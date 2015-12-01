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
   * Enter a parse tree produced by {@link AbcParser#abc}.
   * @param ctx the parse tree
   */
  void enterAbc(AbcParser.AbcContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#abc}.
   * @param ctx the parse tree
   */
  void exitAbc(AbcParser.AbcContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#x}.
   * @param ctx the parse tree
   */
  void enterX(AbcParser.XContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#x}.
   * @param ctx the parse tree
   */
  void exitX(AbcParser.XContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#t}.
   * @param ctx the parse tree
   */
  void enterT(AbcParser.TContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#t}.
   * @param ctx the parse tree
   */
  void exitT(AbcParser.TContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#l}.
   * @param ctx the parse tree
   */
  void enterL(AbcParser.LContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#l}.
   * @param ctx the parse tree
   */
  void exitL(AbcParser.LContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#q}.
   * @param ctx the parse tree
   */
  void enterQ(AbcParser.QContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#q}.
   * @param ctx the parse tree
   */
  void exitQ(AbcParser.QContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#m}.
   * @param ctx the parse tree
   */
  void enterM(AbcParser.MContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#m}.
   * @param ctx the parse tree
   */
  void exitM(AbcParser.MContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#c}.
   * @param ctx the parse tree
   */
  void enterC(AbcParser.CContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#c}.
   * @param ctx the parse tree
   */
  void exitC(AbcParser.CContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#v}.
   * @param ctx the parse tree
   */
  void enterV(AbcParser.VContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#v}.
   * @param ctx the parse tree
   */
  void exitV(AbcParser.VContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#k}.
   * @param ctx the parse tree
   */
  void enterK(AbcParser.KContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#k}.
   * @param ctx the parse tree
   */
  void exitK(AbcParser.KContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#key}.
   * @param ctx the parse tree
   */
  void enterKey(AbcParser.KeyContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#key}.
   * @param ctx the parse tree
   */
  void exitKey(AbcParser.KeyContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#keynote}.
   * @param ctx the parse tree
   */
  void enterKeynote(AbcParser.KeynoteContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#keynote}.
   * @param ctx the parse tree
   */
  void exitKeynote(AbcParser.KeynoteContext ctx);
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
   * Enter a parse tree produced by {@link AbcParser#eol}.
   * @param ctx the parse tree
   */
  void enterEol(AbcParser.EolContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#eol}.
   * @param ctx the parse tree
   */
  void exitEol(AbcParser.EolContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#comment}.
   * @param ctx the parse tree
   */
  void enterComment(AbcParser.CommentContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#comment}.
   * @param ctx the parse tree
   */
  void exitComment(AbcParser.CommentContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#text}.
   * @param ctx the parse tree
   */
  void enterText(AbcParser.TextContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#text}.
   * @param ctx the parse tree
   */
  void exitText(AbcParser.TextContext ctx);
}