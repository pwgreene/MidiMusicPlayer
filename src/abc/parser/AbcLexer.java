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
    COMMENT=1, FIELD_NUMBER=2, FIELD_TITLE=3, FIELD_COMPOSER=4, FIELD_DEFAULT_LENGTH=5, 
    FIELD_METER=6, FIELD_TEMPO=7, FIELD_VOICE=8, FIELD_KEY=9, LINE=10, NOTE=11, 
    PITCH=12, KEYACCIDENTAL=13, MODEMINOR=14, SPACE=15, REST=16, OPEN_BRACKET=17, 
    CLOSE_BRACKET=18, BARLINE=19, NTH_REPEAT=20, DUPLET=21, TRIPLET=22, 
    QUADRUPLET=23, SLASH=24, DIGIT=25;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "COMMENT", "FIELD_NUMBER", "FIELD_TITLE", "FIELD_COMPOSER", "FIELD_DEFAULT_LENGTH", 
    "FIELD_METER", "FIELD_TEMPO", "FIELD_VOICE", "FIELD_KEY", "LINE", "NOTE", 
    "PITCH", "KEYACCIDENTAL", "MODEMINOR", "SPACE", "REST", "OPEN_BRACKET", 
    "CLOSE_BRACKET", "BARLINE", "NTH_REPEAT", "DUPLET", "TRIPLET", "QUADRUPLET", 
    "SLASH", "DIGIT"
  };

  private static final String[] _LITERAL_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, "'m'", null, "'z'", "'['", "']'", null, null, "'(2'", "'(3'", 
    "'(4'", "'/'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, "COMMENT", "FIELD_NUMBER", "FIELD_TITLE", "FIELD_COMPOSER", "FIELD_DEFAULT_LENGTH", 
    "FIELD_METER", "FIELD_TEMPO", "FIELD_VOICE", "FIELD_KEY", "LINE", "NOTE", 
    "PITCH", "KEYACCIDENTAL", "MODEMINOR", "SPACE", "REST", "OPEN_BRACKET", 
    "CLOSE_BRACKET", "BARLINE", "NTH_REPEAT", "DUPLET", "TRIPLET", "QUADRUPLET", 
    "SLASH", "DIGIT"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u013d\b\1\4"+
      "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
      "\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
      "\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
      "\4\30\t\30\4\31\t\31\4\32\t\32\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\2"+
      "\3\2\3\3\3\3\3\3\3\3\7\3C\n\3\f\3\16\3F\13\3\3\3\6\3I\n\3\r\3\16\3"+
      "J\3\4\3\4\3\4\3\4\7\4Q\n\4\f\4\16\4T\13\4\3\4\6\4W\n\4\r\4\16\4X\3"+
      "\5\3\5\3\5\3\5\7\5_\n\5\f\5\16\5b\13\5\3\5\6\5e\n\5\r\5\16\5f\3\6"+
      "\3\6\3\6\3\6\7\6m\n\6\f\6\16\6p\13\6\3\6\6\6s\n\6\r\6\16\6t\3\6\3"+
      "\6\6\6y\n\6\r\6\16\6z\3\7\3\7\3\7\3\7\7\7\u0081\n\7\f\7\16\7\u0084"+
      "\13\7\3\7\3\7\3\7\3\7\6\7\u008a\n\7\r\7\16\7\u008b\3\7\3\7\6\7\u0090"+
      "\n\7\r\7\16\7\u0091\5\7\u0094\n\7\3\b\3\b\3\b\3\b\7\b\u009a\n\b\f"+
      "\b\16\b\u009d\13\b\3\b\6\b\u00a0\n\b\r\b\16\b\u00a1\3\b\3\b\6\b\u00a6"+
      "\n\b\r\b\16\b\u00a7\3\b\3\b\5\b\u00ac\n\b\3\b\6\b\u00af\n\b\r\b\16"+
      "\b\u00b0\3\t\3\t\3\t\3\t\7\t\u00b7\n\t\f\t\16\t\u00ba\13\t\3\t\6\t"+
      "\u00bd\n\t\r\t\16\t\u00be\3\n\3\n\3\n\3\n\7\n\u00c5\n\n\f\n\16\n\u00c8"+
      "\13\n\3\n\3\n\5\n\u00cc\n\n\3\n\5\n\u00cf\n\n\3\13\6\13\u00d2\n\13"+
      "\r\13\16\13\u00d3\3\f\3\f\5\f\u00d8\n\f\3\f\3\f\6\f\u00dc\n\f\r\f"+
      "\16\f\u00dd\3\f\3\f\3\f\5\f\u00e3\n\f\3\f\6\f\u00e6\n\f\r\f\16\f\u00e7"+
      "\3\f\6\f\u00eb\n\f\r\f\16\f\u00ec\3\f\3\f\6\f\u00f1\n\f\r\f\16\f\u00f2"+
      "\5\f\u00f5\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00fe\n\r\3\r\3\r\6"+
      "\r\u0102\n\r\r\r\16\r\u0103\3\r\6\r\u0107\n\r\r\r\16\r\u0108\5\r\u010b"+
      "\n\r\3\16\3\16\3\17\3\17\3\20\6\20\u0112\n\20\r\20\16\20\u0113\3\20"+
      "\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
      "\3\24\3\24\3\24\3\24\3\24\5\24\u0129\n\24\3\25\3\25\3\25\3\25\5\25"+
      "\u012f\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31"+
      "\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
      "\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
      "\63\33\3\2\7\3\2\f\f\4\2CIci\4\2\13\f\17\17\4\2%%dd\3\2\62;\u0170"+
      "\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
      "\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
      "\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
      "\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-"+
      "\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5>\3\2"+
      "\2\2\7L\3\2\2\2\tZ\3\2\2\2\13h\3\2\2\2\r|\3\2\2\2\17\u0095\3\2\2\2"+
      "\21\u00b2\3\2\2\2\23\u00c0\3\2\2\2\25\u00d1\3\2\2\2\27\u00d7\3\2\2"+
      "\2\31\u00fd\3\2\2\2\33\u010c\3\2\2\2\35\u010e\3\2\2\2\37\u0111\3\2"+
      "\2\2!\u0117\3\2\2\2#\u0119\3\2\2\2%\u011b\3\2\2\2\'\u0128\3\2\2\2"+
      ")\u012e\3\2\2\2+\u0130\3\2\2\2-\u0133\3\2\2\2/\u0136\3\2\2\2\61\u0139"+
      "\3\2\2\2\63\u013b\3\2\2\2\659\7\'\2\2\668\n\2\2\2\67\66\3\2\2\28;"+
      "\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\b\2\2\2=\4\3"+
      "\2\2\2>?\7Z\2\2?@\7<\2\2@D\3\2\2\2AC\5\37\20\2BA\3\2\2\2CF\3\2\2\2"+
      "DB\3\2\2\2DE\3\2\2\2EH\3\2\2\2FD\3\2\2\2GI\5\63\32\2HG\3\2\2\2IJ\3"+
      "\2\2\2JH\3\2\2\2JK\3\2\2\2K\6\3\2\2\2LM\7V\2\2MN\7<\2\2NR\3\2\2\2"+
      "OQ\5\37\20\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2\2TR\3"+
      "\2\2\2UW\n\2\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\b\3\2\2"+
      "\2Z[\7E\2\2[\\\7<\2\2\\`\3\2\2\2]_\5\37\20\2^]\3\2\2\2_b\3\2\2\2`"+
      "^\3\2\2\2`a\3\2\2\2ad\3\2\2\2b`\3\2\2\2ce\n\2\2\2dc\3\2\2\2ef\3\2"+
      "\2\2fd\3\2\2\2fg\3\2\2\2g\n\3\2\2\2hi\7N\2\2ij\7<\2\2jn\3\2\2\2km"+
      "\5\37\20\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2or\3\2\2\2pn\3\2"+
      "\2\2qs\5\63\32\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2"+
      "vx\7\61\2\2wy\5\63\32\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\f"+
      "\3\2\2\2|}\7O\2\2}~\7<\2\2~\u0082\3\2\2\2\177\u0081\5\37\20\2\u0080"+
      "\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3"+
      "\2\2\2\u0083\u0093\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0094\7E\2\2"+
      "\u0086\u0087\7E\2\2\u0087\u0094\7~\2\2\u0088\u008a\5\63\32\2\u0089"+
      "\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c"+
      "\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\7\61\2\2\u008e\u0090\5\63"+
      "\32\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2"+
      "\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0085\3\2\2\2\u0093"+
      "\u0086\3\2\2\2\u0093\u0089\3\2\2\2\u0094\16\3\2\2\2\u0095\u0096\7"+
      "S\2\2\u0096\u0097\7<\2\2\u0097\u009b\3\2\2\2\u0098\u009a\5\37\20\2"+
      "\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
      "\u009c\3\2\2\2\u009c\u00ab\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a0"+
      "\5\63\32\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2"+
      "\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\7\61\2\2"+
      "\u00a4\u00a6\5\63\32\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
      "\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa"+
      "\7?\2\2\u00aa\u00ac\3\2\2\2\u00ab\u009f\3\2\2\2\u00ab\u00ac\3\2\2"+
      "\2\u00ac\u00ae\3\2\2\2\u00ad\u00af\5\63\32\2\u00ae\u00ad\3\2\2\2\u00af"+
      "\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\20\3"+
      "\2\2\2\u00b2\u00b3\7X\2\2\u00b3\u00b4\7<\2\2\u00b4\u00b8\3\2\2\2\u00b5"+
      "\u00b7\5\37\20\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6"+
      "\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2"+
      "\2\u00bb\u00bd\n\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
      "\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\22\3\2\2\2\u00c0\u00c1\7"+
      "M\2\2\u00c1\u00c2\7<\2\2\u00c2\u00c6\3\2\2\2\u00c3\u00c5\5\37\20\2"+
      "\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
      "\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cb"+
      "\t\3\2\2\u00ca\u00cc\5\33\16\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2"+
      "\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cf\5\35\17\2\u00ce\u00cd\3\2\2\2"+
      "\u00ce\u00cf\3\2\2\2\u00cf\24\3\2\2\2\u00d0\u00d2\t\4\2\2\u00d1\u00d0"+
      "\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2"+
      "\2\u00d4\26\3\2\2\2\u00d5\u00d8\5\31\r\2\u00d6\u00d8\5!\21\2\u00d7"+
      "\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00f4\3\2\2\2\u00d9\u00f5"+
      "\5\61\31\2\u00da\u00dc\5\63\32\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3"+
      "\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2"+
      "\u00df\u00e0\5\61\31\2\u00e0\u00f5\3\2\2\2\u00e1\u00e3\5\61\31\2\u00e2"+
      "\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e6"+
      "\5\63\32\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2"+
      "\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00f5\3\2\2\2\u00e9\u00eb\5\63\32\2"+
      "\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
      "\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\7\61\2\2\u00ef\u00f1"+
      "\5\63\32\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2"+
      "\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00d9\3\2\2\2\u00f4"+
      "\u00db\3\2\2\2\u00f4\u00e2\3\2\2\2\u00f4\u00ea\3\2\2\2\u00f4\u00f5"+
      "\3\2\2\2\u00f5\30\3\2\2\2\u00f6\u00fe\7`\2\2\u00f7\u00f8\7`\2\2\u00f8"+
      "\u00fe\7`\2\2\u00f9\u00fe\7a\2\2\u00fa\u00fb\7a\2\2\u00fb\u00fe\7"+
      "a\2\2\u00fc\u00fe\7?\2\2\u00fd\u00f6\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fd"+
      "\u00f9\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe"+
      "\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u010a\t\3\2\2\u0100\u0102\7)\2"+
      "\2\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103"+
      "\u0104\3\2\2\2\u0104\u010b\3\2\2\2\u0105\u0107\7.\2\2\u0106\u0105"+
      "\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2"+
      "\2\u0109\u010b\3\2\2\2\u010a\u0101\3\2\2\2\u010a\u0106\3\2\2\2\u010a"+
      "\u010b\3\2\2\2\u010b\32\3\2\2\2\u010c\u010d\t\5\2\2\u010d\34\3\2\2"+
      "\2\u010e\u010f\7o\2\2\u010f\36\3\2\2\2\u0110\u0112\7\"\2\2\u0111\u0110"+
      "\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2"+
      "\2\u0114\u0115\3\2\2\2\u0115\u0116\b\20\2\2\u0116 \3\2\2\2\u0117\u0118"+
      "\7|\2\2\u0118\"\3\2\2\2\u0119\u011a\7]\2\2\u011a$\3\2\2\2\u011b\u011c"+
      "\7_\2\2\u011c&\3\2\2\2\u011d\u0129\7~\2\2\u011e\u011f\7~\2\2\u011f"+
      "\u0129\7~\2\2\u0120\u0121\7]\2\2\u0121\u0129\7~\2\2\u0122\u0123\7"+
      "~\2\2\u0123\u0129\7_\2\2\u0124\u0125\7<\2\2\u0125\u0129\7~\2\2\u0126"+
      "\u0127\7~\2\2\u0127\u0129\7<\2\2\u0128\u011d\3\2\2\2\u0128\u011e\3"+
      "\2\2\2\u0128\u0120\3\2\2\2\u0128\u0122\3\2\2\2\u0128\u0124\3\2\2\2"+
      "\u0128\u0126\3\2\2\2\u0129(\3\2\2\2\u012a\u012b\7]\2\2\u012b\u012f"+
      "\7\63\2\2\u012c\u012d\7]\2\2\u012d\u012f\7\64\2\2\u012e\u012a\3\2"+
      "\2\2\u012e\u012c\3\2\2\2\u012f*\3\2\2\2\u0130\u0131\7*\2\2\u0131\u0132"+
      "\7\64\2\2\u0132,\3\2\2\2\u0133\u0134\7*\2\2\u0134\u0135\7\65\2\2\u0135"+
      ".\3\2\2\2\u0136\u0137\7*\2\2\u0137\u0138\7\66\2\2\u0138\60\3\2\2\2"+
      "\u0139\u013a\7\61\2\2\u013a\62\3\2\2\2\u013b\u013c\t\6\2\2\u013c\64"+
      "\3\2\2\2*\29DJRX`fntz\u0082\u008b\u0091\u0093\u009b\u00a1\u00a7\u00ab"+
      "\u00b0\u00b8\u00be\u00c6\u00cb\u00ce\u00d3\u00d7\u00dd\u00e2\u00e7"+
      "\u00ec\u00f2\u00f4\u00fd\u0103\u0108\u010a\u0113\u0128\u012e\3\b\2"+
      "\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}