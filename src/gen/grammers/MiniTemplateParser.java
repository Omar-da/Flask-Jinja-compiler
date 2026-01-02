// Generated from C:/Users/Dell/IdeaProjects/Compiler/src/grammers/MiniTemplateParser.g4 by ANTLR 4.13.1
package gen.grammers;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiniTemplateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		H1_START=1, NAV_START=2, FOOTER_START=3, MAIN_START=4, SECTION_START=5, 
		HEADER_START=6, P_START=7, DIV_START=8, INPUT_START=9, BUTTON_START=10, 
		FORM_START=11, UL_START=12, LI_START=13, A_START=14, STYLE_START=15, VAR_START=16, 
		BLOCK_START=17, COMMENT=18, NEWLINE=19, TEXT=20, WS=21, HTML_CONTENT_H1_START=22, 
		HTML_CONTENT_HEADER_START=23, HTML_CONTENT_MAIN_START=24, HTML_CONTENT_FOOTER_START=25, 
		HTML_CONTENT_SECTION_START=26, HTML_CONTENT_NAV_START=27, HTML_CONTENT_P_START=28, 
		HTML_CONTENT_DIV_START=29, HTML_CONTENT_INPUT_START=30, HTML_CONTENT_BUTTON_START=31, 
		HTML_CONTENT_FORM_START=32, HTML_CONTENT_UL_START=33, HTML_CONTENT_LI_START=34, 
		HTML_CONTENT_A_START=35, HTML_CONTENT_VAR_START=36, HTML_CONTENT_BLOCK_START=37, 
		HTML_CONTENT_COMMENT=38, HTML_CONTENT_TEXT=39, HTML_CONTENT_NEWLINE=40, 
		HTML_CONTENT_WS=41, H1_END=42, HEADER_END=43, MAIN_END=44, FOOTER_END=45, 
		NAV_END=46, SECTION_END=47, P_END=48, DIV_END=49, BUTTON_END=50, FORM_END=51, 
		UL_END=52, LI_END=53, A_END=54, HTML_ATTR_EQUALS=55, HTML_ATTR_SINGLE_QUOTE=56, 
		HTML_ATTR_DOUBLE_QUOTE=57, HTML_ATTR_VAR_START=58, HTML_ATTR_BLOCK_START=59, 
		HTML_ATTR_IDENT=60, HTML_ATTR_WS=61, HTML_ATTR_GT=62, HTML_ATTR_VALUE_COMMENT=63, 
		HTML_ATTR_VALUE_TEXT=64, HTML_ATTR_VALUE_VAR_START=65, HTML_ATTR_VALUE_BLOCK_START=66, 
		HTML_ATTR_VALUE_DOUBLE_QUOTE=67, CSS_IDENT=68, CSS_TAG=69, CSS_STAR=70, 
		CSS_HASH=71, CSS_GT=72, CSS_PLUS=73, CSS_GEN_SIB=74, CSS_LPAREN=75, CSS_RPAREN=76, 
		CSS_PSEUDO_COLON=77, CSS_PSEUDO_DOUBLE_COLON=78, CSS_COMMA=79, CSS_DOT=80, 
		CSS_LBRACE=81, CSS_COMMENT=82, CSS_NUMBER=83, CSS_NEWLINE=84, CSS_WS=85, 
		CSS_STYLE_END=86, CSS_RULE_COLON=87, CSS_RULE_COMMENT=88, CSS_RULE_IDENT=89, 
		CSS_RULE_WS=90, CSS_RULE_RBRACE=91, CSS_VALUE_VAR_START=92, CSS_VALUE_LPAREN=93, 
		CSS_VALUE_RPAREN=94, CSS_VALUE_MINUS=95, CSS_VAR_PREFIX=96, CSS_VALUE_PLUS=97, 
		CSS_VALUE_COMMA=98, CSS_VALUE_COMMENT=99, CSS_VALUE_STRING=100, CSS_VALUE_NUMBER=101, 
		CSS_VALUE_COLOR=102, CSS_VALUE_UNIT=103, CSS_VALUE_IDENT=104, CSS_VALUE_END=105, 
		CSS_VALUE_WS=106, JINJA_NONE=107, JINJA_TRUE=108, JINJA_FALSE=109, JINJA_APP=110, 
		JINJA_IF=111, JINJA_ELIF=112, JINJA_ELSE=113, JINJA_ENDIF=114, JINJA_FOR=115, 
		JINJA_ENDFOR=116, JINJA_IN=117, JINJA_EQEQ=118, JINJA_PLUS=119, JINJA_DOT=120, 
		JINJA_LBRACK=121, JINJA_RBRACK=122, JINJA_LPAREN=123, JINJA_RPAREN=124, 
		JINJA_LBRACE=125, JINJA_RBRACE=126, JINJA_COMMA=127, JINJA_EQUALS=128, 
		JINJA_COLON=129, JINJA_COMMENT=130, JINJA_STRING=131, JINJA_NUMBER=132, 
		JINJA_IDENT=133, JINJA_WS=134, JINJA_NEWLINE=135, JINJA_BLOCK_END=136, 
		JINJA_VAR_END=137, CSS_STRING=138, CSS_MINUS=139;
	public static final int
		RULE_template = 0, RULE_element = 1, RULE_text = 2, RULE_htmlTag = 3, 
		RULE_tagWithContent = 4, RULE_h1Tag = 5, RULE_h1Start = 6, RULE_divTag = 7, 
		RULE_divStart = 8, RULE_headerTag = 9, RULE_headerStart = 10, RULE_mainTag = 11, 
		RULE_mainStart = 12, RULE_footerTag = 13, RULE_footerStart = 14, RULE_navTag = 15, 
		RULE_navStart = 16, RULE_sectionTag = 17, RULE_sectionStart = 18, RULE_pTag = 19, 
		RULE_pStart = 20, RULE_inputTag = 21, RULE_inputStart = 22, RULE_buttonTag = 23, 
		RULE_buttonStart = 24, RULE_formTag = 25, RULE_formStart = 26, RULE_ulTag = 27, 
		RULE_ulStart = 28, RULE_liTag = 29, RULE_liStart = 30, RULE_aTag = 31, 
		RULE_aStart = 32, RULE_attr = 33, RULE_quotedValue = 34, RULE_quotedItem = 35, 
		RULE_styleTag = 36, RULE_cssRules = 37, RULE_cssRule = 38, RULE_cssDeclarationList = 39, 
		RULE_cssDeclaration = 40, RULE_cssProperty = 41, RULE_cssValue = 42, RULE_cssFunction = 43, 
		RULE_cssSelectorList = 44, RULE_cssSelector = 45, RULE_selectorUnit = 46, 
		RULE_baseSelectorPart = 47, RULE_classPart = 48, RULE_idPart = 49, RULE_combinator = 50, 
		RULE_pseudoClass = 51, RULE_pseudoArgs = 52, RULE_pseudoExpr = 53, RULE_pseudoExprAtom = 54, 
		RULE_pseudoElement = 55, RULE_jinjaVar = 56, RULE_varStart = 57, RULE_jinjaBlock = 58, 
		RULE_jinjaFor = 59, RULE_jinjaIf = 60, RULE_blockStart = 61, RULE_expr = 62, 
		RULE_additive = 63, RULE_primary = 64, RULE_suffix = 65, RULE_routeArgKws = 66, 
		RULE_arg = 67, RULE_atom = 68, RULE_listLiteral = 69, RULE_dictLiteral = 70, 
		RULE_pair = 71, RULE_genExpr = 72;
	private static String[] makeRuleNames() {
		return new String[] {
			"template", "element", "text", "htmlTag", "tagWithContent", "h1Tag", 
			"h1Start", "divTag", "divStart", "headerTag", "headerStart", "mainTag", 
			"mainStart", "footerTag", "footerStart", "navTag", "navStart", "sectionTag", 
			"sectionStart", "pTag", "pStart", "inputTag", "inputStart", "buttonTag", 
			"buttonStart", "formTag", "formStart", "ulTag", "ulStart", "liTag", "liStart", 
			"aTag", "aStart", "attr", "quotedValue", "quotedItem", "styleTag", "cssRules", 
			"cssRule", "cssDeclarationList", "cssDeclaration", "cssProperty", "cssValue", 
			"cssFunction", "cssSelectorList", "cssSelector", "selectorUnit", "baseSelectorPart", 
			"classPart", "idPart", "combinator", "pseudoClass", "pseudoArgs", "pseudoExpr", 
			"pseudoExprAtom", "pseudoElement", "jinjaVar", "varStart", "jinjaBlock", 
			"jinjaFor", "jinjaIf", "blockStart", "expr", "additive", "primary", "suffix", 
			"routeArgKws", "arg", "atom", "listLiteral", "dictLiteral", "pair", "genExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'<style>'", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'</h1>'", "'</header>'", "'</main>'", 
			"'</footer>'", "'</nav>'", "'</section>'", "'</p>'", "'</div>'", "'</button>'", 
			"'</form>'", "'</ul>'", "'</li>'", "'</a>'", null, "'''", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'*'", 
			"'#'", null, null, "'~'", null, null, null, "'::'", null, null, null, 
			null, null, null, null, "'</style>'", null, null, null, null, null, null, 
			null, null, "'-'", "'--'", null, null, null, null, null, null, null, 
			null, "';'", null, "'None'", "'True'", "'False'", "'app'", "'if'", "'elif'", 
			"'else'", "'endif'", "'for'", "'endfor'", "'in'", "'=='", null, null, 
			"'['", "']'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'%}'", "'}}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "H1_START", "NAV_START", "FOOTER_START", "MAIN_START", "SECTION_START", 
			"HEADER_START", "P_START", "DIV_START", "INPUT_START", "BUTTON_START", 
			"FORM_START", "UL_START", "LI_START", "A_START", "STYLE_START", "VAR_START", 
			"BLOCK_START", "COMMENT", "NEWLINE", "TEXT", "WS", "HTML_CONTENT_H1_START", 
			"HTML_CONTENT_HEADER_START", "HTML_CONTENT_MAIN_START", "HTML_CONTENT_FOOTER_START", 
			"HTML_CONTENT_SECTION_START", "HTML_CONTENT_NAV_START", "HTML_CONTENT_P_START", 
			"HTML_CONTENT_DIV_START", "HTML_CONTENT_INPUT_START", "HTML_CONTENT_BUTTON_START", 
			"HTML_CONTENT_FORM_START", "HTML_CONTENT_UL_START", "HTML_CONTENT_LI_START", 
			"HTML_CONTENT_A_START", "HTML_CONTENT_VAR_START", "HTML_CONTENT_BLOCK_START", 
			"HTML_CONTENT_COMMENT", "HTML_CONTENT_TEXT", "HTML_CONTENT_NEWLINE", 
			"HTML_CONTENT_WS", "H1_END", "HEADER_END", "MAIN_END", "FOOTER_END", 
			"NAV_END", "SECTION_END", "P_END", "DIV_END", "BUTTON_END", "FORM_END", 
			"UL_END", "LI_END", "A_END", "HTML_ATTR_EQUALS", "HTML_ATTR_SINGLE_QUOTE", 
			"HTML_ATTR_DOUBLE_QUOTE", "HTML_ATTR_VAR_START", "HTML_ATTR_BLOCK_START", 
			"HTML_ATTR_IDENT", "HTML_ATTR_WS", "HTML_ATTR_GT", "HTML_ATTR_VALUE_COMMENT", 
			"HTML_ATTR_VALUE_TEXT", "HTML_ATTR_VALUE_VAR_START", "HTML_ATTR_VALUE_BLOCK_START", 
			"HTML_ATTR_VALUE_DOUBLE_QUOTE", "CSS_IDENT", "CSS_TAG", "CSS_STAR", "CSS_HASH", 
			"CSS_GT", "CSS_PLUS", "CSS_GEN_SIB", "CSS_LPAREN", "CSS_RPAREN", "CSS_PSEUDO_COLON", 
			"CSS_PSEUDO_DOUBLE_COLON", "CSS_COMMA", "CSS_DOT", "CSS_LBRACE", "CSS_COMMENT", 
			"CSS_NUMBER", "CSS_NEWLINE", "CSS_WS", "CSS_STYLE_END", "CSS_RULE_COLON", 
			"CSS_RULE_COMMENT", "CSS_RULE_IDENT", "CSS_RULE_WS", "CSS_RULE_RBRACE", 
			"CSS_VALUE_VAR_START", "CSS_VALUE_LPAREN", "CSS_VALUE_RPAREN", "CSS_VALUE_MINUS", 
			"CSS_VAR_PREFIX", "CSS_VALUE_PLUS", "CSS_VALUE_COMMA", "CSS_VALUE_COMMENT", 
			"CSS_VALUE_STRING", "CSS_VALUE_NUMBER", "CSS_VALUE_COLOR", "CSS_VALUE_UNIT", 
			"CSS_VALUE_IDENT", "CSS_VALUE_END", "CSS_VALUE_WS", "JINJA_NONE", "JINJA_TRUE", 
			"JINJA_FALSE", "JINJA_APP", "JINJA_IF", "JINJA_ELIF", "JINJA_ELSE", "JINJA_ENDIF", 
			"JINJA_FOR", "JINJA_ENDFOR", "JINJA_IN", "JINJA_EQEQ", "JINJA_PLUS", 
			"JINJA_DOT", "JINJA_LBRACK", "JINJA_RBRACK", "JINJA_LPAREN", "JINJA_RPAREN", 
			"JINJA_LBRACE", "JINJA_RBRACE", "JINJA_COMMA", "JINJA_EQUALS", "JINJA_COLON", 
			"JINJA_COMMENT", "JINJA_STRING", "JINJA_NUMBER", "JINJA_IDENT", "JINJA_WS", 
			"JINJA_NEWLINE", "JINJA_BLOCK_END", "JINJA_VAR_END", "CSS_STRING", "CSS_MINUS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "MiniTemplateParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniTemplateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MiniTemplateParser.EOF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MiniTemplateParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MiniTemplateParser.NEWLINE, i);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 864691953085972478L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 134217731L) != 0)) {
				{
				{
				setState(146);
				element();
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(147);
					match(NEWLINE);
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	 
		public ElementContext() { }
		public void copyFrom(ElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateHtmlElementContext extends ElementContext {
		public HtmlTagContext htmlTag() {
			return getRuleContext(HtmlTagContext.class,0);
		}
		public TemplateHtmlElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateJinjaVarContext extends ElementContext {
		public JinjaVarContext jinjaVar() {
			return getRuleContext(JinjaVarContext.class,0);
		}
		public TemplateJinjaVarContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateJinjaVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateJinjaVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateJinjaVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateJinjaBlockContext extends ElementContext {
		public JinjaBlockContext jinjaBlock() {
			return getRuleContext(JinjaBlockContext.class,0);
		}
		public TemplateJinjaBlockContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateJinjaBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateJinjaBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateJinjaBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateTextContext extends ElementContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public TemplateTextContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case H1_START:
			case NAV_START:
			case FOOTER_START:
			case MAIN_START:
			case SECTION_START:
			case HEADER_START:
			case P_START:
			case DIV_START:
			case INPUT_START:
			case BUTTON_START:
			case FORM_START:
			case UL_START:
			case LI_START:
			case A_START:
			case STYLE_START:
			case HTML_CONTENT_H1_START:
			case HTML_CONTENT_HEADER_START:
			case HTML_CONTENT_MAIN_START:
			case HTML_CONTENT_FOOTER_START:
			case HTML_CONTENT_SECTION_START:
			case HTML_CONTENT_NAV_START:
			case HTML_CONTENT_P_START:
			case HTML_CONTENT_DIV_START:
			case HTML_CONTENT_INPUT_START:
			case HTML_CONTENT_BUTTON_START:
			case HTML_CONTENT_FORM_START:
			case HTML_CONTENT_UL_START:
			case HTML_CONTENT_LI_START:
			case HTML_CONTENT_A_START:
				_localctx = new TemplateHtmlElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				htmlTag();
				}
				break;
			case VAR_START:
			case HTML_CONTENT_VAR_START:
			case HTML_ATTR_VAR_START:
			case HTML_ATTR_VALUE_VAR_START:
			case CSS_VALUE_VAR_START:
				_localctx = new TemplateJinjaVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				jinjaVar();
				}
				break;
			case BLOCK_START:
			case HTML_CONTENT_BLOCK_START:
			case HTML_ATTR_BLOCK_START:
			case HTML_ATTR_VALUE_BLOCK_START:
				_localctx = new TemplateJinjaBlockContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				jinjaBlock();
				}
				break;
			case TEXT:
			case HTML_CONTENT_TEXT:
				_localctx = new TemplateTextContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				text();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(MiniTemplateParser.TEXT, 0); }
		public TerminalNode HTML_CONTENT_TEXT() { return getToken(MiniTemplateParser.HTML_CONTENT_TEXT, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !(_la==TEXT || _la==HTML_CONTENT_TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTagContext extends ParserRuleContext {
		public HtmlTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTag; }
	 
		public HtmlTagContext() { }
		public void copyFrom(HtmlTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateHtmlLiContext extends HtmlTagContext {
		public LiTagContext liTag() {
			return getRuleContext(LiTagContext.class,0);
		}
		public TemplateHtmlLiContext(HtmlTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateHtmlLi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateHtmlLi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateHtmlLi(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateHtmlDivContext extends HtmlTagContext {
		public DivTagContext divTag() {
			return getRuleContext(DivTagContext.class,0);
		}
		public TemplateHtmlDivContext(HtmlTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateHtmlDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateHtmlDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateHtmlDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateHtmlFormContext extends HtmlTagContext {
		public FormTagContext formTag() {
			return getRuleContext(FormTagContext.class,0);
		}
		public TemplateHtmlFormContext(HtmlTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateHtmlForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateHtmlForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateHtmlForm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateHtmlHeaderContext extends HtmlTagContext {
		public HeaderTagContext headerTag() {
			return getRuleContext(HeaderTagContext.class,0);
		}
		public TemplateHtmlHeaderContext(HtmlTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateHtmlHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateHtmlHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateHtmlHeader(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateHtmlInputContext extends HtmlTagContext {
		public InputTagContext inputTag() {
			return getRuleContext(InputTagContext.class,0);
		}
		public TemplateHtmlInputContext(HtmlTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateHtmlInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateHtmlInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateHtmlInput(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateHtmlButtonContext extends HtmlTagContext {
		public ButtonTagContext buttonTag() {
			return getRuleContext(ButtonTagContext.class,0);
		}
		public TemplateHtmlButtonContext(HtmlTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateHtmlButton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateHtmlButton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateHtmlButton(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateHtmlPContext extends HtmlTagContext {
		public PTagContext pTag() {
			return getRuleContext(PTagContext.class,0);
		}
		public TemplateHtmlPContext(HtmlTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateHtmlP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateHtmlP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateHtmlP(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateHtmlH1Context extends HtmlTagContext {
		public H1TagContext h1Tag() {
			return getRuleContext(H1TagContext.class,0);
		}
		public TemplateHtmlH1Context(HtmlTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateHtmlH1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateHtmlH1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateHtmlH1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateHtmlSectionContext extends HtmlTagContext {
		public SectionTagContext sectionTag() {
			return getRuleContext(SectionTagContext.class,0);
		}
		public TemplateHtmlSectionContext(HtmlTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateHtmlSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateHtmlSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateHtmlSection(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateHtmlMainContext extends HtmlTagContext {
		public MainTagContext mainTag() {
			return getRuleContext(MainTagContext.class,0);
		}
		public TemplateHtmlMainContext(HtmlTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateHtmlMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateHtmlMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateHtmlMain(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateHtmlNavContext extends HtmlTagContext {
		public NavTagContext navTag() {
			return getRuleContext(NavTagContext.class,0);
		}
		public TemplateHtmlNavContext(HtmlTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateHtmlNav(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateHtmlNav(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateHtmlNav(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateHtmlFooterContext extends HtmlTagContext {
		public FooterTagContext footerTag() {
			return getRuleContext(FooterTagContext.class,0);
		}
		public TemplateHtmlFooterContext(HtmlTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateHtmlFooter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateHtmlFooter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateHtmlFooter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateHtmlAContext extends HtmlTagContext {
		public ATagContext aTag() {
			return getRuleContext(ATagContext.class,0);
		}
		public TemplateHtmlAContext(HtmlTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateHtmlA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateHtmlA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateHtmlA(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateHtmlStyleContext extends HtmlTagContext {
		public StyleTagContext styleTag() {
			return getRuleContext(StyleTagContext.class,0);
		}
		public TemplateHtmlStyleContext(HtmlTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateHtmlStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateHtmlStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateHtmlStyle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateHtmlUlContext extends HtmlTagContext {
		public UlTagContext ulTag() {
			return getRuleContext(UlTagContext.class,0);
		}
		public TemplateHtmlUlContext(HtmlTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateHtmlUl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateHtmlUl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateHtmlUl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagContext htmlTag() throws RecognitionException {
		HtmlTagContext _localctx = new HtmlTagContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlTag);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case H1_START:
			case HTML_CONTENT_H1_START:
				_localctx = new TemplateHtmlH1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				h1Tag();
				}
				break;
			case DIV_START:
			case HTML_CONTENT_DIV_START:
				_localctx = new TemplateHtmlDivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				divTag();
				}
				break;
			case HEADER_START:
			case HTML_CONTENT_HEADER_START:
				_localctx = new TemplateHtmlHeaderContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				headerTag();
				}
				break;
			case MAIN_START:
			case HTML_CONTENT_MAIN_START:
				_localctx = new TemplateHtmlMainContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				mainTag();
				}
				break;
			case NAV_START:
			case HTML_CONTENT_NAV_START:
				_localctx = new TemplateHtmlNavContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				navTag();
				}
				break;
			case FOOTER_START:
			case HTML_CONTENT_FOOTER_START:
				_localctx = new TemplateHtmlFooterContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				footerTag();
				}
				break;
			case SECTION_START:
			case HTML_CONTENT_SECTION_START:
				_localctx = new TemplateHtmlSectionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				sectionTag();
				}
				break;
			case P_START:
			case HTML_CONTENT_P_START:
				_localctx = new TemplateHtmlPContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(175);
				pTag();
				}
				break;
			case INPUT_START:
			case HTML_CONTENT_INPUT_START:
				_localctx = new TemplateHtmlInputContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(176);
				inputTag();
				}
				break;
			case BUTTON_START:
			case HTML_CONTENT_BUTTON_START:
				_localctx = new TemplateHtmlButtonContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(177);
				buttonTag();
				}
				break;
			case FORM_START:
			case HTML_CONTENT_FORM_START:
				_localctx = new TemplateHtmlFormContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(178);
				formTag();
				}
				break;
			case UL_START:
			case HTML_CONTENT_UL_START:
				_localctx = new TemplateHtmlUlContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(179);
				ulTag();
				}
				break;
			case LI_START:
			case HTML_CONTENT_LI_START:
				_localctx = new TemplateHtmlLiContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(180);
				liTag();
				}
				break;
			case A_START:
			case HTML_CONTENT_A_START:
				_localctx = new TemplateHtmlAContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(181);
				aTag();
				}
				break;
			case STYLE_START:
				_localctx = new TemplateHtmlStyleContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(182);
				styleTag();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TagWithContentContext extends ParserRuleContext {
		public TagWithContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagWithContent; }
	 
		public TagWithContentContext() { }
		public void copyFrom(TagWithContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateTagWithContentContext extends TagWithContentContext {
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public List<JinjaVarContext> jinjaVar() {
			return getRuleContexts(JinjaVarContext.class);
		}
		public JinjaVarContext jinjaVar(int i) {
			return getRuleContext(JinjaVarContext.class,i);
		}
		public List<JinjaBlockContext> jinjaBlock() {
			return getRuleContexts(JinjaBlockContext.class);
		}
		public JinjaBlockContext jinjaBlock(int i) {
			return getRuleContext(JinjaBlockContext.class,i);
		}
		public TemplateTagWithContentContext(TagWithContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateTagWithContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateTagWithContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateTagWithContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagWithContentContext tagWithContent() throws RecognitionException {
		TagWithContentContext _localctx = new TagWithContentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tagWithContent);
		int _la;
		try {
			_localctx = new TemplateTagWithContentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2017612839220609024L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 134217731L) != 0)) {
				{
				setState(188);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case HTML_ATTR_IDENT:
					{
					setState(185);
					attr();
					}
					break;
				case VAR_START:
				case HTML_CONTENT_VAR_START:
				case HTML_ATTR_VAR_START:
				case HTML_ATTR_VALUE_VAR_START:
				case CSS_VALUE_VAR_START:
					{
					setState(186);
					jinjaVar();
					}
					break;
				case BLOCK_START:
				case HTML_CONTENT_BLOCK_START:
				case HTML_ATTR_BLOCK_START:
				case HTML_ATTR_VALUE_BLOCK_START:
					{
					setState(187);
					jinjaBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class H1TagContext extends ParserRuleContext {
		public H1TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h1Tag; }
	 
		public H1TagContext() { }
		public void copyFrom(H1TagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateH1TagContext extends H1TagContext {
		public H1StartContext h1Start() {
			return getRuleContext(H1StartContext.class,0);
		}
		public TagWithContentContext tagWithContent() {
			return getRuleContext(TagWithContentContext.class,0);
		}
		public TerminalNode HTML_ATTR_GT() { return getToken(MiniTemplateParser.HTML_ATTR_GT, 0); }
		public TerminalNode H1_END() { return getToken(MiniTemplateParser.H1_END, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TemplateH1TagContext(H1TagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateH1Tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateH1Tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateH1Tag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final H1TagContext h1Tag() throws RecognitionException {
		H1TagContext _localctx = new H1TagContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_h1Tag);
		int _la;
		try {
			_localctx = new TemplateH1TagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			h1Start();
			setState(194);
			tagWithContent();
			setState(195);
			match(HTML_ATTR_GT);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 864691953085972478L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 134217731L) != 0)) {
				{
				{
				setState(196);
				element();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(H1_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class H1StartContext extends ParserRuleContext {
		public H1StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h1Start; }
	 
		public H1StartContext() { }
		public void copyFrom(H1StartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalH1StartContext extends H1StartContext {
		public TerminalNode H1_START() { return getToken(MiniTemplateParser.H1_START, 0); }
		public GlobalH1StartContext(H1StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterGlobalH1Start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitGlobalH1Start(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitGlobalH1Start(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentH1StartContext extends H1StartContext {
		public TerminalNode HTML_CONTENT_H1_START() { return getToken(MiniTemplateParser.HTML_CONTENT_H1_START, 0); }
		public HtmlContentH1StartContext(H1StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterHtmlContentH1Start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitHtmlContentH1Start(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitHtmlContentH1Start(this);
			else return visitor.visitChildren(this);
		}
	}

	public final H1StartContext h1Start() throws RecognitionException {
		H1StartContext _localctx = new H1StartContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_h1Start);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case H1_START:
				_localctx = new GlobalH1StartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(H1_START);
				}
				break;
			case HTML_CONTENT_H1_START:
				_localctx = new HtmlContentH1StartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(HTML_CONTENT_H1_START);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DivTagContext extends ParserRuleContext {
		public DivTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divTag; }
	 
		public DivTagContext() { }
		public void copyFrom(DivTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateDivTagContext extends DivTagContext {
		public DivStartContext divStart() {
			return getRuleContext(DivStartContext.class,0);
		}
		public TagWithContentContext tagWithContent() {
			return getRuleContext(TagWithContentContext.class,0);
		}
		public TerminalNode HTML_ATTR_GT() { return getToken(MiniTemplateParser.HTML_ATTR_GT, 0); }
		public TerminalNode DIV_END() { return getToken(MiniTemplateParser.DIV_END, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TemplateDivTagContext(DivTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateDivTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateDivTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateDivTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivTagContext divTag() throws RecognitionException {
		DivTagContext _localctx = new DivTagContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_divTag);
		int _la;
		try {
			_localctx = new TemplateDivTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			divStart();
			setState(209);
			tagWithContent();
			setState(210);
			match(HTML_ATTR_GT);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 864691953085972478L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 134217731L) != 0)) {
				{
				{
				setState(211);
				element();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			match(DIV_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DivStartContext extends ParserRuleContext {
		public DivStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divStart; }
	 
		public DivStartContext() { }
		public void copyFrom(DivStartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalDivStartContext extends DivStartContext {
		public TerminalNode DIV_START() { return getToken(MiniTemplateParser.DIV_START, 0); }
		public GlobalDivStartContext(DivStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterGlobalDivStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitGlobalDivStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitGlobalDivStart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentDivStartContext extends DivStartContext {
		public TerminalNode HTML_CONTENT_DIV_START() { return getToken(MiniTemplateParser.HTML_CONTENT_DIV_START, 0); }
		public HtmlContentDivStartContext(DivStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterHtmlContentDivStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitHtmlContentDivStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitHtmlContentDivStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivStartContext divStart() throws RecognitionException {
		DivStartContext _localctx = new DivStartContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_divStart);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIV_START:
				_localctx = new GlobalDivStartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(DIV_START);
				}
				break;
			case HTML_CONTENT_DIV_START:
				_localctx = new HtmlContentDivStartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(HTML_CONTENT_DIV_START);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HeaderTagContext extends ParserRuleContext {
		public HeaderTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerTag; }
	 
		public HeaderTagContext() { }
		public void copyFrom(HeaderTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateHeaderTagContext extends HeaderTagContext {
		public HeaderStartContext headerStart() {
			return getRuleContext(HeaderStartContext.class,0);
		}
		public TagWithContentContext tagWithContent() {
			return getRuleContext(TagWithContentContext.class,0);
		}
		public TerminalNode HTML_ATTR_GT() { return getToken(MiniTemplateParser.HTML_ATTR_GT, 0); }
		public TerminalNode HEADER_END() { return getToken(MiniTemplateParser.HEADER_END, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TemplateHeaderTagContext(HeaderTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateHeaderTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateHeaderTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateHeaderTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderTagContext headerTag() throws RecognitionException {
		HeaderTagContext _localctx = new HeaderTagContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_headerTag);
		int _la;
		try {
			_localctx = new TemplateHeaderTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			headerStart();
			setState(224);
			tagWithContent();
			setState(225);
			match(HTML_ATTR_GT);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 864691953085972478L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 134217731L) != 0)) {
				{
				{
				setState(226);
				element();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(HEADER_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HeaderStartContext extends ParserRuleContext {
		public HeaderStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerStart; }
	 
		public HeaderStartContext() { }
		public void copyFrom(HeaderStartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentHeaderStartContext extends HeaderStartContext {
		public TerminalNode HTML_CONTENT_HEADER_START() { return getToken(MiniTemplateParser.HTML_CONTENT_HEADER_START, 0); }
		public HtmlContentHeaderStartContext(HeaderStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterHtmlContentHeaderStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitHtmlContentHeaderStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitHtmlContentHeaderStart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalHeaderStartContext extends HeaderStartContext {
		public TerminalNode HEADER_START() { return getToken(MiniTemplateParser.HEADER_START, 0); }
		public GlobalHeaderStartContext(HeaderStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterGlobalHeaderStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitGlobalHeaderStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitGlobalHeaderStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderStartContext headerStart() throws RecognitionException {
		HeaderStartContext _localctx = new HeaderStartContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_headerStart);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEADER_START:
				_localctx = new GlobalHeaderStartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(HEADER_START);
				}
				break;
			case HTML_CONTENT_HEADER_START:
				_localctx = new HtmlContentHeaderStartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(HTML_CONTENT_HEADER_START);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainTagContext extends ParserRuleContext {
		public MainTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainTag; }
	 
		public MainTagContext() { }
		public void copyFrom(MainTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateMainTagContext extends MainTagContext {
		public MainStartContext mainStart() {
			return getRuleContext(MainStartContext.class,0);
		}
		public TagWithContentContext tagWithContent() {
			return getRuleContext(TagWithContentContext.class,0);
		}
		public TerminalNode HTML_ATTR_GT() { return getToken(MiniTemplateParser.HTML_ATTR_GT, 0); }
		public TerminalNode MAIN_END() { return getToken(MiniTemplateParser.MAIN_END, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TemplateMainTagContext(MainTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateMainTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateMainTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateMainTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainTagContext mainTag() throws RecognitionException {
		MainTagContext _localctx = new MainTagContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mainTag);
		int _la;
		try {
			_localctx = new TemplateMainTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			mainStart();
			setState(239);
			tagWithContent();
			setState(240);
			match(HTML_ATTR_GT);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 864691953085972478L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 134217731L) != 0)) {
				{
				{
				setState(241);
				element();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			match(MAIN_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainStartContext extends ParserRuleContext {
		public MainStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainStart; }
	 
		public MainStartContext() { }
		public void copyFrom(MainStartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalMainStartContext extends MainStartContext {
		public TerminalNode MAIN_START() { return getToken(MiniTemplateParser.MAIN_START, 0); }
		public GlobalMainStartContext(MainStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterGlobalMainStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitGlobalMainStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitGlobalMainStart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentMainStartContext extends MainStartContext {
		public TerminalNode HTML_CONTENT_MAIN_START() { return getToken(MiniTemplateParser.HTML_CONTENT_MAIN_START, 0); }
		public HtmlContentMainStartContext(MainStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterHtmlContentMainStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitHtmlContentMainStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitHtmlContentMainStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainStartContext mainStart() throws RecognitionException {
		MainStartContext _localctx = new MainStartContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mainStart);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIN_START:
				_localctx = new GlobalMainStartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(MAIN_START);
				}
				break;
			case HTML_CONTENT_MAIN_START:
				_localctx = new HtmlContentMainStartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(HTML_CONTENT_MAIN_START);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FooterTagContext extends ParserRuleContext {
		public FooterTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_footerTag; }
	 
		public FooterTagContext() { }
		public void copyFrom(FooterTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateFooterTagContext extends FooterTagContext {
		public FooterStartContext footerStart() {
			return getRuleContext(FooterStartContext.class,0);
		}
		public TagWithContentContext tagWithContent() {
			return getRuleContext(TagWithContentContext.class,0);
		}
		public TerminalNode HTML_ATTR_GT() { return getToken(MiniTemplateParser.HTML_ATTR_GT, 0); }
		public TerminalNode FOOTER_END() { return getToken(MiniTemplateParser.FOOTER_END, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TemplateFooterTagContext(FooterTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateFooterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateFooterTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateFooterTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FooterTagContext footerTag() throws RecognitionException {
		FooterTagContext _localctx = new FooterTagContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_footerTag);
		int _la;
		try {
			_localctx = new TemplateFooterTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			footerStart();
			setState(254);
			tagWithContent();
			setState(255);
			match(HTML_ATTR_GT);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 864691953085972478L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 134217731L) != 0)) {
				{
				{
				setState(256);
				element();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
			match(FOOTER_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FooterStartContext extends ParserRuleContext {
		public FooterStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_footerStart; }
	 
		public FooterStartContext() { }
		public void copyFrom(FooterStartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentFooterStartContext extends FooterStartContext {
		public TerminalNode HTML_CONTENT_FOOTER_START() { return getToken(MiniTemplateParser.HTML_CONTENT_FOOTER_START, 0); }
		public HtmlContentFooterStartContext(FooterStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterHtmlContentFooterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitHtmlContentFooterStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitHtmlContentFooterStart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalFooterStartContext extends FooterStartContext {
		public TerminalNode FOOTER_START() { return getToken(MiniTemplateParser.FOOTER_START, 0); }
		public GlobalFooterStartContext(FooterStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterGlobalFooterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitGlobalFooterStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitGlobalFooterStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FooterStartContext footerStart() throws RecognitionException {
		FooterStartContext _localctx = new FooterStartContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_footerStart);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOOTER_START:
				_localctx = new GlobalFooterStartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(FOOTER_START);
				}
				break;
			case HTML_CONTENT_FOOTER_START:
				_localctx = new HtmlContentFooterStartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(HTML_CONTENT_FOOTER_START);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NavTagContext extends ParserRuleContext {
		public NavTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navTag; }
	 
		public NavTagContext() { }
		public void copyFrom(NavTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateNavTagContext extends NavTagContext {
		public NavStartContext navStart() {
			return getRuleContext(NavStartContext.class,0);
		}
		public TagWithContentContext tagWithContent() {
			return getRuleContext(TagWithContentContext.class,0);
		}
		public TerminalNode HTML_ATTR_GT() { return getToken(MiniTemplateParser.HTML_ATTR_GT, 0); }
		public TerminalNode NAV_END() { return getToken(MiniTemplateParser.NAV_END, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TemplateNavTagContext(NavTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateNavTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateNavTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateNavTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavTagContext navTag() throws RecognitionException {
		NavTagContext _localctx = new NavTagContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_navTag);
		int _la;
		try {
			_localctx = new TemplateNavTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			navStart();
			setState(269);
			tagWithContent();
			setState(270);
			match(HTML_ATTR_GT);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 864691953085972478L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 134217731L) != 0)) {
				{
				{
				setState(271);
				element();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277);
			match(NAV_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NavStartContext extends ParserRuleContext {
		public NavStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navStart; }
	 
		public NavStartContext() { }
		public void copyFrom(NavStartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentNavStartContext extends NavStartContext {
		public TerminalNode HTML_CONTENT_NAV_START() { return getToken(MiniTemplateParser.HTML_CONTENT_NAV_START, 0); }
		public HtmlContentNavStartContext(NavStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterHtmlContentNavStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitHtmlContentNavStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitHtmlContentNavStart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalNavStartContext extends NavStartContext {
		public TerminalNode NAV_START() { return getToken(MiniTemplateParser.NAV_START, 0); }
		public GlobalNavStartContext(NavStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterGlobalNavStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitGlobalNavStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitGlobalNavStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavStartContext navStart() throws RecognitionException {
		NavStartContext _localctx = new NavStartContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_navStart);
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAV_START:
				_localctx = new GlobalNavStartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(NAV_START);
				}
				break;
			case HTML_CONTENT_NAV_START:
				_localctx = new HtmlContentNavStartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				match(HTML_CONTENT_NAV_START);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SectionTagContext extends ParserRuleContext {
		public SectionTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sectionTag; }
	 
		public SectionTagContext() { }
		public void copyFrom(SectionTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateSectionTagContext extends SectionTagContext {
		public SectionStartContext sectionStart() {
			return getRuleContext(SectionStartContext.class,0);
		}
		public TagWithContentContext tagWithContent() {
			return getRuleContext(TagWithContentContext.class,0);
		}
		public TerminalNode HTML_ATTR_GT() { return getToken(MiniTemplateParser.HTML_ATTR_GT, 0); }
		public TerminalNode SECTION_END() { return getToken(MiniTemplateParser.SECTION_END, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TemplateSectionTagContext(SectionTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateSectionTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateSectionTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateSectionTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionTagContext sectionTag() throws RecognitionException {
		SectionTagContext _localctx = new SectionTagContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sectionTag);
		int _la;
		try {
			_localctx = new TemplateSectionTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			sectionStart();
			setState(284);
			tagWithContent();
			setState(285);
			match(HTML_ATTR_GT);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 864691953085972478L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 134217731L) != 0)) {
				{
				{
				setState(286);
				element();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			match(SECTION_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SectionStartContext extends ParserRuleContext {
		public SectionStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sectionStart; }
	 
		public SectionStartContext() { }
		public void copyFrom(SectionStartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalSectionStartContext extends SectionStartContext {
		public TerminalNode SECTION_START() { return getToken(MiniTemplateParser.SECTION_START, 0); }
		public GlobalSectionStartContext(SectionStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterGlobalSectionStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitGlobalSectionStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitGlobalSectionStart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentSectionStartContext extends SectionStartContext {
		public TerminalNode HTML_CONTENT_SECTION_START() { return getToken(MiniTemplateParser.HTML_CONTENT_SECTION_START, 0); }
		public HtmlContentSectionStartContext(SectionStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterHtmlContentSectionStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitHtmlContentSectionStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitHtmlContentSectionStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionStartContext sectionStart() throws RecognitionException {
		SectionStartContext _localctx = new SectionStartContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sectionStart);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SECTION_START:
				_localctx = new GlobalSectionStartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(SECTION_START);
				}
				break;
			case HTML_CONTENT_SECTION_START:
				_localctx = new HtmlContentSectionStartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				match(HTML_CONTENT_SECTION_START);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PTagContext extends ParserRuleContext {
		public PTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pTag; }
	 
		public PTagContext() { }
		public void copyFrom(PTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplatePTagContext extends PTagContext {
		public PStartContext pStart() {
			return getRuleContext(PStartContext.class,0);
		}
		public TagWithContentContext tagWithContent() {
			return getRuleContext(TagWithContentContext.class,0);
		}
		public TerminalNode HTML_ATTR_GT() { return getToken(MiniTemplateParser.HTML_ATTR_GT, 0); }
		public TerminalNode P_END() { return getToken(MiniTemplateParser.P_END, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TemplatePTagContext(PTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplatePTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplatePTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplatePTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PTagContext pTag() throws RecognitionException {
		PTagContext _localctx = new PTagContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pTag);
		int _la;
		try {
			_localctx = new TemplatePTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			pStart();
			setState(299);
			tagWithContent();
			setState(300);
			match(HTML_ATTR_GT);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 864691953085972478L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 134217731L) != 0)) {
				{
				{
				setState(301);
				element();
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
			match(P_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PStartContext extends ParserRuleContext {
		public PStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pStart; }
	 
		public PStartContext() { }
		public void copyFrom(PStartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentPStartContext extends PStartContext {
		public TerminalNode HTML_CONTENT_P_START() { return getToken(MiniTemplateParser.HTML_CONTENT_P_START, 0); }
		public HtmlContentPStartContext(PStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterHtmlContentPStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitHtmlContentPStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitHtmlContentPStart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalPStartContext extends PStartContext {
		public TerminalNode P_START() { return getToken(MiniTemplateParser.P_START, 0); }
		public GlobalPStartContext(PStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterGlobalPStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitGlobalPStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitGlobalPStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PStartContext pStart() throws RecognitionException {
		PStartContext _localctx = new PStartContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pStart);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case P_START:
				_localctx = new GlobalPStartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(P_START);
				}
				break;
			case HTML_CONTENT_P_START:
				_localctx = new HtmlContentPStartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				match(HTML_CONTENT_P_START);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InputTagContext extends ParserRuleContext {
		public InputTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputTag; }
	 
		public InputTagContext() { }
		public void copyFrom(InputTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateInputTagContext extends InputTagContext {
		public InputStartContext inputStart() {
			return getRuleContext(InputStartContext.class,0);
		}
		public TagWithContentContext tagWithContent() {
			return getRuleContext(TagWithContentContext.class,0);
		}
		public TerminalNode HTML_ATTR_GT() { return getToken(MiniTemplateParser.HTML_ATTR_GT, 0); }
		public TemplateInputTagContext(InputTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateInputTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateInputTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateInputTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputTagContext inputTag() throws RecognitionException {
		InputTagContext _localctx = new InputTagContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_inputTag);
		try {
			_localctx = new TemplateInputTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			inputStart();
			setState(314);
			tagWithContent();
			setState(315);
			match(HTML_ATTR_GT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InputStartContext extends ParserRuleContext {
		public InputStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStart; }
	 
		public InputStartContext() { }
		public void copyFrom(InputStartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentInputStartContext extends InputStartContext {
		public TerminalNode HTML_CONTENT_INPUT_START() { return getToken(MiniTemplateParser.HTML_CONTENT_INPUT_START, 0); }
		public HtmlContentInputStartContext(InputStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterHtmlContentInputStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitHtmlContentInputStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitHtmlContentInputStart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalInputStartContext extends InputStartContext {
		public TerminalNode INPUT_START() { return getToken(MiniTemplateParser.INPUT_START, 0); }
		public GlobalInputStartContext(InputStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterGlobalInputStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitGlobalInputStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitGlobalInputStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputStartContext inputStart() throws RecognitionException {
		InputStartContext _localctx = new InputStartContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_inputStart);
		try {
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT_START:
				_localctx = new GlobalInputStartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(INPUT_START);
				}
				break;
			case HTML_CONTENT_INPUT_START:
				_localctx = new HtmlContentInputStartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				match(HTML_CONTENT_INPUT_START);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ButtonTagContext extends ParserRuleContext {
		public ButtonTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buttonTag; }
	 
		public ButtonTagContext() { }
		public void copyFrom(ButtonTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateButtonTagContext extends ButtonTagContext {
		public ButtonStartContext buttonStart() {
			return getRuleContext(ButtonStartContext.class,0);
		}
		public TagWithContentContext tagWithContent() {
			return getRuleContext(TagWithContentContext.class,0);
		}
		public TerminalNode HTML_ATTR_GT() { return getToken(MiniTemplateParser.HTML_ATTR_GT, 0); }
		public TerminalNode BUTTON_END() { return getToken(MiniTemplateParser.BUTTON_END, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TemplateButtonTagContext(ButtonTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateButtonTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateButtonTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateButtonTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonTagContext buttonTag() throws RecognitionException {
		ButtonTagContext _localctx = new ButtonTagContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_buttonTag);
		int _la;
		try {
			_localctx = new TemplateButtonTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			buttonStart();
			setState(322);
			tagWithContent();
			setState(323);
			match(HTML_ATTR_GT);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 864691953085972478L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 134217731L) != 0)) {
				{
				{
				setState(324);
				element();
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(330);
			match(BUTTON_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ButtonStartContext extends ParserRuleContext {
		public ButtonStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buttonStart; }
	 
		public ButtonStartContext() { }
		public void copyFrom(ButtonStartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentButtonStartContext extends ButtonStartContext {
		public TerminalNode HTML_CONTENT_BUTTON_START() { return getToken(MiniTemplateParser.HTML_CONTENT_BUTTON_START, 0); }
		public HtmlContentButtonStartContext(ButtonStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterHtmlContentButtonStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitHtmlContentButtonStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitHtmlContentButtonStart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalButtonStartContext extends ButtonStartContext {
		public TerminalNode BUTTON_START() { return getToken(MiniTemplateParser.BUTTON_START, 0); }
		public GlobalButtonStartContext(ButtonStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterGlobalButtonStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitGlobalButtonStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitGlobalButtonStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonStartContext buttonStart() throws RecognitionException {
		ButtonStartContext _localctx = new ButtonStartContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_buttonStart);
		try {
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BUTTON_START:
				_localctx = new GlobalButtonStartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(BUTTON_START);
				}
				break;
			case HTML_CONTENT_BUTTON_START:
				_localctx = new HtmlContentButtonStartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				match(HTML_CONTENT_BUTTON_START);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FormTagContext extends ParserRuleContext {
		public FormTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formTag; }
	 
		public FormTagContext() { }
		public void copyFrom(FormTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateFormTagContext extends FormTagContext {
		public FormStartContext formStart() {
			return getRuleContext(FormStartContext.class,0);
		}
		public TagWithContentContext tagWithContent() {
			return getRuleContext(TagWithContentContext.class,0);
		}
		public TerminalNode HTML_ATTR_GT() { return getToken(MiniTemplateParser.HTML_ATTR_GT, 0); }
		public TerminalNode FORM_END() { return getToken(MiniTemplateParser.FORM_END, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TemplateFormTagContext(FormTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateFormTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateFormTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateFormTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormTagContext formTag() throws RecognitionException {
		FormTagContext _localctx = new FormTagContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_formTag);
		int _la;
		try {
			_localctx = new TemplateFormTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			formStart();
			setState(337);
			tagWithContent();
			setState(338);
			match(HTML_ATTR_GT);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 864691953085972478L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 134217731L) != 0)) {
				{
				{
				setState(339);
				element();
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345);
			match(FORM_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FormStartContext extends ParserRuleContext {
		public FormStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formStart; }
	 
		public FormStartContext() { }
		public void copyFrom(FormStartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentFormStartContext extends FormStartContext {
		public TerminalNode HTML_CONTENT_FORM_START() { return getToken(MiniTemplateParser.HTML_CONTENT_FORM_START, 0); }
		public HtmlContentFormStartContext(FormStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterHtmlContentFormStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitHtmlContentFormStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitHtmlContentFormStart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalFormStartContext extends FormStartContext {
		public TerminalNode FORM_START() { return getToken(MiniTemplateParser.FORM_START, 0); }
		public GlobalFormStartContext(FormStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterGlobalFormStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitGlobalFormStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitGlobalFormStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormStartContext formStart() throws RecognitionException {
		FormStartContext _localctx = new FormStartContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_formStart);
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORM_START:
				_localctx = new GlobalFormStartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				match(FORM_START);
				}
				break;
			case HTML_CONTENT_FORM_START:
				_localctx = new HtmlContentFormStartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(HTML_CONTENT_FORM_START);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UlTagContext extends ParserRuleContext {
		public UlTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ulTag; }
	 
		public UlTagContext() { }
		public void copyFrom(UlTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateUlTagContext extends UlTagContext {
		public UlStartContext ulStart() {
			return getRuleContext(UlStartContext.class,0);
		}
		public TagWithContentContext tagWithContent() {
			return getRuleContext(TagWithContentContext.class,0);
		}
		public TerminalNode HTML_ATTR_GT() { return getToken(MiniTemplateParser.HTML_ATTR_GT, 0); }
		public TerminalNode UL_END() { return getToken(MiniTemplateParser.UL_END, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TemplateUlTagContext(UlTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateUlTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateUlTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateUlTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UlTagContext ulTag() throws RecognitionException {
		UlTagContext _localctx = new UlTagContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ulTag);
		int _la;
		try {
			_localctx = new TemplateUlTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			ulStart();
			setState(352);
			tagWithContent();
			setState(353);
			match(HTML_ATTR_GT);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 864691953085972478L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 134217731L) != 0)) {
				{
				{
				setState(354);
				element();
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(360);
			match(UL_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UlStartContext extends ParserRuleContext {
		public UlStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ulStart; }
	 
		public UlStartContext() { }
		public void copyFrom(UlStartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentUlStartContext extends UlStartContext {
		public TerminalNode HTML_CONTENT_UL_START() { return getToken(MiniTemplateParser.HTML_CONTENT_UL_START, 0); }
		public HtmlContentUlStartContext(UlStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterHtmlContentUlStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitHtmlContentUlStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitHtmlContentUlStart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalUlStartContext extends UlStartContext {
		public TerminalNode UL_START() { return getToken(MiniTemplateParser.UL_START, 0); }
		public GlobalUlStartContext(UlStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterGlobalUlStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitGlobalUlStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitGlobalUlStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UlStartContext ulStart() throws RecognitionException {
		UlStartContext _localctx = new UlStartContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ulStart);
		try {
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UL_START:
				_localctx = new GlobalUlStartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(UL_START);
				}
				break;
			case HTML_CONTENT_UL_START:
				_localctx = new HtmlContentUlStartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				match(HTML_CONTENT_UL_START);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiTagContext extends ParserRuleContext {
		public LiTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liTag; }
	 
		public LiTagContext() { }
		public void copyFrom(LiTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateLiTagContext extends LiTagContext {
		public LiStartContext liStart() {
			return getRuleContext(LiStartContext.class,0);
		}
		public TagWithContentContext tagWithContent() {
			return getRuleContext(TagWithContentContext.class,0);
		}
		public TerminalNode HTML_ATTR_GT() { return getToken(MiniTemplateParser.HTML_ATTR_GT, 0); }
		public TerminalNode LI_END() { return getToken(MiniTemplateParser.LI_END, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TemplateLiTagContext(LiTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateLiTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateLiTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateLiTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiTagContext liTag() throws RecognitionException {
		LiTagContext _localctx = new LiTagContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_liTag);
		int _la;
		try {
			_localctx = new TemplateLiTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			liStart();
			setState(367);
			tagWithContent();
			setState(368);
			match(HTML_ATTR_GT);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 864691953085972478L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 134217731L) != 0)) {
				{
				{
				setState(369);
				element();
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(375);
			match(LI_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiStartContext extends ParserRuleContext {
		public LiStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liStart; }
	 
		public LiStartContext() { }
		public void copyFrom(LiStartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentLiStartContext extends LiStartContext {
		public TerminalNode HTML_CONTENT_LI_START() { return getToken(MiniTemplateParser.HTML_CONTENT_LI_START, 0); }
		public HtmlContentLiStartContext(LiStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterHtmlContentLiStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitHtmlContentLiStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitHtmlContentLiStart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalLiStartContext extends LiStartContext {
		public TerminalNode LI_START() { return getToken(MiniTemplateParser.LI_START, 0); }
		public GlobalLiStartContext(LiStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterGlobalLiStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitGlobalLiStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitGlobalLiStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiStartContext liStart() throws RecognitionException {
		LiStartContext _localctx = new LiStartContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_liStart);
		try {
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LI_START:
				_localctx = new GlobalLiStartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(LI_START);
				}
				break;
			case HTML_CONTENT_LI_START:
				_localctx = new HtmlContentLiStartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(HTML_CONTENT_LI_START);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ATagContext extends ParserRuleContext {
		public ATagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aTag; }
	 
		public ATagContext() { }
		public void copyFrom(ATagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateATagContext extends ATagContext {
		public AStartContext aStart() {
			return getRuleContext(AStartContext.class,0);
		}
		public TagWithContentContext tagWithContent() {
			return getRuleContext(TagWithContentContext.class,0);
		}
		public TerminalNode HTML_ATTR_GT() { return getToken(MiniTemplateParser.HTML_ATTR_GT, 0); }
		public TerminalNode A_END() { return getToken(MiniTemplateParser.A_END, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TemplateATagContext(ATagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateATag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateATag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateATag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ATagContext aTag() throws RecognitionException {
		ATagContext _localctx = new ATagContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_aTag);
		int _la;
		try {
			_localctx = new TemplateATagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			aStart();
			setState(382);
			tagWithContent();
			setState(383);
			match(HTML_ATTR_GT);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 864691953085972478L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 134217731L) != 0)) {
				{
				{
				setState(384);
				element();
				}
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(390);
			match(A_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AStartContext extends ParserRuleContext {
		public AStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aStart; }
	 
		public AStartContext() { }
		public void copyFrom(AStartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalAStartContext extends AStartContext {
		public TerminalNode A_START() { return getToken(MiniTemplateParser.A_START, 0); }
		public GlobalAStartContext(AStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterGlobalAStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitGlobalAStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitGlobalAStart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentAStartContext extends AStartContext {
		public TerminalNode HTML_CONTENT_A_START() { return getToken(MiniTemplateParser.HTML_CONTENT_A_START, 0); }
		public HtmlContentAStartContext(AStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterHtmlContentAStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitHtmlContentAStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitHtmlContentAStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AStartContext aStart() throws RecognitionException {
		AStartContext _localctx = new AStartContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_aStart);
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A_START:
				_localctx = new GlobalAStartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				match(A_START);
				}
				break;
			case HTML_CONTENT_A_START:
				_localctx = new HtmlContentAStartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				match(HTML_CONTENT_A_START);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttrContext extends ParserRuleContext {
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
	 
		public AttrContext() { }
		public void copyFrom(AttrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateAttrContext extends AttrContext {
		public TerminalNode HTML_ATTR_IDENT() { return getToken(MiniTemplateParser.HTML_ATTR_IDENT, 0); }
		public TerminalNode HTML_ATTR_EQUALS() { return getToken(MiniTemplateParser.HTML_ATTR_EQUALS, 0); }
		public QuotedValueContext quotedValue() {
			return getRuleContext(QuotedValueContext.class,0);
		}
		public TemplateAttrContext(AttrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_attr);
		try {
			_localctx = new TemplateAttrContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(HTML_ATTR_IDENT);
			setState(397);
			match(HTML_ATTR_EQUALS);
			setState(398);
			quotedValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class QuotedValueContext extends ParserRuleContext {
		public QuotedValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedValue; }
	 
		public QuotedValueContext() { }
		public void copyFrom(QuotedValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateQuotedDoubleContext extends QuotedValueContext {
		public TerminalNode HTML_ATTR_DOUBLE_QUOTE() { return getToken(MiniTemplateParser.HTML_ATTR_DOUBLE_QUOTE, 0); }
		public TerminalNode HTML_ATTR_VALUE_DOUBLE_QUOTE() { return getToken(MiniTemplateParser.HTML_ATTR_VALUE_DOUBLE_QUOTE, 0); }
		public List<QuotedItemContext> quotedItem() {
			return getRuleContexts(QuotedItemContext.class);
		}
		public QuotedItemContext quotedItem(int i) {
			return getRuleContext(QuotedItemContext.class,i);
		}
		public TemplateQuotedDoubleContext(QuotedValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateQuotedDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateQuotedDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateQuotedDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateQuotedSingleContext extends QuotedValueContext {
		public TerminalNode HTML_ATTR_SINGLE_QUOTE() { return getToken(MiniTemplateParser.HTML_ATTR_SINGLE_QUOTE, 0); }
		public TerminalNode HTML_ATTR_VALUE_DOUBLE_QUOTE() { return getToken(MiniTemplateParser.HTML_ATTR_VALUE_DOUBLE_QUOTE, 0); }
		public List<QuotedItemContext> quotedItem() {
			return getRuleContexts(QuotedItemContext.class);
		}
		public QuotedItemContext quotedItem(int i) {
			return getRuleContext(QuotedItemContext.class,i);
		}
		public TemplateQuotedSingleContext(QuotedValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateQuotedSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateQuotedSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateQuotedSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedValueContext quotedValue() throws RecognitionException {
		QuotedValueContext _localctx = new QuotedValueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_quotedValue);
		int _la;
		try {
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_ATTR_DOUBLE_QUOTE:
				_localctx = new TemplateQuotedDoubleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				match(HTML_ATTR_DOUBLE_QUOTE);
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 864691334613762048L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 268435463L) != 0)) {
					{
					{
					setState(401);
					quotedItem();
					}
					}
					setState(406);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(407);
				match(HTML_ATTR_VALUE_DOUBLE_QUOTE);
				}
				break;
			case HTML_ATTR_SINGLE_QUOTE:
				_localctx = new TemplateQuotedSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(HTML_ATTR_SINGLE_QUOTE);
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 864691334613762048L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 268435463L) != 0)) {
					{
					{
					setState(409);
					quotedItem();
					}
					}
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(415);
				match(HTML_ATTR_VALUE_DOUBLE_QUOTE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class QuotedItemContext extends ParserRuleContext {
		public QuotedItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedItem; }
	 
		public QuotedItemContext() { }
		public void copyFrom(QuotedItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateQuotedTextContext extends QuotedItemContext {
		public TerminalNode HTML_ATTR_VALUE_TEXT() { return getToken(MiniTemplateParser.HTML_ATTR_VALUE_TEXT, 0); }
		public TemplateQuotedTextContext(QuotedItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateQuotedText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateQuotedText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateQuotedText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateQuotedJinjaVarContext extends QuotedItemContext {
		public JinjaVarContext jinjaVar() {
			return getRuleContext(JinjaVarContext.class,0);
		}
		public TemplateQuotedJinjaVarContext(QuotedItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateQuotedJinjaVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateQuotedJinjaVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateQuotedJinjaVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateQuotedJinjaBlockContext extends QuotedItemContext {
		public JinjaBlockContext jinjaBlock() {
			return getRuleContext(JinjaBlockContext.class,0);
		}
		public TemplateQuotedJinjaBlockContext(QuotedItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateQuotedJinjaBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateQuotedJinjaBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateQuotedJinjaBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedItemContext quotedItem() throws RecognitionException {
		QuotedItemContext _localctx = new QuotedItemContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_quotedItem);
		try {
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_ATTR_VALUE_TEXT:
				_localctx = new TemplateQuotedTextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				match(HTML_ATTR_VALUE_TEXT);
				}
				break;
			case VAR_START:
			case HTML_CONTENT_VAR_START:
			case HTML_ATTR_VAR_START:
			case HTML_ATTR_VALUE_VAR_START:
			case CSS_VALUE_VAR_START:
				_localctx = new TemplateQuotedJinjaVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				jinjaVar();
				}
				break;
			case BLOCK_START:
			case HTML_CONTENT_BLOCK_START:
			case HTML_ATTR_BLOCK_START:
			case HTML_ATTR_VALUE_BLOCK_START:
				_localctx = new TemplateQuotedJinjaBlockContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
				jinjaBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StyleTagContext extends ParserRuleContext {
		public StyleTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleTag; }
	 
		public StyleTagContext() { }
		public void copyFrom(StyleTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateStyleTagContext extends StyleTagContext {
		public TerminalNode STYLE_START() { return getToken(MiniTemplateParser.STYLE_START, 0); }
		public CssRulesContext cssRules() {
			return getRuleContext(CssRulesContext.class,0);
		}
		public TerminalNode CSS_STYLE_END() { return getToken(MiniTemplateParser.CSS_STYLE_END, 0); }
		public List<TerminalNode> CSS_NEWLINE() { return getTokens(MiniTemplateParser.CSS_NEWLINE); }
		public TerminalNode CSS_NEWLINE(int i) {
			return getToken(MiniTemplateParser.CSS_NEWLINE, i);
		}
		public TemplateStyleTagContext(StyleTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateStyleTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateStyleTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateStyleTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleTagContext styleTag() throws RecognitionException {
		StyleTagContext _localctx = new StyleTagContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_styleTag);
		int _la;
		try {
			int _alt;
			_localctx = new TemplateStyleTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(STYLE_START);
			setState(427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(424);
					match(CSS_NEWLINE);
					}
					} 
				}
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(430);
			cssRules();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_NEWLINE) {
				{
				{
				setState(431);
				match(CSS_NEWLINE);
				}
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(437);
			match(CSS_STYLE_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssRulesContext extends ParserRuleContext {
		public CssRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRules; }
	 
		public CssRulesContext() { }
		public void copyFrom(CssRulesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateCssRulesContext extends CssRulesContext {
		public List<CssRuleContext> cssRule() {
			return getRuleContexts(CssRuleContext.class);
		}
		public CssRuleContext cssRule(int i) {
			return getRuleContext(CssRuleContext.class,i);
		}
		public TemplateCssRulesContext(CssRulesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateCssRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateCssRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateCssRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRulesContext cssRules() throws RecognitionException {
		CssRulesContext _localctx = new CssRulesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_cssRules);
		int _la;
		try {
			_localctx = new TemplateCssRulesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 4111L) != 0)) {
				{
				{
				setState(439);
				cssRule();
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssRuleContext extends ParserRuleContext {
		public CssRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRule; }
	 
		public CssRuleContext() { }
		public void copyFrom(CssRuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateCssRuleContext extends CssRuleContext {
		public CssSelectorListContext cssSelectorList() {
			return getRuleContext(CssSelectorListContext.class,0);
		}
		public CssDeclarationListContext cssDeclarationList() {
			return getRuleContext(CssDeclarationListContext.class,0);
		}
		public List<TerminalNode> CSS_NEWLINE() { return getTokens(MiniTemplateParser.CSS_NEWLINE); }
		public TerminalNode CSS_NEWLINE(int i) {
			return getToken(MiniTemplateParser.CSS_NEWLINE, i);
		}
		public TemplateCssRuleContext(CssRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateCssRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateCssRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateCssRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRuleContext cssRule() throws RecognitionException {
		CssRuleContext _localctx = new CssRuleContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_cssRule);
		try {
			int _alt;
			_localctx = new TemplateCssRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			cssSelectorList();
			setState(446);
			cssDeclarationList();
			setState(450);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(447);
					match(CSS_NEWLINE);
					}
					} 
				}
				setState(452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssDeclarationListContext extends ParserRuleContext {
		public CssDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDeclarationList; }
	 
		public CssDeclarationListContext() { }
		public void copyFrom(CssDeclarationListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateCssDeclarationListContext extends CssDeclarationListContext {
		public TerminalNode CSS_LBRACE() { return getToken(MiniTemplateParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RULE_RBRACE() { return getToken(MiniTemplateParser.CSS_RULE_RBRACE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(MiniTemplateParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MiniTemplateParser.NEWLINE, i);
		}
		public List<CssDeclarationContext> cssDeclaration() {
			return getRuleContexts(CssDeclarationContext.class);
		}
		public CssDeclarationContext cssDeclaration(int i) {
			return getRuleContext(CssDeclarationContext.class,i);
		}
		public TemplateCssDeclarationListContext(CssDeclarationListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateCssDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateCssDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateCssDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDeclarationListContext cssDeclarationList() throws RecognitionException {
		CssDeclarationListContext _localctx = new CssDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_cssDeclarationList);
		int _la;
		try {
			int _alt;
			_localctx = new TemplateCssDeclarationListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(CSS_LBRACE);
			setState(457);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(454);
					match(NEWLINE);
					}
					} 
				}
				setState(459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_RULE_IDENT) {
				{
				{
				setState(460);
				cssDeclaration();
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(466);
				match(NEWLINE);
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(472);
			match(CSS_RULE_RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssDeclarationContext extends ParserRuleContext {
		public CssDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDeclaration; }
	 
		public CssDeclarationContext() { }
		public void copyFrom(CssDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateCssDeclarationContext extends CssDeclarationContext {
		public CssPropertyContext cssProperty() {
			return getRuleContext(CssPropertyContext.class,0);
		}
		public TerminalNode CSS_RULE_COLON() { return getToken(MiniTemplateParser.CSS_RULE_COLON, 0); }
		public TerminalNode CSS_VALUE_END() { return getToken(MiniTemplateParser.CSS_VALUE_END, 0); }
		public List<CssValueContext> cssValue() {
			return getRuleContexts(CssValueContext.class);
		}
		public CssValueContext cssValue(int i) {
			return getRuleContext(CssValueContext.class,i);
		}
		public TemplateCssDeclarationContext(CssDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateCssDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateCssDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateCssDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDeclarationContext cssDeclaration() throws RecognitionException {
		CssDeclarationContext _localctx = new CssDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_cssDeclaration);
		int _la;
		try {
			_localctx = new TemplateCssDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			cssProperty();
			setState(475);
			match(CSS_RULE_COLON);
			setState(477); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(476);
				cssValue();
				}
				}
				setState(479); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 288230444871254016L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 793629425665L) != 0) );
			setState(481);
			match(CSS_VALUE_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssPropertyContext extends ParserRuleContext {
		public CssPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssProperty; }
	 
		public CssPropertyContext() { }
		public void copyFrom(CssPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateCssPropertyContext extends CssPropertyContext {
		public TerminalNode CSS_RULE_IDENT() { return getToken(MiniTemplateParser.CSS_RULE_IDENT, 0); }
		public TemplateCssPropertyContext(CssPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateCssProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateCssProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateCssProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssPropertyContext cssProperty() throws RecognitionException {
		CssPropertyContext _localctx = new CssPropertyContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_cssProperty);
		try {
			_localctx = new TemplateCssPropertyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(CSS_RULE_IDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssValueContext extends ParserRuleContext {
		public CssValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValue; }
	 
		public CssValueContext() { }
		public void copyFrom(CssValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateCssJinjaVarContext extends CssValueContext {
		public JinjaVarContext jinjaVar() {
			return getRuleContext(JinjaVarContext.class,0);
		}
		public TerminalNode CSS_VALUE_UNIT() { return getToken(MiniTemplateParser.CSS_VALUE_UNIT, 0); }
		public TemplateCssJinjaVarContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateCssJinjaVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateCssJinjaVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateCssJinjaVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateCssColorContext extends CssValueContext {
		public TerminalNode CSS_VALUE_COLOR() { return getToken(MiniTemplateParser.CSS_VALUE_COLOR, 0); }
		public TemplateCssColorContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateCssColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateCssColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateCssColor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateCssNumberContext extends CssValueContext {
		public TerminalNode CSS_VALUE_NUMBER() { return getToken(MiniTemplateParser.CSS_VALUE_NUMBER, 0); }
		public TerminalNode CSS_VALUE_MINUS() { return getToken(MiniTemplateParser.CSS_VALUE_MINUS, 0); }
		public TerminalNode CSS_VALUE_UNIT() { return getToken(MiniTemplateParser.CSS_VALUE_UNIT, 0); }
		public TemplateCssNumberContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateCssNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateCssNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateCssNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateCssFunctionContext extends CssValueContext {
		public CssFunctionContext cssFunction() {
			return getRuleContext(CssFunctionContext.class,0);
		}
		public TemplateCssFunctionContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateCssFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateCssFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateCssFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateCssIdentContext extends CssValueContext {
		public TerminalNode CSS_VALUE_IDENT() { return getToken(MiniTemplateParser.CSS_VALUE_IDENT, 0); }
		public TerminalNode CSS_VAR_PREFIX() { return getToken(MiniTemplateParser.CSS_VAR_PREFIX, 0); }
		public TemplateCssIdentContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateCssIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateCssIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateCssIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateCssStringContext extends CssValueContext {
		public TerminalNode CSS_VALUE_STRING() { return getToken(MiniTemplateParser.CSS_VALUE_STRING, 0); }
		public TemplateCssStringContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateCssString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateCssString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateCssString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueContext cssValue() throws RecognitionException {
		CssValueContext _localctx = new CssValueContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_cssValue);
		int _la;
		try {
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				_localctx = new TemplateCssNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_VALUE_MINUS) {
					{
					setState(485);
					match(CSS_VALUE_MINUS);
					}
				}

				setState(488);
				match(CSS_VALUE_NUMBER);
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_VALUE_UNIT) {
					{
					setState(489);
					match(CSS_VALUE_UNIT);
					}
				}

				}
				break;
			case 2:
				_localctx = new TemplateCssFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				cssFunction();
				}
				break;
			case 3:
				_localctx = new TemplateCssIdentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_VAR_PREFIX) {
					{
					setState(493);
					match(CSS_VAR_PREFIX);
					}
				}

				setState(496);
				match(CSS_VALUE_IDENT);
				}
				break;
			case 4:
				_localctx = new TemplateCssStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(497);
				match(CSS_VALUE_STRING);
				}
				break;
			case 5:
				_localctx = new TemplateCssColorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(498);
				match(CSS_VALUE_COLOR);
				}
				break;
			case 6:
				_localctx = new TemplateCssJinjaVarContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(499);
				jinjaVar();
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_VALUE_UNIT) {
					{
					setState(500);
					match(CSS_VALUE_UNIT);
					}
				}

				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssFunctionContext extends ParserRuleContext {
		public TerminalNode CSS_VALUE_IDENT() { return getToken(MiniTemplateParser.CSS_VALUE_IDENT, 0); }
		public TerminalNode CSS_VALUE_LPAREN() { return getToken(MiniTemplateParser.CSS_VALUE_LPAREN, 0); }
		public List<CssValueContext> cssValue() {
			return getRuleContexts(CssValueContext.class);
		}
		public CssValueContext cssValue(int i) {
			return getRuleContext(CssValueContext.class,i);
		}
		public TerminalNode CSS_VALUE_RPAREN() { return getToken(MiniTemplateParser.CSS_VALUE_RPAREN, 0); }
		public List<TerminalNode> CSS_VALUE_COMMA() { return getTokens(MiniTemplateParser.CSS_VALUE_COMMA); }
		public TerminalNode CSS_VALUE_COMMA(int i) {
			return getToken(MiniTemplateParser.CSS_VALUE_COMMA, i);
		}
		public List<TerminalNode> CSS_VALUE_WS() { return getTokens(MiniTemplateParser.CSS_VALUE_WS); }
		public TerminalNode CSS_VALUE_WS(int i) {
			return getToken(MiniTemplateParser.CSS_VALUE_WS, i);
		}
		public List<TerminalNode> CSS_VALUE_PLUS() { return getTokens(MiniTemplateParser.CSS_VALUE_PLUS); }
		public TerminalNode CSS_VALUE_PLUS(int i) {
			return getToken(MiniTemplateParser.CSS_VALUE_PLUS, i);
		}
		public List<TerminalNode> CSS_VALUE_MINUS() { return getTokens(MiniTemplateParser.CSS_VALUE_MINUS); }
		public TerminalNode CSS_VALUE_MINUS(int i) {
			return getToken(MiniTemplateParser.CSS_VALUE_MINUS, i);
		}
		public CssFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterCssFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitCssFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitCssFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssFunctionContext cssFunction() throws RecognitionException {
		CssFunctionContext _localctx = new CssFunctionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_cssFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(CSS_VALUE_IDENT);
			setState(506);
			match(CSS_VALUE_LPAREN);
			setState(507);
			cssValue();
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 2061L) != 0)) {
				{
				{
				setState(508);
				_la = _input.LA(1);
				if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 2061L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(509);
				cssValue();
				}
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(515);
			match(CSS_VALUE_RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorListContext extends ParserRuleContext {
		public CssSelectorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelectorList; }
	 
		public CssSelectorListContext() { }
		public void copyFrom(CssSelectorListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateCssSelectorListContext extends CssSelectorListContext {
		public List<CssSelectorContext> cssSelector() {
			return getRuleContexts(CssSelectorContext.class);
		}
		public CssSelectorContext cssSelector(int i) {
			return getRuleContext(CssSelectorContext.class,i);
		}
		public List<TerminalNode> CSS_COMMA() { return getTokens(MiniTemplateParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(MiniTemplateParser.CSS_COMMA, i);
		}
		public TemplateCssSelectorListContext(CssSelectorListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateCssSelectorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateCssSelectorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateCssSelectorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelectorListContext cssSelectorList() throws RecognitionException {
		CssSelectorListContext _localctx = new CssSelectorListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_cssSelectorList);
		int _la;
		try {
			_localctx = new TemplateCssSelectorListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			cssSelector();
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(518);
				match(CSS_COMMA);
				setState(519);
				cssSelector();
				}
				}
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorContext extends ParserRuleContext {
		public CssSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelector; }
	 
		public CssSelectorContext() { }
		public void copyFrom(CssSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateCssSelectorContext extends CssSelectorContext {
		public List<SelectorUnitContext> selectorUnit() {
			return getRuleContexts(SelectorUnitContext.class);
		}
		public SelectorUnitContext selectorUnit(int i) {
			return getRuleContext(SelectorUnitContext.class,i);
		}
		public List<CombinatorContext> combinator() {
			return getRuleContexts(CombinatorContext.class);
		}
		public CombinatorContext combinator(int i) {
			return getRuleContext(CombinatorContext.class,i);
		}
		public TemplateCssSelectorContext(CssSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateCssSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateCssSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateCssSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelectorContext cssSelector() throws RecognitionException {
		CssSelectorContext _localctx = new CssSelectorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_cssSelector);
		int _la;
		try {
			_localctx = new TemplateCssSelectorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			selectorUnit();
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 4223L) != 0)) {
				{
				{
				setState(526);
				combinator();
				setState(527);
				selectorUnit();
				}
				}
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorUnitContext extends ParserRuleContext {
		public SelectorUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorUnit; }
	 
		public SelectorUnitContext() { }
		public void copyFrom(SelectorUnitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateSelectorUnitContext extends SelectorUnitContext {
		public BaseSelectorPartContext baseSelectorPart() {
			return getRuleContext(BaseSelectorPartContext.class,0);
		}
		public List<ClassPartContext> classPart() {
			return getRuleContexts(ClassPartContext.class);
		}
		public ClassPartContext classPart(int i) {
			return getRuleContext(ClassPartContext.class,i);
		}
		public List<IdPartContext> idPart() {
			return getRuleContexts(IdPartContext.class);
		}
		public IdPartContext idPart(int i) {
			return getRuleContext(IdPartContext.class,i);
		}
		public List<PseudoClassContext> pseudoClass() {
			return getRuleContexts(PseudoClassContext.class);
		}
		public PseudoClassContext pseudoClass(int i) {
			return getRuleContext(PseudoClassContext.class,i);
		}
		public List<PseudoElementContext> pseudoElement() {
			return getRuleContexts(PseudoElementContext.class);
		}
		public PseudoElementContext pseudoElement(int i) {
			return getRuleContext(PseudoElementContext.class,i);
		}
		public TemplateSelectorUnitContext(SelectorUnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateSelectorUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateSelectorUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateSelectorUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorUnitContext selectorUnit() throws RecognitionException {
		SelectorUnitContext _localctx = new SelectorUnitContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_selectorUnit);
		try {
			int _alt;
			_localctx = new TemplateSelectorUnitContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			baseSelectorPart();
			setState(541);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(539);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CSS_DOT:
						{
						setState(535);
						classPart();
						}
						break;
					case CSS_HASH:
						{
						setState(536);
						idPart();
						}
						break;
					case CSS_PSEUDO_COLON:
						{
						setState(537);
						pseudoClass();
						}
						break;
					case CSS_PSEUDO_DOUBLE_COLON:
						{
						setState(538);
						pseudoElement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BaseSelectorPartContext extends ParserRuleContext {
		public BaseSelectorPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseSelectorPart; }
	 
		public BaseSelectorPartContext() { }
		public void copyFrom(BaseSelectorPartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateBaseSelectorIdContext extends BaseSelectorPartContext {
		public IdPartContext idPart() {
			return getRuleContext(IdPartContext.class,0);
		}
		public TemplateBaseSelectorIdContext(BaseSelectorPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateBaseSelectorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateBaseSelectorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateBaseSelectorId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateBaseSelectorTagContext extends BaseSelectorPartContext {
		public TerminalNode CSS_TAG() { return getToken(MiniTemplateParser.CSS_TAG, 0); }
		public TemplateBaseSelectorTagContext(BaseSelectorPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateBaseSelectorTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateBaseSelectorTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateBaseSelectorTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateBaseSelectorClassContext extends BaseSelectorPartContext {
		public ClassPartContext classPart() {
			return getRuleContext(ClassPartContext.class,0);
		}
		public TemplateBaseSelectorClassContext(BaseSelectorPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateBaseSelectorClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateBaseSelectorClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateBaseSelectorClass(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateBaseSelectorStarContext extends BaseSelectorPartContext {
		public TerminalNode CSS_STAR() { return getToken(MiniTemplateParser.CSS_STAR, 0); }
		public TemplateBaseSelectorStarContext(BaseSelectorPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateBaseSelectorStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateBaseSelectorStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateBaseSelectorStar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateBaseSelectorIdentContext extends BaseSelectorPartContext {
		public TerminalNode CSS_IDENT() { return getToken(MiniTemplateParser.CSS_IDENT, 0); }
		public TemplateBaseSelectorIdentContext(BaseSelectorPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateBaseSelectorIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateBaseSelectorIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateBaseSelectorIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseSelectorPartContext baseSelectorPart() throws RecognitionException {
		BaseSelectorPartContext _localctx = new BaseSelectorPartContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_baseSelectorPart);
		try {
			setState(549);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_TAG:
				_localctx = new TemplateBaseSelectorTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				match(CSS_TAG);
				}
				break;
			case CSS_IDENT:
				_localctx = new TemplateBaseSelectorIdentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				match(CSS_IDENT);
				}
				break;
			case CSS_STAR:
				_localctx = new TemplateBaseSelectorStarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(546);
				match(CSS_STAR);
				}
				break;
			case CSS_DOT:
				_localctx = new TemplateBaseSelectorClassContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(547);
				classPart();
				}
				break;
			case CSS_HASH:
				_localctx = new TemplateBaseSelectorIdContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(548);
				idPart();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassPartContext extends ParserRuleContext {
		public ClassPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classPart; }
	 
		public ClassPartContext() { }
		public void copyFrom(ClassPartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateClassPartContext extends ClassPartContext {
		public TerminalNode CSS_DOT() { return getToken(MiniTemplateParser.CSS_DOT, 0); }
		public TerminalNode CSS_IDENT() { return getToken(MiniTemplateParser.CSS_IDENT, 0); }
		public TemplateClassPartContext(ClassPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateClassPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateClassPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateClassPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassPartContext classPart() throws RecognitionException {
		ClassPartContext _localctx = new ClassPartContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_classPart);
		try {
			_localctx = new TemplateClassPartContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(CSS_DOT);
			setState(552);
			match(CSS_IDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdPartContext extends ParserRuleContext {
		public IdPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idPart; }
	 
		public IdPartContext() { }
		public void copyFrom(IdPartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateIdPartContext extends IdPartContext {
		public TerminalNode CSS_HASH() { return getToken(MiniTemplateParser.CSS_HASH, 0); }
		public TerminalNode CSS_IDENT() { return getToken(MiniTemplateParser.CSS_IDENT, 0); }
		public TemplateIdPartContext(IdPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateIdPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateIdPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateIdPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdPartContext idPart() throws RecognitionException {
		IdPartContext _localctx = new IdPartContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_idPart);
		try {
			_localctx = new TemplateIdPartContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(CSS_HASH);
			setState(555);
			match(CSS_IDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CombinatorContext extends ParserRuleContext {
		public CombinatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinator; }
	 
		public CombinatorContext() { }
		public void copyFrom(CombinatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateCombinatorNoneContext extends CombinatorContext {
		public TemplateCombinatorNoneContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateCombinatorNone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateCombinatorNone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateCombinatorNone(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateCombinatorGenSibContext extends CombinatorContext {
		public TerminalNode CSS_GEN_SIB() { return getToken(MiniTemplateParser.CSS_GEN_SIB, 0); }
		public TemplateCombinatorGenSibContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateCombinatorGenSib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateCombinatorGenSib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateCombinatorGenSib(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateCombinatorGtContext extends CombinatorContext {
		public TerminalNode CSS_GT() { return getToken(MiniTemplateParser.CSS_GT, 0); }
		public TemplateCombinatorGtContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateCombinatorGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateCombinatorGt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateCombinatorGt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateCombinatorPlusContext extends CombinatorContext {
		public TerminalNode CSS_PLUS() { return getToken(MiniTemplateParser.CSS_PLUS, 0); }
		public TemplateCombinatorPlusContext(CombinatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateCombinatorPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateCombinatorPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateCombinatorPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombinatorContext combinator() throws RecognitionException {
		CombinatorContext _localctx = new CombinatorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_combinator);
		try {
			setState(561);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_GT:
				_localctx = new TemplateCombinatorGtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				match(CSS_GT);
				}
				break;
			case CSS_PLUS:
				_localctx = new TemplateCombinatorPlusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				match(CSS_PLUS);
				}
				break;
			case CSS_GEN_SIB:
				_localctx = new TemplateCombinatorGenSibContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(559);
				match(CSS_GEN_SIB);
				}
				break;
			case CSS_IDENT:
			case CSS_TAG:
			case CSS_STAR:
			case CSS_HASH:
			case CSS_DOT:
				_localctx = new TemplateCombinatorNoneContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoClassContext extends ParserRuleContext {
		public PseudoClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoClass; }
	 
		public PseudoClassContext() { }
		public void copyFrom(PseudoClassContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PseudoClassNodeContext extends PseudoClassContext {
		public TerminalNode CSS_PSEUDO_COLON() { return getToken(MiniTemplateParser.CSS_PSEUDO_COLON, 0); }
		public TerminalNode CSS_IDENT() { return getToken(MiniTemplateParser.CSS_IDENT, 0); }
		public PseudoArgsContext pseudoArgs() {
			return getRuleContext(PseudoArgsContext.class,0);
		}
		public PseudoClassNodeContext(PseudoClassContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterPseudoClassNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitPseudoClassNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitPseudoClassNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoClassContext pseudoClass() throws RecognitionException {
		PseudoClassContext _localctx = new PseudoClassContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_pseudoClass);
		int _la;
		try {
			_localctx = new PseudoClassNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(CSS_PSEUDO_COLON);
			setState(564);
			match(CSS_IDENT);
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_LPAREN) {
				{
				setState(565);
				pseudoArgs();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoArgsContext extends ParserRuleContext {
		public PseudoArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoArgs; }
	 
		public PseudoArgsContext() { }
		public void copyFrom(PseudoArgsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PseudoArgsNodeContext extends PseudoArgsContext {
		public TerminalNode CSS_LPAREN() { return getToken(MiniTemplateParser.CSS_LPAREN, 0); }
		public PseudoExprContext pseudoExpr() {
			return getRuleContext(PseudoExprContext.class,0);
		}
		public TerminalNode CSS_RPAREN() { return getToken(MiniTemplateParser.CSS_RPAREN, 0); }
		public PseudoArgsNodeContext(PseudoArgsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterPseudoArgsNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitPseudoArgsNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitPseudoArgsNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoArgsContext pseudoArgs() throws RecognitionException {
		PseudoArgsContext _localctx = new PseudoArgsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_pseudoArgs);
		try {
			_localctx = new PseudoArgsNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(CSS_LPAREN);
			setState(569);
			pseudoExpr();
			setState(570);
			match(CSS_RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoExprContext extends ParserRuleContext {
		public PseudoExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoExpr; }
	 
		public PseudoExprContext() { }
		public void copyFrom(PseudoExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PseudoExprNodeContext extends PseudoExprContext {
		public List<PseudoExprAtomContext> pseudoExprAtom() {
			return getRuleContexts(PseudoExprAtomContext.class);
		}
		public PseudoExprAtomContext pseudoExprAtom(int i) {
			return getRuleContext(PseudoExprAtomContext.class,i);
		}
		public PseudoExprNodeContext(PseudoExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterPseudoExprNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitPseudoExprNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitPseudoExprNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoExprContext pseudoExpr() throws RecognitionException {
		PseudoExprContext _localctx = new PseudoExprContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_pseudoExpr);
		int _la;
		try {
			_localctx = new PseudoExprNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(573); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(572);
				pseudoExprAtom();
				}
				}
				setState(575); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 39605L) != 0) || _la==CSS_STRING || _la==CSS_MINUS );
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

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoExprAtomContext extends ParserRuleContext {
		public PseudoExprAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoExprAtom; }
	 
		public PseudoExprAtomContext() { }
		public void copyFrom(PseudoExprAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomStarContext extends PseudoExprAtomContext {
		public TerminalNode CSS_STAR() { return getToken(MiniTemplateParser.CSS_STAR, 0); }
		public AtomStarContext(PseudoExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterAtomStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitAtomStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitAtomStar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomColonIdentContext extends PseudoExprAtomContext {
		public TerminalNode CSS_PSEUDO_COLON() { return getToken(MiniTemplateParser.CSS_PSEUDO_COLON, 0); }
		public TerminalNode CSS_IDENT() { return getToken(MiniTemplateParser.CSS_IDENT, 0); }
		public AtomColonIdentContext(PseudoExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterAtomColonIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitAtomColonIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitAtomColonIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomCommaContext extends PseudoExprAtomContext {
		public TerminalNode CSS_COMMA() { return getToken(MiniTemplateParser.CSS_COMMA, 0); }
		public AtomCommaContext(PseudoExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterAtomComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitAtomComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitAtomComma(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomPlusContext extends PseudoExprAtomContext {
		public TerminalNode CSS_PLUS() { return getToken(MiniTemplateParser.CSS_PLUS, 0); }
		public AtomPlusContext(PseudoExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterAtomPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitAtomPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitAtomPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomNumberContext extends PseudoExprAtomContext {
		public TerminalNode CSS_NUMBER() { return getToken(MiniTemplateParser.CSS_NUMBER, 0); }
		public AtomNumberContext(PseudoExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterAtomNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitAtomNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitAtomNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomMinusContext extends PseudoExprAtomContext {
		public TerminalNode CSS_MINUS() { return getToken(MiniTemplateParser.CSS_MINUS, 0); }
		public AtomMinusContext(PseudoExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterAtomMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitAtomMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitAtomMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomDotIdentContext extends PseudoExprAtomContext {
		public TerminalNode CSS_DOT() { return getToken(MiniTemplateParser.CSS_DOT, 0); }
		public TerminalNode CSS_IDENT() { return getToken(MiniTemplateParser.CSS_IDENT, 0); }
		public AtomDotIdentContext(PseudoExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterAtomDotIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitAtomDotIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitAtomDotIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomParenExprContext extends PseudoExprAtomContext {
		public TerminalNode CSS_LPAREN() { return getToken(MiniTemplateParser.CSS_LPAREN, 0); }
		public PseudoExprContext pseudoExpr() {
			return getRuleContext(PseudoExprContext.class,0);
		}
		public TerminalNode CSS_RPAREN() { return getToken(MiniTemplateParser.CSS_RPAREN, 0); }
		public AtomParenExprContext(PseudoExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterAtomParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitAtomParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitAtomParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomStringContext extends PseudoExprAtomContext {
		public TerminalNode CSS_STRING() { return getToken(MiniTemplateParser.CSS_STRING, 0); }
		public AtomStringContext(PseudoExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterAtomString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitAtomString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitAtomString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomIdentContext extends PseudoExprAtomContext {
		public TerminalNode CSS_IDENT() { return getToken(MiniTemplateParser.CSS_IDENT, 0); }
		public AtomIdentContext(PseudoExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterAtomIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitAtomIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitAtomIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomGtContext extends PseudoExprAtomContext {
		public TerminalNode CSS_GT() { return getToken(MiniTemplateParser.CSS_GT, 0); }
		public AtomGtContext(PseudoExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterAtomGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitAtomGt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitAtomGt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoExprAtomContext pseudoExprAtom() throws RecognitionException {
		PseudoExprAtomContext _localctx = new PseudoExprAtomContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_pseudoExprAtom);
		try {
			setState(593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_IDENT:
				_localctx = new AtomIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				match(CSS_IDENT);
				}
				break;
			case CSS_NUMBER:
				_localctx = new AtomNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				match(CSS_NUMBER);
				}
				break;
			case CSS_STRING:
				_localctx = new AtomStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(579);
				match(CSS_STRING);
				}
				break;
			case CSS_DOT:
				_localctx = new AtomDotIdentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(580);
				match(CSS_DOT);
				setState(581);
				match(CSS_IDENT);
				}
				break;
			case CSS_PSEUDO_COLON:
				_localctx = new AtomColonIdentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(582);
				match(CSS_PSEUDO_COLON);
				setState(583);
				match(CSS_IDENT);
				}
				break;
			case CSS_LPAREN:
				_localctx = new AtomParenExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(584);
				match(CSS_LPAREN);
				setState(585);
				pseudoExpr();
				setState(586);
				match(CSS_RPAREN);
				}
				break;
			case CSS_COMMA:
				_localctx = new AtomCommaContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(588);
				match(CSS_COMMA);
				}
				break;
			case CSS_PLUS:
				_localctx = new AtomPlusContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(589);
				match(CSS_PLUS);
				}
				break;
			case CSS_MINUS:
				_localctx = new AtomMinusContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(590);
				match(CSS_MINUS);
				}
				break;
			case CSS_STAR:
				_localctx = new AtomStarContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(591);
				match(CSS_STAR);
				}
				break;
			case CSS_GT:
				_localctx = new AtomGtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(592);
				match(CSS_GT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoElementContext extends ParserRuleContext {
		public PseudoElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoElement; }
	 
		public PseudoElementContext() { }
		public void copyFrom(PseudoElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplatePseudoElementExprContext extends PseudoElementContext {
		public TerminalNode CSS_PSEUDO_DOUBLE_COLON() { return getToken(MiniTemplateParser.CSS_PSEUDO_DOUBLE_COLON, 0); }
		public TerminalNode CSS_IDENT() { return getToken(MiniTemplateParser.CSS_IDENT, 0); }
		public TemplatePseudoElementExprContext(PseudoElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplatePseudoElementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplatePseudoElementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplatePseudoElementExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoElementContext pseudoElement() throws RecognitionException {
		PseudoElementContext _localctx = new PseudoElementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_pseudoElement);
		try {
			_localctx = new TemplatePseudoElementExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(CSS_PSEUDO_DOUBLE_COLON);
			setState(596);
			match(CSS_IDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaVarContext extends ParserRuleContext {
		public JinjaVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaVar; }
	 
		public JinjaVarContext() { }
		public void copyFrom(JinjaVarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateJinjaVarExprContext extends JinjaVarContext {
		public VarStartContext varStart() {
			return getRuleContext(VarStartContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode JINJA_VAR_END() { return getToken(MiniTemplateParser.JINJA_VAR_END, 0); }
		public TemplateJinjaVarExprContext(JinjaVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateJinjaVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateJinjaVarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateJinjaVarExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaVarContext jinjaVar() throws RecognitionException {
		JinjaVarContext _localctx = new JinjaVarContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_jinjaVar);
		try {
			_localctx = new TemplateJinjaVarExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			varStart();
			setState(599);
			expr();
			setState(600);
			match(JINJA_VAR_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarStartContext extends ParserRuleContext {
		public VarStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varStart; }
	 
		public VarStartContext() { }
		public void copyFrom(VarStartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaHtmlVarStartContext extends VarStartContext {
		public TerminalNode HTML_CONTENT_VAR_START() { return getToken(MiniTemplateParser.HTML_CONTENT_VAR_START, 0); }
		public JinjaHtmlVarStartContext(VarStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterJinjaHtmlVarStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitJinjaHtmlVarStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitJinjaHtmlVarStart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaHtmlAttrVarStartContext extends VarStartContext {
		public TerminalNode HTML_ATTR_VAR_START() { return getToken(MiniTemplateParser.HTML_ATTR_VAR_START, 0); }
		public JinjaHtmlAttrVarStartContext(VarStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterJinjaHtmlAttrVarStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitJinjaHtmlAttrVarStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitJinjaHtmlAttrVarStart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaHtmlAttrValueVarStartContext extends VarStartContext {
		public TerminalNode HTML_ATTR_VALUE_VAR_START() { return getToken(MiniTemplateParser.HTML_ATTR_VALUE_VAR_START, 0); }
		public JinjaHtmlAttrValueVarStartContext(VarStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterJinjaHtmlAttrValueVarStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitJinjaHtmlAttrValueVarStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitJinjaHtmlAttrValueVarStart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaVarStartContext extends VarStartContext {
		public TerminalNode VAR_START() { return getToken(MiniTemplateParser.VAR_START, 0); }
		public JinjaVarStartContext(VarStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterJinjaVarStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitJinjaVarStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitJinjaVarStart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaCssValueVarStartContext extends VarStartContext {
		public TerminalNode CSS_VALUE_VAR_START() { return getToken(MiniTemplateParser.CSS_VALUE_VAR_START, 0); }
		public JinjaCssValueVarStartContext(VarStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterJinjaCssValueVarStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitJinjaCssValueVarStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitJinjaCssValueVarStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarStartContext varStart() throws RecognitionException {
		VarStartContext _localctx = new VarStartContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_varStart);
		try {
			setState(607);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_START:
				_localctx = new JinjaVarStartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				match(VAR_START);
				}
				break;
			case HTML_CONTENT_VAR_START:
				_localctx = new JinjaHtmlVarStartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				match(HTML_CONTENT_VAR_START);
				}
				break;
			case HTML_ATTR_VAR_START:
				_localctx = new JinjaHtmlAttrVarStartContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(604);
				match(HTML_ATTR_VAR_START);
				}
				break;
			case HTML_ATTR_VALUE_VAR_START:
				_localctx = new JinjaHtmlAttrValueVarStartContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(605);
				match(HTML_ATTR_VALUE_VAR_START);
				}
				break;
			case CSS_VALUE_VAR_START:
				_localctx = new JinjaCssValueVarStartContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(606);
				match(CSS_VALUE_VAR_START);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockContext extends ParserRuleContext {
		public JinjaBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaBlock; }
	 
		public JinjaBlockContext() { }
		public void copyFrom(JinjaBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateJinjaIfBlockContext extends JinjaBlockContext {
		public JinjaIfContext jinjaIf() {
			return getRuleContext(JinjaIfContext.class,0);
		}
		public TemplateJinjaIfBlockContext(JinjaBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateJinjaIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateJinjaIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateJinjaIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateJinjaForBlockContext extends JinjaBlockContext {
		public JinjaForContext jinjaFor() {
			return getRuleContext(JinjaForContext.class,0);
		}
		public TemplateJinjaForBlockContext(JinjaBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateJinjaForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateJinjaForBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateJinjaForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaBlockContext jinjaBlock() throws RecognitionException {
		JinjaBlockContext _localctx = new JinjaBlockContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_jinjaBlock);
		try {
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				_localctx = new TemplateJinjaForBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				jinjaFor();
				}
				break;
			case 2:
				_localctx = new TemplateJinjaIfBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				jinjaIf();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaForContext extends ParserRuleContext {
		public JinjaForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaFor; }
	 
		public JinjaForContext() { }
		public void copyFrom(JinjaForContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateJinjaForContext extends JinjaForContext {
		public List<BlockStartContext> blockStart() {
			return getRuleContexts(BlockStartContext.class);
		}
		public BlockStartContext blockStart(int i) {
			return getRuleContext(BlockStartContext.class,i);
		}
		public TerminalNode JINJA_FOR() { return getToken(MiniTemplateParser.JINJA_FOR, 0); }
		public TerminalNode JINJA_IDENT() { return getToken(MiniTemplateParser.JINJA_IDENT, 0); }
		public TerminalNode JINJA_IN() { return getToken(MiniTemplateParser.JINJA_IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> JINJA_BLOCK_END() { return getTokens(MiniTemplateParser.JINJA_BLOCK_END); }
		public TerminalNode JINJA_BLOCK_END(int i) {
			return getToken(MiniTemplateParser.JINJA_BLOCK_END, i);
		}
		public TerminalNode JINJA_ENDFOR() { return getToken(MiniTemplateParser.JINJA_ENDFOR, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TemplateJinjaForContext(JinjaForContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateJinjaFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateJinjaFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateJinjaFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaForContext jinjaFor() throws RecognitionException {
		JinjaForContext _localctx = new JinjaForContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_jinjaFor);
		try {
			int _alt;
			_localctx = new TemplateJinjaForContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			blockStart();
			setState(614);
			match(JINJA_FOR);
			setState(615);
			match(JINJA_IDENT);
			setState(616);
			match(JINJA_IN);
			setState(617);
			expr();
			setState(618);
			match(JINJA_BLOCK_END);
			setState(622);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(619);
					element();
					}
					} 
				}
				setState(624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(625);
			blockStart();
			setState(626);
			match(JINJA_ENDFOR);
			setState(627);
			match(JINJA_BLOCK_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaIfContext extends ParserRuleContext {
		public JinjaIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaIf; }
	 
		public JinjaIfContext() { }
		public void copyFrom(JinjaIfContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateJinjaIfContext extends JinjaIfContext {
		public List<BlockStartContext> blockStart() {
			return getRuleContexts(BlockStartContext.class);
		}
		public BlockStartContext blockStart(int i) {
			return getRuleContext(BlockStartContext.class,i);
		}
		public TerminalNode JINJA_IF() { return getToken(MiniTemplateParser.JINJA_IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> JINJA_BLOCK_END() { return getTokens(MiniTemplateParser.JINJA_BLOCK_END); }
		public TerminalNode JINJA_BLOCK_END(int i) {
			return getToken(MiniTemplateParser.JINJA_BLOCK_END, i);
		}
		public TerminalNode JINJA_ENDIF() { return getToken(MiniTemplateParser.JINJA_ENDIF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> JINJA_ELIF() { return getTokens(MiniTemplateParser.JINJA_ELIF); }
		public TerminalNode JINJA_ELIF(int i) {
			return getToken(MiniTemplateParser.JINJA_ELIF, i);
		}
		public List<TerminalNode> JINJA_ELSE() { return getTokens(MiniTemplateParser.JINJA_ELSE); }
		public TerminalNode JINJA_ELSE(int i) {
			return getToken(MiniTemplateParser.JINJA_ELSE, i);
		}
		public TemplateJinjaIfContext(JinjaIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterTemplateJinjaIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitTemplateJinjaIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitTemplateJinjaIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaIfContext jinjaIf() throws RecognitionException {
		JinjaIfContext _localctx = new JinjaIfContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_jinjaIf);
		try {
			int _alt;
			_localctx = new TemplateJinjaIfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			blockStart();
			setState(630);
			match(JINJA_IF);
			setState(631);
			expr();
			setState(632);
			match(JINJA_BLOCK_END);
			setState(636);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(633);
					element();
					}
					} 
				}
				setState(638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(651);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(639);
					blockStart();
					setState(640);
					match(JINJA_ELIF);
					setState(641);
					expr();
					setState(642);
					match(JINJA_BLOCK_END);
					setState(646);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(643);
							element();
							}
							} 
						}
						setState(648);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
					}
					}
					} 
				}
				setState(653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			setState(665);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(654);
					blockStart();
					setState(655);
					match(JINJA_ELSE);
					setState(656);
					match(JINJA_BLOCK_END);
					setState(660);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(657);
							element();
							}
							} 
						}
						setState(662);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
					}
					}
					} 
				}
				setState(667);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(668);
			blockStart();
			setState(669);
			match(JINJA_ENDIF);
			setState(670);
			match(JINJA_BLOCK_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStartContext extends ParserRuleContext {
		public BlockStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStart; }
	 
		public BlockStartContext() { }
		public void copyFrom(BlockStartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaHtmlAttrBlockStartContext extends BlockStartContext {
		public TerminalNode HTML_ATTR_BLOCK_START() { return getToken(MiniTemplateParser.HTML_ATTR_BLOCK_START, 0); }
		public JinjaHtmlAttrBlockStartContext(BlockStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterJinjaHtmlAttrBlockStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitJinjaHtmlAttrBlockStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitJinjaHtmlAttrBlockStart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockStartContext extends BlockStartContext {
		public TerminalNode BLOCK_START() { return getToken(MiniTemplateParser.BLOCK_START, 0); }
		public JinjaBlockStartContext(BlockStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterJinjaBlockStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitJinjaBlockStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitJinjaBlockStart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaHtmlBlockStartContext extends BlockStartContext {
		public TerminalNode HTML_CONTENT_BLOCK_START() { return getToken(MiniTemplateParser.HTML_CONTENT_BLOCK_START, 0); }
		public JinjaHtmlBlockStartContext(BlockStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterJinjaHtmlBlockStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitJinjaHtmlBlockStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitJinjaHtmlBlockStart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaHtmlAttrValueBlockStartContext extends BlockStartContext {
		public TerminalNode HTML_ATTR_VALUE_BLOCK_START() { return getToken(MiniTemplateParser.HTML_ATTR_VALUE_BLOCK_START, 0); }
		public JinjaHtmlAttrValueBlockStartContext(BlockStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterJinjaHtmlAttrValueBlockStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitJinjaHtmlAttrValueBlockStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitJinjaHtmlAttrValueBlockStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStartContext blockStart() throws RecognitionException {
		BlockStartContext _localctx = new BlockStartContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_blockStart);
		try {
			setState(676);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCK_START:
				_localctx = new JinjaBlockStartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(672);
				match(BLOCK_START);
				}
				break;
			case HTML_CONTENT_BLOCK_START:
				_localctx = new JinjaHtmlBlockStartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
				match(HTML_CONTENT_BLOCK_START);
				}
				break;
			case HTML_ATTR_BLOCK_START:
				_localctx = new JinjaHtmlAttrBlockStartContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(674);
				match(HTML_ATTR_BLOCK_START);
				}
				break;
			case HTML_ATTR_VALUE_BLOCK_START:
				_localctx = new JinjaHtmlAttrValueBlockStartContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(675);
				match(HTML_ATTR_VALUE_BLOCK_START);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskEqualityExprContext extends ExprContext {
		public List<AdditiveContext> additive() {
			return getRuleContexts(AdditiveContext.class);
		}
		public AdditiveContext additive(int i) {
			return getRuleContext(AdditiveContext.class,i);
		}
		public TerminalNode JINJA_EQEQ() { return getToken(MiniTemplateParser.JINJA_EQEQ, 0); }
		public FlaskEqualityExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterFlaskEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitFlaskEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitFlaskEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_expr);
		int _la;
		try {
			_localctx = new FlaskEqualityExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			additive();
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_EQEQ) {
				{
				setState(679);
				match(JINJA_EQEQ);
				setState(680);
				additive();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveContext extends ParserRuleContext {
		public AdditiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive; }
	 
		public AdditiveContext() { }
		public void copyFrom(AdditiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskAdditiveExprContext extends AdditiveContext {
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public List<TerminalNode> JINJA_PLUS() { return getTokens(MiniTemplateParser.JINJA_PLUS); }
		public TerminalNode JINJA_PLUS(int i) {
			return getToken(MiniTemplateParser.JINJA_PLUS, i);
		}
		public FlaskAdditiveExprContext(AdditiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterFlaskAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitFlaskAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitFlaskAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveContext additive() throws RecognitionException {
		AdditiveContext _localctx = new AdditiveContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_additive);
		int _la;
		try {
			_localctx = new FlaskAdditiveExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			primary();
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_PLUS) {
				{
				{
				setState(684);
				match(JINJA_PLUS);
				setState(685);
				primary();
				}
				}
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskPrimaryExprContext extends PrimaryContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<SuffixContext> suffix() {
			return getRuleContexts(SuffixContext.class);
		}
		public SuffixContext suffix(int i) {
			return getRuleContext(SuffixContext.class,i);
		}
		public FlaskPrimaryExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterFlaskPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitFlaskPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitFlaskPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_primary);
		int _la;
		try {
			_localctx = new FlaskPrimaryExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			atom();
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 11L) != 0)) {
				{
				{
				setState(692);
				suffix();
				}
				}
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SuffixContext extends ParserRuleContext {
		public SuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suffix; }
	 
		public SuffixContext() { }
		public void copyFrom(SuffixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskCallSuffixContext extends SuffixContext {
		public TerminalNode JINJA_LPAREN() { return getToken(MiniTemplateParser.JINJA_LPAREN, 0); }
		public TerminalNode JINJA_RPAREN() { return getToken(MiniTemplateParser.JINJA_RPAREN, 0); }
		public RouteArgKwsContext routeArgKws() {
			return getRuleContext(RouteArgKwsContext.class,0);
		}
		public FlaskCallSuffixContext(SuffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterFlaskCallSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitFlaskCallSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitFlaskCallSuffix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskAttrAccessContext extends SuffixContext {
		public TerminalNode JINJA_DOT() { return getToken(MiniTemplateParser.JINJA_DOT, 0); }
		public TerminalNode JINJA_IDENT() { return getToken(MiniTemplateParser.JINJA_IDENT, 0); }
		public FlaskAttrAccessContext(SuffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterFlaskAttrAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitFlaskAttrAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitFlaskAttrAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskIndexingContext extends SuffixContext {
		public TerminalNode JINJA_LBRACK() { return getToken(MiniTemplateParser.JINJA_LBRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode JINJA_RBRACK() { return getToken(MiniTemplateParser.JINJA_RBRACK, 0); }
		public FlaskIndexingContext(SuffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterFlaskIndexing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitFlaskIndexing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitFlaskIndexing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuffixContext suffix() throws RecognitionException {
		SuffixContext _localctx = new SuffixContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_suffix);
		int _la;
		try {
			setState(709);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_DOT:
				_localctx = new FlaskAttrAccessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				match(JINJA_DOT);
				setState(699);
				match(JINJA_IDENT);
				}
				break;
			case JINJA_LBRACK:
				_localctx = new FlaskIndexingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(700);
				match(JINJA_LBRACK);
				setState(701);
				expr();
				setState(702);
				match(JINJA_RBRACK);
				}
				break;
			case JINJA_LPAREN:
				_localctx = new FlaskCallSuffixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(704);
				match(JINJA_LPAREN);
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & 117784591L) != 0)) {
					{
					setState(705);
					routeArgKws();
					}
				}

				setState(708);
				match(JINJA_RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RouteArgKwsContext extends ParserRuleContext {
		public RouteArgKwsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routeArgKws; }
	 
		public RouteArgKwsContext() { }
		public void copyFrom(RouteArgKwsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskArgsListContext extends RouteArgKwsContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<TerminalNode> JINJA_COMMA() { return getTokens(MiniTemplateParser.JINJA_COMMA); }
		public TerminalNode JINJA_COMMA(int i) {
			return getToken(MiniTemplateParser.JINJA_COMMA, i);
		}
		public FlaskArgsListContext(RouteArgKwsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterFlaskArgsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitFlaskArgsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitFlaskArgsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouteArgKwsContext routeArgKws() throws RecognitionException {
		RouteArgKwsContext _localctx = new RouteArgKwsContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_routeArgKws);
		int _la;
		try {
			_localctx = new FlaskArgsListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			arg();
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_COMMA) {
				{
				{
				setState(712);
				match(JINJA_COMMA);
				setState(713);
				arg();
				}
				}
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgContext extends ParserRuleContext {
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	 
		public ArgContext() { }
		public void copyFrom(ArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskKwArgContext extends ArgContext {
		public TerminalNode JINJA_IDENT() { return getToken(MiniTemplateParser.JINJA_IDENT, 0); }
		public TerminalNode JINJA_EQUALS() { return getToken(MiniTemplateParser.JINJA_EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FlaskKwArgContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterFlaskKwArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitFlaskKwArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitFlaskKwArg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskPosArgContext extends ArgContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FlaskPosArgContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterFlaskPosArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitFlaskPosArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitFlaskPosArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_arg);
		try {
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				_localctx = new FlaskKwArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(719);
				match(JINJA_IDENT);
				setState(720);
				match(JINJA_EQUALS);
				setState(721);
				expr();
				}
				break;
			case 2:
				_localctx = new FlaskPosArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(722);
				expr();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskAtomStringContext extends AtomContext {
		public TerminalNode JINJA_STRING() { return getToken(MiniTemplateParser.JINJA_STRING, 0); }
		public FlaskAtomStringContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterFlaskAtomString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitFlaskAtomString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitFlaskAtomString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskAtomListContext extends AtomContext {
		public ListLiteralContext listLiteral() {
			return getRuleContext(ListLiteralContext.class,0);
		}
		public FlaskAtomListContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterFlaskAtomList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitFlaskAtomList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitFlaskAtomList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskAtomFalseContext extends AtomContext {
		public TerminalNode JINJA_FALSE() { return getToken(MiniTemplateParser.JINJA_FALSE, 0); }
		public FlaskAtomFalseContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterFlaskAtomFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitFlaskAtomFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitFlaskAtomFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskAtomGenExprContext extends AtomContext {
		public GenExprContext genExpr() {
			return getRuleContext(GenExprContext.class,0);
		}
		public FlaskAtomGenExprContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterFlaskAtomGenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitFlaskAtomGenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitFlaskAtomGenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskAtomNumberContext extends AtomContext {
		public TerminalNode JINJA_NUMBER() { return getToken(MiniTemplateParser.JINJA_NUMBER, 0); }
		public FlaskAtomNumberContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterFlaskAtomNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitFlaskAtomNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitFlaskAtomNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlskAtomAppContext extends AtomContext {
		public TerminalNode JINJA_APP() { return getToken(MiniTemplateParser.JINJA_APP, 0); }
		public FlskAtomAppContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterFlskAtomApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitFlskAtomApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitFlskAtomApp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskAtomTrueContext extends AtomContext {
		public TerminalNode JINJA_TRUE() { return getToken(MiniTemplateParser.JINJA_TRUE, 0); }
		public FlaskAtomTrueContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterFlaskAtomTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitFlaskAtomTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitFlaskAtomTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskAtomDictContext extends AtomContext {
		public DictLiteralContext dictLiteral() {
			return getRuleContext(DictLiteralContext.class,0);
		}
		public FlaskAtomDictContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterFlaskAtomDict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitFlaskAtomDict(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitFlaskAtomDict(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskAtomNameContext extends AtomContext {
		public TerminalNode JINJA_IDENT() { return getToken(MiniTemplateParser.JINJA_IDENT, 0); }
		public FlaskAtomNameContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterFlaskAtomName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitFlaskAtomName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitFlaskAtomName(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskAtomParenContext extends AtomContext {
		public TerminalNode JINJA_LPAREN() { return getToken(MiniTemplateParser.JINJA_LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode JINJA_RPAREN() { return getToken(MiniTemplateParser.JINJA_RPAREN, 0); }
		public FlaskAtomParenContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterFlaskAtomParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitFlaskAtomParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitFlaskAtomParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskAtomNoneContext extends AtomContext {
		public TerminalNode JINJA_NONE() { return getToken(MiniTemplateParser.JINJA_NONE, 0); }
		public FlaskAtomNoneContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterFlaskAtomNone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitFlaskAtomNone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitFlaskAtomNone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_atom);
		try {
			setState(739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				_localctx = new FlaskAtomNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				match(JINJA_IDENT);
				}
				break;
			case 2:
				_localctx = new FlaskAtomStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
				match(JINJA_STRING);
				}
				break;
			case 3:
				_localctx = new FlaskAtomNumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(727);
				match(JINJA_NUMBER);
				}
				break;
			case 4:
				_localctx = new FlskAtomAppContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(728);
				match(JINJA_APP);
				}
				break;
			case 5:
				_localctx = new FlaskAtomNoneContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(729);
				match(JINJA_NONE);
				}
				break;
			case 6:
				_localctx = new FlaskAtomTrueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(730);
				match(JINJA_TRUE);
				}
				break;
			case 7:
				_localctx = new FlaskAtomFalseContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(731);
				match(JINJA_FALSE);
				}
				break;
			case 8:
				_localctx = new FlaskAtomListContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(732);
				listLiteral();
				}
				break;
			case 9:
				_localctx = new FlaskAtomDictContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(733);
				dictLiteral();
				}
				break;
			case 10:
				_localctx = new FlaskAtomGenExprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(734);
				genExpr();
				}
				break;
			case 11:
				_localctx = new FlaskAtomParenContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(735);
				match(JINJA_LPAREN);
				setState(736);
				expr();
				setState(737);
				match(JINJA_RPAREN);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListLiteralContext extends ParserRuleContext {
		public ListLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listLiteral; }
	 
		public ListLiteralContext() { }
		public void copyFrom(ListLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskListLiteralContext extends ListLiteralContext {
		public TerminalNode JINJA_LBRACK() { return getToken(MiniTemplateParser.JINJA_LBRACK, 0); }
		public TerminalNode JINJA_RBRACK() { return getToken(MiniTemplateParser.JINJA_RBRACK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> JINJA_COMMA() { return getTokens(MiniTemplateParser.JINJA_COMMA); }
		public TerminalNode JINJA_COMMA(int i) {
			return getToken(MiniTemplateParser.JINJA_COMMA, i);
		}
		public FlaskListLiteralContext(ListLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterFlaskListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitFlaskListLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitFlaskListLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListLiteralContext listLiteral() throws RecognitionException {
		ListLiteralContext _localctx = new ListLiteralContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_listLiteral);
		int _la;
		try {
			_localctx = new FlaskListLiteralContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			match(JINJA_LBRACK);
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & 117784591L) != 0)) {
				{
				setState(742);
				expr();
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==JINJA_COMMA) {
					{
					{
					setState(743);
					match(JINJA_COMMA);
					setState(744);
					expr();
					}
					}
					setState(749);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(752);
			match(JINJA_RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DictLiteralContext extends ParserRuleContext {
		public DictLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictLiteral; }
	 
		public DictLiteralContext() { }
		public void copyFrom(DictLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskDictLiteralContext extends DictLiteralContext {
		public TerminalNode JINJA_LBRACE() { return getToken(MiniTemplateParser.JINJA_LBRACE, 0); }
		public TerminalNode JINJA_RBRACE() { return getToken(MiniTemplateParser.JINJA_RBRACE, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public List<TerminalNode> JINJA_COMMA() { return getTokens(MiniTemplateParser.JINJA_COMMA); }
		public TerminalNode JINJA_COMMA(int i) {
			return getToken(MiniTemplateParser.JINJA_COMMA, i);
		}
		public FlaskDictLiteralContext(DictLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterFlaskDictLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitFlaskDictLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitFlaskDictLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictLiteralContext dictLiteral() throws RecognitionException {
		DictLiteralContext _localctx = new DictLiteralContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_dictLiteral);
		int _la;
		try {
			_localctx = new FlaskDictLiteralContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(JINJA_LBRACE);
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_STRING || _la==JINJA_IDENT) {
				{
				setState(755);
				pair();
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==JINJA_COMMA) {
					{
					{
					setState(756);
					match(JINJA_COMMA);
					setState(757);
					pair();
					}
					}
					setState(762);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(765);
			match(JINJA_RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PairContext extends ParserRuleContext {
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
	 
		public PairContext() { }
		public void copyFrom(PairContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskDictPairContext extends PairContext {
		public TerminalNode JINJA_COLON() { return getToken(MiniTemplateParser.JINJA_COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode JINJA_STRING() { return getToken(MiniTemplateParser.JINJA_STRING, 0); }
		public TerminalNode JINJA_IDENT() { return getToken(MiniTemplateParser.JINJA_IDENT, 0); }
		public FlaskDictPairContext(PairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterFlaskDictPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitFlaskDictPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitFlaskDictPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_pair);
		int _la;
		try {
			_localctx = new FlaskDictPairContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			_la = _input.LA(1);
			if ( !(_la==JINJA_STRING || _la==JINJA_IDENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(768);
			match(JINJA_COLON);
			setState(769);
			expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class GenExprContext extends ParserRuleContext {
		public GenExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genExpr; }
	 
		public GenExprContext() { }
		public void copyFrom(GenExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskGeneratorExprContext extends GenExprContext {
		public TerminalNode JINJA_LPAREN() { return getToken(MiniTemplateParser.JINJA_LPAREN, 0); }
		public List<TerminalNode> JINJA_IDENT() { return getTokens(MiniTemplateParser.JINJA_IDENT); }
		public TerminalNode JINJA_IDENT(int i) {
			return getToken(MiniTemplateParser.JINJA_IDENT, i);
		}
		public TerminalNode JINJA_FOR() { return getToken(MiniTemplateParser.JINJA_FOR, 0); }
		public TerminalNode JINJA_IN() { return getToken(MiniTemplateParser.JINJA_IN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode JINJA_RPAREN() { return getToken(MiniTemplateParser.JINJA_RPAREN, 0); }
		public TerminalNode JINJA_IF() { return getToken(MiniTemplateParser.JINJA_IF, 0); }
		public FlaskGeneratorExprContext(GenExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).enterFlaskGeneratorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniTemplateParserListener ) ((MiniTemplateParserListener)listener).exitFlaskGeneratorExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniTemplateParserVisitor ) return ((MiniTemplateParserVisitor<? extends T>)visitor).visitFlaskGeneratorExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenExprContext genExpr() throws RecognitionException {
		GenExprContext _localctx = new GenExprContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_genExpr);
		int _la;
		try {
			_localctx = new FlaskGeneratorExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(JINJA_LPAREN);
			setState(772);
			match(JINJA_IDENT);
			setState(773);
			match(JINJA_FOR);
			setState(774);
			match(JINJA_IDENT);
			setState(775);
			match(JINJA_IN);
			setState(776);
			expr();
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_IF) {
				{
				setState(777);
				match(JINJA_IF);
				setState(778);
				expr();
				}
			}

			setState(781);
			match(JINJA_RPAREN);
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
		"\u0004\u0001\u008b\u0310\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u0095\b\u0000\n\u0000\f\u0000\u0098\t\u0000\u0005\u0000\u009a\b"+
		"\u0000\n\u0000\f\u0000\u009d\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00a5\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00b8\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00bd\b\u0004\n\u0004"+
		"\f\u0004\u00c0\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u00c6\b\u0005\n\u0005\f\u0005\u00c9\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u00cf\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00d5\b\u0007\n\u0007\f\u0007"+
		"\u00d8\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\u00de\b"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00e4\b\t\n\t\f\t\u00e7\t\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0003\n\u00ed\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00f3\b\u000b\n\u000b\f\u000b\u00f6"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003\f\u00fc\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u0102\b\r\n\r\f\r\u0105\t\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e\u010b\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0111\b\u000f\n\u000f"+
		"\f\u000f\u0114\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u011a\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u0120\b\u0011\n\u0011\f\u0011\u0123\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u0129\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u012f\b\u0013\n\u0013\f\u0013"+
		"\u0132\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0138\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0140\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u0146\b\u0017\n\u0017\f\u0017\u0149\t\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u014f\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0155\b\u0019\n"+
		"\u0019\f\u0019\u0158\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u015e\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0005\u001b\u0164\b\u001b\n\u001b\f\u001b\u0167\t\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u016d\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0173\b\u001d\n\u001d"+
		"\f\u001d\u0176\t\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u017c\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u0182\b\u001f\n\u001f\f\u001f\u0185\t\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0003 \u018b\b \u0001!\u0001!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0005\"\u0193\b\"\n\"\f\"\u0196\t\"\u0001\"\u0001\"\u0001\""+
		"\u0005\"\u019b\b\"\n\"\f\"\u019e\t\"\u0001\"\u0003\"\u01a1\b\"\u0001#"+
		"\u0001#\u0001#\u0003#\u01a6\b#\u0001$\u0001$\u0005$\u01aa\b$\n$\f$\u01ad"+
		"\t$\u0001$\u0001$\u0005$\u01b1\b$\n$\f$\u01b4\t$\u0001$\u0001$\u0001%"+
		"\u0005%\u01b9\b%\n%\f%\u01bc\t%\u0001&\u0001&\u0001&\u0005&\u01c1\b&\n"+
		"&\f&\u01c4\t&\u0001\'\u0001\'\u0005\'\u01c8\b\'\n\'\f\'\u01cb\t\'\u0001"+
		"\'\u0005\'\u01ce\b\'\n\'\f\'\u01d1\t\'\u0001\'\u0005\'\u01d4\b\'\n\'\f"+
		"\'\u01d7\t\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0004(\u01de\b(\u000b"+
		"(\f(\u01df\u0001(\u0001(\u0001)\u0001)\u0001*\u0003*\u01e7\b*\u0001*\u0001"+
		"*\u0003*\u01eb\b*\u0001*\u0001*\u0003*\u01ef\b*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0003*\u01f6\b*\u0003*\u01f8\b*\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0005+\u01ff\b+\n+\f+\u0202\t+\u0001+\u0001+\u0001,\u0001,\u0001,\u0005"+
		",\u0209\b,\n,\f,\u020c\t,\u0001-\u0001-\u0001-\u0001-\u0005-\u0212\b-"+
		"\n-\f-\u0215\t-\u0001.\u0001.\u0001.\u0001.\u0001.\u0005.\u021c\b.\n."+
		"\f.\u021f\t.\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u0226\b/\u0001"+
		"0\u00010\u00010\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u0003"+
		"2\u0232\b2\u00013\u00013\u00013\u00033\u0237\b3\u00014\u00014\u00014\u0001"+
		"4\u00015\u00045\u023e\b5\u000b5\f5\u023f\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00036\u0252\b6\u00017\u00017\u00017\u00018\u00018\u00018\u0001"+
		"8\u00019\u00019\u00019\u00019\u00019\u00039\u0260\b9\u0001:\u0001:\u0003"+
		":\u0264\b:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0005;\u026d"+
		"\b;\n;\f;\u0270\t;\u0001;\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0005<\u027b\b<\n<\f<\u027e\t<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0005<\u0285\b<\n<\f<\u0288\t<\u0005<\u028a\b<\n<\f<\u028d\t<\u0001"+
		"<\u0001<\u0001<\u0001<\u0005<\u0293\b<\n<\f<\u0296\t<\u0005<\u0298\b<"+
		"\n<\f<\u029b\t<\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001"+
		"=\u0003=\u02a5\b=\u0001>\u0001>\u0001>\u0003>\u02aa\b>\u0001?\u0001?\u0001"+
		"?\u0005?\u02af\b?\n?\f?\u02b2\t?\u0001@\u0001@\u0005@\u02b6\b@\n@\f@\u02b9"+
		"\t@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0003A\u02c3"+
		"\bA\u0001A\u0003A\u02c6\bA\u0001B\u0001B\u0001B\u0005B\u02cb\bB\nB\fB"+
		"\u02ce\tB\u0001C\u0001C\u0001C\u0001C\u0003C\u02d4\bC\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0003D\u02e4\bD\u0001E\u0001E\u0001E\u0001E\u0005E\u02ea\bE\n"+
		"E\fE\u02ed\tE\u0003E\u02ef\bE\u0001E\u0001E\u0001F\u0001F\u0001F\u0001"+
		"F\u0005F\u02f7\bF\nF\fF\u02fa\tF\u0003F\u02fc\bF\u0001F\u0001F\u0001G"+
		"\u0001G\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0003H\u030c\bH\u0001H\u0001H\u0001H\u0000\u0000I\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0000\u0003\u0002\u0000\u0014\u0014\'\'"+
		"\u0003\u0000__abjj\u0002\u0000\u0083\u0083\u0085\u0085\u034c\u0000\u009b"+
		"\u0001\u0000\u0000\u0000\u0002\u00a4\u0001\u0000\u0000\u0000\u0004\u00a6"+
		"\u0001\u0000\u0000\u0000\u0006\u00b7\u0001\u0000\u0000\u0000\b\u00be\u0001"+
		"\u0000\u0000\u0000\n\u00c1\u0001\u0000\u0000\u0000\f\u00ce\u0001\u0000"+
		"\u0000\u0000\u000e\u00d0\u0001\u0000\u0000\u0000\u0010\u00dd\u0001\u0000"+
		"\u0000\u0000\u0012\u00df\u0001\u0000\u0000\u0000\u0014\u00ec\u0001\u0000"+
		"\u0000\u0000\u0016\u00ee\u0001\u0000\u0000\u0000\u0018\u00fb\u0001\u0000"+
		"\u0000\u0000\u001a\u00fd\u0001\u0000\u0000\u0000\u001c\u010a\u0001\u0000"+
		"\u0000\u0000\u001e\u010c\u0001\u0000\u0000\u0000 \u0119\u0001\u0000\u0000"+
		"\u0000\"\u011b\u0001\u0000\u0000\u0000$\u0128\u0001\u0000\u0000\u0000"+
		"&\u012a\u0001\u0000\u0000\u0000(\u0137\u0001\u0000\u0000\u0000*\u0139"+
		"\u0001\u0000\u0000\u0000,\u013f\u0001\u0000\u0000\u0000.\u0141\u0001\u0000"+
		"\u0000\u00000\u014e\u0001\u0000\u0000\u00002\u0150\u0001\u0000\u0000\u0000"+
		"4\u015d\u0001\u0000\u0000\u00006\u015f\u0001\u0000\u0000\u00008\u016c"+
		"\u0001\u0000\u0000\u0000:\u016e\u0001\u0000\u0000\u0000<\u017b\u0001\u0000"+
		"\u0000\u0000>\u017d\u0001\u0000\u0000\u0000@\u018a\u0001\u0000\u0000\u0000"+
		"B\u018c\u0001\u0000\u0000\u0000D\u01a0\u0001\u0000\u0000\u0000F\u01a5"+
		"\u0001\u0000\u0000\u0000H\u01a7\u0001\u0000\u0000\u0000J\u01ba\u0001\u0000"+
		"\u0000\u0000L\u01bd\u0001\u0000\u0000\u0000N\u01c5\u0001\u0000\u0000\u0000"+
		"P\u01da\u0001\u0000\u0000\u0000R\u01e3\u0001\u0000\u0000\u0000T\u01f7"+
		"\u0001\u0000\u0000\u0000V\u01f9\u0001\u0000\u0000\u0000X\u0205\u0001\u0000"+
		"\u0000\u0000Z\u020d\u0001\u0000\u0000\u0000\\\u0216\u0001\u0000\u0000"+
		"\u0000^\u0225\u0001\u0000\u0000\u0000`\u0227\u0001\u0000\u0000\u0000b"+
		"\u022a\u0001\u0000\u0000\u0000d\u0231\u0001\u0000\u0000\u0000f\u0233\u0001"+
		"\u0000\u0000\u0000h\u0238\u0001\u0000\u0000\u0000j\u023d\u0001\u0000\u0000"+
		"\u0000l\u0251\u0001\u0000\u0000\u0000n\u0253\u0001\u0000\u0000\u0000p"+
		"\u0256\u0001\u0000\u0000\u0000r\u025f\u0001\u0000\u0000\u0000t\u0263\u0001"+
		"\u0000\u0000\u0000v\u0265\u0001\u0000\u0000\u0000x\u0275\u0001\u0000\u0000"+
		"\u0000z\u02a4\u0001\u0000\u0000\u0000|\u02a6\u0001\u0000\u0000\u0000~"+
		"\u02ab\u0001\u0000\u0000\u0000\u0080\u02b3\u0001\u0000\u0000\u0000\u0082"+
		"\u02c5\u0001\u0000\u0000\u0000\u0084\u02c7\u0001\u0000\u0000\u0000\u0086"+
		"\u02d3\u0001\u0000\u0000\u0000\u0088\u02e3\u0001\u0000\u0000\u0000\u008a"+
		"\u02e5\u0001\u0000\u0000\u0000\u008c\u02f2\u0001\u0000\u0000\u0000\u008e"+
		"\u02ff\u0001\u0000\u0000\u0000\u0090\u0303\u0001\u0000\u0000\u0000\u0092"+
		"\u0096\u0003\u0002\u0001\u0000\u0093\u0095\u0005\u0013\u0000\u0000\u0094"+
		"\u0093\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096"+
		"\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097"+
		"\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099"+
		"\u0092\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b"+
		"\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c"+
		"\u009e\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0005\u0000\u0000\u0001\u009f\u0001\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a5\u0003\u0006\u0003\u0000\u00a1\u00a5\u0003p8\u0000\u00a2\u00a5\u0003"+
		"t:\u0000\u00a3\u00a5\u0003\u0004\u0002\u0000\u00a4\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u0003\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0007\u0000\u0000\u0000\u00a7\u0005\u0001\u0000\u0000"+
		"\u0000\u00a8\u00b8\u0003\n\u0005\u0000\u00a9\u00b8\u0003\u000e\u0007\u0000"+
		"\u00aa\u00b8\u0003\u0012\t\u0000\u00ab\u00b8\u0003\u0016\u000b\u0000\u00ac"+
		"\u00b8\u0003\u001e\u000f\u0000\u00ad\u00b8\u0003\u001a\r\u0000\u00ae\u00b8"+
		"\u0003\"\u0011\u0000\u00af\u00b8\u0003&\u0013\u0000\u00b0\u00b8\u0003"+
		"*\u0015\u0000\u00b1\u00b8\u0003.\u0017\u0000\u00b2\u00b8\u00032\u0019"+
		"\u0000\u00b3\u00b8\u00036\u001b\u0000\u00b4\u00b8\u0003:\u001d\u0000\u00b5"+
		"\u00b8\u0003>\u001f\u0000\u00b6\u00b8\u0003H$\u0000\u00b7\u00a8\u0001"+
		"\u0000\u0000\u0000\u00b7\u00a9\u0001\u0000\u0000\u0000\u00b7\u00aa\u0001"+
		"\u0000\u0000\u0000\u00b7\u00ab\u0001\u0000\u0000\u0000\u00b7\u00ac\u0001"+
		"\u0000\u0000\u0000\u00b7\u00ad\u0001\u0000\u0000\u0000\u00b7\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b7\u00af\u0001\u0000\u0000\u0000\u00b7\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b1\u0001\u0000\u0000\u0000\u00b7\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b3\u0001\u0000\u0000\u0000\u00b7\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b8\u0007\u0001\u0000\u0000\u0000\u00b9\u00bd\u0003"+
		"B!\u0000\u00ba\u00bd\u0003p8\u0000\u00bb\u00bd\u0003t:\u0000\u00bc\u00b9"+
		"\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\t\u0001"+
		"\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2\u0003"+
		"\f\u0006\u0000\u00c2\u00c3\u0003\b\u0004\u0000\u00c3\u00c7\u0005>\u0000"+
		"\u0000\u00c4\u00c6\u0003\u0002\u0001\u0000\u00c5\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000"+
		"\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005*\u0000\u0000"+
		"\u00cb\u000b\u0001\u0000\u0000\u0000\u00cc\u00cf\u0005\u0001\u0000\u0000"+
		"\u00cd\u00cf\u0005\u0016\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cd\u0001\u0000\u0000\u0000\u00cf\r\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0003\u0010\b\u0000\u00d1\u00d2\u0003\b\u0004\u0000\u00d2\u00d6"+
		"\u0005>\u0000\u0000\u00d3\u00d5\u0003\u0002\u0001\u0000\u00d4\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00da\u0005"+
		"1\u0000\u0000\u00da\u000f\u0001\u0000\u0000\u0000\u00db\u00de\u0005\b"+
		"\u0000\u0000\u00dc\u00de\u0005\u001d\u0000\u0000\u00dd\u00db\u0001\u0000"+
		"\u0000\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de\u0011\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0003\u0014\n\u0000\u00e0\u00e1\u0003\b\u0004"+
		"\u0000\u00e1\u00e5\u0005>\u0000\u0000\u00e2\u00e4\u0003\u0002\u0001\u0000"+
		"\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0005+\u0000\u0000\u00e9\u0013\u0001\u0000\u0000\u0000\u00ea"+
		"\u00ed\u0005\u0006\u0000\u0000\u00eb\u00ed\u0005\u0017\u0000\u0000\u00ec"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed"+
		"\u0015\u0001\u0000\u0000\u0000\u00ee\u00ef\u0003\u0018\f\u0000\u00ef\u00f0"+
		"\u0003\b\u0004\u0000\u00f0\u00f4\u0005>\u0000\u0000\u00f1\u00f3\u0003"+
		"\u0002\u0001\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0005,\u0000\u0000\u00f8\u0017\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fc\u0005\u0004\u0000\u0000\u00fa\u00fc\u0005\u0018"+
		"\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fc\u0019\u0001\u0000\u0000\u0000\u00fd\u00fe\u0003\u001c"+
		"\u000e\u0000\u00fe\u00ff\u0003\b\u0004\u0000\u00ff\u0103\u0005>\u0000"+
		"\u0000\u0100\u0102\u0003\u0002\u0001\u0000\u0101\u0100\u0001\u0000\u0000"+
		"\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0106\u0001\u0000\u0000"+
		"\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u0107\u0005-\u0000\u0000"+
		"\u0107\u001b\u0001\u0000\u0000\u0000\u0108\u010b\u0005\u0003\u0000\u0000"+
		"\u0109\u010b\u0005\u0019\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000"+
		"\u010a\u0109\u0001\u0000\u0000\u0000\u010b\u001d\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0003 \u0010\u0000\u010d\u010e\u0003\b\u0004\u0000\u010e"+
		"\u0112\u0005>\u0000\u0000\u010f\u0111\u0003\u0002\u0001\u0000\u0110\u010f"+
		"\u0001\u0000\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110"+
		"\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0115"+
		"\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\u0005.\u0000\u0000\u0116\u001f\u0001\u0000\u0000\u0000\u0117\u011a\u0005"+
		"\u0002\u0000\u0000\u0118\u011a\u0005\u001b\u0000\u0000\u0119\u0117\u0001"+
		"\u0000\u0000\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u011a!\u0001\u0000"+
		"\u0000\u0000\u011b\u011c\u0003$\u0012\u0000\u011c\u011d\u0003\b\u0004"+
		"\u0000\u011d\u0121\u0005>\u0000\u0000\u011e\u0120\u0003\u0002\u0001\u0000"+
		"\u011f\u011e\u0001\u0000\u0000\u0000\u0120\u0123\u0001\u0000\u0000\u0000"+
		"\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000"+
		"\u0122\u0124\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0005/\u0000\u0000\u0125#\u0001\u0000\u0000\u0000\u0126\u0129"+
		"\u0005\u0005\u0000\u0000\u0127\u0129\u0005\u001a\u0000\u0000\u0128\u0126"+
		"\u0001\u0000\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0129%\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u0003(\u0014\u0000\u012b\u012c\u0003\b"+
		"\u0004\u0000\u012c\u0130\u0005>\u0000\u0000\u012d\u012f\u0003\u0002\u0001"+
		"\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012f\u0132\u0001\u0000\u0000"+
		"\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000"+
		"\u0000\u0131\u0133\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000"+
		"\u0000\u0133\u0134\u00050\u0000\u0000\u0134\'\u0001\u0000\u0000\u0000"+
		"\u0135\u0138\u0005\u0007\u0000\u0000\u0136\u0138\u0005\u001c\u0000\u0000"+
		"\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0136\u0001\u0000\u0000\u0000"+
		"\u0138)\u0001\u0000\u0000\u0000\u0139\u013a\u0003,\u0016\u0000\u013a\u013b"+
		"\u0003\b\u0004\u0000\u013b\u013c\u0005>\u0000\u0000\u013c+\u0001\u0000"+
		"\u0000\u0000\u013d\u0140\u0005\t\u0000\u0000\u013e\u0140\u0005\u001e\u0000"+
		"\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u013e\u0001\u0000\u0000"+
		"\u0000\u0140-\u0001\u0000\u0000\u0000\u0141\u0142\u00030\u0018\u0000\u0142"+
		"\u0143\u0003\b\u0004\u0000\u0143\u0147\u0005>\u0000\u0000\u0144\u0146"+
		"\u0003\u0002\u0001\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146\u0149"+
		"\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0148"+
		"\u0001\u0000\u0000\u0000\u0148\u014a\u0001\u0000\u0000\u0000\u0149\u0147"+
		"\u0001\u0000\u0000\u0000\u014a\u014b\u00052\u0000\u0000\u014b/\u0001\u0000"+
		"\u0000\u0000\u014c\u014f\u0005\n\u0000\u0000\u014d\u014f\u0005\u001f\u0000"+
		"\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014d\u0001\u0000\u0000"+
		"\u0000\u014f1\u0001\u0000\u0000\u0000\u0150\u0151\u00034\u001a\u0000\u0151"+
		"\u0152\u0003\b\u0004\u0000\u0152\u0156\u0005>\u0000\u0000\u0153\u0155"+
		"\u0003\u0002\u0001\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0155\u0158"+
		"\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0157"+
		"\u0001\u0000\u0000\u0000\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u0156"+
		"\u0001\u0000\u0000\u0000\u0159\u015a\u00053\u0000\u0000\u015a3\u0001\u0000"+
		"\u0000\u0000\u015b\u015e\u0005\u000b\u0000\u0000\u015c\u015e\u0005 \u0000"+
		"\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015c\u0001\u0000\u0000"+
		"\u0000\u015e5\u0001\u0000\u0000\u0000\u015f\u0160\u00038\u001c\u0000\u0160"+
		"\u0161\u0003\b\u0004\u0000\u0161\u0165\u0005>\u0000\u0000\u0162\u0164"+
		"\u0003\u0002\u0001\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0164\u0167"+
		"\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165\u0166"+
		"\u0001\u0000\u0000\u0000\u0166\u0168\u0001\u0000\u0000\u0000\u0167\u0165"+
		"\u0001\u0000\u0000\u0000\u0168\u0169\u00054\u0000\u0000\u01697\u0001\u0000"+
		"\u0000\u0000\u016a\u016d\u0005\f\u0000\u0000\u016b\u016d\u0005!\u0000"+
		"\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016b\u0001\u0000\u0000"+
		"\u0000\u016d9\u0001\u0000\u0000\u0000\u016e\u016f\u0003<\u001e\u0000\u016f"+
		"\u0170\u0003\b\u0004\u0000\u0170\u0174\u0005>\u0000\u0000\u0171\u0173"+
		"\u0003\u0002\u0001\u0000\u0172\u0171\u0001\u0000\u0000\u0000\u0173\u0176"+
		"\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0174\u0175"+
		"\u0001\u0000\u0000\u0000\u0175\u0177\u0001\u0000\u0000\u0000\u0176\u0174"+
		"\u0001\u0000\u0000\u0000\u0177\u0178\u00055\u0000\u0000\u0178;\u0001\u0000"+
		"\u0000\u0000\u0179\u017c\u0005\r\u0000\u0000\u017a\u017c\u0005\"\u0000"+
		"\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017a\u0001\u0000\u0000"+
		"\u0000\u017c=\u0001\u0000\u0000\u0000\u017d\u017e\u0003@ \u0000\u017e"+
		"\u017f\u0003\b\u0004\u0000\u017f\u0183\u0005>\u0000\u0000\u0180\u0182"+
		"\u0003\u0002\u0001\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0182\u0185"+
		"\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0183\u0184"+
		"\u0001\u0000\u0000\u0000\u0184\u0186\u0001\u0000\u0000\u0000\u0185\u0183"+
		"\u0001\u0000\u0000\u0000\u0186\u0187\u00056\u0000\u0000\u0187?\u0001\u0000"+
		"\u0000\u0000\u0188\u018b\u0005\u000e\u0000\u0000\u0189\u018b\u0005#\u0000"+
		"\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018a\u0189\u0001\u0000\u0000"+
		"\u0000\u018bA\u0001\u0000\u0000\u0000\u018c\u018d\u0005<\u0000\u0000\u018d"+
		"\u018e\u00057\u0000\u0000\u018e\u018f\u0003D\"\u0000\u018fC\u0001\u0000"+
		"\u0000\u0000\u0190\u0194\u00059\u0000\u0000\u0191\u0193\u0003F#\u0000"+
		"\u0192\u0191\u0001\u0000\u0000\u0000\u0193\u0196\u0001\u0000\u0000\u0000"+
		"\u0194\u0192\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000"+
		"\u0195\u0197\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000"+
		"\u0197\u01a1\u0005C\u0000\u0000\u0198\u019c\u00058\u0000\u0000\u0199\u019b"+
		"\u0003F#\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019b\u019e\u0001\u0000"+
		"\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000"+
		"\u0000\u0000\u019d\u019f\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000"+
		"\u0000\u0000\u019f\u01a1\u0005C\u0000\u0000\u01a0\u0190\u0001\u0000\u0000"+
		"\u0000\u01a0\u0198\u0001\u0000\u0000\u0000\u01a1E\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a6\u0005@\u0000\u0000\u01a3\u01a6\u0003p8\u0000\u01a4\u01a6"+
		"\u0003t:\u0000\u01a5\u01a2\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a6G\u0001\u0000\u0000"+
		"\u0000\u01a7\u01ab\u0005\u000f\u0000\u0000\u01a8\u01aa\u0005T\u0000\u0000"+
		"\u01a9\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ad\u0001\u0000\u0000\u0000"+
		"\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000"+
		"\u01ac\u01ae\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000"+
		"\u01ae\u01b2\u0003J%\u0000\u01af\u01b1\u0005T\u0000\u0000\u01b0\u01af"+
		"\u0001\u0000\u0000\u0000\u01b1\u01b4\u0001\u0000\u0000\u0000\u01b2\u01b0"+
		"\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b5\u01b6"+
		"\u0005V\u0000\u0000\u01b6I\u0001\u0000\u0000\u0000\u01b7\u01b9\u0003L"+
		"&\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b9\u01bc\u0001\u0000\u0000"+
		"\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000"+
		"\u0000\u01bbK\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000"+
		"\u01bd\u01be\u0003X,\u0000\u01be\u01c2\u0003N\'\u0000\u01bf\u01c1\u0005"+
		"T\u0000\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c3M\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c9\u0005Q\u0000\u0000\u01c6\u01c8\u0005\u0013\u0000\u0000"+
		"\u01c7\u01c6\u0001\u0000\u0000\u0000\u01c8\u01cb\u0001\u0000\u0000\u0000"+
		"\u01c9\u01c7\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000"+
		"\u01ca\u01cf\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000"+
		"\u01cc\u01ce\u0003P(\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01ce\u01d1"+
		"\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d5\u0001\u0000\u0000\u0000\u01d1\u01cf"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d4\u0005\u0013\u0000\u0000\u01d3\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d7\u0001\u0000\u0000\u0000\u01d5\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d8"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d8\u01d9"+
		"\u0005[\u0000\u0000\u01d9O\u0001\u0000\u0000\u0000\u01da\u01db\u0003R"+
		")\u0000\u01db\u01dd\u0005W\u0000\u0000\u01dc\u01de\u0003T*\u0000\u01dd"+
		"\u01dc\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df"+
		"\u01dd\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e2\u0005i\u0000\u0000\u01e2Q\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e4\u0005Y\u0000\u0000\u01e4S\u0001\u0000\u0000"+
		"\u0000\u01e5\u01e7\u0005_\u0000\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000"+
		"\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000"+
		"\u01e8\u01ea\u0005e\u0000\u0000\u01e9\u01eb\u0005g\u0000\u0000\u01ea\u01e9"+
		"\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u01f8"+
		"\u0001\u0000\u0000\u0000\u01ec\u01f8\u0003V+\u0000\u01ed\u01ef\u0005`"+
		"\u0000\u0000\u01ee\u01ed\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000"+
		"\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f8\u0005h\u0000"+
		"\u0000\u01f1\u01f8\u0005d\u0000\u0000\u01f2\u01f8\u0005f\u0000\u0000\u01f3"+
		"\u01f5\u0003p8\u0000\u01f4\u01f6\u0005g\u0000\u0000\u01f5\u01f4\u0001"+
		"\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f8\u0001"+
		"\u0000\u0000\u0000\u01f7\u01e6\u0001\u0000\u0000\u0000\u01f7\u01ec\u0001"+
		"\u0000\u0000\u0000\u01f7\u01ee\u0001\u0000\u0000\u0000\u01f7\u01f1\u0001"+
		"\u0000\u0000\u0000\u01f7\u01f2\u0001\u0000\u0000\u0000\u01f7\u01f3\u0001"+
		"\u0000\u0000\u0000\u01f8U\u0001\u0000\u0000\u0000\u01f9\u01fa\u0005h\u0000"+
		"\u0000\u01fa\u01fb\u0005]\u0000\u0000\u01fb\u0200\u0003T*\u0000\u01fc"+
		"\u01fd\u0007\u0001\u0000\u0000\u01fd\u01ff\u0003T*\u0000\u01fe\u01fc\u0001"+
		"\u0000\u0000\u0000\u01ff\u0202\u0001\u0000\u0000\u0000\u0200\u01fe\u0001"+
		"\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201\u0203\u0001"+
		"\u0000\u0000\u0000\u0202\u0200\u0001\u0000\u0000\u0000\u0203\u0204\u0005"+
		"^\u0000\u0000\u0204W\u0001\u0000\u0000\u0000\u0205\u020a\u0003Z-\u0000"+
		"\u0206\u0207\u0005O\u0000\u0000\u0207\u0209\u0003Z-\u0000\u0208\u0206"+
		"\u0001\u0000\u0000\u0000\u0209\u020c\u0001\u0000\u0000\u0000\u020a\u0208"+
		"\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020bY\u0001"+
		"\u0000\u0000\u0000\u020c\u020a\u0001\u0000\u0000\u0000\u020d\u0213\u0003"+
		"\\.\u0000\u020e\u020f\u0003d2\u0000\u020f\u0210\u0003\\.\u0000\u0210\u0212"+
		"\u0001\u0000\u0000\u0000\u0211\u020e\u0001\u0000\u0000\u0000\u0212\u0215"+
		"\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0213\u0214"+
		"\u0001\u0000\u0000\u0000\u0214[\u0001\u0000\u0000\u0000\u0215\u0213\u0001"+
		"\u0000\u0000\u0000\u0216\u021d\u0003^/\u0000\u0217\u021c\u0003`0\u0000"+
		"\u0218\u021c\u0003b1\u0000\u0219\u021c\u0003f3\u0000\u021a\u021c\u0003"+
		"n7\u0000\u021b\u0217\u0001\u0000\u0000\u0000\u021b\u0218\u0001\u0000\u0000"+
		"\u0000\u021b\u0219\u0001\u0000\u0000\u0000\u021b\u021a\u0001\u0000\u0000"+
		"\u0000\u021c\u021f\u0001\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000"+
		"\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e]\u0001\u0000\u0000\u0000"+
		"\u021f\u021d\u0001\u0000\u0000\u0000\u0220\u0226\u0005E\u0000\u0000\u0221"+
		"\u0226\u0005D\u0000\u0000\u0222\u0226\u0005F\u0000\u0000\u0223\u0226\u0003"+
		"`0\u0000\u0224\u0226\u0003b1\u0000\u0225\u0220\u0001\u0000\u0000\u0000"+
		"\u0225\u0221\u0001\u0000\u0000\u0000\u0225\u0222\u0001\u0000\u0000\u0000"+
		"\u0225\u0223\u0001\u0000\u0000\u0000\u0225\u0224\u0001\u0000\u0000\u0000"+
		"\u0226_\u0001\u0000\u0000\u0000\u0227\u0228\u0005P\u0000\u0000\u0228\u0229"+
		"\u0005D\u0000\u0000\u0229a\u0001\u0000\u0000\u0000\u022a\u022b\u0005G"+
		"\u0000\u0000\u022b\u022c\u0005D\u0000\u0000\u022cc\u0001\u0000\u0000\u0000"+
		"\u022d\u0232\u0005H\u0000\u0000\u022e\u0232\u0005I\u0000\u0000\u022f\u0232"+
		"\u0005J\u0000\u0000\u0230\u0232\u0001\u0000\u0000\u0000\u0231\u022d\u0001"+
		"\u0000\u0000\u0000\u0231\u022e\u0001\u0000\u0000\u0000\u0231\u022f\u0001"+
		"\u0000\u0000\u0000\u0231\u0230\u0001\u0000\u0000\u0000\u0232e\u0001\u0000"+
		"\u0000\u0000\u0233\u0234\u0005M\u0000\u0000\u0234\u0236\u0005D\u0000\u0000"+
		"\u0235\u0237\u0003h4\u0000\u0236\u0235\u0001\u0000\u0000\u0000\u0236\u0237"+
		"\u0001\u0000\u0000\u0000\u0237g\u0001\u0000\u0000\u0000\u0238\u0239\u0005"+
		"K\u0000\u0000\u0239\u023a\u0003j5\u0000\u023a\u023b\u0005L\u0000\u0000"+
		"\u023bi\u0001\u0000\u0000\u0000\u023c\u023e\u0003l6\u0000\u023d\u023c"+
		"\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023f\u023d"+
		"\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000\u0240k\u0001"+
		"\u0000\u0000\u0000\u0241\u0252\u0005D\u0000\u0000\u0242\u0252\u0005S\u0000"+
		"\u0000\u0243\u0252\u0005\u008a\u0000\u0000\u0244\u0245\u0005P\u0000\u0000"+
		"\u0245\u0252\u0005D\u0000\u0000\u0246\u0247\u0005M\u0000\u0000\u0247\u0252"+
		"\u0005D\u0000\u0000\u0248\u0249\u0005K\u0000\u0000\u0249\u024a\u0003j"+
		"5\u0000\u024a\u024b\u0005L\u0000\u0000\u024b\u0252\u0001\u0000\u0000\u0000"+
		"\u024c\u0252\u0005O\u0000\u0000\u024d\u0252\u0005I\u0000\u0000\u024e\u0252"+
		"\u0005\u008b\u0000\u0000\u024f\u0252\u0005F\u0000\u0000\u0250\u0252\u0005"+
		"H\u0000\u0000\u0251\u0241\u0001\u0000\u0000\u0000\u0251\u0242\u0001\u0000"+
		"\u0000\u0000\u0251\u0243\u0001\u0000\u0000\u0000\u0251\u0244\u0001\u0000"+
		"\u0000\u0000\u0251\u0246\u0001\u0000\u0000\u0000\u0251\u0248\u0001\u0000"+
		"\u0000\u0000\u0251\u024c\u0001\u0000\u0000\u0000\u0251\u024d\u0001\u0000"+
		"\u0000\u0000\u0251\u024e\u0001\u0000\u0000\u0000\u0251\u024f\u0001\u0000"+
		"\u0000\u0000\u0251\u0250\u0001\u0000\u0000\u0000\u0252m\u0001\u0000\u0000"+
		"\u0000\u0253\u0254\u0005N\u0000\u0000\u0254\u0255\u0005D\u0000\u0000\u0255"+
		"o\u0001\u0000\u0000\u0000\u0256\u0257\u0003r9\u0000\u0257\u0258\u0003"+
		"|>\u0000\u0258\u0259\u0005\u0089\u0000\u0000\u0259q\u0001\u0000\u0000"+
		"\u0000\u025a\u0260\u0005\u0010\u0000\u0000\u025b\u0260\u0005$\u0000\u0000"+
		"\u025c\u0260\u0005:\u0000\u0000\u025d\u0260\u0005A\u0000\u0000\u025e\u0260"+
		"\u0005\\\u0000\u0000\u025f\u025a\u0001\u0000\u0000\u0000\u025f\u025b\u0001"+
		"\u0000\u0000\u0000\u025f\u025c\u0001\u0000\u0000\u0000\u025f\u025d\u0001"+
		"\u0000\u0000\u0000\u025f\u025e\u0001\u0000\u0000\u0000\u0260s\u0001\u0000"+
		"\u0000\u0000\u0261\u0264\u0003v;\u0000\u0262\u0264\u0003x<\u0000\u0263"+
		"\u0261\u0001\u0000\u0000\u0000\u0263\u0262\u0001\u0000\u0000\u0000\u0264"+
		"u\u0001\u0000\u0000\u0000\u0265\u0266\u0003z=\u0000\u0266\u0267\u0005"+
		"s\u0000\u0000\u0267\u0268\u0005\u0085\u0000\u0000\u0268\u0269\u0005u\u0000"+
		"\u0000\u0269\u026a\u0003|>\u0000\u026a\u026e\u0005\u0088\u0000\u0000\u026b"+
		"\u026d\u0003\u0002\u0001\u0000\u026c\u026b\u0001\u0000\u0000\u0000\u026d"+
		"\u0270\u0001\u0000\u0000\u0000\u026e\u026c\u0001\u0000\u0000\u0000\u026e"+
		"\u026f\u0001\u0000\u0000\u0000\u026f\u0271\u0001\u0000\u0000\u0000\u0270"+
		"\u026e\u0001\u0000\u0000\u0000\u0271\u0272\u0003z=\u0000\u0272\u0273\u0005"+
		"t\u0000\u0000\u0273\u0274\u0005\u0088\u0000\u0000\u0274w\u0001\u0000\u0000"+
		"\u0000\u0275\u0276\u0003z=\u0000\u0276\u0277\u0005o\u0000\u0000\u0277"+
		"\u0278\u0003|>\u0000\u0278\u027c\u0005\u0088\u0000\u0000\u0279\u027b\u0003"+
		"\u0002\u0001\u0000\u027a\u0279\u0001\u0000\u0000\u0000\u027b\u027e\u0001"+
		"\u0000\u0000\u0000\u027c\u027a\u0001\u0000\u0000\u0000\u027c\u027d\u0001"+
		"\u0000\u0000\u0000\u027d\u028b\u0001\u0000\u0000\u0000\u027e\u027c\u0001"+
		"\u0000\u0000\u0000\u027f\u0280\u0003z=\u0000\u0280\u0281\u0005p\u0000"+
		"\u0000\u0281\u0282\u0003|>\u0000\u0282\u0286\u0005\u0088\u0000\u0000\u0283"+
		"\u0285\u0003\u0002\u0001\u0000\u0284\u0283\u0001\u0000\u0000\u0000\u0285"+
		"\u0288\u0001\u0000\u0000\u0000\u0286\u0284\u0001\u0000\u0000\u0000\u0286"+
		"\u0287\u0001\u0000\u0000\u0000\u0287\u028a\u0001\u0000\u0000\u0000\u0288"+
		"\u0286\u0001\u0000\u0000\u0000\u0289\u027f\u0001\u0000\u0000\u0000\u028a"+
		"\u028d\u0001\u0000\u0000\u0000\u028b\u0289\u0001\u0000\u0000\u0000\u028b"+
		"\u028c\u0001\u0000\u0000\u0000\u028c\u0299\u0001\u0000\u0000\u0000\u028d"+
		"\u028b\u0001\u0000\u0000\u0000\u028e\u028f\u0003z=\u0000\u028f\u0290\u0005"+
		"q\u0000\u0000\u0290\u0294\u0005\u0088\u0000\u0000\u0291\u0293\u0003\u0002"+
		"\u0001\u0000\u0292\u0291\u0001\u0000\u0000\u0000\u0293\u0296\u0001\u0000"+
		"\u0000\u0000\u0294\u0292\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000"+
		"\u0000\u0000\u0295\u0298\u0001\u0000\u0000\u0000\u0296\u0294\u0001\u0000"+
		"\u0000\u0000\u0297\u028e\u0001\u0000\u0000\u0000\u0298\u029b\u0001\u0000"+
		"\u0000\u0000\u0299\u0297\u0001\u0000\u0000\u0000\u0299\u029a\u0001\u0000"+
		"\u0000\u0000\u029a\u029c\u0001\u0000\u0000\u0000\u029b\u0299\u0001\u0000"+
		"\u0000\u0000\u029c\u029d\u0003z=\u0000\u029d\u029e\u0005r\u0000\u0000"+
		"\u029e\u029f\u0005\u0088\u0000\u0000\u029fy\u0001\u0000\u0000\u0000\u02a0"+
		"\u02a5\u0005\u0011\u0000\u0000\u02a1\u02a5\u0005%\u0000\u0000\u02a2\u02a5"+
		"\u0005;\u0000\u0000\u02a3\u02a5\u0005B\u0000\u0000\u02a4\u02a0\u0001\u0000"+
		"\u0000\u0000\u02a4\u02a1\u0001\u0000\u0000\u0000\u02a4\u02a2\u0001\u0000"+
		"\u0000\u0000\u02a4\u02a3\u0001\u0000\u0000\u0000\u02a5{\u0001\u0000\u0000"+
		"\u0000\u02a6\u02a9\u0003~?\u0000\u02a7\u02a8\u0005v\u0000\u0000\u02a8"+
		"\u02aa\u0003~?\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001"+
		"\u0000\u0000\u0000\u02aa}\u0001\u0000\u0000\u0000\u02ab\u02b0\u0003\u0080"+
		"@\u0000\u02ac\u02ad\u0005w\u0000\u0000\u02ad\u02af\u0003\u0080@\u0000"+
		"\u02ae\u02ac\u0001\u0000\u0000\u0000\u02af\u02b2\u0001\u0000\u0000\u0000"+
		"\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000\u0000"+
		"\u02b1\u007f\u0001\u0000\u0000\u0000\u02b2\u02b0\u0001\u0000\u0000\u0000"+
		"\u02b3\u02b7\u0003\u0088D\u0000\u02b4\u02b6\u0003\u0082A\u0000\u02b5\u02b4"+
		"\u0001\u0000\u0000\u0000\u02b6\u02b9\u0001\u0000\u0000\u0000\u02b7\u02b5"+
		"\u0001\u0000\u0000\u0000\u02b7\u02b8\u0001\u0000\u0000\u0000\u02b8\u0081"+
		"\u0001\u0000\u0000\u0000\u02b9\u02b7\u0001\u0000\u0000\u0000\u02ba\u02bb"+
		"\u0005x\u0000\u0000\u02bb\u02c6\u0005\u0085\u0000\u0000\u02bc\u02bd\u0005"+
		"y\u0000\u0000\u02bd\u02be\u0003|>\u0000\u02be\u02bf\u0005z\u0000\u0000"+
		"\u02bf\u02c6\u0001\u0000\u0000\u0000\u02c0\u02c2\u0005{\u0000\u0000\u02c1"+
		"\u02c3\u0003\u0084B\u0000\u02c2\u02c1\u0001\u0000\u0000\u0000\u02c2\u02c3"+
		"\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000\u02c4\u02c6"+
		"\u0005|\u0000\u0000\u02c5\u02ba\u0001\u0000\u0000\u0000\u02c5\u02bc\u0001"+
		"\u0000\u0000\u0000\u02c5\u02c0\u0001\u0000\u0000\u0000\u02c6\u0083\u0001"+
		"\u0000\u0000\u0000\u02c7\u02cc\u0003\u0086C\u0000\u02c8\u02c9\u0005\u007f"+
		"\u0000\u0000\u02c9\u02cb\u0003\u0086C\u0000\u02ca\u02c8\u0001\u0000\u0000"+
		"\u0000\u02cb\u02ce\u0001\u0000\u0000\u0000\u02cc\u02ca\u0001\u0000\u0000"+
		"\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cd\u0085\u0001\u0000\u0000"+
		"\u0000\u02ce\u02cc\u0001\u0000\u0000\u0000\u02cf\u02d0\u0005\u0085\u0000"+
		"\u0000\u02d0\u02d1\u0005\u0080\u0000\u0000\u02d1\u02d4\u0003|>\u0000\u02d2"+
		"\u02d4\u0003|>\u0000\u02d3\u02cf\u0001\u0000\u0000\u0000\u02d3\u02d2\u0001"+
		"\u0000\u0000\u0000\u02d4\u0087\u0001\u0000\u0000\u0000\u02d5\u02e4\u0005"+
		"\u0085\u0000\u0000\u02d6\u02e4\u0005\u0083\u0000\u0000\u02d7\u02e4\u0005"+
		"\u0084\u0000\u0000\u02d8\u02e4\u0005n\u0000\u0000\u02d9\u02e4\u0005k\u0000"+
		"\u0000\u02da\u02e4\u0005l\u0000\u0000\u02db\u02e4\u0005m\u0000\u0000\u02dc"+
		"\u02e4\u0003\u008aE\u0000\u02dd\u02e4\u0003\u008cF\u0000\u02de\u02e4\u0003"+
		"\u0090H\u0000\u02df\u02e0\u0005{\u0000\u0000\u02e0\u02e1\u0003|>\u0000"+
		"\u02e1\u02e2\u0005|\u0000\u0000\u02e2\u02e4\u0001\u0000\u0000\u0000\u02e3"+
		"\u02d5\u0001\u0000\u0000\u0000\u02e3\u02d6\u0001\u0000\u0000\u0000\u02e3"+
		"\u02d7\u0001\u0000\u0000\u0000\u02e3\u02d8\u0001\u0000\u0000\u0000\u02e3"+
		"\u02d9\u0001\u0000\u0000\u0000\u02e3\u02da\u0001\u0000\u0000\u0000\u02e3"+
		"\u02db\u0001\u0000\u0000\u0000\u02e3\u02dc\u0001\u0000\u0000\u0000\u02e3"+
		"\u02dd\u0001\u0000\u0000\u0000\u02e3\u02de\u0001\u0000\u0000\u0000\u02e3"+
		"\u02df\u0001\u0000\u0000\u0000\u02e4\u0089\u0001\u0000\u0000\u0000\u02e5"+
		"\u02ee\u0005y\u0000\u0000\u02e6\u02eb\u0003|>\u0000\u02e7\u02e8\u0005"+
		"\u007f\u0000\u0000\u02e8\u02ea\u0003|>\u0000\u02e9\u02e7\u0001\u0000\u0000"+
		"\u0000\u02ea\u02ed\u0001\u0000\u0000\u0000\u02eb\u02e9\u0001\u0000\u0000"+
		"\u0000\u02eb\u02ec\u0001\u0000\u0000\u0000\u02ec\u02ef\u0001\u0000\u0000"+
		"\u0000\u02ed\u02eb\u0001\u0000\u0000\u0000\u02ee\u02e6\u0001\u0000\u0000"+
		"\u0000\u02ee\u02ef\u0001\u0000\u0000\u0000\u02ef\u02f0\u0001\u0000\u0000"+
		"\u0000\u02f0\u02f1\u0005z\u0000\u0000\u02f1\u008b\u0001\u0000\u0000\u0000"+
		"\u02f2\u02fb\u0005}\u0000\u0000\u02f3\u02f8\u0003\u008eG\u0000\u02f4\u02f5"+
		"\u0005\u007f\u0000\u0000\u02f5\u02f7\u0003\u008eG\u0000\u02f6\u02f4\u0001"+
		"\u0000\u0000\u0000\u02f7\u02fa\u0001\u0000\u0000\u0000\u02f8\u02f6\u0001"+
		"\u0000\u0000\u0000\u02f8\u02f9\u0001\u0000\u0000\u0000\u02f9\u02fc\u0001"+
		"\u0000\u0000\u0000\u02fa\u02f8\u0001\u0000\u0000\u0000\u02fb\u02f3\u0001"+
		"\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001"+
		"\u0000\u0000\u0000\u02fd\u02fe\u0005~\u0000\u0000\u02fe\u008d\u0001\u0000"+
		"\u0000\u0000\u02ff\u0300\u0007\u0002\u0000\u0000\u0300\u0301\u0005\u0081"+
		"\u0000\u0000\u0301\u0302\u0003|>\u0000\u0302\u008f\u0001\u0000\u0000\u0000"+
		"\u0303\u0304\u0005{\u0000\u0000\u0304\u0305\u0005\u0085\u0000\u0000\u0305"+
		"\u0306\u0005s\u0000\u0000\u0306\u0307\u0005\u0085\u0000\u0000\u0307\u0308"+
		"\u0005u\u0000\u0000\u0308\u030b\u0003|>\u0000\u0309\u030a\u0005o\u0000"+
		"\u0000\u030a\u030c\u0003|>\u0000\u030b\u0309\u0001\u0000\u0000\u0000\u030b"+
		"\u030c\u0001\u0000\u0000\u0000\u030c\u030d\u0001\u0000\u0000\u0000\u030d"+
		"\u030e\u0005|\u0000\u0000\u030e\u0091\u0001\u0000\u0000\u0000R\u0096\u009b"+
		"\u00a4\u00b7\u00bc\u00be\u00c7\u00ce\u00d6\u00dd\u00e5\u00ec\u00f4\u00fb"+
		"\u0103\u010a\u0112\u0119\u0121\u0128\u0130\u0137\u013f\u0147\u014e\u0156"+
		"\u015d\u0165\u016c\u0174\u017b\u0183\u018a\u0194\u019c\u01a0\u01a5\u01ab"+
		"\u01b2\u01ba\u01c2\u01c9\u01cf\u01d5\u01df\u01e6\u01ea\u01ee\u01f5\u01f7"+
		"\u0200\u020a\u0213\u021b\u021d\u0225\u0231\u0236\u023f\u0251\u025f\u0263"+
		"\u026e\u027c\u0286\u028b\u0294\u0299\u02a4\u02a9\u02b0\u02b7\u02c2\u02c5"+
		"\u02cc\u02d3\u02e3\u02eb\u02ee\u02f8\u02fb\u030b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}