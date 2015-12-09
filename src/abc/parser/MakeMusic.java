package abc.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.parser.AbcParser.*;
import abc.player.Chord;
import abc.player.Key;
import abc.player.Music;
import abc.player.RationalNum;
import abc.player.Rest;
import abc.player.SingleNote;
import abc.player.Tuplet;
import abc.sound.Pitch;

public class MakeMusic implements AbcListener {

    //Header Fields
    private int index = 1;
    private String title = "DEFAULT";
    private String composer = "DEFAULT";
    private Key key = null;
    private RationalNum defaultLength = null;
    private RationalNum meter = new RationalNum(4,4);
    private RationalNum tempoBeat = null;
    private int bpm = 100;


    //The bars (List<List<Music>>) for a given voice name (Each bar is a List<Music>)
    private HashMap<String, List<List<Music>>> barsForVoice = new HashMap<String, List<List<Music>>>();  
    //True if currently processing a tuplet or chord
    private boolean inChord = false;
    private int inTuple = 0;
    //The current voice name being processed
    private String voiceName;

    /**
     * A HashMap to associate repeats with the appropriate voice
     * 
     * the lists contain documentation of repeats:
     * a repeat is a 3-element array including the following data:
     * - range of bars to repeat (start & end)
     * - the bar after which the repeat is inserted
     * [startBar (inclusive), endBar (exclusive), repeatAt]
     * the last entry in this list will always be the currently open repeat
     */
    private HashMap<String, List<Integer[]>> repeatsForVoiceName = new HashMap<String, List<Integer[]>>();

    /**
     * Container for things in voice
     */
    private List<Music> tupleNotes = new ArrayList<Music>();
    private List<SingleNote> chordNotes = new ArrayList<SingleNote>();  

    //These have been implemented:
    @Override
    //Get Index Number
    public void exitField_number(Field_numberContext ctx) {
        index = Integer.parseInt(ctx.FIELD_NUMBER().getText().replace("X:", "").trim());
    }

    @Override
    //Get Title
    public void exitField_title(Field_titleContext ctx) {
        title = ctx.FIELD_TITLE().getText().replace("T:", "").trim();   
    }

    @Override
    //Get Key
    public void exitField_key(Field_keyContext ctx) {
        key = new Key(ctx.FIELD_KEY().getText().replace("K:", "").trim());  
    }

    @Override
    public void exitOther_fields(Other_fieldsContext ctx) {
        if(ctx.FIELD_COMPOSER() != null) {
            composer = ctx.FIELD_COMPOSER().getText().replace("C:", "").trim();
        }
        if(ctx.FIELD_DEFAULT_LENGTH() != null) {
            defaultLength = new RationalNum( ctx.FIELD_DEFAULT_LENGTH().getText().replace("L:", "").trim());
        }
        if(ctx.FIELD_METER() != null) {
            String meterStr = ctx.FIELD_METER().getText().replace("M:", "").trim();
            if(meterStr.equals("C")) {
                meter = new RationalNum(4,4);
            } else if(meterStr.equals("C|")) {
                meter = new RationalNum(2,2);
            } else {
                meter = new RationalNum(meterStr);
            }
        }
        if(ctx.FIELD_TEMPO() != null) {
            String[] tempoStrings = ctx.FIELD_TEMPO().getText().replace("Q:","").split("=");
            tempoBeat = new RationalNum(tempoStrings[0].trim());
            bpm = Integer.parseInt(tempoStrings[1].trim());
        }
        if(ctx.FIELD_VOICE() != null) {
            voiceName = ctx.FIELD_VOICE().getText().replace("V:", "").trim();
            if(!barsForVoice.containsKey(voiceName)) {
                List<List<Music>> newVoice = new ArrayList<List<Music>>();
                newVoice.add(new ArrayList<Music>());
                barsForVoice.put(voiceName, newVoice);
                Integer[] startRepeat = new Integer[]{0,0,0};
                List<Integer[]> reps = new ArrayList<Integer[]>();
                reps.add(startRepeat);
                repeatsForVoiceName.put(voiceName, reps);
            }
        }
    }

    @Override
    public void exitClose_bracket(Close_bracketContext ctx) {
        if(inChord){
            ArrayList<SingleNote> notes = new ArrayList<SingleNote>();
            for(SingleNote m : chordNotes) {
                notes.add(m);
            }
            //TODO chords in a tuple
            if(inTuple!=0){
                tupleNotes.add(new Chord(notes));
            }else{           
                List<List<Music>> bars = barsForVoice.get(voiceName);
                bars.get(bars.size()-1).add(new Chord(notes));  
            }
            this.inChord = false;
            chordNotes = new ArrayList<SingleNote>();
        }
    }

