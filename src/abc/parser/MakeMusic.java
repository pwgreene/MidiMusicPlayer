package abc.parser;

import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.parser.AbcParser.*;
import abc.player.Key;
import abc.player.Music;

public class MakeMusic implements AbcListener {
    
    private Key keySignature;
    private int beatsPerMinute;
    private final Stack<Music> stack = new Stack<>();

    //Invariant:
    
    public Music getMusic() {
        return stack.get(0);
    }
    public int getBPM() {
        return beatsPerMinute;
    }
    
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

    @Override
    //Default length of note
    public void enterL(LContext ctx) {
        // TODO Auto-generated method stub
    }
    @Override
    public void exitL(LContext ctx) {
        // TODO Auto-generated method stub
    }

    @Override
    //Tempo
    public void enterQ(QContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitQ(QContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    //Meter
    public void enterM(MContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitM(MContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    //Voice
    public void enterV(VContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitV(VContext ctx) {
        // TODO Auto-generated method stub
        
    }

   

    @Override
    public void enterKey(KeyContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitKey(KeyContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterKeynote(KeynoteContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitKeynote(KeynoteContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterBody(BodyContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitBody(BodyContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterEol(EolContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitEol(EolContext ctx) {
        // TODO Auto-generated method stub
        
    }

 


    @Override
    public void enterRoot(RootContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitRoot(RootContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterAbcmusic(AbcmusicContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitAbcmusic(AbcmusicContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterAbcline(AbclineContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitAbcline(AbclineContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterElement(ElementContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitElement(ElementContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterNoteelement(NoteelementContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitNoteelement(NoteelementContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterNote(NoteContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitNote(NoteContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterNoteorrest(NoteorrestContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitNoteorrest(NoteorrestContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterPitch(PitchContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitPitch(PitchContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterOctave(OctaveContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitOctave(OctaveContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterNotelength(NotelengthContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitNotelength(NotelengthContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterNotelengthstrict(NotelengthstrictContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitNotelengthstrict(NotelengthstrictContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterRest(RestContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitRest(RestContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterTupletelement(TupletelementContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitTupletelement(TupletelementContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterTupletspec(TupletspecContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitTupletspec(TupletspecContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterMultinote(MultinoteContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitMultinote(MultinoteContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterMidtunefield(MidtunefieldContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitMidtunefield(MidtunefieldContext ctx) {
        // TODO Auto-generated method stub
        
    }

}
