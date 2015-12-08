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
    COMMENT=1, FIELD_NUMBER=2, FIELD_TITLE=3, FIELD_COMPOSER=4, FIELD_DEFAULT_LENGTH=5, 
    FIELD_METER=6, FIELD_TEMPO=7, FIELD_VOICE=8, FIELD_KEY=9, LINE=10, NOTE=11, 
    PITCH=12, KEYACCIDENTAL=13, MODEMINOR=14, SPACE=15, REST=16, OPEN_BRACKET=17, 
    CLOSE_BRACKET=18, BARLINE=19, NTH_REPEAT=20, DUPLET=21, TRIPLET=22, 
    QUADRUPLET=23, SLASH=24, DIGIT=25;
  public static final int
    RULE_root = 0, RULE_field_voice = 1, RULE_header = 2, RULE_field_number = 3, 
    RULE_field_title = 4, RULE_other_fields = 5, RULE_field_key = 6, RULE_body = 7, 
    RULE_abcline = 8, RULE_open_bracket = 9, RULE_close_bracket = 10, RULE_multinote = 11, 
    RULE_note_element = 12, RULE_tuplet_element = 13, RULE_barline = 14, 
    RULE_element = 15;
  public static final String[] ruleNames = {
    "root", "field_voice", "header", "field_number", "field_title", "other_fields", 
    "field_key", "body", "abcline", "open_bracket", "close_bracket", "multinote", 
    "note_element", "tuplet_element", "barline", "element"
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
    public HeaderContext header() {
      return getRuleContext(HeaderContext.class,0);
    }
    public BodyContext body() {
      return getRuleContext(BodyContext.class,0);
    }
    public TerminalNode EOF() { return getToken(AbcParser.EOF, 0); }
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
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(32);
      header();
      setState(33);
      body();
      setState(34);
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

  public static class Field_voiceContext extends ParserRuleContext {
    public TerminalNode FIELD_VOICE() { return getToken(AbcParser.FIELD_VOICE, 0); }
    public Field_voiceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field_voice; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_voice(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_voice(this);
    }
  }

  public final Field_voiceContext field_voice() throws RecognitionException {
    Field_voiceContext _localctx = new Field_voiceContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_field_voice);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(36);
      match(FIELD_VOICE);
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

  public static class HeaderContext extends ParserRuleContext {
    public Field_numberContext field_number() {
      return getRuleContext(Field_numberContext.class,0);
    }
    public List<TerminalNode> LINE() { return getTokens(AbcParser.LINE); }
    public TerminalNode LINE(int i) {
      return getToken(AbcParser.LINE, i);
    }
    public Field_titleContext field_title() {
      return getRuleContext(Field_titleContext.class,0);
    }
    public Field_keyContext field_key() {
      return getRuleContext(Field_keyContext.class,0);
    }
    public List<Other_fieldsContext> other_fields() {
      return getRuleContexts(Other_fieldsContext.class);
    }
    public Other_fieldsContext other_fields(int i) {
      return getRuleContext(Other_fieldsContext.class,i);
    }
    public HeaderContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_header; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterHeader(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitHeader(this);
    }
  }

  public final HeaderContext header() throws RecognitionException {
    HeaderContext _localctx = new HeaderContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_header);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(38);
      field_number();
      setState(39);
      match(LINE);
      setState(40);
      field_title();
      setState(41);
      match(LINE);
      setState(47);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIELD_COMPOSER) | (1L << FIELD_DEFAULT_LENGTH) | (1L << FIELD_METER) | (1L << FIELD_TEMPO) | (1L << FIELD_VOICE))) != 0)) {
        {
        {
        setState(42);
        other_fields();
        setState(43);
        match(LINE);
        }
        }
        setState(49);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(50);
      field_key();
      setState(51);
      match(LINE);
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

  public static class Field_numberContext extends ParserRuleContext {
    public TerminalNode FIELD_NUMBER() { return getToken(AbcParser.FIELD_NUMBER, 0); }
    public Field_numberContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field_number; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_number(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_number(this);
    }
  }

  public final Field_numberContext field_number() throws RecognitionException {
    Field_numberContext _localctx = new Field_numberContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_field_number);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(53);
      match(FIELD_NUMBER);
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

  public static class Field_titleContext extends ParserRuleContext {
    public TerminalNode FIELD_TITLE() { return getToken(AbcParser.FIELD_TITLE, 0); }
    public Field_titleContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field_title; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_title(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_title(this);
    }
  }

  public final Field_titleContext field_title() throws RecognitionException {
    Field_titleContext _localctx = new Field_titleContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_field_title);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(55);
      match(FIELD_TITLE);
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

  public static class Other_fieldsContext extends ParserRuleContext {
    public TerminalNode FIELD_COMPOSER() { return getToken(AbcParser.FIELD_COMPOSER, 0); }
    public TerminalNode FIELD_DEFAULT_LENGTH() { return getToken(AbcParser.FIELD_DEFAULT_LENGTH, 0); }
    public TerminalNode FIELD_METER() { return getToken(AbcParser.FIELD_METER, 0); }
    public TerminalNode FIELD_TEMPO() { return getToken(AbcParser.FIELD_TEMPO, 0); }
    public TerminalNode FIELD_VOICE() { return getToken(AbcParser.FIELD_VOICE, 0); }
    public Other_fieldsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_other_fields; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterOther_fields(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitOther_fields(this);
    }
  }

  public final Other_fieldsContext other_fields() throws RecognitionException {
    Other_fieldsContext _localctx = new Other_fieldsContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_other_fields);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(57);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIELD_COMPOSER) | (1L << FIELD_DEFAULT_LENGTH) | (1L << FIELD_METER) | (1L << FIELD_TEMPO) | (1L << FIELD_VOICE))) != 0)) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
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

  public static class Field_keyContext extends ParserRuleContext {
    public TerminalNode FIELD_KEY() { return getToken(AbcParser.FIELD_KEY, 0); }
    public Field_keyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field_key; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_key(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_key(this);
    }
  }

  public final Field_keyContext field_key() throws RecognitionException {
    Field_keyContext _localctx = new Field_keyContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_field_key);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(59);
      match(FIELD_KEY);
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
    public List<AbclineContext> abcline() {
      return getRuleContexts(AbclineContext.class);
    }
    public AbclineContext abcline(int i) {
      return getRuleContext(AbclineContext.class,i);
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
    enterRule(_localctx, 14, RULE_body);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(62); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(61);
        abcline();
        }
        }
        setState(64); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIELD_VOICE) | (1L << LINE) | (1L << NOTE) | (1L << OPEN_BRACKET) | (1L << BARLINE) | (1L << NTH_REPEAT) | (1L << DUPLET) | (1L << TRIPLET) | (1L << QUADRUPLET))) != 0) );
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
    public TerminalNode LINE() { return getToken(AbcParser.LINE, 0); }
    public List<ElementContext> element() {
      return getRuleContexts(ElementContext.class);
    }
    public ElementContext element(int i) {
      return getRuleContext(ElementContext.class,i);
    }
    public Field_voiceContext field_voice() {
      return getRuleContext(Field_voiceContext.class,0);
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
    enterRule(_localctx, 16, RULE_abcline);
    int _la;
    try {
      setState(77);
      switch (_input.LA(1)) {
      case NOTE:
      case OPEN_BRACKET:
      case BARLINE:
      case NTH_REPEAT:
      case DUPLET:
      case TRIPLET:
      case QUADRUPLET:
        enterOuterAlt(_localctx, 1);
        {
        {
        setState(67); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(66);
          element();
          }
          }
          setState(69); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTE) | (1L << OPEN_BRACKET) | (1L << BARLINE) | (1L << NTH_REPEAT) | (1L << DUPLET) | (1L << TRIPLET) | (1L << QUADRUPLET))) != 0) );
        setState(71);
        match(LINE);
        }
        }
        break;
      case FIELD_VOICE:
        enterOuterAlt(_localctx, 2);
        {
        {
        setState(73);
        field_voice();
        setState(74);
        match(LINE);
        }
        }
        break;
      case LINE:
        enterOuterAlt(_localctx, 3);
        {
        setState(76);
        match(LINE);
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

  public static class Open_bracketContext extends ParserRuleContext {
    public TerminalNode OPEN_BRACKET() { return getToken(AbcParser.OPEN_BRACKET, 0); }
    public Open_bracketContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_open_bracket; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterOpen_bracket(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitOpen_bracket(this);
    }
  }

  public final Open_bracketContext open_bracket() throws RecognitionException {
    Open_bracketContext _localctx = new Open_bracketContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_open_bracket);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(79);
      match(OPEN_BRACKET);
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

  public static class Close_bracketContext extends ParserRuleContext {
    public TerminalNode CLOSE_BRACKET() { return getToken(AbcParser.CLOSE_BRACKET, 0); }
    public Close_bracketContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_close_bracket; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterClose_bracket(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitClose_bracket(this);
    }
  }

  public final Close_bracketContext close_bracket() throws RecognitionException {
    Close_bracketContext _localctx = new Close_bracketContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_close_bracket);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(81);
      match(CLOSE_BRACKET);
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
    public Open_bracketContext open_bracket() {
      return getRuleContext(Open_bracketContext.class,0);
    }
    public Close_bracketContext close_bracket() {
      return getRuleContext(Close_bracketContext.class,0);
    }
    public List<Note_elementContext> note_element() {
      return getRuleContexts(Note_elementContext.class);
    }
    public Note_elementContext note_element(int i) {
      return getRuleContext(Note_elementContext.class,i);
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
    enterRule(_localctx, 22, RULE_multinote);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(83);
      open_bracket();
      setState(85); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(84);
        note_element();
        }
        }
        setState(87); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==NOTE || _la==OPEN_BRACKET );
      setState(89);
      close_bracket();
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

  public static class Note_elementContext extends ParserRuleContext {
    public TerminalNode NOTE() { return getToken(AbcParser.NOTE, 0); }
    public MultinoteContext multinote() {
      return getRuleContext(MultinoteContext.class,0);
    }
    public Note_elementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_note_element; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNote_element(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNote_element(this);
    }
  }

  public final Note_elementContext note_element() throws RecognitionException {
    Note_elementContext _localctx = new Note_elementContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_note_element);
    try {
      setState(93);
      switch (_input.LA(1)) {
      case NOTE:
        enterOuterAlt(_localctx, 1);
        {
        setState(91);
        match(NOTE);
        }
        break;
      case OPEN_BRACKET:
        enterOuterAlt(_localctx, 2);
        {
        setState(92);
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

  public static class Tuplet_elementContext extends ParserRuleContext {
    public TerminalNode DUPLET() { return getToken(AbcParser.DUPLET, 0); }
    public List<ElementContext> element() {
      return getRuleContexts(ElementContext.class);
    }
    public ElementContext element(int i) {
      return getRuleContext(ElementContext.class,i);
    }
    public TerminalNode TRIPLET() { return getToken(AbcParser.TRIPLET, 0); }
    public TerminalNode QUADRUPLET() { return getToken(AbcParser.QUADRUPLET, 0); }
    public Tuplet_elementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tuplet_element; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterTuplet_element(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitTuplet_element(this);
    }
  }

  public final Tuplet_elementContext tuplet_element() throws RecognitionException {
    Tuplet_elementContext _localctx = new Tuplet_elementContext(_ctx, getState());
    enterRule(_localctx, 26, RULE_tuplet_element);
    try {
      setState(110);
      switch (_input.LA(1)) {
      case DUPLET:
        enterOuterAlt(_localctx, 1);
        {
        {
        setState(95);
        match(DUPLET);
        setState(96);
        element();
        setState(97);
        element();
        }
        }
        break;
      case TRIPLET:
        enterOuterAlt(_localctx, 2);
        {
        {
        setState(99);
        match(TRIPLET);
        setState(100);
        element();
        setState(101);
        element();
        setState(102);
        element();
        }
        }
        break;
      case QUADRUPLET:
        enterOuterAlt(_localctx, 3);
        {
        {
        setState(104);
        match(QUADRUPLET);
        setState(105);
        element();
        setState(106);
        element();
        setState(107);
        element();
        setState(108);
        element();
        }
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

  public static class BarlineContext extends ParserRuleContext {
    public TerminalNode BARLINE() { return getToken(AbcParser.BARLINE, 0); }
    public TerminalNode NTH_REPEAT() { return getToken(AbcParser.NTH_REPEAT, 0); }
    public List<TerminalNode> SPACE() { return getTokens(AbcParser.SPACE); }
    public TerminalNode SPACE(int i) {
      return getToken(AbcParser.SPACE, i);
    }
    public BarlineContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_barline; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterBarline(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitBarline(this);
    }
  }

  public final BarlineContext barline() throws RecognitionException {
    BarlineContext _localctx = new BarlineContext(_ctx, getState());
    enterRule(_localctx, 28, RULE_barline);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(112);
      _la = _input.LA(1);
      if ( !(_la==BARLINE || _la==NTH_REPEAT) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
      setState(116);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,7,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(113);
          match(SPACE);
          }
          } 
        }
        setState(118);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

  public static class ElementContext extends ParserRuleContext {
    public Note_elementContext note_element() {
      return getRuleContext(Note_elementContext.class,0);
    }
    public Tuplet_elementContext tuplet_element() {
      return getRuleContext(Tuplet_elementContext.class,0);
    }
    public BarlineContext barline() {
      return getRuleContext(BarlineContext.class,0);
    }
    public List<TerminalNode> SPACE() { return getTokens(AbcParser.SPACE); }
    public TerminalNode SPACE(int i) {
      return getToken(AbcParser.SPACE, i);
    }
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
    enterRule(_localctx, 30, RULE_element);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(122);
      switch (_input.LA(1)) {
      case NOTE:
      case OPEN_BRACKET:
        {
        setState(119);
        note_element();
        }
        break;
      case DUPLET:
      case TRIPLET:
      case QUADRUPLET:
        {
        setState(120);
        tuplet_element();
        }
        break;
      case BARLINE:
      case NTH_REPEAT:
        {
        setState(121);
        barline();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      {
      setState(127);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,9,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(124);
          match(SPACE);
          }
          } 
        }
        setState(129);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33\u0085\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
      "\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\60\n\4\f"+
      "\4\16\4\63\13\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\6"+
      "\tA\n\t\r\t\16\tB\3\n\6\nF\n\n\r\n\16\nG\3\n\3\n\3\n\3\n\3\n\3\n\5"+
      "\nP\n\n\3\13\3\13\3\f\3\f\3\r\3\r\6\rX\n\r\r\r\16\rY\3\r\3\r\3\16"+
      "\3\16\5\16`\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
      "\3\17\3\17\3\17\3\17\3\17\5\17q\n\17\3\20\3\20\7\20u\n\20\f\20\16"+
      "\20x\13\20\3\21\3\21\3\21\5\21}\n\21\3\21\7\21\u0080\n\21\f\21\16"+
      "\21\u0083\13\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
      " \2\4\3\2\6\n\3\2\25\26\u0081\2\"\3\2\2\2\4&\3\2\2\2\6(\3\2\2\2\b"+
      "\67\3\2\2\2\n9\3\2\2\2\f;\3\2\2\2\16=\3\2\2\2\20@\3\2\2\2\22O\3\2"+
      "\2\2\24Q\3\2\2\2\26S\3\2\2\2\30U\3\2\2\2\32_\3\2\2\2\34p\3\2\2\2\36"+
      "r\3\2\2\2 |\3\2\2\2\"#\5\6\4\2#$\5\20\t\2$%\7\2\2\3%\3\3\2\2\2&\'"+
      "\7\n\2\2\'\5\3\2\2\2()\5\b\5\2)*\7\f\2\2*+\5\n\6\2+\61\7\f\2\2,-\5"+
      "\f\7\2-.\7\f\2\2.\60\3\2\2\2/,\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61"+
      "\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\5\16\b\2\65\66\7\f\2"+
      "\2\66\7\3\2\2\2\678\7\4\2\28\t\3\2\2\29:\7\5\2\2:\13\3\2\2\2;<\t\2"+
      "\2\2<\r\3\2\2\2=>\7\13\2\2>\17\3\2\2\2?A\5\22\n\2@?\3\2\2\2AB\3\2"+
      "\2\2B@\3\2\2\2BC\3\2\2\2C\21\3\2\2\2DF\5 \21\2ED\3\2\2\2FG\3\2\2\2"+
      "GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7\f\2\2JP\3\2\2\2KL\5\4\3\2LM\7\f"+
      "\2\2MP\3\2\2\2NP\7\f\2\2OE\3\2\2\2OK\3\2\2\2ON\3\2\2\2P\23\3\2\2\2"+
      "QR\7\23\2\2R\25\3\2\2\2ST\7\24\2\2T\27\3\2\2\2UW\5\24\13\2VX\5\32"+
      "\16\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\5\26\f"+
      "\2\\\31\3\2\2\2]`\7\r\2\2^`\5\30\r\2_]\3\2\2\2_^\3\2\2\2`\33\3\2\2"+
      "\2ab\7\27\2\2bc\5 \21\2cd\5 \21\2dq\3\2\2\2ef\7\30\2\2fg\5 \21\2g"+
      "h\5 \21\2hi\5 \21\2iq\3\2\2\2jk\7\31\2\2kl\5 \21\2lm\5 \21\2mn\5 "+
      "\21\2no\5 \21\2oq\3\2\2\2pa\3\2\2\2pe\3\2\2\2pj\3\2\2\2q\35\3\2\2"+
      "\2rv\t\3\2\2su\7\21\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\37"+
      "\3\2\2\2xv\3\2\2\2y}\5\32\16\2z}\5\34\17\2{}\5\36\20\2|y\3\2\2\2|"+
      "z\3\2\2\2|{\3\2\2\2}\u0081\3\2\2\2~\u0080\7\21\2\2\177~\3\2\2\2\u0080"+
      "\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082!\3\2\2"+
      "\2\u0083\u0081\3\2\2\2\f\61BGOY_pv|\u0081";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}