    @Override
    public void enterTuplet_element(Tuplet_elementContext ctx) {
        if(ctx.DUPLET() != null){
            inTuple = 2;
        }else if(ctx.TRIPLET() != null){
            this.inTuple = 3;
        }else{
            this.inTuple = 4;
        }
    }

    @Override 
    public void exitOpen_bracket(Open_bracketContext ctx) {
        this.inChord = true;
    }

    @Override
    public void exitHeader(HeaderContext ctx) {
        if(defaultLength == null){
            defaultLength = (meter.getNum()*1.0/(1.0*meter.getDenom()) < 0.75) ? new RationalNum(1,16) : new RationalNum(1,8);
        }
        if(tempoBeat == null){
            tempoBeat = defaultLength;
        }
    }

    @Override
    public void enterBody(BodyContext ctx) {
        //initialize containers
        if(this.voiceName == null){
            voiceName = "THE_DEFAULT_VOICE";
            List<List<Music>> newVoice = new ArrayList<List<Music>>();
            newVoice.add(new ArrayList<Music>());
            barsForVoice.put(this.voiceName, newVoice);
            Integer[] startRepeat = new Integer[]{0,0,0};
            List<Integer[]> reps = new ArrayList<Integer[]>();
            reps.add(startRepeat);
            repeatsForVoiceName.put(voiceName, reps);
        }
    }

    @Override
    public void exitField_voice(Field_voiceContext ctx) {
        voiceName = ctx.getText().replace("V:", "").trim();
        if(!this.barsForVoice.containsKey(voiceName)) {
            List<List<Music>> newVoice = new ArrayList<List<Music>>();
            newVoice.add(new ArrayList<Music>());
            this.barsForVoice.put(voiceName, newVoice);
            Integer[] startRepeat = new Integer[]{0,0,0};
            List<Integer[]> reps = new ArrayList<Integer[]>();
            reps.add(startRepeat);
            this.repeatsForVoiceName.put(voiceName, reps);
        }
    }

    @Override
    public void exitTuplet_element(Tuplet_elementContext ctx) {
        this.inTuple = 0;
        List<List<Music>> bars = barsForVoice.get(voiceName);
        bars.get(bars.size()-1).add(new Tuplet(tupleNotes));
        //Clear notes from tuple
        tupleNotes = new ArrayList<Music>();
    }

    @Override
    public void enterBarline(BarlineContext ctx) {
        //parse notes into bars and keep track of repeats
        String barlineString = "";
        if(ctx.BARLINE() != null)
            barlineString = ctx.BARLINE().getText();
        else if(ctx.NTH_REPEAT() != null)
            barlineString = ctx.NTH_REPEAT().getText();

        List<List<Music>> bars = barsForVoice.get(voiceName);
        boolean addNewBar = true;

        List<Integer[]> repeats = repeatsForVoiceName.get(voiceName);
        Integer[] currentRepeat  = null;
        if(repeats.size() > 0){
            currentRepeat = repeats.get(repeats.size()-1);
        }
        else{
            currentRepeat = new Integer[3];
        }
        if(barlineString.equals("|:")) {
            currentRepeat[0] = new Integer(bars.size());
        } else if(barlineString.equals(":|")) {
//            if(currentRepeat[1] == null)
//                System.out.println("here");
            currentRepeat[1] = new Integer(bars.size());
            currentRepeat[2] = new Integer(bars.size());
        } else if(barlineString.equals("[1")) {
            addNewBar = false;
            currentRepeat[1] = new Integer(bars.size());
        } else if(barlineString.equals("[2")) {
            addNewBar = false;
        } else if(barlineString.equals("[|")) {
            if(currentRepeat[0] == null)
                currentRepeat[0] = new Integer(bars.size());
        }
        if(repeats.size() > 0){
            repeats.set(repeats.size()-1, currentRepeat);
        }
        else{
            repeats.add(currentRepeat);
        }
        if(addNewBar){
            bars.add(new ArrayList<Music>());
        }
    }

