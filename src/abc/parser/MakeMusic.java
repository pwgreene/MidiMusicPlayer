package abc.parser;

import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.parser.AbcParser.*;
import abc.player.Key;
import abc.player.Music;

public class MakeMusic implements AbcListener {

    private Key key;
    private int beatsPerMinute = 100; //100 is default
    private final Stack<Music> noteStack = new Stack<>();

    //Invariant:

    public Music getMusic() {
        return noteStack.get(0);
    }
    public int getBPM() {
        return beatsPerMinute;
    }

    @Override
    //Default length of note
    public void exitL(LContext ctx) {
        // TODO Auto-generated method stub
    }


    @Override
    //Tempo (beats per minute) TODO fix this
    public void exitQ(QContext ctx) {
        if(ctx != null) {
            int n = Integer.valueOf(ctx.getText());
            beatsPerMinute = n;
        }
    }

    @Override
    //Meter
    public void exitM(MContext ctx) {
        if(ctx != null){
            if(ctx.toString().equals("C")){ //common time

            }else if(ctx.toString().equals("C|")){  //cut time

            }//else if(/*TODO*/){ //other meters

           // }
        }
    }

    //Voice
    @Override
    public void exitV(VContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitKey(KeyContext ctx) {
        if(ctx.keynote().BASENOTE().equals("A")){
            if(ctx.keynote().KEYACCIDENTAL() != null){
                if(ctx.keynote().KEYACCIDENTAL().equals("b")){
                    if(ctx.MODEMINOR() != null && ctx.MODEMINOR().equals("m")){
                        key = Key.Ab_MINOR;
                    }else{
                        key = Key.Ab_MAJOR;
                    }
                }else if(ctx.keynote().KEYACCIDENTAL().equals("#")){
                    if(ctx.MODEMINOR() != null && ctx.MODEMINOR().equals("m")){
                        key = Key.As_MINOR;
                    }else{
                        //key = Key.AsMajor?? TODO
                    }
                }else{
                    if(ctx.MODEMINOR() != null && ctx.MODEMINOR().equals("m")){
                        key = Key.A_MINOR;
                    }else{
                        key = Key.A_MAJOR;
                    }
                }
            }

        }else if(ctx.keynote().BASENOTE().equals("B")){

        }else if(ctx.keynote().BASENOTE().equals("C")){

        }else if(ctx.keynote().BASENOTE().equals("D")){

        }else if(ctx.keynote().BASENOTE().equals("E")){

        }else if(ctx.keynote().BASENOTE().equals("F")){

        }else if(ctx.keynote().BASENOTE().equals("G")){

        }
    }

    @Override
    public void exitKeynote(KeynoteContext ctx) {
        // TODO Auto-generated method stub

    }



    @Override
    public void exitBody(BodyContext ctx) {
        // TODO Auto-generated method stub

    }



    @Override
    public void exitEol(EolContext ctx) {
        // TODO Auto-generated method stub

    }






    @Override
    public void exitRoot(RootContext ctx) {
        // TODO Auto-generated method stub

    }



    @Override
    public void exitAbcmusic(AbcmusicContext ctx) {
        // TODO Auto-generated method stub

    }



    @Override
    public void exitAbcline(AbclineContext ctx) {
        // TODO Auto-generated method stub

    }



    @Override
    public void exitElement(ElementContext ctx) {
        // TODO Auto-generated method stub

    }



    @Override
    public void exitNoteelement(NoteelementContext ctx) {
        // TODO Auto-generated method stub

    }



    @Override
    public void exitNote(NoteContext ctx) {
        // TODO Auto-generated method stub

    }



    @Override
    public void exitNoteorrest(NoteorrestContext ctx) {
        // TODO Auto-generated method stub

    }



    @Override
    public void exitPitch(PitchContext ctx) {
        // TODO Auto-generated method stub

    }



    @Override
    public void exitOctave(OctaveContext ctx) {
        // TODO Auto-generated method stub

    }



    @Override
    public void exitNotelength(NotelengthContext ctx) {
        // TODO Auto-generated method stub

    }



    @Override
    public void exitNotelengthstrict(NotelengthstrictContext ctx) {
        // TODO Auto-generated method stub

    }



    @Override
    public void exitRest(RestContext ctx) {
        // TODO Auto-generated method stub

    }



    @Override
    public void exitTupletelement(TupletelementContext ctx) {
        // TODO Auto-generated method stub

    }



    @Override
    public void exitTupletspec(TupletspecContext ctx) {
        // TODO Auto-generated method stub

    }


    @Override
    public void exitMultinote(MultinoteContext ctx) {
        // TODO Auto-generated method stub

    }


    @Override
    public void exitMidtunefield(MidtunefieldContext ctx) {
        // TODO Auto-generated method stub

    }


    //THESE ARE NOT USED
    @Override public void enterEveryRule(ParserRuleContext arg0) {} //These are not used
    @Override public void exitEveryRule(ParserRuleContext arg0) {}
    @Override public void visitErrorNode(ErrorNode arg0) {}
    @Override public void visitTerminal(TerminalNode arg0) {}
    @Override public void enterX(XContext ctx) {} //Do nothing with the index number
    @Override public void exitX(XContext ctx) {} 
    @Override public void enterT(TContext ctx) {} //Do nothing with the title
    @Override public void exitT(TContext ctx) {} 
    @Override public void enterC(CContext ctx) {} //Do nothing with the composer
    @Override public void exitC(CContext ctx) {} 
    @Override public void enterK(KContext ctx) {} //Do nothing when entering K 
    @Override public void exitK(KContext ctx) {} 
    @Override public void enterComment(CommentContext ctx) {} //Do nothing with comments
    @Override public void exitComment(CommentContext ctx) {}
    @Override public void enterText(TextContext ctx) {} //Do nothing with comment text
    @Override public void exitText(TextContext ctx) {}
    @Override public void enterL(LContext ctx) {}
    @Override public void enterQ(QContext ctx) {}
    @Override public void enterM(MContext ctx){}
    @Override public void enterV(VContext ctx) {}
    @Override public void enterKey(KeyContext ctx) {}
    @Override public void enterKeynote(KeynoteContext ctx) {}
    @Override public void enterBody(BodyContext ctx) {}
    @Override public void enterRest(RestContext ctx) {}
    @Override public void enterRoot(RootContext ctx) {}
    @Override public void enterEol(EolContext ctx) {}
    @Override public void enterMultinote(MultinoteContext ctx) {}
    @Override public void enterMidtunefield(MidtunefieldContext ctx) {}
    @Override public void enterTupletspec(TupletspecContext ctx) {}
    @Override public void enterTupletelement(TupletelementContext ctx) {}
    @Override public void enterNotelengthstrict(NotelengthstrictContext ctx) {}
    @Override public void enterNotelength(NotelengthContext ctx) {}
    @Override public void enterOctave(OctaveContext ctx) {}
    @Override public void enterPitch(PitchContext ctx) {}
    @Override public void enterNoteorrest(NoteorrestContext ctx) {}
    @Override public void enterNote(NoteContext ctx) {}
    @Override public void enterAbcline(AbclineContext ctx) {}
    @Override public void enterNoteelement(NoteelementContext ctx) {}
    @Override public void enterElement(ElementContext ctx) {}
    @Override public void enterAbcmusic(AbcmusicContext ctx) {}

}
