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
    T__0=1, T__1=2, T__2=3, HEADERX=4, INDEX=5, HEADERT=6, TITLE=7, HEADERL=8, 
    LENGTH=9, HEADERQ=10, BPM=11, BPT=12, HEADERM=13, METER=14, HEADERC=15, 
    COMPOSER=16, HEADERV=17, VOICE=18, HEADERK=19, KEYACCIDENTAL=20, MODEMINOR=21, 
    BASENOTE=22, NEWLINE=23, SPACES=24;
  public static final int
    RULE_root = 0, RULE_x = 1, RULE_t = 2, RULE_l = 3, RULE_q = 4, RULE_m = 5, 
    RULE_c = 6, RULE_v = 7, RULE_k = 8, RULE_key = 9, RULE_keynote = 10, 
    RULE_body = 11, RULE_eol = 12, RULE_comment = 13, RULE_text = 14;
  public static final String[] ruleNames = {
    "root", "x", "t", "l", "q", "m", "c", "v", "k", "key", "keynote", "body", 
    "eol", "comment", "text"
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
      setState(30);
      x();
      setState(31);
      t();
      setState(40);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << HEADERL) | (1L << HEADERQ) | (1L << BPM) | (1L << HEADERM) | (1L << HEADERC) | (1L << HEADERV))) != 0)) {
        {
        setState(38);
        switch (_input.LA(1)) {
        case HEADERL:
          {
          setState(32);
          l();
          }
          break;
        case T__1:
        case HEADERQ:
        case BPM:
          {
          setState(33);
          q();
          }
          break;
        case HEADERM:
          {
          setState(34);
          m();
          }
          break;
        case HEADERC:
          {
          setState(35);
          c();
          }
          break;
        case T__2:
          {
          setState(36);
          comment();
          }
          break;
        case HEADERV:
          {
          setState(37);
          v();
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(42);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(43);
      k();
      setState(44);
      body();
      setState(45);
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
      setState(47);
      match(HEADERX);
      setState(48);
      match(INDEX);
      setState(49);
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
      setState(51);
      match(HEADERT);
      setState(52);
      match(TITLE);
      setState(53);
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
      setState(55);
      match(HEADERL);
      setState(56);
      match(LENGTH);
      setState(57);
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
      setState(64);
      switch (_input.LA(1)) {
      case HEADERQ:
        enterOuterAlt(_localctx, 1);
        {
        setState(59);
        match(HEADERQ);
        setState(60);
        match(T__0);
        }
        break;
      case T__1:
        enterOuterAlt(_localctx, 2);
        {
        setState(61);
        match(T__1);
        }
        break;
      case BPM:
        enterOuterAlt(_localctx, 3);
        {
        {
        setState(62);
        ((QContext)_localctx).BPT = match(BPM);
        }
        setState(63);
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
      setState(66);
      match(HEADERM);
      setState(67);
      match(METER);
      setState(68);
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
      setState(70);
      match(HEADERC);
      setState(71);
      match(COMPOSER);
      setState(72);
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
      setState(74);
      match(HEADERV);
      setState(75);
      match(VOICE);
      setState(76);
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
      setState(78);
      match(HEADERK);
      setState(79);
      key();
      setState(80);
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
      setState(82);
      keynote();
      setState(84);
      _la = _input.LA(1);
      if (_la==MODEMINOR) {
        {
        setState(83);
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
      setState(86);
      match(BASENOTE);
      setState(88);
      _la = _input.LA(1);
      if (_la==KEYACCIDENTAL) {
        {
        setState(87);
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
      setState(90);
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
    enterRule(_localctx, 24, RULE_eol);
    try {
      setState(94);
      switch (_input.LA(1)) {
      case T__2:
        enterOuterAlt(_localctx, 1);
        {
        setState(92);
        comment();
        }
        break;
      case NEWLINE:
        enterOuterAlt(_localctx, 2);
        {
        setState(93);
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
    enterRule(_localctx, 26, RULE_comment);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(96);
      match(T__2);
      setState(97);
      text();
      setState(98);
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
    enterRule(_localctx, 28, RULE_text);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(103);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,6,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(100);
          matchWildcard();
          }
          } 
        }
        setState(105);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32m\4\2\t\2\4\3"+
      "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
      "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3"+
      "\2\3\2\3\2\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\2\3\2\3\2\3\2\3\3\3\3"+
      "\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6C"+
      "\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
      "\n\3\13\3\13\5\13W\n\13\3\f\3\f\5\f[\n\f\3\r\3\r\3\16\3\16\5\16a\n"+
      "\16\3\17\3\17\3\17\3\17\3\20\7\20h\n\20\f\20\16\20k\13\20\3\20\2\2"+
      "\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2i\2 \3\2\2\2\4\61\3"+
      "\2\2\2\6\65\3\2\2\2\b9\3\2\2\2\nB\3\2\2\2\fD\3\2\2\2\16H\3\2\2\2\20"+
      "L\3\2\2\2\22P\3\2\2\2\24T\3\2\2\2\26X\3\2\2\2\30\\\3\2\2\2\32`\3\2"+
      "\2\2\34b\3\2\2\2\36i\3\2\2\2 !\5\4\3\2!*\5\6\4\2\")\5\b\5\2#)\5\n"+
      "\6\2$)\5\f\7\2%)\5\16\b\2&)\5\34\17\2\')\5\20\t\2(\"\3\2\2\2(#\3\2"+
      "\2\2($\3\2\2\2(%\3\2\2\2(&\3\2\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2"+
      "*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-.\5\22\n\2./\5\30\r\2/\60\7\2\2\3\60"+
      "\3\3\2\2\2\61\62\7\6\2\2\62\63\7\7\2\2\63\64\5\32\16\2\64\5\3\2\2"+
      "\2\65\66\7\b\2\2\66\67\7\t\2\2\678\5\32\16\28\7\3\2\2\29:\7\n\2\2"+
      ":;\7\13\2\2;<\5\32\16\2<\t\3\2\2\2=>\7\f\2\2>C\7\3\2\2?C\7\4\2\2@"+
      "A\7\r\2\2AC\5\32\16\2B=\3\2\2\2B?\3\2\2\2B@\3\2\2\2C\13\3\2\2\2DE"+
      "\7\17\2\2EF\7\20\2\2FG\5\32\16\2G\r\3\2\2\2HI\7\21\2\2IJ\7\22\2\2"+
      "JK\5\32\16\2K\17\3\2\2\2LM\7\23\2\2MN\7\24\2\2NO\5\32\16\2O\21\3\2"+
      "\2\2PQ\7\25\2\2QR\5\24\13\2RS\5\32\16\2S\23\3\2\2\2TV\5\26\f\2UW\7"+
      "\27\2\2VU\3\2\2\2VW\3\2\2\2W\25\3\2\2\2XZ\7\30\2\2Y[\7\26\2\2ZY\3"+
      "\2\2\2Z[\3\2\2\2[\27\3\2\2\2\\]\5\32\16\2]\31\3\2\2\2^a\5\34\17\2"+
      "_a\7\31\2\2`^\3\2\2\2`_\3\2\2\2a\33\3\2\2\2bc\7\5\2\2cd\5\36\20\2"+
      "de\7\31\2\2e\35\3\2\2\2fh\13\2\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2i"+
      "j\3\2\2\2j\37\3\2\2\2ki\3\2\2\2\t(*BVZ`i";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}