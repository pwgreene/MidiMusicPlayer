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
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, X=9, 
    T=10, L=11, LENGTH=12, Q=13, BPM=14, BPT=15, M=16, METER=17, C=18, V=19, 
    K=20, ACCIDENTAL=21, BARLINE=22, NTHREPEAT=23, BASENOTE=24, NEWLINE=25, 
    WHITESPACE=26, DIGIT=27;
  public static final int
    RULE_root = 0, RULE_body = 1, RULE_abcmusic = 2, RULE_abcline = 3, RULE_element = 4, 
    RULE_noteelement = 5, RULE_note = 6, RULE_noteorrest = 7, RULE_pitch = 8, 
    RULE_octave = 9, RULE_notelength = 10, RULE_notelengthstrict = 11, RULE_rest = 12, 
    RULE_tupletelement = 13, RULE_tupletspec = 14, RULE_multinote = 15, 
    RULE_midtunefield = 16, RULE_eol = 17, RULE_comment = 18;
  public static final String[] ruleNames = {
    "root", "body", "abcmusic", "abcline", "element", "noteelement", "note", 
    "noteorrest", "pitch", "octave", "notelength", "notelengthstrict", "rest", 
    "tupletelement", "tupletspec", "multinote", "midtunefield", "eol", "comment"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'''", "','", "'/'", "'z'", "'('", "'['", "']'", "'%'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, "X", "T", "L", 
    "LENGTH", "Q", "BPM", "BPT", "M", "METER", "C", "V", "K", "ACCIDENTAL", 
    "BARLINE", "NTHREPEAT", "BASENOTE", "NEWLINE", "WHITESPACE", "DIGIT"
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
    public TerminalNode X() { return getToken(AbcParser.X, 0); }
    public TerminalNode T() { return getToken(AbcParser.T, 0); }
    public TerminalNode K() { return getToken(AbcParser.K, 0); }
    public BodyContext body() {
      return getRuleContext(BodyContext.class,0);
    }
    public TerminalNode EOF() { return getToken(AbcParser.EOF, 0); }
    public List<TerminalNode> L() { return getTokens(AbcParser.L); }
    public TerminalNode L(int i) {
      return getToken(AbcParser.L, i);
    }
    public List<TerminalNode> Q() { return getTokens(AbcParser.Q); }
    public TerminalNode Q(int i) {
      return getToken(AbcParser.Q, i);
    }
    public List<TerminalNode> M() { return getTokens(AbcParser.M); }
    public TerminalNode M(int i) {
      return getToken(AbcParser.M, i);
    }
    public List<TerminalNode> C() { return getTokens(AbcParser.C); }
    public TerminalNode C(int i) {
      return getToken(AbcParser.C, i);
    }
    public List<CommentContext> comment() {
      return getRuleContexts(CommentContext.class);
    }
    public CommentContext comment(int i) {
      return getRuleContext(CommentContext.class,i);
    }
    public List<TerminalNode> V() { return getTokens(AbcParser.V); }
    public TerminalNode V(int i) {
      return getToken(AbcParser.V, i);
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
      setState(38);
      match(X);
      setState(39);
      match(T);
      setState(48);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << L) | (1L << Q) | (1L << M) | (1L << C) | (1L << V))) != 0)) {
        {
        setState(46);
        switch (_input.LA(1)) {
        case L:
          {
          setState(40);
          match(L);
          }
          break;
        case Q:
          {
          setState(41);
          match(Q);
          }
          break;
        case M:
          {
          setState(42);
          match(M);
          }
          break;
        case C:
          {
          setState(43);
          match(C);
          }
          break;
        case T__7:
          {
          setState(44);
          comment();
          }
          break;
        case V:
          {
          setState(45);
          match(V);
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(50);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(51);
      match(K);
      setState(52);
      body();
      setState(53);
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

  public static class BodyContext extends ParserRuleContext {
    public AbcmusicContext abcmusic() {
      return getRuleContext(AbcmusicContext.class,0);
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
    enterRule(_localctx, 2, RULE_body);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(55);
      abcmusic();
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
    enterRule(_localctx, 4, RULE_abcmusic);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(58); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(57);
        abcline();
        }
        }
        setState(60); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << V) | (1L << ACCIDENTAL) | (1L << BARLINE) | (1L << NTHREPEAT) | (1L << BASENOTE) | (1L << WHITESPACE))) != 0) );
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
    enterRule(_localctx, 6, RULE_abcline);
    int _la;
    try {
      setState(71);
      switch (_input.LA(1)) {
      case T__3:
      case T__4:
      case T__5:
      case ACCIDENTAL:
      case BARLINE:
      case NTHREPEAT:
      case BASENOTE:
      case WHITESPACE:
        enterOuterAlt(_localctx, 1);
        {
        setState(63); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(62);
          element();
          }
          }
          setState(65); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << ACCIDENTAL) | (1L << BARLINE) | (1L << NTHREPEAT) | (1L << BASENOTE) | (1L << WHITESPACE))) != 0) );
        setState(67);
        match(NEWLINE);
        }
        break;
      case V:
        enterOuterAlt(_localctx, 2);
        {
        setState(69);
        midtunefield();
        }
        break;
      case T__7:
        enterOuterAlt(_localctx, 3);
        {
        setState(70);
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
    enterRule(_localctx, 8, RULE_element);
    try {
      setState(78);
      switch (_input.LA(1)) {
      case T__3:
      case T__5:
      case ACCIDENTAL:
      case BASENOTE:
        enterOuterAlt(_localctx, 1);
        {
        setState(73);
        noteelement();
        }
        break;
      case T__4:
        enterOuterAlt(_localctx, 2);
        {
        setState(74);
        tupletelement();
        }
        break;
      case BARLINE:
        enterOuterAlt(_localctx, 3);
        {
        setState(75);
        match(BARLINE);
        }
        break;
      case NTHREPEAT:
        enterOuterAlt(_localctx, 4);
        {
        setState(76);
        match(NTHREPEAT);
        }
        break;
      case WHITESPACE:
        enterOuterAlt(_localctx, 5);
        {
        setState(77);
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
    enterRule(_localctx, 10, RULE_noteelement);
    try {
      setState(82);
      switch (_input.LA(1)) {
      case T__3:
      case ACCIDENTAL:
      case BASENOTE:
        enterOuterAlt(_localctx, 1);
        {
        setState(80);
        note();
        }
        break;
      case T__5:
        enterOuterAlt(_localctx, 2);
        {
        setState(81);
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
    enterRule(_localctx, 12, RULE_note);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(84);
      noteorrest();
      setState(85);
      notelength();
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
    enterRule(_localctx, 14, RULE_noteorrest);
    try {
      setState(89);
      switch (_input.LA(1)) {
      case ACCIDENTAL:
      case BASENOTE:
        enterOuterAlt(_localctx, 1);
        {
        setState(87);
        pitch();
        }
        break;
      case T__3:
        enterOuterAlt(_localctx, 2);
        {
        setState(88);
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
    enterRule(_localctx, 16, RULE_pitch);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(92);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(91);
        match(ACCIDENTAL);
        }
      }

      setState(94);
      match(BASENOTE);
      setState(96);
      _la = _input.LA(1);
      if (_la==T__0 || _la==T__1) {
        {
        setState(95);
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
    enterRule(_localctx, 18, RULE_octave);
    int _la;
    try {
      setState(108);
      switch (_input.LA(1)) {
      case T__0:
        enterOuterAlt(_localctx, 1);
        {
        setState(99); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(98);
          match(T__0);
          }
          }
          setState(101); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__0 );
        }
        break;
      case T__1:
        enterOuterAlt(_localctx, 2);
        {
        setState(104); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(103);
          match(T__1);
          }
          }
          setState(106); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__1 );
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
    enterRule(_localctx, 20, RULE_notelength);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(115);
      _la = _input.LA(1);
      if (_la==DIGIT) {
        {
        setState(111); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(110);
          match(DIGIT);
          }
          }
          setState(113); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==DIGIT );
        }
      }

      setState(125);
      _la = _input.LA(1);
      if (_la==T__2) {
        {
        setState(117);
        match(T__2);
        setState(123);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
          setState(119); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(118);
            match(DIGIT);
            }
            }
            setState(121); 
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
    enterRule(_localctx, 22, RULE_notelengthstrict);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(128); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(127);
        match(DIGIT);
        }
        }
        setState(130); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(132);
      match(T__2);
      setState(134); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(133);
        match(DIGIT);
        }
        }
        setState(136); 
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
    enterRule(_localctx, 24, RULE_rest);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(138);
      match(T__3);
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
    enterRule(_localctx, 26, RULE_tupletelement);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(140);
      tupletspec();
      setState(142); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(141);
          noteelement();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(144); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
    enterRule(_localctx, 28, RULE_tupletspec);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(146);
      match(T__4);
      setState(147);
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
    enterRule(_localctx, 30, RULE_multinote);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(149);
      match(T__5);
      setState(151); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(150);
        note();
        }
        }
        setState(153); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << ACCIDENTAL) | (1L << BASENOTE))) != 0) );
      setState(155);
      match(T__6);
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
    public TerminalNode V() { return getToken(AbcParser.V, 0); }
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
    enterRule(_localctx, 32, RULE_midtunefield);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(157);
      match(V);
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
    enterRule(_localctx, 34, RULE_eol);
    try {
      setState(161);
      switch (_input.LA(1)) {
      case T__7:
        enterOuterAlt(_localctx, 1);
        {
        setState(159);
        comment();
        }
        break;
      case NEWLINE:
        enterOuterAlt(_localctx, 2);
        {
        setState(160);
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
    enterRule(_localctx, 36, RULE_comment);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(163);
      match(T__7);
      setState(164);
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

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35\u00a9\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
      "\4\22\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2"+
      "\61\n\2\f\2\16\2\64\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\6\4=\n\4\r\4"+
      "\16\4>\3\5\6\5B\n\5\r\5\16\5C\3\5\3\5\3\5\3\5\5\5J\n\5\3\6\3\6\3\6"+
      "\3\6\3\6\5\6Q\n\6\3\7\3\7\5\7U\n\7\3\b\3\b\3\b\3\t\3\t\5\t\\\n\t\3"+
      "\n\5\n_\n\n\3\n\3\n\5\nc\n\n\3\13\6\13f\n\13\r\13\16\13g\3\13\6\13"+
      "k\n\13\r\13\16\13l\5\13o\n\13\3\f\6\fr\n\f\r\f\16\fs\5\fv\n\f\3\f"+
      "\3\f\6\fz\n\f\r\f\16\f{\5\f~\n\f\5\f\u0080\n\f\3\r\6\r\u0083\n\r\r"+
      "\r\16\r\u0084\3\r\3\r\6\r\u0089\n\r\r\r\16\r\u008a\3\16\3\16\3\17"+
      "\3\17\6\17\u0091\n\17\r\17\16\17\u0092\3\20\3\20\3\20\3\21\3\21\6"+
      "\21\u009a\n\21\r\21\16\21\u009b\3\21\3\21\3\22\3\22\3\23\3\23\5\23"+
      "\u00a4\n\23\3\24\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26"+
      "\30\32\34\36 \"$&\2\2\u00b4\2(\3\2\2\2\49\3\2\2\2\6<\3\2\2\2\bI\3"+
      "\2\2\2\nP\3\2\2\2\fT\3\2\2\2\16V\3\2\2\2\20[\3\2\2\2\22^\3\2\2\2\24"+
      "n\3\2\2\2\26u\3\2\2\2\30\u0082\3\2\2\2\32\u008c\3\2\2\2\34\u008e\3"+
      "\2\2\2\36\u0094\3\2\2\2 \u0097\3\2\2\2\"\u009f\3\2\2\2$\u00a3\3\2"+
      "\2\2&\u00a5\3\2\2\2()\7\13\2\2)\62\7\f\2\2*\61\7\r\2\2+\61\7\17\2"+
      "\2,\61\7\22\2\2-\61\7\24\2\2.\61\5&\24\2/\61\7\25\2\2\60*\3\2\2\2"+
      "\60+\3\2\2\2\60,\3\2\2\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\61\64"+
      "\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65"+
      "\66\7\26\2\2\66\67\5\4\3\2\678\7\2\2\38\3\3\2\2\29:\5\6\4\2:\5\3\2"+
      "\2\2;=\5\b\5\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\7\3\2\2\2"+
      "@B\5\n\6\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7\33"+
      "\2\2FJ\3\2\2\2GJ\5\"\22\2HJ\5&\24\2IA\3\2\2\2IG\3\2\2\2IH\3\2\2\2"+
      "J\t\3\2\2\2KQ\5\f\7\2LQ\5\34\17\2MQ\7\30\2\2NQ\7\31\2\2OQ\7\34\2\2"+
      "PK\3\2\2\2PL\3\2\2\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2Q\13\3\2\2\2RU\5"+
      "\16\b\2SU\5 \21\2TR\3\2\2\2TS\3\2\2\2U\r\3\2\2\2VW\5\20\t\2WX\5\26"+
      "\f\2X\17\3\2\2\2Y\\\5\22\n\2Z\\\5\32\16\2[Y\3\2\2\2[Z\3\2\2\2\\\21"+
      "\3\2\2\2]_\7\27\2\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`b\7\32\2\2ac\5\24"+
      "\13\2ba\3\2\2\2bc\3\2\2\2c\23\3\2\2\2df\7\3\2\2ed\3\2\2\2fg\3\2\2"+
      "\2ge\3\2\2\2gh\3\2\2\2ho\3\2\2\2ik\7\4\2\2ji\3\2\2\2kl\3\2\2\2lj\3"+
      "\2\2\2lm\3\2\2\2mo\3\2\2\2ne\3\2\2\2nj\3\2\2\2o\25\3\2\2\2pr\7\35"+
      "\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2uq\3\2\2\2u"+
      "v\3\2\2\2v\177\3\2\2\2w}\7\5\2\2xz\7\35\2\2yx\3\2\2\2z{\3\2\2\2{y"+
      "\3\2\2\2{|\3\2\2\2|~\3\2\2\2}y\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177"+
      "w\3\2\2\2\177\u0080\3\2\2\2\u0080\27\3\2\2\2\u0081\u0083\7\35\2\2"+
      "\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
      "\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\7\5\2\2\u0087\u0089"+
      "\7\35\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2"+
      "\2\2\u008a\u008b\3\2\2\2\u008b\31\3\2\2\2\u008c\u008d\7\6\2\2\u008d"+
      "\33\3\2\2\2\u008e\u0090\5\36\20\2\u008f\u0091\5\f\7\2\u0090\u008f"+
      "\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2"+
      "\2\u0093\35\3\2\2\2\u0094\u0095\7\7\2\2\u0095\u0096\7\35\2\2\u0096"+
      "\37\3\2\2\2\u0097\u0099\7\b\2\2\u0098\u009a\5\16\b\2\u0099\u0098\3"+
      "\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2"+
      "\u009c\u009d\3\2\2\2\u009d\u009e\7\t\2\2\u009e!\3\2\2\2\u009f\u00a0"+
      "\7\25\2\2\u00a0#\3\2\2\2\u00a1\u00a4\5&\24\2\u00a2\u00a4\7\33\2\2"+
      "\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4%\3\2\2\2\u00a5\u00a6"+
      "\7\n\2\2\u00a6\u00a7\7\33\2\2\u00a7\'\3\2\2\2\31\60\62>CIPT[^bgln"+
      "su{}\177\u0084\u008a\u0092\u009b\u00a3";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}