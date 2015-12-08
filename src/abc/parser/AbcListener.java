// Generated from Abc.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AbcParser}.
 */
public interface AbcListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link AbcParser#root}.
   * @param ctx the parse tree
   */
  void enterRoot(AbcParser.RootContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#root}.
   * @param ctx the parse tree
   */
  void exitRoot(AbcParser.RootContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#field_voice}.
   * @param ctx the parse tree
   */
  void enterField_voice(AbcParser.Field_voiceContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#field_voice}.
   * @param ctx the parse tree
   */
  void exitField_voice(AbcParser.Field_voiceContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#header}.
   * @param ctx the parse tree
   */
  void enterHeader(AbcParser.HeaderContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#header}.
   * @param ctx the parse tree
   */
  void exitHeader(AbcParser.HeaderContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#field_number}.
   * @param ctx the parse tree
   */
  void enterField_number(AbcParser.Field_numberContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#field_number}.
   * @param ctx the parse tree
   */
  void exitField_number(AbcParser.Field_numberContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#field_title}.
   * @param ctx the parse tree
   */
  void enterField_title(AbcParser.Field_titleContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#field_title}.
   * @param ctx the parse tree
   */
  void exitField_title(AbcParser.Field_titleContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#other_fields}.
   * @param ctx the parse tree
   */
  void enterOther_fields(AbcParser.Other_fieldsContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#other_fields}.
   * @param ctx the parse tree
   */
  void exitOther_fields(AbcParser.Other_fieldsContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#field_key}.
   * @param ctx the parse tree
   */
  void enterField_key(AbcParser.Field_keyContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#field_key}.
   * @param ctx the parse tree
   */
  void exitField_key(AbcParser.Field_keyContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#body}.
   * @param ctx the parse tree
   */
  void enterBody(AbcParser.BodyContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#body}.
   * @param ctx the parse tree
   */
  void exitBody(AbcParser.BodyContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#abcline}.
   * @param ctx the parse tree
   */
  void enterAbcline(AbcParser.AbclineContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#abcline}.
   * @param ctx the parse tree
   */
  void exitAbcline(AbcParser.AbclineContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#l_bracket}.
   * @param ctx the parse tree
   */
  void enterL_bracket(AbcParser.L_bracketContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#l_bracket}.
   * @param ctx the parse tree
   */
  void exitL_bracket(AbcParser.L_bracketContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#r_bracket}.
   * @param ctx the parse tree
   */
  void enterR_bracket(AbcParser.R_bracketContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#r_bracket}.
   * @param ctx the parse tree
   */
  void exitR_bracket(AbcParser.R_bracketContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#multinote}.
   * @param ctx the parse tree
   */
  void enterMultinote(AbcParser.MultinoteContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#multinote}.
   * @param ctx the parse tree
   */
  void exitMultinote(AbcParser.MultinoteContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#note_element}.
   * @param ctx the parse tree
   */
  void enterNote_element(AbcParser.Note_elementContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#note_element}.
   * @param ctx the parse tree
   */
  void exitNote_element(AbcParser.Note_elementContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#tuplet_element}.
   * @param ctx the parse tree
   */
  void enterTuplet_element(AbcParser.Tuplet_elementContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#tuplet_element}.
   * @param ctx the parse tree
   */
  void exitTuplet_element(AbcParser.Tuplet_elementContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#barline}.
   * @param ctx the parse tree
   */
  void enterBarline(AbcParser.BarlineContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#barline}.
   * @param ctx the parse tree
   */
  void exitBarline(AbcParser.BarlineContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#element}.
   * @param ctx the parse tree
   */
  void enterElement(AbcParser.ElementContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#element}.
   * @param ctx the parse tree
   */
  void exitElement(AbcParser.ElementContext ctx);
}