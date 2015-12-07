// Generated from Abc.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AbcLexer extends Lexer {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, X=9, 
    T=10, L=11, LENGTH=12, Q=13, BPM=14, BPT=15, M=16, METER=17, C=18, V=19, 
    K=20, ACCIDENTAL=21, BARLINE=22, NTHREPEAT=23, BASENOTE=24, DIGIT=25, 
    NEWLINE=26, WHITESPACE=27, WS=28;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "X", 
    "T", "L", "LENGTH", "Q", "BPM", "BPT", "M", "METER", "C", "V", "K", 
    "ACCIDENTAL", "BARLINE", "NTHREPEAT", "BASENOTE", "DIGIT", "NEWLINE", 
    "WHITESPACE", "WS"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'''", "','", "'/'", "'z'", "'('", "'['", "']'", "'%'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, "X", "T", "L", 
    "LENGTH", "Q", "BPM", "BPT", "M", "METER", "C", "V", "K", "ACCIDENTAL", 
    "BARLINE", "NTHREPEAT", "BASENOTE", "DIGIT", "NEWLINE", "WHITESPACE", 
    "WS"
  };
  public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

  /**
   * @deprecated Use {@link #VOCABULARY} instead.
   */
  @Deprecated
  public static final String[] tokenNames;
  static {
    tokenNames = new String[_SYMBOLIC_NAMES.length];
    for (int i = 0; i < tokenNames.length; i++) {
      tokenNames[i] = VOCABULARY.getLiteralName(i);
      if (tokenNames[i] == null) {
        tokenNames[i] = VOCABULARY.getSymbolicName(i);
      }

      if (tokenNames[i] == null) {
        tokenNames[i] = "<INVALID>";
      }
    }
  }

  @Override
  @Deprecated
  public String[] getTokenNames() {
    return tokenNames;
  }

  @Override

  public Vocabulary getVocabulary() {
    return VOCABULARY;
  }


      // This method makes the parser stop running if it encounters
      // invalid input and throw a RuntimeException.
      public void reportErrorsAsExceptions() {
          // To prevent any reports to standard error, add this line:
          //removeErrorListeners();
          
          addErrorListener(new BaseErrorListener() {
              public void syntaxError(Recognizer<?, ?> recognizer,
                                      Object offendingSymbol, 
                                      int line, int charPositionInLine,
                                      String msg, RecognitionException e) {
                  throw new ParseCancellationException(msg, e);
              }
          });
      }


  public AbcLexer(CharStream input) {
    super(input);
    _interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }

  @Override
  public String getGrammarFileName() { return "Abc.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public String[] getModeNames() { return modeNames; }

  @Override
  public ATN getATN() { return _ATN; }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u00f1\b\1\4"+
      "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
      "\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
      "\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
      "\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3"+
      "\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
      "\3\n\3\n\6\nP\n\n\r\n\16\nQ\3\n\3\n\3\13\3\13\3\13\3\13\6\13Z\n\13"+
      "\r\13\16\13[\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\6\rg\n\r\r\r\16"+
      "\rh\3\r\3\r\6\rm\n\r\r\r\16\rn\3\r\6\rr\n\r\r\r\16\rs\5\rv\n\r\3\16"+
      "\3\16\3\16\3\16\3\16\3\16\3\16\5\16\177\n\16\3\17\6\17\u0082\n\17"+
      "\r\17\16\17\u0083\3\20\6\20\u0087\n\20\r\20\16\20\u0088\3\20\3\20"+
      "\6\20\u008d\n\20\r\20\16\20\u008e\3\21\3\21\3\21\3\21\3\21\3\21\3"+
      "\22\6\22\u0098\n\22\r\22\16\22\u0099\3\22\3\22\6\22\u009e\n\22\r\22"+
      "\16\22\u009f\3\23\3\23\3\23\3\23\6\23\u00a6\n\23\r\23\16\23\u00a7"+
      "\3\23\3\23\3\24\3\24\3\24\3\24\6\24\u00b0\n\24\r\24\16\24\u00b1\3"+
      "\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u00bb\n\25\3\25\5\25\u00be"+
      "\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00c9\n\26"+
      "\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00d6"+
      "\n\27\3\30\3\30\3\30\3\30\5\30\u00dc\n\30\3\31\3\31\3\32\3\32\3\33"+
      "\3\33\3\33\5\33\u00e5\n\33\5\33\u00e7\n\33\3\34\3\34\3\35\6\35\u00ec"+
      "\n\35\r\35\16\35\u00ed\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17"+
      "\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)"+
      "\26+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\b\3\2\62;\4\2\f\f"+
      "\17\17\4\2%%dd\4\2CIci\4\2\13\13\"\"\3\2\"\"\u010e\2\3\3\2\2\2\2\5"+
      "\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
      "\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
      "\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
      "\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
      "\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2"+
      "\3;\3\2\2\2\5=\3\2\2\2\7?\3\2\2\2\tA\3\2\2\2\13C\3\2\2\2\rE\3\2\2"+
      "\2\17G\3\2\2\2\21I\3\2\2\2\23K\3\2\2\2\25U\3\2\2\2\27_\3\2\2\2\31"+
      "u\3\2\2\2\33~\3\2\2\2\35\u0081\3\2\2\2\37\u0086\3\2\2\2!\u0090\3\2"+
      "\2\2#\u0097\3\2\2\2%\u00a1\3\2\2\2\'\u00ab\3\2\2\2)\u00b5\3\2\2\2"+
      "+\u00c8\3\2\2\2-\u00d5\3\2\2\2/\u00db\3\2\2\2\61\u00dd\3\2\2\2\63"+
      "\u00df\3\2\2\2\65\u00e6\3\2\2\2\67\u00e8\3\2\2\29\u00eb\3\2\2\2;<"+
      "\7)\2\2<\4\3\2\2\2=>\7.\2\2>\6\3\2\2\2?@\7\61\2\2@\b\3\2\2\2AB\7|"+
      "\2\2B\n\3\2\2\2CD\7*\2\2D\f\3\2\2\2EF\7]\2\2F\16\3\2\2\2GH\7_\2\2"+
      "H\20\3\2\2\2IJ\7\'\2\2J\22\3\2\2\2KL\7Z\2\2LM\7<\2\2MO\3\2\2\2NP\t"+
      "\2\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\f\2\2"+
      "T\24\3\2\2\2UV\7V\2\2VW\7<\2\2WY\3\2\2\2XZ\n\3\2\2YX\3\2\2\2Z[\3\2"+
      "\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7\f\2\2^\26\3\2\2\2_`\7N\2"+
      "\2`a\7<\2\2ab\3\2\2\2bc\5\31\r\2cd\7\f\2\2d\30\3\2\2\2eg\t\2\2\2f"+
      "e\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jl\7\61\2\2km\t\2"+
      "\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2ov\3\2\2\2pr\t\2\2\2q"+
      "p\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2uf\3\2\2\2uq\3\2"+
      "\2\2v\32\3\2\2\2wx\7S\2\2xy\7<\2\2yz\3\2\2\2z\177\7E\2\2{|\7E\2\2"+
      "|\177\7~\2\2}\177\5\35\17\2~w\3\2\2\2~{\3\2\2\2~}\3\2\2\2\177\34\3"+
      "\2\2\2\u0080\u0082\t\2\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2"+
      "\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\36\3\2\2\2\u0085\u0087"+
      "\t\2\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2"+
      "\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\7\61\2\2\u008b"+
      "\u008d\t\2\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c"+
      "\3\2\2\2\u008e\u008f\3\2\2\2\u008f \3\2\2\2\u0090\u0091\7O\2\2\u0091"+
      "\u0092\7<\2\2\u0092\u0093\3\2\2\2\u0093\u0094\5#\22\2\u0094\u0095"+
      "\7\f\2\2\u0095\"\3\2\2\2\u0096\u0098\t\2\2\2\u0097\u0096\3\2\2\2\u0098"+
      "\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b"+
      "\3\2\2\2\u009b\u009d\7\61\2\2\u009c\u009e\t\2\2\2\u009d\u009c\3\2"+
      "\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
      "$\3\2\2\2\u00a1\u00a2\7E\2\2\u00a2\u00a3\7<\2\2\u00a3\u00a5\3\2\2"+
      "\2\u00a4\u00a6\n\3\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
      "\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa"+
      "\7\f\2\2\u00aa&\3\2\2\2\u00ab\u00ac\7X\2\2\u00ac\u00ad\7<\2\2\u00ad"+
      "\u00af\3\2\2\2\u00ae\u00b0\n\3\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1"+
      "\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2"+
      "\2\u00b3\u00b4\7\f\2\2\u00b4(\3\2\2\2\u00b5\u00b6\7M\2\2\u00b6\u00b7"+
      "\7<\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\5\61\31\2\u00b9\u00bb\t\4"+
      "\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc"+
      "\u00be\7o\2\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf"+
      "\3\2\2\2\u00bf\u00c0\7\f\2\2\u00c0*\3\2\2\2\u00c1\u00c9\7`\2\2\u00c2"+
      "\u00c3\7`\2\2\u00c3\u00c9\7`\2\2\u00c4\u00c9\7a\2\2\u00c5\u00c6\7"+
      "a\2\2\u00c6\u00c9\7a\2\2\u00c7\u00c9\7?\2\2\u00c8\u00c1\3\2\2\2\u00c8"+
      "\u00c2\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c7"+
      "\3\2\2\2\u00c9,\3\2\2\2\u00ca\u00d6\7~\2\2\u00cb\u00cc\7~\2\2\u00cc"+
      "\u00d6\7~\2\2\u00cd\u00ce\7]\2\2\u00ce\u00d6\7~\2\2\u00cf\u00d0\7"+
      "~\2\2\u00d0\u00d6\7_\2\2\u00d1\u00d2\7<\2\2\u00d2\u00d6\7~\2\2\u00d3"+
      "\u00d4\7~\2\2\u00d4\u00d6\7<\2\2\u00d5\u00ca\3\2\2\2\u00d5\u00cb\3"+
      "\2\2\2\u00d5\u00cd\3\2\2\2\u00d5\u00cf\3\2\2\2\u00d5\u00d1\3\2\2\2"+
      "\u00d5\u00d3\3\2\2\2\u00d6.\3\2\2\2\u00d7\u00d8\7]\2\2\u00d8\u00dc"+
      "\7\63\2\2\u00d9\u00da\7]\2\2\u00da\u00dc\7\64\2\2\u00db\u00d7\3\2"+
      "\2\2\u00db\u00d9\3\2\2\2\u00dc\60\3\2\2\2\u00dd\u00de\t\5\2\2\u00de"+
      "\62\3\2\2\2\u00df\u00e0\t\2\2\2\u00e0\64\3\2\2\2\u00e1\u00e7\7\f\2"+
      "\2\u00e2\u00e4\7\17\2\2\u00e3\u00e5\7\f\2\2\u00e4\u00e3\3\2\2\2\u00e4"+
      "\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e1\3\2\2\2\u00e6\u00e2"+
      "\3\2\2\2\u00e7\66\3\2\2\2\u00e8\u00e9\t\6\2\2\u00e98\3\2\2\2\u00ea"+
      "\u00ec\t\7\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb"+
      "\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\b\35"+
      "\2\2\u00f0:\3\2\2\2\31\2Q[hnsu~\u0083\u0088\u008e\u0099\u009f\u00a7"+
      "\u00b1\u00ba\u00bd\u00c8\u00d5\u00db\u00e4\u00e6\u00ed\3\b\2\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}