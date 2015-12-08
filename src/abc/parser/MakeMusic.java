package abc.parser;

import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.parser.AbcParser.AbclineContext;
import abc.parser.AbcParser.BarlineContext;
import abc.parser.AbcParser.BodyContext;
import abc.parser.AbcParser.ElementContext;
import abc.parser.AbcParser.Field_keyContext;
import abc.parser.AbcParser.Field_numberContext;
import abc.parser.AbcParser.Field_titleContext;
import abc.parser.AbcParser.Field_voiceContext;
import abc.parser.AbcParser.HeaderContext;
import abc.parser.AbcParser.L_bracketContext;
import abc.parser.AbcParser.MultinoteContext;
import abc.parser.AbcParser.Note_elementContext;
import abc.parser.AbcParser.Other_fieldsContext;
import abc.parser.AbcParser.R_bracketContext;
import abc.parser.AbcParser.RootContext;
import abc.parser.AbcParser.Tuplet_elementContext;
import abc.parser.AbcParser.*;
import abc.player.Key;
import abc.player.Music;

public class MakeMusic implements AbcListener {

    /*private Song song;
    private Header header;
    private Body body;
    
    /**
     * Fields for Header
     * Header = index + title + composer + key + defaultLength + meter + tempoBeat + bpm
     */
    /*private int index = 1;
    private String title = "DEFAULT";
    private String composer = "DEFAULT";
    private KeySignature key = null;
    private Fraction defaultLength = null;
    private Fraction meter = new Fraction(4,4);
    private Fraction tempoBeat = null;
    private int bpm = -1;
    
    /**
     * Fields for Body
     * Body = List<Voice>
     */
    //private List<Voice> voices = new ArrayList<Voice>();
    
    /**
     * Returns the bars (List<List<Music>>) for a given voice name
     * Each bar is a List<Music>
     */
    //private HashMap<String, List<List<Music>>> barsForVoiceName = new HashMap<String, List<List<Music>>>();
    //private HashMap<String, Integer> currentBarForVoiceName = new HashMap<String, Integer>();
    
    /**
     * true if the listener is currently processing a multinote (i.e. tuplet, chord) 
     */
   // private boolean inMultinote = false;
    
    /**
     * The current voice name being processed
     */
    //private String voiceName;
    
    /**
     * a hashmap to associate repeats with the appropriate voice
     * 
     * the lists contain documentation of repeats:
     * a repeat is a 3-element array including the following data:
     * - range of bars to repeat (start & end)
     * - the bar after which the repeat is inserted
     * [startBar (inclusive), endBar (exclusive), repeatAt]
     * the last entry in this list will always be the currently open repeat
     * (as such, nested repeats are not supported)
     */
    //private HashMap<String, List<Integer[]>> repeatsForVoiceName = new HashMap<String, List<Integer[]>>();
    
    /**
     * Container for things in voice
     */
    //private List<Music> tupletNotes = new ArrayList<Music>();
    //private List<Music> chordNotes = new ArrayList<Music>();
    /**
     * Notes are always put in this container. this will be assigned to the appropriate
     * container from above (see below) when necessary
     */
    //private List<Music> chordParentContainer = new ArrayList<Music>();
    //private List<Music> tupletParentContainer = new ArrayList<Music>();
    //private List<Music> noteContainer = new ArrayList<Music>();*/

    //Invariant: TODO



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



    /********************************************
    //These NEED TO BE implemented: TODO
     ********************************************/


    @Override
    public void exitRoot(RootContext ctx) {
        /* song = new Song(header, body);*/   
    }

    @Override
    public void exitField_voice(Field_voiceContext ctx) {
        /*   voiceName = ctx.getText().replace("V:", "").trim();
        if(!this.barsForVoiceName.containsKey(voiceName)) {
            List<List<Music>> newVoice = new ArrayList<List<Music>>();
            newVoice.add(new ArrayList<Music>());
            this.barsForVoiceName.put(voiceName, newVoice);
            Integer[] startRepeat = new Integer[]{0,0,0};
            List<Integer[]> reps = new ArrayList<Integer[]>();
            reps.add(startRepeat);
            this.repeatsForVoiceName.put(voiceName, reps);
        }*/

    }
    @Override
    public void exitHeader(HeaderContext ctx) {
        /* // If there's no default length, 
        if(defaultLength == null)
            defaultLength = (meter.getNumerator()*1.0/(1.0*meter.getDenominator()) < 0.75) ? new Fraction(1,16) : new Fraction(1,8);
        if(bpm == -1)
            bpm = 100;
        if(tempoBeat == null)
            tempoBeat = defaultLength;
        header = new Header(index, title, composer, key, meter, bpm, tempoBeat, defaultLength);*/

    }



