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

    private Key key;
    private int beatsPerMinute = 100; //100 is default
    //private 
    private final Stack<Music> noteStack = new Stack<>();

    //Invariant:

    public Music getMusic() {
        return noteStack.get(0);
    }
    public int getBPM() {
        return beatsPerMinute;
    }
    @Override
    public void enterEveryRule(ParserRuleContext arg0) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitEveryRule(ParserRuleContext arg0) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void visitErrorNode(ErrorNode arg0) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void visitTerminal(TerminalNode arg0) {
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
    public void enterField_voice(Field_voiceContext ctx) {
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
    public void enterField_number(Field_numberContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitField_number(Field_numberContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterField_title(Field_titleContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitField_title(Field_titleContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterOther_fields(Other_fieldsContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitOther_fields(Other_fieldsContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterField_key(Field_keyContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitField_key(Field_keyContext ctx) {
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
    public void enterAbcline(AbclineContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitAbcline(AbclineContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterL_bracket(L_bracketContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitL_bracket(L_bracketContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void enterR_bracket(R_bracketContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitR_bracket(R_bracketContext ctx) {
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
    public void enterNote_element(Note_elementContext ctx) {
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
    @Override
    public void enterElement(ElementContext ctx) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void exitElement(ElementContext ctx) {
        // TODO Auto-generated method stub
        
    }


//
//    @Override
//    public void exitKey(KeyContext ctx) {    
//        if(ctx.keynote().BASENOTE().equals("A")){
//            if(ctx.keynote().KEYACCIDENTAL() != null){
//                if(ctx.keynote().KEYACCIDENTAL().equals("b")){
//                    if(ctx.MODEMINOR() != null && ctx.MODEMINOR().equals("m")){
//                        key = Key.Ab_MINOR;
//                    }else{
//                        key = Key.Ab_MAJOR;
//                    }
//                }else if(ctx.keynote().KEYACCIDENTAL().equals("#")){
//                    if(ctx.MODEMINOR() != null && ctx.MODEMINOR().equals("m")){
//                        key = Key.As_MINOR;
//                    }
//                }else{
//                    if(ctx.MODEMINOR() != null && ctx.MODEMINOR().equals("m")){
//                        key = Key.A_MINOR;
//                    }else{
//                        key = Key.A_MAJOR;                       
//                    }
//                }
//            }
//        }else if(ctx.keynote().BASENOTE().equals("B")){
//            if(ctx.keynote().KEYACCIDENTAL() != null){
//                if(ctx.keynote().KEYACCIDENTAL().equals("b")){
//                    if(ctx.MODEMINOR() != null && ctx.MODEMINOR().equals("m")){
//                        key = Key.Bb_MINOR;
//                    }else{
//                        key = Key.Bb_MAJOR;
//                    }
//                }else{
//                    if(ctx.MODEMINOR() != null && ctx.MODEMINOR().equals("m")){
//                        key = Key.B_MINOR;
//                    }else{
//                        key = Key.B_MAJOR;                      
//                    }
//                }
//            }
//
//        }else if(ctx.keynote().BASENOTE().equals("C")){
//            if(ctx.keynote().KEYACCIDENTAL() != null){
//                if(ctx.keynote().KEYACCIDENTAL().equals("b")){
//                    if(ctx.MODEMINOR() != null && ctx.MODEMINOR().equals("m")){
//                    }else{
//                        key = Key.Cb_MAJOR;
//                    }
//                }else if(ctx.keynote().KEYACCIDENTAL().equals("#")){
//                    if(ctx.MODEMINOR() != null && ctx.MODEMINOR().equals("m")){
//                        key = Key.Cs_MINOR;
//                    }else{
//                        key = Key.Cs_MAJOR;
//                    }
//                }else{
//                    if(ctx.MODEMINOR() != null && ctx.MODEMINOR().equals("m")){
//                        key = Key.C_MINOR;
//                    }else{
//                        key = Key.C_MAJOR;
//                    }
//                }
//            }
//
//        }else if(ctx.keynote().BASENOTE().equals("D")){
//            if(ctx.keynote().KEYACCIDENTAL() != null){
//                if(ctx.keynote().KEYACCIDENTAL().equals("b")){
//                    if(ctx.MODEMINOR() != null && ctx.MODEMINOR().equals("m")){
//                    }else{
//                        key = Key.Db_MAJOR;
//                    }
//                }else if(ctx.keynote().KEYACCIDENTAL().equals("#")){
//                    if(ctx.MODEMINOR() != null && ctx.MODEMINOR().equals("m")){
//                        key = Key.Ds_MINOR;
//                    }
//                }else{
//                    if(ctx.MODEMINOR() != null && ctx.MODEMINOR().equals("m")){
//                        key = Key.D_MINOR;
//                    }else{
//                        key = Key.D_MAJOR;
//                    }
//                }
//            }
//
//        }else if(ctx.keynote().BASENOTE().equals("E")){
//            if(ctx.keynote().KEYACCIDENTAL() != null){
//                if(ctx.keynote().KEYACCIDENTAL().equals("b")){
//                    if(ctx.MODEMINOR() != null && ctx.MODEMINOR().equals("m")){
//                        key = Key.Eb_MINOR;
//                    }else{
//                        key = Key.Eb_MAJOR;
//                    }
//                }else{
//                    if(ctx.MODEMINOR() != null && ctx.MODEMINOR().equals("m")){
//                        key = Key.E_MINOR;
//                    }else{
//                        key = Key.E_MAJOR;
//                    }
//                }
//            }
//
//        }else if(ctx.keynote().BASENOTE().equals("F")){
//            if(ctx.keynote().KEYACCIDENTAL() != null){
//               if(ctx.keynote().KEYACCIDENTAL().equals("#")){
//                    if(ctx.MODEMINOR() != null && ctx.MODEMINOR().equals("m")){
//                        key = Key.Fs_MINOR;
//                    }else{
//                        key = Key.Fs_MAJOR;
//                    }
//                }else{
//                    if(ctx.MODEMINOR() != null && ctx.MODEMINOR().equals("m")){
//                        key = Key.F_MINOR;
//                    }else{
//                        key = Key.F_MAJOR;
//                    }
//                }
//            }
//
//        }else if(ctx.keynote().BASENOTE().equals("G")){
//            if(ctx.keynote().KEYACCIDENTAL() != null){
//                if(ctx.keynote().KEYACCIDENTAL().equals("b")){
//                    if(ctx.MODEMINOR() != null && ctx.MODEMINOR().equals("m")){
//                    }else{
//                        key = Key.Gb_MAJOR;
//                    }
//                }else if(ctx.keynote().KEYACCIDENTAL().equals("#")){
//                    if(ctx.MODEMINOR() != null && ctx.MODEMINOR().equals("m")){
//                        key = Key.Gs_MINOR;
//                    }
//                }else{
//                    if(ctx.MODEMINOR() != null && ctx.MODEMINOR().equals("m")){
//                        key = Key.G_MINOR;
//                    }else{
//                        key = Key.G_MAJOR;
//                    }
//                }
//            }
//        }
//    }



}
