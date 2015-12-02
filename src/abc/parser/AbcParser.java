// Generated from Abc.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AbcParser extends Parser {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
    T__9=10, HEADERX=11, INDEX=12, HEADERT=13, TITLE=14, HEADERL=15, LENGTH=16, 
    HEADERQ=17, BPM=18, BPT=19, HEADERM=20, METER=21, HEADERC=22, COMPOSER=23, 
    HEADERV=24, VOICE=25, HEADERK=26, KEYACCIDENTAL=27, MODEMINOR=28, ACCIDENTAL=29, 
    BARLINE=30, NTHREPEAT=31, BASENOTE=32, DIGIT=33, NEWLINE=34, WHITESPACE=35;
  public static final int
    RULE_root = 0, RULE_x = 1, RULE_t = 2, RULE_l = 3, RULE_q = 4, RULE_m = 5, 
    RULE_c = 6, RULE_v = 7, RULE_k = 8, RULE_key = 9, RULE_keynote = 10, 
    RULE_body = 11, RULE_abcmusic = 12, RULE_abcline = 13, RULE_element = 14, 
    RULE_noteelement = 15, RULE_note = 16, RULE_noteorrest = 17, RULE_pitch = 18, 
    RULE_octave = 19, RULE_notelength = 20, RULE_notelengthstrict = 21, 
    RULE_rest = 22, RULE_tupletelement = 23, RULE_tupletspec = 24, RULE_multinote = 25, 
    RULE_midtunefield = 26, RULE_eol = 27, RULE_comment = 28, RULE_text = 29;
  public static final String[] ruleNames = {
    "root", "x", "t", "l", "q", "m", "c", "v", "k", "key", "keynote", "body", 
    "abcmusic", "abcline", "element", "noteelement", "note", "noteorrest", 
    "pitch", "octave", "notelength", "notelengthstrict", "rest", "tupletelement", 
    "tupletspec", "multinote", "midtunefield", "eol", "comment", "text"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'C'", "'C|'", "'''", "','", "'/'", "'z'", "'('", "'['", "']'", 
    "'%'", "'X:'", null, "'T:'", null, "'L:'", null, "'Q:'", null, null, 
    "'M:'", null, "'C:'", null, "'V:'", null, "'K:'", null, "'m'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, "HEADERX", 
    "INDEX", "HEADERT", "TITLE", "HEADERL", "LENGTH", "HEADERQ", "BPM", 
    "BPT", "HEADERM", "METER", "HEADERC", "COMPOSER", "HEADERV", "VOICE", 
    "HEADERK", "KEYACCIDENTAL", "MODEMINOR", "ACCIDENTAL", "BARLINE", "NTHREPEAT", 
    "BASENOTE", "DIGIT", "NEWLINE", "WHITESPACE"
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

  @Override
  public String getGrammarFileName() { return "Abc.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public ATN getATN() { return _ATN; }


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

  public AbcParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }
  public static class RootContext extends ParserRuleContext {
    public XContext x() {
      return getRuleContext(XContext.class,0);
    }
    public TContext t() {
      return getRuleContext(TContext.class,0);
    }
    public KContext k() {
      return getRuleContext(KContext.class,0);
    }
    public BodyContext body() {
      return getRuleContext(BodyContext.class,0);
    }
    public TerminalNode EOF() { return getToken(AbcParser.EOF, 0); }
    public List<LContext> l() {
      return getRuleContexts(LContext.class);
    }
    public LContext l(int i) {
      return getRuleContext(LContext.class,i);
    }
    public List<QContext> q() {
      return getRuleContexts(QContext.class);
    }
    public QContext q(int i) {
      return getRuleContext(QContext.class,i);
    }
    public List<MContext> m() {
      return getRuleContexts(MContext.class);
    }
    public MContext m(int i) {
      return getRuleContext(MContext.class,i);
    }
    public List<CContext> c() {
      return getRuleContexts(CContext.class);
    }
    public CContext c(int i) {
      return getRuleContext(CContext.class,i);
    }
    public List<CommentContext> comment() {
      return getRuleContexts(CommentContext.class);
    }
    public CommentContext comment(int i) {
      return getRuleContext(CommentContext.class,i);
    }
    public List<VContext> v() {
      return getRuleContexts(VContext.class);
    }
    public VContext v(int i) {
      return getRuleContext(VContext.class,i);
    }
    public RootContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_root; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterRoot(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitRoot(this);
    }
  }

  public final RootContext root() throws RecognitionException {
    RootContext _localctx = new RootContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_root);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(60);
      x();
      setState(61);
      t();
      setState(70);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__9) | (1L << HEADERL) | (1L << HEADERQ) | (1L << BPM) | (1L << HEADERM) | (1L << HEADERC) | (1L << HEADERV))) != 0)) {
        {
        setState(68);
        switch (_input.LA(1)) {
        case HEADERL:
          {
          setState(62);
          l();
          }
          break;
        case T__1:
        case HEADERQ:
        case BPM:
          {
          setState(63);
          q();
          }
          break;
        case HEADERM:
          {
          setState(64);
          m();
          }
          break;
        case HEADERC:
          {
          setState(65);
          c();
          }
          break;
        case T__9:
          {
          setState(66);
          comment();
          }
          break;
        case HEADERV:
          {
          setState(67);
          v();
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(72);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(73);
      k();
      setState(74);
      body();
      setState(75);
      match(EOF);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class XContext extends ParserRuleContext {
    public TerminalNode HEADERX() { return getToken(AbcParser.HEADERX, 0); }
    public TerminalNode INDEX() { return getToken(AbcParser.INDEX, 0); }
    public EolContext eol() {
      return getRuleContext(EolContext.class,0);
    }
    public XContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_x; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterX(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitX(this);
    }
  }

  public final XContext x() throws RecognitionException {
    XContext _localctx = new XContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_x);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(77);
      match(HEADERX);
      setState(78);
      match(INDEX);
      setState(79);
      eol();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class TContext extends ParserRuleContext {
    public TerminalNode HEADERT() { return getToken(AbcParser.HEADERT, 0); }
    public TerminalNode TITLE() { return getToken(AbcParser.TITLE, 0); }
    public EolContext eol() {
      return getRuleContext(EolContext.class,0);
    }
    public TContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_t; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterT(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitT(this);
    }
  }

  public final TContext t() throws RecognitionException {
    TContext _localctx = new TContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_t);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(81);
      match(HEADERT);
      setState(82);
      match(TITLE);
      setState(83);
      eol();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class LContext extends ParserRuleContext {
    public TerminalNode HEADERL() { return getToken(AbcParser.HEADERL, 0); }
    public TerminalNode LENGTH() { return getToken(AbcParser.LENGTH, 0); }
    public EolContext eol() {
      return getRuleContext(EolContext.class,0);
    }
    public LContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_l; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterL(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitL(this);
    }
  }

  public final LContext l() throws RecognitionException {
    LContext _localctx = new LContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_l);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(85);
      match(HEADERL);
      setState(86);
      match(LENGTH);
      setState(87);
      eol();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class QContext extends ParserRuleContext {
    public Token BPT;
    public TerminalNode HEADERQ() { return getToken(AbcParser.HEADERQ, 0); }
    public EolContext eol() {
      return getRuleContext(EolContext.class,0);
    }
    public TerminalNode BPM() { return getToken(AbcParser.BPM, 0); }
    public QContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_q; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterQ(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitQ(this);
    }
  }

  public final QContext q() throws RecognitionException {
    QContext _localctx = new QContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_q);
    try {
      setState(94);
      switch (_input.LA(1)) {
      case HEADERQ:
        enterOuterAlt(_localctx, 1);
        {
        setState(89);
        match(HEADERQ);
        setState(90);
        match(T__0);
        }
        break;
      case T__1:
        enterOuterAlt(_localctx, 2);
        {
        setState(91);
        match(T__1);
        }
        break;
      case BPM:
        enterOuterAlt(_localctx, 3);
        {
        {
        setState(92);
        ((QContext)_localctx).BPT = match(BPM);
        }
        setState(93);
        eol();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class MContext extends ParserRuleContext {
    public TerminalNode HEADERM() { return getToken(AbcParser.HEADERM, 0); }
    public TerminalNode METER() { return getToken(AbcParser.METER, 0); }
    public EolContext eol() {
      return getRuleContext(EolContext.class,0);
    }
    public MContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_m; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterM(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitM(this);
    }
  }

  public final MContext m() throws RecognitionException {
    MContext _localctx = new MContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_m);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(96);
      match(HEADERM);
      setState(97);
      match(METER);
      setState(98);
      eol();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class CContext extends ParserRuleContext {
    public TerminalNode HEADERC() { return getToken(AbcParser.HEADERC, 0); }
    public TerminalNode COMPOSER() { return getToken(AbcParser.COMPOSER, 0); }
    public EolContext eol() {
      return getRuleContext(EolContext.class,0);
    }
    public CContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_c; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterC(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitC(this);
    }
  }

  public final CContext c() throws RecognitionException {
    CContext _localctx = new CContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_c);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(100);
      match(HEADERC);
      setState(101);
      match(COMPOSER);
      setState(102);
      eol();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class VContext extends ParserRuleContext {
    public TerminalNode VOICE() { return getToken(AbcParser.VOICE, 0); }
    public EolContext eol() {
      return getRuleContext(EolContext.class,0);
    }
    public VContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_v; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterV(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitV(this);
    }
  }

  public final VContext v() throws RecognitionException {
    VContext _localctx = new VContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_v);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(104);
      match(HEADERV);
      setState(105);
      match(VOICE);
      setState(106);
      eol();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class KContext extends ParserRuleContext {
    public KeyContext key() {
      return getRuleContext(KeyContext.class,0);
    }
    public EolContext eol() {
      return getRuleContext(EolContext.class,0);
    }
    public KContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_k; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterK(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitK(this);
    }
  }

  public final KContext k() throws RecognitionException {
    KContext _localctx = new KContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_k);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(108);
      match(HEADERK);
      setState(109);
      key();
      setState(110);
      eol();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class KeyContext extends ParserRuleContext {
    public KeynoteContext keynote() {
      return getRuleContext(KeynoteContext.class,0);
    }
    public TerminalNode MODEMINOR() { return getToken(AbcParser.MODEMINOR, 0); }
    public KeyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_key; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterKey(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitKey(this);
    }
  }

  public final KeyContext key() throws RecognitionException {
    KeyContext _localctx = new KeyContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_key);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(112);
      keynote();
      setState(114);
      _la = _input.LA(1);
      if (_la==MODEMINOR) {
        {
        setState(113);
        match(MODEMINOR);
        }
      }

      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class KeynoteContext extends ParserRuleContext {
    public TerminalNode BASENOTE() { return getToken(AbcParser.BASENOTE, 0); }
    public TerminalNode KEYACCIDENTAL() { return getToken(AbcParser.KEYACCIDENTAL, 0); }
    public KeynoteContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_keynote; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterKeynote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitKeynote(this);
    }
  }

  public final KeynoteContext keynote() throws RecognitionException {
    KeynoteContext _localctx = new KeynoteContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_keynote);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(116);
      match(BASENOTE);
      setState(118);
      _la = _input.LA(1);
      if (_la==KEYACCIDENTAL) {
        {
        setState(117);
        match(KEYACCIDENTAL);
        }
      }

      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class BodyContext extends ParserRuleContext {
    public AbcmusicContext abcmusic() {
      return getRuleContext(AbcmusicContext.class,0);
    }
    public EolContext eol() {
      return getRuleContext(EolContext.class,0);
    }
    public BodyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_body; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterBody(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitBody(this);
    }
  }

  public final BodyContext body() throws RecognitionException {
    BodyContext _localctx = new BodyContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_body);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(120);
      abcmusic();
      setState(121);
      eol();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class AbcmusicContext extends ParserRuleContext {
    public List<AbclineContext> abcline() {
      return getRuleContexts(AbclineContext.class);
    }
    public AbclineContext abcline(int i) {
      return getRuleContext(AbclineContext.class,i);
    }
    public AbcmusicContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_abcmusic; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterAbcmusic(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitAbcmusic(this);
    }
  }

  public final AbcmusicContext abcmusic() throws RecognitionException {
    AbcmusicContext _localctx = new AbcmusicContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_abcmusic);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(124); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(123);
          abcline();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(126); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,5,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class AbclineContext extends ParserRuleContext {
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public List<ElementContext> element() {
      return getRuleContexts(ElementContext.class);
    }
    public ElementContext element(int i) {
      return getRuleContext(ElementContext.class,i);
    }
    public MidtunefieldContext midtunefield() {
      return getRuleContext(MidtunefieldContext.class,0);
    }
    public CommentContext comment() {
      return getRuleContext(CommentContext.class,0);
    }
    public AbclineContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_abcline; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterAbcline(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitAbcline(this);
    }
  }

  public final AbclineContext abcline() throws RecognitionException {
    AbclineContext _localctx = new AbclineContext(_ctx, getState());
    enterRule(_localctx, 26, RULE_abcline);
    int _la;
    try {
      setState(137);
      switch (_input.LA(1)) {
      case T__5:
      case T__6:
      case T__7:
      case ACCIDENTAL:
      case BARLINE:
      case NTHREPEAT:
      case BASENOTE:
      case WHITESPACE:
        enterOuterAlt(_localctx, 1);
        {
        setState(129); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(128);
          element();
          }
          }
          setState(131); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << ACCIDENTAL) | (1L << BARLINE) | (1L << NTHREPEAT) | (1L << BASENOTE) | (1L << WHITESPACE))) != 0) );
        setState(133);
        match(NEWLINE);
        }
        break;
      case HEADERV:
        enterOuterAlt(_localctx, 2);
        {
        setState(135);
        midtunefield();
        }
        break;
      case T__9:
        enterOuterAlt(_localctx, 3);
        {
        setState(136);
        comment();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ElementContext extends ParserRuleContext {
    public NoteelementContext noteelement() {
      return getRuleContext(NoteelementContext.class,0);
    }
    public TupletelementContext tupletelement() {
      return getRuleContext(TupletelementContext.class,0);
    }
    public TerminalNode BARLINE() { return getToken(AbcParser.BARLINE, 0); }
    public TerminalNode NTHREPEAT() { return getToken(AbcParser.NTHREPEAT, 0); }
    public TerminalNode WHITESPACE() { return getToken(AbcParser.WHITESPACE, 0); }
    public ElementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_element; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterElement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitElement(this);
    }
  }

  public final ElementContext element() throws RecognitionException {
    ElementContext _localctx = new ElementContext(_ctx, getState());
    enterRule(_localctx, 28, RULE_element);
    try {
      setState(144);
      switch (_input.LA(1)) {
      case T__5:
      case T__7:
      case ACCIDENTAL:
      case BASENOTE:
        enterOuterAlt(_localctx, 1);
        {
        setState(139);
        noteelement();
        }
        break;
      case T__6:
        enterOuterAlt(_localctx, 2);
        {
        setState(140);
        tupletelement();
        }
        break;
      case BARLINE:
        enterOuterAlt(_localctx, 3);
        {
        setState(141);
        match(BARLINE);
        }
        break;
      case NTHREPEAT:
        enterOuterAlt(_localctx, 4);
        {
        setState(142);
        match(NTHREPEAT);
        }
        break;
      case WHITESPACE:
        enterOuterAlt(_localctx, 5);
        {
        setState(143);
        match(WHITESPACE);
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class NoteelementContext extends ParserRuleContext {
    public NoteContext note() {
      return getRuleContext(NoteContext.class,0);
    }
    public MultinoteContext multinote() {
      return getRuleContext(MultinoteContext.class,0);
    }
    public NoteelementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_noteelement; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNoteelement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNoteelement(this);
    }
  }

  public final NoteelementContext noteelement() throws RecognitionException {
    NoteelementContext _localctx = new NoteelementContext(_ctx, getState());
    enterRule(_localctx, 30, RULE_noteelement);
    try {
      setState(148);
      switch (_input.LA(1)) {
      case T__5:
      case ACCIDENTAL:
      case BASENOTE:
        enterOuterAlt(_localctx, 1);
        {
        setState(146);
        note();
        }
        break;
      case T__7:
        enterOuterAlt(_localctx, 2);
        {
        setState(147);
        multinote();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class NoteContext extends ParserRuleContext {
    public NoteorrestContext noteorrest() {
      return getRuleContext(NoteorrestContext.class,0);
    }
    public NotelengthContext notelength() {
      return getRuleContext(NotelengthContext.class,0);
    }
    public NoteContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_note; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNote(this);
    }
  }

  public final NoteContext note() throws RecognitionException {
    NoteContext _localctx = new NoteContext(_ctx, getState());
    enterRule(_localctx, 32, RULE_note);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(150);
      noteorrest();
      setState(152);
      switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
      case 1:
        {
        setState(151);
        notelength();
        }
        break;
      }
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class NoteorrestContext extends ParserRuleContext {
    public PitchContext pitch() {
      return getRuleContext(PitchContext.class,0);
    }
    public RestContext rest() {
      return getRuleContext(RestContext.class,0);
    }
    public NoteorrestContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_noteorrest; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNoteorrest(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNoteorrest(this);
    }
  }

  public final NoteorrestContext noteorrest() throws RecognitionException {
    NoteorrestContext _localctx = new NoteorrestContext(_ctx, getState());
    enterRule(_localctx, 34, RULE_noteorrest);
    try {
      setState(156);
      switch (_input.LA(1)) {
      case ACCIDENTAL:
      case BASENOTE:
        enterOuterAlt(_localctx, 1);
        {
        setState(154);
        pitch();
        }
        break;
      case T__5:
        enterOuterAlt(_localctx, 2);
        {
        setState(155);
        rest();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class PitchContext extends ParserRuleContext {
    public TerminalNode BASENOTE() { return getToken(AbcParser.BASENOTE, 0); }
    public TerminalNode ACCIDENTAL() { return getToken(AbcParser.ACCIDENTAL, 0); }
    public OctaveContext octave() {
      return getRuleContext(OctaveContext.class,0);
    }
    public PitchContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_pitch; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterPitch(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitPitch(this);
    }
  }

  public final PitchContext pitch() throws RecognitionException {
    PitchContext _localctx = new PitchContext(_ctx, getState());
    enterRule(_localctx, 36, RULE_pitch);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(159);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(158);
        match(ACCIDENTAL);
        }
      }

      setState(161);
      match(BASENOTE);
      setState(163);
      _la = _input.LA(1);
      if (_la==T__2 || _la==T__3) {
        {
        setState(162);
        octave();
        }
      }

      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class OctaveContext extends ParserRuleContext {
    public OctaveContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_octave; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterOctave(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitOctave(this);
    }
  }

  public final OctaveContext octave() throws RecognitionException {
    OctaveContext _localctx = new OctaveContext(_ctx, getState());
    enterRule(_localctx, 38, RULE_octave);
    int _la;
    try {
      setState(175);
      switch (_input.LA(1)) {
      case T__2:
        enterOuterAlt(_localctx, 1);
        {
        setState(166); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(165);
          match(T__2);
          }
          }
          setState(168); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__2 );
        }
        break;
      case T__3:
        enterOuterAlt(_localctx, 2);
        {
        setState(171); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(170);
          match(T__3);
          }
          }
          setState(173); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__3 );
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class NotelengthContext extends ParserRuleContext {
    public List<TerminalNode> DIGIT() { return getTokens(AbcParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(AbcParser.DIGIT, i);
    }
    public NotelengthContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_notelength; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNotelength(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNotelength(this);
    }
  }

  public final NotelengthContext notelength() throws RecognitionException {
    NotelengthContext _localctx = new NotelengthContext(_ctx, getState());
    enterRule(_localctx, 40, RULE_notelength);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(182);
      _la = _input.LA(1);
      if (_la==DIGIT) {
        {
        setState(178); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(177);
          match(DIGIT);
          }
          }
          setState(180); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==DIGIT );
        }
      }

      setState(192);
      _la = _input.LA(1);
      if (_la==T__4) {
        {
        setState(184);
        match(T__4);
        setState(190);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
          setState(186); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(185);
            match(DIGIT);
            }
            }
            setState(188); 
            _errHandler.sync(this);
            _la = _input.LA(1);
          } while ( _la==DIGIT );
          }
        }

        }
      }

      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class NotelengthstrictContext extends ParserRuleContext {
    public List<TerminalNode> DIGIT() { return getTokens(AbcParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(AbcParser.DIGIT, i);
    }
    public NotelengthstrictContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_notelengthstrict; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNotelengthstrict(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNotelengthstrict(this);
    }
  }

  public final NotelengthstrictContext notelengthstrict() throws RecognitionException {
    NotelengthstrictContext _localctx = new NotelengthstrictContext(_ctx, getState());
    enterRule(_localctx, 42, RULE_notelengthstrict);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(195); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(194);
        match(DIGIT);
        }
        }
        setState(197); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(199);
      match(T__4);
      setState(201); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(200);
        match(DIGIT);
        }
        }
        setState(203); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class RestContext extends ParserRuleContext {
    public RestContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_rest; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterRest(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitRest(this);
    }
  }

  public final RestContext rest() throws RecognitionException {
    RestContext _localctx = new RestContext(_ctx, getState());
    enterRule(_localctx, 44, RULE_rest);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(205);
      match(T__5);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class TupletelementContext extends ParserRuleContext {
    public TupletspecContext tupletspec() {
      return getRuleContext(TupletspecContext.class,0);
    }
    public List<NoteelementContext> noteelement() {
      return getRuleContexts(NoteelementContext.class);
    }
    public NoteelementContext noteelement(int i) {
      return getRuleContext(NoteelementContext.class,i);
    }
    public TupletelementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tupletelement; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterTupletelement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitTupletelement(this);
    }
  }

  public final TupletelementContext tupletelement() throws RecognitionException {
    TupletelementContext _localctx = new TupletelementContext(_ctx, getState());
    enterRule(_localctx, 46, RULE_tupletelement);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(207);
      tupletspec();
      setState(209); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(208);
          noteelement();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(211); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,24,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class TupletspecContext extends ParserRuleContext {
    public TerminalNode DIGIT() { return getToken(AbcParser.DIGIT, 0); }
    public TupletspecContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tupletspec; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterTupletspec(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitTupletspec(this);
    }
  }

  public final TupletspecContext tupletspec() throws RecognitionException {
    TupletspecContext _localctx = new TupletspecContext(_ctx, getState());
    enterRule(_localctx, 48, RULE_tupletspec);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(213);
      match(T__6);
      setState(214);
      match(DIGIT);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class MultinoteContext extends ParserRuleContext {
    public List<NoteContext> note() {
      return getRuleContexts(NoteContext.class);
    }
    public NoteContext note(int i) {
      return getRuleContext(NoteContext.class,i);
    }
    public MultinoteContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_multinote; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterMultinote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitMultinote(this);
    }
  }

  public final MultinoteContext multinote() throws RecognitionException {
    MultinoteContext _localctx = new MultinoteContext(_ctx, getState());
    enterRule(_localctx, 50, RULE_multinote);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(216);
      match(T__7);
      setState(218); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(217);
        note();
        }
        }
        setState(220); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << ACCIDENTAL) | (1L << BASENOTE))) != 0) );
      setState(222);
      match(T__8);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class MidtunefieldContext extends ParserRuleContext {
    public VContext v() {
      return getRuleContext(VContext.class,0);
    }
    public MidtunefieldContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_midtunefield; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterMidtunefield(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitMidtunefield(this);
    }
  }

  public final MidtunefieldContext midtunefield() throws RecognitionException {
    MidtunefieldContext _localctx = new MidtunefieldContext(_ctx, getState());
    enterRule(_localctx, 52, RULE_midtunefield);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(224);
      v();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class EolContext extends ParserRuleContext {
    public CommentContext comment() {
      return getRuleContext(CommentContext.class,0);
    }
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public EolContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_eol; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterEol(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitEol(this);
    }
  }

  public final EolContext eol() throws RecognitionException {
    EolContext _localctx = new EolContext(_ctx, getState());
    enterRule(_localctx, 54, RULE_eol);
    try {
      setState(228);
      switch (_input.LA(1)) {
      case T__9:
        enterOuterAlt(_localctx, 1);
        {
        setState(226);
        comment();
        }
        break;
      case NEWLINE:
        enterOuterAlt(_localctx, 2);
        {
        setState(227);
        match(NEWLINE);
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class CommentContext extends ParserRuleContext {
    public TextContext text() {
      return getRuleContext(TextContext.class,0);
    }
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public CommentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_comment; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterComment(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitComment(this);
    }
  }

  public final CommentContext comment() throws RecognitionException {
    CommentContext _localctx = new CommentContext(_ctx, getState());
    enterRule(_localctx, 56, RULE_comment);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(230);
      match(T__9);
      setState(231);
      text();
      setState(232);
      match(NEWLINE);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class TextContext extends ParserRuleContext {
    public TextContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_text; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterText(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitText(this);
    }
  }

  public final TextContext text() throws RecognitionException {
    TextContext _localctx = new TextContext(_ctx, getState());
    enterRule(_localctx, 58, RULE_text);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(237);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,27,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(234);
          matchWildcard();
          }
          } 
        }
        setState(239);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,27,_ctx);
      }
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u00f3\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
      "\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t"+
      "\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4"+
      "\37\t\37\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2G\n\2\f\2\16\2J\13\2\3"+
      "\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6"+
      "\3\6\3\6\3\6\3\6\5\6a\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t"+
      "\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\5\13u\n\13\3\f\3\f\5\fy\n\f\3\r"+
      "\3\r\3\r\3\16\6\16\177\n\16\r\16\16\16\u0080\3\17\6\17\u0084\n\17"+
      "\r\17\16\17\u0085\3\17\3\17\3\17\3\17\5\17\u008c\n\17\3\20\3\20\3"+
      "\20\3\20\3\20\5\20\u0093\n\20\3\21\3\21\5\21\u0097\n\21\3\22\3\22"+
      "\5\22\u009b\n\22\3\23\3\23\5\23\u009f\n\23\3\24\5\24\u00a2\n\24\3"+
      "\24\3\24\5\24\u00a6\n\24\3\25\6\25\u00a9\n\25\r\25\16\25\u00aa\3\25"+
      "\6\25\u00ae\n\25\r\25\16\25\u00af\5\25\u00b2\n\25\3\26\6\26\u00b5"+
      "\n\26\r\26\16\26\u00b6\5\26\u00b9\n\26\3\26\3\26\6\26\u00bd\n\26\r"+
      "\26\16\26\u00be\5\26\u00c1\n\26\5\26\u00c3\n\26\3\27\6\27\u00c6\n"+
      "\27\r\27\16\27\u00c7\3\27\3\27\6\27\u00cc\n\27\r\27\16\27\u00cd\3"+
      "\30\3\30\3\31\3\31\6\31\u00d4\n\31\r\31\16\31\u00d5\3\32\3\32\3\32"+
      "\3\33\3\33\6\33\u00dd\n\33\r\33\16\33\u00de\3\33\3\33\3\34\3\34\3"+
      "\35\3\35\5\35\u00e7\n\35\3\36\3\36\3\36\3\36\3\37\7\37\u00ee\n\37"+
      "\f\37\16\37\u00f1\13\37\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30\32"+
      "\34\36 \"$&(*,.\60\62\64\668:<\2\2\u00f9\2>\3\2\2\2\4O\3\2\2\2\6S"+
      "\3\2\2\2\bW\3\2\2\2\n`\3\2\2\2\fb\3\2\2\2\16f\3\2\2\2\20j\3\2\2\2"+
      "\22n\3\2\2\2\24r\3\2\2\2\26v\3\2\2\2\30z\3\2\2\2\32~\3\2\2\2\34\u008b"+
      "\3\2\2\2\36\u0092\3\2\2\2 \u0096\3\2\2\2\"\u0098\3\2\2\2$\u009e\3"+
      "\2\2\2&\u00a1\3\2\2\2(\u00b1\3\2\2\2*\u00b8\3\2\2\2,\u00c5\3\2\2\2"+
      ".\u00cf\3\2\2\2\60\u00d1\3\2\2\2\62\u00d7\3\2\2\2\64\u00da\3\2\2\2"+
      "\66\u00e2\3\2\2\28\u00e6\3\2\2\2:\u00e8\3\2\2\2<\u00ef\3\2\2\2>?\5"+
      "\4\3\2?H\5\6\4\2@G\5\b\5\2AG\5\n\6\2BG\5\f\7\2CG\5\16\b\2DG\5:\36"+
      "\2EG\5\20\t\2F@\3\2\2\2FA\3\2\2\2FB\3\2\2\2FC\3\2\2\2FD\3\2\2\2FE"+
      "\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\5\22"+
      "\n\2LM\5\30\r\2MN\7\2\2\3N\3\3\2\2\2OP\7\r\2\2PQ\7\16\2\2QR\58\35"+
      "\2R\5\3\2\2\2ST\7\17\2\2TU\7\20\2\2UV\58\35\2V\7\3\2\2\2WX\7\21\2"+
      "\2XY\7\22\2\2YZ\58\35\2Z\t\3\2\2\2[\\\7\23\2\2\\a\7\3\2\2]a\7\4\2"+
      "\2^_\7\24\2\2_a\58\35\2`[\3\2\2\2`]\3\2\2\2`^\3\2\2\2a\13\3\2\2\2"+
      "bc\7\26\2\2cd\7\27\2\2de\58\35\2e\r\3\2\2\2fg\7\30\2\2gh\7\31\2\2"+
      "hi\58\35\2i\17\3\2\2\2jk\7\32\2\2kl\7\33\2\2lm\58\35\2m\21\3\2\2\2"+
      "no\7\34\2\2op\5\24\13\2pq\58\35\2q\23\3\2\2\2rt\5\26\f\2su\7\36\2"+
      "\2ts\3\2\2\2tu\3\2\2\2u\25\3\2\2\2vx\7\"\2\2wy\7\35\2\2xw\3\2\2\2"+
      "xy\3\2\2\2y\27\3\2\2\2z{\5\32\16\2{|\58\35\2|\31\3\2\2\2}\177\5\34"+
      "\17\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2"+
      "\2\u0081\33\3\2\2\2\u0082\u0084\5\36\20\2\u0083\u0082\3\2\2\2\u0084"+
      "\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087"+
      "\3\2\2\2\u0087\u0088\7$\2\2\u0088\u008c\3\2\2\2\u0089\u008c\5\66\34"+
      "\2\u008a\u008c\5:\36\2\u008b\u0083\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
      "\u008a\3\2\2\2\u008c\35\3\2\2\2\u008d\u0093\5 \21\2\u008e\u0093\5"+
      "\60\31\2\u008f\u0093\7 \2\2\u0090\u0093\7!\2\2\u0091\u0093\7%\2\2"+
      "\u0092\u008d\3\2\2\2\u0092\u008e\3\2\2\2\u0092\u008f\3\2\2\2\u0092"+
      "\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\37\3\2\2\2\u0094\u0097\5"+
      "\"\22\2\u0095\u0097\5\64\33\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2"+
      "\2\2\u0097!\3\2\2\2\u0098\u009a\5$\23\2\u0099\u009b\5*\26\2\u009a"+
      "\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b#\3\2\2\2\u009c\u009f\5&\24"+
      "\2\u009d\u009f\5.\30\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f"+
      "%\3\2\2\2\u00a0\u00a2\7\37\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2"+
      "\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\7\"\2\2\u00a4\u00a6\5(\25\2\u00a5"+
      "\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\'\3\2\2\2\u00a7\u00a9\7\5"+
      "\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
      "\u00ab\3\2\2\2\u00ab\u00b2\3\2\2\2\u00ac\u00ae\7\6\2\2\u00ad\u00ac"+
      "\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2"+
      "\2\u00b0\u00b2\3\2\2\2\u00b1\u00a8\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b2"+
      ")\3\2\2\2\u00b3\u00b5\7#\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2"+
      "\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
      "\u00b4\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00c2\3\2\2\2\u00ba\u00c0"+
      "\7\7\2\2\u00bb\u00bd\7#\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2"+
      "\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0"+
      "\u00bc\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00ba"+
      "\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3+\3\2\2\2\u00c4\u00c6\7#\2\2\u00c5"+
      "\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8"+
      "\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\7\7\2\2\u00ca\u00cc\7#\2"+
      "\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
      "\u00ce\3\2\2\2\u00ce-\3\2\2\2\u00cf\u00d0\7\b\2\2\u00d0/\3\2\2\2\u00d1"+
      "\u00d3\5\62\32\2\u00d2\u00d4\5 \21\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5"+
      "\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\61\3\2\2\2"+
      "\u00d7\u00d8\7\t\2\2\u00d8\u00d9\7#\2\2\u00d9\63\3\2\2\2\u00da\u00dc"+
      "\7\n\2\2\u00db\u00dd\5\"\22\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2"+
      "\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
      "\u00e1\7\13\2\2\u00e1\65\3\2\2\2\u00e2\u00e3\5\20\t\2\u00e3\67\3\2"+
      "\2\2\u00e4\u00e7\5:\36\2\u00e5\u00e7\7$\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
      "\u00e5\3\2\2\2\u00e79\3\2\2\2\u00e8\u00e9\7\f\2\2\u00e9\u00ea\5<\37"+
      "\2\u00ea\u00eb\7$\2\2\u00eb;\3\2\2\2\u00ec\u00ee\13\2\2\2\u00ed\u00ec"+
      "\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2"+
      "\2\u00f0=\3\2\2\2\u00f1\u00ef\3\2\2\2\36FH`tx\u0080\u0085\u008b\u0092"+
      "\u0096\u009a\u009e\u00a1\u00a5\u00aa\u00af\u00b1\u00b6\u00b8\u00be"+
      "\u00c0\u00c2\u00c7\u00cd\u00d5\u00de\u00e6\u00ef";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}