    @Override
    public void exitOther_fields(Other_fieldsContext ctx) {
        if(ctx.FIELD_COMPOSER() != null) {
            composer = ctx.FIELD_COMPOSER().getText().replace("C:", "").trim();
        }
        /*if(ctx.FIELD_DEFAULT_LENGTH() != null) {
            String fracText = ctx.FIELD_DEFAULT_LENGTH().getText().replace("L:", "").trim();
            defaultLength = new Fraction(fracText);
        }
        if(ctx.FIELD_METER() != null) {
            String meterString = ctx.FIELD_METER().getText().replace("M:", "").trim();
            if(meterString.equals("C")) {
                meter = new Fraction(4,4);
            } else if(meterString.equals("C|")) {
                meter = new Fraction(2,2);
            } else {
                meter = new Fraction(meterString);
            }
        }
        if(ctx.FIELD_TEMPO() != null) {
            String[] tempoStrings = ctx.FIELD_TEMPO().getText().replace("Q:","").split("=");
            tempoBeat = new Fraction(tempoStrings[0].trim());
            bpm = Integer.parseInt(tempoStrings[1].trim());
        }
        if(ctx.FIELD_VOICE() != null) {
            //initialize containers for this voice
            voiceName = ctx.FIELD_VOICE().getText().replace("V:", "").trim();
            if(!this.barsForVoiceName.containsKey(voiceName)) {
                List<List<Music>> newVoice = new ArrayList<List<Music>>();
                newVoice.add(new ArrayList<Music>());
                this.barsForVoiceName.put(voiceName, newVoice);
                Integer[] startRepeat = new Integer[]{0,0,0};
                List<Integer[]> reps = new ArrayList<Integer[]>();
                reps.add(startRepeat);
                this.repeatsForVoiceName.put(voiceName, reps);
            }
        }*/

    }


    @Override
    public void enterBody(BodyContext ctx) {
        /*// if there is not voice specified, use a default voice
        //initialize containers
        if(this.voiceName == null){
            this.voiceName = "THE_DEFAULT_VOICE";
            List<List<Music>> newVoice = new ArrayList<List<Music>>();
            newVoice.add(new ArrayList<Music>());
            this.barsForVoiceName.put(this.voiceName, newVoice);
            Integer[] startRepeat = new Integer[]{0,0,0};
            List<Integer[]> reps = new ArrayList<Integer[]>();
            reps.add(startRepeat);
            this.repeatsForVoiceName.put(voiceName, reps);
        }*/

    }
    @Override
    public void exitBody(BodyContext ctx) {
        /* for(String name : this.barsForVoiceName.keySet()){
            List<List<Music>> voiceBars = barsForVoiceName.get(name);
            List<Integer[]> repeats = repeatsForVoiceName.get(name);
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
            voices.add(new Voice(name, concatenatedBars));
        }
        body = new Body(voices);*/

    }

    @Override
    public void exitAbcline(AbclineContext ctx) {
        /*List<List<Music>> bars = barsForVoiceName.get(voiceName);
        int lineLength = bars.size();
        currentBarForVoiceName.put(voiceName, lineLength);*/

    }

    @Override
    public void exitL_bracket(L_bracketContext ctx) {
        /*chordParentContainer = noteContainer;
        chordNotes = new ArrayList<Music>();
        noteContainer = chordNotes;
        this.inMultinote = true;*/
    }