    @Override
    public void exitNote_element(Note_elementContext ctx) {
        if(ctx.NOTE() != null) {

            //Split the string into a note and a note_duration part
            String noteString = ctx.NOTE().getText();
            String[] splitNote = noteString.split("(?=[\\d+/])",2);
            String pitchString = splitNote[0];
            RationalNum duration = new RationalNum(1,1);
            if(splitNote.length == 2) {
                String durationString = splitNote[1];
                String[] splitRationalNum = durationString.split("(?=/)|(?<=/)");
                if(splitRationalNum.length == 3) {
                    int num = 1;
                    int den = 2;
                    if(splitRationalNum[0].equals("")) {
                        den = Integer.parseInt(splitRationalNum[2]);
                    } else if(splitRationalNum[2].equals("")) {
                        //this case should never happen..right?
                    } else {
                        num = Integer.parseInt(splitRationalNum[0]);
                        den = Integer.parseInt(splitRationalNum[2]);
                    }
                    duration = new RationalNum(num, den);
                } else if(splitRationalNum.length == 1) {
                    int num = Integer.parseInt(splitRationalNum[0]);
                    int den = 1;
                    duration = new RationalNum(num, den);
                } else if (splitRationalNum.length == 2){
                    int num = 1;
                    int den = 2;
                    duration = new RationalNum(num, den);
                }
            }

            String[] splitPitch = pitchString.split("(?=[A-Ga-gz])|(?<=[A-Ga-gz])");


            //add a rest or a note
            if(splitPitch[0].equals("z")) {
                List<List<Music>> bars = this.barsForVoice.get(voiceName);
                bars.get(bars.size()-1).add(new Rest(duration));
            } else{


                int changeInPitch = 0;
                boolean hasAccidental = false;
                int octave = 0;
                String baseNoteString;
                if (splitPitch.length == 1) {
                    baseNoteString = splitPitch[0];
                } else if (splitPitch.length == 2 && splitPitch[1].matches("[A-Ga-g]")) { //matches "^C"
                    String accidental = splitPitch[0];
                    hasAccidental = true;
                    if (accidental.equals("_")) {
                        changeInPitch = -1;
                    }
                    else if (accidental.equals("__")) {
                        changeInPitch = -2;
                    }
                    else if (accidental.equals("^")) {
                        changeInPitch = 1;
                    }
                    else if (accidental.equals("^^")) {
                        changeInPitch = 2;
                    }
                    baseNoteString = splitPitch[1];
                } else if (splitPitch.length == 2) { //matches "C ,"
                    String octaveMarker = splitPitch[1];
                    baseNoteString = splitPitch[0];
                    //check what octave the note is
                    if (octaveMarker.charAt(0) == ',') {
                        octave -= octaveMarker.length();
                    } else if (octaveMarker.charAt(0) == '\'') {
                        octave += octaveMarker.length();
                    }
                }
                else { //matches "^ C '"
                    String accidental = splitPitch[1];
                    String octaveMarker = splitPitch[2];
                    baseNoteString = splitPitch[1];
                    hasAccidental = true;
                    //check what accidental is
                    if (accidental.equals("_")) {
                        changeInPitch = -1;
                    }
                    else if (accidental.equals("__")) {
                        changeInPitch = -2;
                    }
                    else if (accidental.equals("^")) {
                        changeInPitch = 1;
                    }
                    else if (accidental.equals("^^")) {
                        changeInPitch = 2;
                    }
                    //check what octave the note is
                    if (octaveMarker.charAt(0) == ',') {
                        octave -= octaveMarker.length();
                    } else if (octaveMarker.charAt(0) == '\'') {
                        octave += octaveMarker.length();
                    }

                }
                //change pitch based on octave
                if (baseNoteString.toLowerCase().equals(baseNoteString)) {
                    octave++;
                }
                Pitch pitch; //create pitch and change for accidental
                char noteChar = baseNoteString.toUpperCase().charAt(0);
                if (hasAccidental) {
                    pitch = new Pitch(noteChar).transpose(changeInPitch);
                } else  { //no accidental, use key signature
                    pitch = new Pitch(noteChar);
                    if (baseNoteString.toUpperCase().equals("A")) {
                        pitch.transpose(key.getAccidentals()[0]);
                    } else if (baseNoteString.toUpperCase().equals("B")) {
                        pitch.transpose(key.getAccidentals()[1]);
                    } else if (baseNoteString.toUpperCase().equals("C")) {
                        pitch.transpose(key.getAccidentals()[2]);
                    } else if (baseNoteString.toUpperCase().equals("D")) {
                        pitch.transpose(key.getAccidentals()[3]);
                    } else if (baseNoteString.toUpperCase().equals("E")) {
                        pitch.transpose(key.getAccidentals()[4]);
                    } else if (baseNoteString.toUpperCase().equals("F")) {
                        pitch.transpose(key.getAccidentals()[5]);
                    } else if (baseNoteString.toUpperCase().equals("G")) {
                        pitch.transpose(key.getAccidentals()[6]);
                    }
                }
                //transpose pitch by the octave
                pitch = pitch.transpose(octave*Pitch.OCTAVE);


                if(this.inChord){
                    chordNotes.add(new SingleNote(duration, pitch));
                }else if(this.inTuple !=0){
                    if(this.inTuple == 3){
                        tupleNotes.add(new SingleNote(new RationalNum(2*duration.getNum(),inTuple*duration.getDenom()), pitch));
                    }else{
                        tupleNotes.add(new SingleNote(new RationalNum(3*duration.getNum(),inTuple*duration.getDenom()), pitch));
                    }
                }else{
                    List<List<Music>> bars = this.barsForVoice.get(voiceName);
                    bars.get(bars.size()-1).add(new SingleNote(duration, pitch));
                }             
            }
        }
    }

