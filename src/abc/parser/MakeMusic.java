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

    private int index = 1;
    private String title = "DEFAULT";
    private String composer = "DEFAULT";
    private Key key = null;
   // private Fraction defaultLength = null;
   // private Fraction meter = new Fraction(4,4);
   // private Fraction tempoBeat = null;
    private int bpm = -1;
     
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
    public void enterRoot(RootContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitRoot(RootContext ctx) {
        // TODO Auto-generated method stub
        
    }
   
    @Override
    public void exitField_voice(Field_voiceContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterHeader(HeaderContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitHeader(HeaderContext ctx) {
        // TODO Auto-generated method stub
        
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
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitBody(BodyContext ctx) {
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
    public void exitL_bracket(L_bracketContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitR_bracket(R_bracketContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitMultinote(MultinoteContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitNote_element(Note_elementContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterTuplet_element(Tuplet_elementContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitTuplet_element(Tuplet_elementContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterBarline(BarlineContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitBarline(BarlineContext ctx) {
        // TODO Auto-generated method stub
        
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
}
