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
    T__0=1, T__1=2, T__2=3, HEADERX=4, INDEX=5, HEADERT=6, TITLE=7, HEADERL=8, 
    LENGTH=9, HEADERQ=10, BPM=11, BPT=12, HEADERM=13, METER=14, HEADERC=15, 
    COMPOSER=16, HEADERV=17, VOICE=18, HEADERK=19, KEYACCIDENTAL=20, MODEMINOR=21, 
    BASENOTE=22, NEWLINE=23, SPACES=24;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "HEADERX", "INDEX", "HEADERT", "TITLE", "HEADERL", 
    "LENGTH", "HEADERQ", "BPM", "BPT", "HEADERM", "METER", "HEADERC", "COMPOSER", 
    "HEADERV", "VOICE", "HEADERK", "KEYACCIDENTAL", "MODEMINOR", "BASENOTE", 
    "NEWLINE", "SPACES"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'C'", "'C|'", "'%'", "'X:'", null, "'T:'", null, "'L:'", null, 
    "'Q:'", null, null, "'M:'", null, "'C:'", null, "'V:'", null, "'K:'", 
    null, "'m'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, "HEADERX", "INDEX", "HEADERT", "TITLE", "HEADERL", 
    "LENGTH", "HEADERQ", "BPM", "BPT", "HEADERM", "METER", "HEADERC", "COMPOSER", 
    "HEADERV", "VOICE", "HEADERK", "KEYACCIDENTAL", "MODEMINOR", "BASENOTE", 
    "NEWLINE", "SPACES"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u00aa\b\1\4"+
      "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
      "\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
      "\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
      "\4\30\t\30\4\31\t\31\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\6"+
      "\6?\n\6\r\6\16\6@\3\7\3\7\3\7\3\b\7\bG\n\b\f\b\16\bJ\13\b\3\t\3\t"+
      "\3\t\3\n\6\nP\n\n\r\n\16\nQ\3\n\3\n\6\nV\n\n\r\n\16\nW\3\n\6\n[\n"+
      "\n\r\n\16\n\\\5\n_\n\n\3\13\3\13\3\13\3\f\6\fe\n\f\r\f\16\ff\3\r\6"+
      "\rj\n\r\r\r\16\rk\3\r\3\r\6\rp\n\r\r\r\16\rq\3\16\3\16\3\16\3\17\6"+
      "\17x\n\17\r\17\16\17y\3\17\3\17\6\17~\n\17\r\17\16\17\177\3\20\3\20"+
      "\3\20\3\21\7\21\u0086\n\21\f\21\16\21\u0089\13\21\3\22\3\22\3\22\3"+
      "\23\7\23\u008f\n\23\f\23\16\23\u0092\13\23\3\24\3\24\3\24\3\25\3\25"+
      "\3\26\3\26\3\27\3\27\3\30\3\30\3\30\5\30\u00a0\n\30\5\30\u00a2\n\30"+
      "\3\31\6\31\u00a5\n\31\r\31\16\31\u00a6\3\31\3\31\2\2\32\3\3\5\4\7"+
      "\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
      "!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\7\4\2\62\62;<\3\2\62;"+
      "\4\2ZZdd\4\2CIci\3\2\"\"\u00b9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
      "\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
      "\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
      "\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
      "\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63"+
      "\3\2\2\2\5\65\3\2\2\2\78\3\2\2\2\t:\3\2\2\2\13>\3\2\2\2\rB\3\2\2\2"+
      "\17H\3\2\2\2\21K\3\2\2\2\23^\3\2\2\2\25`\3\2\2\2\27d\3\2\2\2\31i\3"+
      "\2\2\2\33s\3\2\2\2\35w\3\2\2\2\37\u0081\3\2\2\2!\u0087\3\2\2\2#\u008a"+
      "\3\2\2\2%\u0090\3\2\2\2\'\u0093\3\2\2\2)\u0096\3\2\2\2+\u0098\3\2"+
      "\2\2-\u009a\3\2\2\2/\u00a1\3\2\2\2\61\u00a4\3\2\2\2\63\64\7E\2\2\64"+
      "\4\3\2\2\2\65\66\7E\2\2\66\67\7~\2\2\67\6\3\2\2\289\7\'\2\29\b\3\2"+
      "\2\2:;\7Z\2\2;<\7<\2\2<\n\3\2\2\2=?\t\2\2\2>=\3\2\2\2?@\3\2\2\2@>"+
      "\3\2\2\2@A\3\2\2\2A\f\3\2\2\2BC\7V\2\2CD\7<\2\2D\16\3\2\2\2EG\13\2"+
      "\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\20\3\2\2\2JH\3\2\2\2"+
      "KL\7N\2\2LM\7<\2\2M\22\3\2\2\2NP\t\3\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2"+
      "\2\2QR\3\2\2\2RS\3\2\2\2SU\7\61\2\2TV\t\3\2\2UT\3\2\2\2VW\3\2\2\2"+
      "WU\3\2\2\2WX\3\2\2\2X_\3\2\2\2Y[\t\3\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3"+
      "\2\2\2\\]\3\2\2\2]_\3\2\2\2^O\3\2\2\2^Z\3\2\2\2_\24\3\2\2\2`a\7S\2"+
      "\2ab\7<\2\2b\26\3\2\2\2ce\t\3\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg"+
      "\3\2\2\2g\30\3\2\2\2hj\t\3\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2"+
      "\2\2lm\3\2\2\2mo\7\61\2\2np\t\3\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2"+
      "qr\3\2\2\2r\32\3\2\2\2st\7O\2\2tu\7<\2\2u\34\3\2\2\2vx\t\3\2\2wv\3"+
      "\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{}\7\61\2\2|~\t\3\2"+
      "\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\36"+
      "\3\2\2\2\u0081\u0082\7E\2\2\u0082\u0083\7<\2\2\u0083 \3\2\2\2\u0084"+
      "\u0086\13\2\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085"+
      "\3\2\2\2\u0087\u0088\3\2\2\2\u0088\"\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
      "\u008b\7X\2\2\u008b\u008c\7<\2\2\u008c$\3\2\2\2\u008d\u008f\13\2\2"+
      "\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
      "\u0091\3\2\2\2\u0091&\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7M\2"+
      "\2\u0094\u0095\7<\2\2\u0095(\3\2\2\2\u0096\u0097\t\4\2\2\u0097*\3"+
      "\2\2\2\u0098\u0099\7o\2\2\u0099,\3\2\2\2\u009a\u009b\t\5\2\2\u009b"+
      ".\3\2\2\2\u009c\u00a2\7\f\2\2\u009d\u009f\7\17\2\2\u009e\u00a0\7\f"+
      "\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
      "\u009c\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2\60\3\2\2\2\u00a3\u00a5\t"+
      "\6\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2"+
      "\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\b\31\2\2\u00a9"+
      "\62\3\2\2\2\23\2@HQW\\^fkqy\177\u0087\u0090\u009f\u00a1\u00a6\3\b"+
      "\2\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}