    @Override
    public void exitR_bracket(R_bracketContext ctx) {
        /* ArrayList<Note> notes = new ArrayList<Note>();
        for(Music m : chordNotes) {
            notes.add((Note)m);
        }
        chordParentContainer.add(new Chord(notes));
        noteContainer = chordParentContainer;
        this.inMultinote = false;
        List<List<Music>> bars = this.barsForVoiceName.get(voiceName);
        bars.get(bars.size()-1).add(new Chord(notes));*/   
    }

    @Override
    public void exitMultinote(MultinoteContext ctx) {
        /*  this.inMultinote = false;*/

    }

    @Override
    public void exitNote_element(Note_elementContext ctx) {
        // TODO Auto-generated method stub

    }
    @Override
    public void enterTuplet_element(Tuplet_elementContext ctx) {
        /*tupletParentContainer = noteContainer;
        //empty the tuplet note container
        tupletNotes = new ArrayList<Music>();
        //set the tuplet container as the current destination for all notes
        noteContainer = tupletNotes;
        this.inMultinote = true;*/

    }
    @Override
    public void exitTuplet_element(Tuplet_elementContext ctx) {
        /*int type = 3;
        if(ctx.DUPLET() != null)
            type = 2;
        else if (ctx.QUADRUPLET() != null)
            type = 4;

        TupletEnum tupletType = TupletEnum.TRIPLET;
        switch(type) {
            case 2: tupletType = TupletEnum.DUPLET; break;
            case 3: tupletType = TupletEnum.TRIPLET; break;
            case 4: tupletType = TupletEnum.QUADRUPLET; break;
        }
        this.inMultinote = false;
        //create the tuplet object and append it to the voice
        tupletParentContainer.add(new Tuplet(tupletType, tupletNotes));         
        //set the container back to the main voice
        noteContainer = tupletParentContainer;
        List<List<Music>> bars = this.barsForVoiceName.get(voiceName);
        bars.get(bars.size()-1).add(new Tuplet(tupletType, tupletNotes));*/

    }
    @Override
    public void enterBarline(BarlineContext ctx) {
        /*//parse notes into bars and keep track of repeats
        String barlineString = "";
        if(ctx.BARLINE() != null)
            barlineString = ctx.BARLINE().getText();
        else if(ctx.NTH_REPEAT() != null)
            barlineString = ctx.NTH_REPEAT().getText();

        List<List<Music>> bars = barsForVoiceName.get(voiceName);
        //does not support nested repeats/multiple end repeats to same start repeat
        boolean addNewBar = true;

        List<Integer[]> repeats = repeatsForVoiceName.get(voiceName);
        Integer[] currentRepeat  = null;
        if(repeats.size() > 0)
            currentRepeat = repeats.get(repeats.size()-1);
        else
            currentRepeat = new Integer[3];

        if(barlineString.equals("|:")) {
            currentRepeat[0] = new Integer(bars.size());
        } else if(barlineString.equals(":|")) {
            if(currentRepeat[1] == null)
                currentRepeat[1] = new Integer(bars.size());
            currentRepeat[2] = new Integer(bars.size() + 1);
        } else if(barlineString.equals("[1")) {
            addNewBar = false;
            currentRepeat[1] = new Integer(bars.size());
        } else if(barlineString.equals("[2")) {
            addNewBar = false;
        } else if(barlineString.equals("[|")) {
            if(currentRepeat[0] == null)
                currentRepeat[0] = new Integer(bars.size());
        }
        if(repeats.size() > 0)
            repeats.set(repeats.size()-1, currentRepeat);
        else
            repeats.add(currentRepeat);
        if(addNewBar)
            bars.add(new ArrayList<Music>());*/

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
    @Override public void enterR_bracket(R_bracketContext ctx) {}
    @Override public void enterL_bracket(L_bracketContext ctx) {}
    @Override public void enterNote_element(Note_elementContext ctx) {}
    @Override public void enterMultinote(MultinoteContext ctx) {}
    @Override public void exitElement(ElementContext ctx) {}
    @Override public void enterElement(ElementContext ctx) {}
    @Override public void enterField_voice(Field_voiceContext ctx) {}
    @Override public void enterAbcline(AbclineContext ctx) {}
    @Override public void exitBarline(BarlineContext ctx) {}
    @Override public void enterHeader(HeaderContext ctx) {}
    @Override public void enterRoot(RootContext ctx) {}

}