    @Override
    public void exitBody(BodyContext ctx) {
        for(String name : barsForVoice.keySet()){
            List<List<Music>> voiceBars = barsForVoice.get(name);
            List<Integer[]> repeats = repeatsForVoiceName.get(name);
            for(int i = 0; i<repeats.size(); i++){
                for(int j = 0; j<3; j++){
                    System.out.println(repeats.get(i)[j]);
                }

            }
            Integer[] lastRepeat = repeats.get(repeats.size()-1);
            if(lastRepeat[0] == null || lastRepeat[1] == null || lastRepeat[2] == null)
                repeats.remove(repeats.size()-1);
            int indexShift = 0;
            for(int i = 0; i < repeats.size(); i++){
                List<List<Music>> barsToRepeat = new ArrayList<List<Music>>();
                for(int j = repeats.get(i)[0]; j < repeats.get(i)[1]; j++) {
                    barsToRepeat.add(voiceBars.get(j));
                }
                voiceBars.addAll(repeats.get(i)[2] + indexShift, barsToRepeat);
                indexShift += barsToRepeat.size();
            }
            List<Music> concatenatedBars = new ArrayList<Music>();
            for(List<Music> bar : voiceBars) {
                concatenatedBars.addAll(bar);
            }
            List<List<Music>> listSizeOne = new ArrayList<List<Music>>();
            listSizeOne.add(concatenatedBars);
            barsForVoice.put(name, listSizeOne);
        }
    }

    //These aren't used:
    @Override public void enterEveryRule(ParserRuleContext arg0) {}
    @Override public void exitEveryRule(ParserRuleContext arg0) {}
    @Override public void visitErrorNode(ErrorNode arg0) {}
    @Override public void visitTerminal(TerminalNode arg0) {}  
    @Override public void enterField_number(Field_numberContext ctx) {}
    @Override public void enterField_title(Field_titleContext ctx) {}
    @Override public void enterOther_fields(Other_fieldsContext ctx) {}
    @Override public void enterField_key(Field_keyContext ctx) {}
    @Override public void enterNote_element(Note_elementContext ctx) {}
    @Override public void enterMultinote(MultinoteContext ctx) {}
    @Override public void exitElement(ElementContext ctx) {}
    @Override public void enterElement(ElementContext ctx) {}
    @Override public void enterField_voice(Field_voiceContext ctx) {}
    @Override public void enterAbcline(AbclineContext ctx) {}
    @Override public void exitBarline(BarlineContext ctx) {}
    @Override public void enterHeader(HeaderContext ctx) {}
    @Override public void enterRoot(RootContext ctx) {}
    @Override public void exitRoot(RootContext ctx) {}
    @Override public void enterOpen_bracket(Open_bracketContext ctx) {}
    @Override public void enterClose_bracket(Close_bracketContext ctx) {}
    @Override public void exitMultinote(MultinoteContext ctx) {}
    @Override public void exitAbcline(AbclineContext ctx) {}

    //Getters

    public int getIndex(){
        return this.index;
    }

    public String getTitle(){
        return this.title;
    }

    public String getComposer(){
        return this.composer;
    }

    public Key getKey(){
        return this.key;
    }

    public RationalNum getDefaultLength(){
        return this.defaultLength;
    }

    public RationalNum getMeter(){
        return this.meter;
    }

    public RationalNum getTempoBeat(){
        return this.tempoBeat;
    }

    public int getBPM(){
        return this.bpm;
    }

    public HashMap<String,List<List<Music>>> getMusic(){
        return this.barsForVoice;
    }

}

