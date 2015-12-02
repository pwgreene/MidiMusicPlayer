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
   * Enter a parse tree produced by {@link AbcParser#abcmusic}.
   * @param ctx the parse tree
   */
  void enterAbcmusic(AbcParser.AbcmusicContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#abcmusic}.
   * @param ctx the parse tree
   */
  void exitAbcmusic(AbcParser.AbcmusicContext ctx);
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
   * Enter a parse tree produced by {@link AbcParser#element}.
   * @param ctx the parse tree
   */
  void enterElement(AbcParser.ElementContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#element}.
   * @param ctx the parse tree
   */
  void exitElement(AbcParser.ElementContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#noteelement}.
   * @param ctx the parse tree
   */
  void enterNoteelement(AbcParser.NoteelementContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#noteelement}.
   * @param ctx the parse tree
   */
  void exitNoteelement(AbcParser.NoteelementContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#note}.
   * @param ctx the parse tree
   */
  void enterNote(AbcParser.NoteContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#note}.
   * @param ctx the parse tree
   */
  void exitNote(AbcParser.NoteContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#noteorrest}.
   * @param ctx the parse tree
   */
  void enterNoteorrest(AbcParser.NoteorrestContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#noteorrest}.
   * @param ctx the parse tree
   */
  void exitNoteorrest(AbcParser.NoteorrestContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#pitch}.
   * @param ctx the parse tree
   */
  void enterPitch(AbcParser.PitchContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#pitch}.
   * @param ctx the parse tree
   */
  void exitPitch(AbcParser.PitchContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#octave}.
   * @param ctx the parse tree
   */
  void enterOctave(AbcParser.OctaveContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#octave}.
   * @param ctx the parse tree
   */
  void exitOctave(AbcParser.OctaveContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#notelength}.
   * @param ctx the parse tree
   */
  void enterNotelength(AbcParser.NotelengthContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#notelength}.
   * @param ctx the parse tree
   */
  void exitNotelength(AbcParser.NotelengthContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#notelengthstrict}.
   * @param ctx the parse tree
   */
  void enterNotelengthstrict(AbcParser.NotelengthstrictContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#notelengthstrict}.
   * @param ctx the parse tree
   */
  void exitNotelengthstrict(AbcParser.NotelengthstrictContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#rest}.
   * @param ctx the parse tree
   */
  void enterRest(AbcParser.RestContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#rest}.
   * @param ctx the parse tree
   */
  void exitRest(AbcParser.RestContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#tupletelement}.
   * @param ctx the parse tree
   */
  void enterTupletelement(AbcParser.TupletelementContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#tupletelement}.
   * @param ctx the parse tree
   */
  void exitTupletelement(AbcParser.TupletelementContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#tupletspec}.
   * @param ctx the parse tree
   */
  void enterTupletspec(AbcParser.TupletspecContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#tupletspec}.
   * @param ctx the parse tree
   */
  void exitTupletspec(AbcParser.TupletspecContext ctx);
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
   * Enter a parse tree produced by {@link AbcParser#midtunefield}.
   * @param ctx the parse tree
   */
  void enterMidtunefield(AbcParser.MidtunefieldContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#midtunefield}.
   * @param ctx the parse tree
   */
  void exitMidtunefield(AbcParser.MidtunefieldContext ctx);
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