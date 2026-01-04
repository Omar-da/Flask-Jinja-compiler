// Generated from C:/Users/Dell/IdeaProjects/Compiler/src/grammers/MiniFlaskParser.g4 by ANTLR 4.13.1
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
public class MiniFlaskParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, IF=2, RETURN=3, APP=4, ROUTE=5, FOR=6, IN=7, FROM=8, IMPORT=9, 
		NONE=10, TRUE=11, FALSE=12, STRING=13, NUMBER=14, IDENT=15, AT=16, DOT=17, 
		LPAREN=18, RPAREN=19, LBRACK=20, RBRACK=21, LBRACE=22, RBRACE=23, COMMA=24, 
		COLON=25, EQUALS=26, PLUS=27, STAR=28, DOUBLESTAR=29, EQEQ=30, COMMENT=31, 
		WS=32, NEWLINE=33;
	public static final int
		RULE_file = 0, RULE_statement = 1, RULE_importStmt = 2, RULE_importNames = 3, 
		RULE_routeDef = 4, RULE_routeArgs = 5, RULE_routeArg = 6, RULE_funcDef = 7, 
		RULE_params = 8, RULE_param = 9, RULE_simpleParam = 10, RULE_defaultParam = 11, 
		RULE_typeAnnotatedParam = 12, RULE_typeAnnotatedDefaultParam = 13, RULE_starParam = 14, 
		RULE_doubleStarParam = 15, RULE_typeExpr = 16, RULE_assign = 17, RULE_ifStmt = 18, 
		RULE_returnStmt = 19, RULE_exprStmt = 20, RULE_expr = 21, RULE_additive = 22, 
		RULE_primary = 23, RULE_suffix = 24, RULE_routeArgKws = 25, RULE_arg = 26, 
		RULE_atom = 27, RULE_listLiteral = 28, RULE_dictLiteral = 29, RULE_pair = 30, 
		RULE_genExpr = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "statement", "importStmt", "importNames", "routeDef", "routeArgs", 
			"routeArg", "funcDef", "params", "param", "simpleParam", "defaultParam", 
			"typeAnnotatedParam", "typeAnnotatedDefaultParam", "starParam", "doubleStarParam", 
			"typeExpr", "assign", "ifStmt", "returnStmt", "exprStmt", "expr", "additive", 
			"primary", "suffix", "routeArgKws", "arg", "atom", "listLiteral", "dictLiteral", 
			"pair", "genExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'if'", "'return'", "'app'", "'route'", "'for'", "'in'", 
			"'from'", "'import'", "'None'", "'True'", "'False'", null, null, null, 
			"'@'", "'.'", "'('", "')'", "'['", "']'", "'{'", "'}'", "','", "':'", 
			"'='", "'+'", "'*'", "'**'", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEF", "IF", "RETURN", "APP", "ROUTE", "FOR", "IN", "FROM", "IMPORT", 
			"NONE", "TRUE", "FALSE", "STRING", "NUMBER", "IDENT", "AT", "DOT", "LPAREN", 
			"RPAREN", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "COMMA", "COLON", "EQUALS", 
			"PLUS", "STAR", "DOUBLESTAR", "EQEQ", "COMMENT", "WS", "NEWLINE"
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
	public String getGrammarFileName() { return "MiniFlaskParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniFlaskParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MiniFlaskParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MiniFlaskParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MiniFlaskParser.NEWLINE, i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5635870L) != 0)) {
				{
				{
				setState(64);
				statement();
				setState(65);
				match(NEWLINE);
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
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
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskAssignStmtContext extends StatementContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public FlaskAssignStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskRouteDefStmtContext extends StatementContext {
		public RouteDefContext routeDef() {
			return getRuleContext(RouteDefContext.class,0);
		}
		public FlaskRouteDefStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskRouteDefStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskRouteDefStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskRouteDefStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskFuncDefStmtContext extends StatementContext {
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public FlaskFuncDefStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskFuncDefStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskFuncDefStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskFuncDefStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskIfStmtContext extends StatementContext {
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public FlaskIfStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskReturnStmtContext extends StatementContext {
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public FlaskReturnStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskImportStmtContext extends StatementContext {
		public ImportStmtContext importStmt() {
			return getRuleContext(ImportStmtContext.class,0);
		}
		public FlaskImportStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskImportStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskImportStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskImportStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskExprStmtContext extends StatementContext {
		public ExprStmtContext exprStmt() {
			return getRuleContext(ExprStmtContext.class,0);
		}
		public FlaskExprStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new FlaskImportStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				importStmt();
				}
				break;
			case 2:
				_localctx = new FlaskRouteDefStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				routeDef();
				}
				break;
			case 3:
				_localctx = new FlaskFuncDefStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				funcDef();
				}
				break;
			case 4:
				_localctx = new FlaskAssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				assign();
				}
				break;
			case 5:
				_localctx = new FlaskIfStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				ifStmt();
				}
				break;
			case 6:
				_localctx = new FlaskReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(79);
				returnStmt();
				}
				break;
			case 7:
				_localctx = new FlaskExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(80);
				exprStmt();
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
	public static class ImportStmtContext extends ParserRuleContext {
		public ImportStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStmt; }
	 
		public ImportStmtContext() { }
		public void copyFrom(ImportStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskFromImportStmtContext extends ImportStmtContext {
		public TerminalNode FROM() { return getToken(MiniFlaskParser.FROM, 0); }
		public TerminalNode IDENT() { return getToken(MiniFlaskParser.IDENT, 0); }
		public TerminalNode IMPORT() { return getToken(MiniFlaskParser.IMPORT, 0); }
		public ImportNamesContext importNames() {
			return getRuleContext(ImportNamesContext.class,0);
		}
		public FlaskFromImportStmtContext(ImportStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskFromImportStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskFromImportStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskFromImportStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskImportNamesStmtContext extends ImportStmtContext {
		public TerminalNode IMPORT() { return getToken(MiniFlaskParser.IMPORT, 0); }
		public ImportNamesContext importNames() {
			return getRuleContext(ImportNamesContext.class,0);
		}
		public FlaskImportNamesStmtContext(ImportStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskImportNamesStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskImportNamesStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskImportNamesStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStmtContext importStmt() throws RecognitionException {
		ImportStmtContext _localctx = new ImportStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStmt);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				_localctx = new FlaskImportNamesStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(IMPORT);
				setState(84);
				importNames();
				}
				break;
			case FROM:
				_localctx = new FlaskFromImportStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(FROM);
				setState(86);
				match(IDENT);
				setState(87);
				match(IMPORT);
				setState(88);
				importNames();
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
	public static class ImportNamesContext extends ParserRuleContext {
		public ImportNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importNames; }
	 
		public ImportNamesContext() { }
		public void copyFrom(ImportNamesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskImportNameListContext extends ImportNamesContext {
		public List<TerminalNode> IDENT() { return getTokens(MiniFlaskParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MiniFlaskParser.IDENT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniFlaskParser.COMMA, i);
		}
		public FlaskImportNameListContext(ImportNamesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskImportNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskImportNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskImportNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportNamesContext importNames() throws RecognitionException {
		ImportNamesContext _localctx = new ImportNamesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importNames);
		int _la;
		try {
			_localctx = new FlaskImportNameListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(IDENT);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(92);
				match(COMMA);
				setState(93);
				match(IDENT);
				}
				}
				setState(98);
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
	public static class RouteDefContext extends ParserRuleContext {
		public RouteDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routeDef; }
	 
		public RouteDefContext() { }
		public void copyFrom(RouteDefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskRouteDefinitionContext extends RouteDefContext {
		public TerminalNode AT() { return getToken(MiniFlaskParser.AT, 0); }
		public TerminalNode APP() { return getToken(MiniFlaskParser.APP, 0); }
		public TerminalNode DOT() { return getToken(MiniFlaskParser.DOT, 0); }
		public TerminalNode ROUTE() { return getToken(MiniFlaskParser.ROUTE, 0); }
		public TerminalNode LPAREN() { return getToken(MiniFlaskParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniFlaskParser.RPAREN, 0); }
		public TerminalNode NEWLINE() { return getToken(MiniFlaskParser.NEWLINE, 0); }
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public RouteArgsContext routeArgs() {
			return getRuleContext(RouteArgsContext.class,0);
		}
		public FlaskRouteDefinitionContext(RouteDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskRouteDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskRouteDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskRouteDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouteDefContext routeDef() throws RecognitionException {
		RouteDefContext _localctx = new RouteDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_routeDef);
		int _la;
		try {
			_localctx = new FlaskRouteDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(AT);
			setState(100);
			match(APP);
			setState(101);
			match(DOT);
			setState(102);
			match(ROUTE);
			setState(103);
			match(LPAREN);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING || _la==IDENT) {
				{
				setState(104);
				routeArgs();
				}
			}

			setState(107);
			match(RPAREN);
			setState(108);
			match(NEWLINE);
			setState(109);
			funcDef();
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
	public static class RouteArgsContext extends ParserRuleContext {
		public RouteArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routeArgs; }
	 
		public RouteArgsContext() { }
		public void copyFrom(RouteArgsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskRouteArgsListContext extends RouteArgsContext {
		public List<RouteArgContext> routeArg() {
			return getRuleContexts(RouteArgContext.class);
		}
		public RouteArgContext routeArg(int i) {
			return getRuleContext(RouteArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniFlaskParser.COMMA, i);
		}
		public FlaskRouteArgsListContext(RouteArgsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskRouteArgsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskRouteArgsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskRouteArgsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouteArgsContext routeArgs() throws RecognitionException {
		RouteArgsContext _localctx = new RouteArgsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_routeArgs);
		int _la;
		try {
			_localctx = new FlaskRouteArgsListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			routeArg();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(112);
				match(COMMA);
				setState(113);
				routeArg();
				}
				}
				setState(118);
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
	public static class RouteArgContext extends ParserRuleContext {
		public RouteArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routeArg; }
	 
		public RouteArgContext() { }
		public void copyFrom(RouteArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskRouteArgStringContext extends RouteArgContext {
		public TerminalNode STRING() { return getToken(MiniFlaskParser.STRING, 0); }
		public FlaskRouteArgStringContext(RouteArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskRouteArgString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskRouteArgString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskRouteArgString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskRouteArgKwContext extends RouteArgContext {
		public TerminalNode IDENT() { return getToken(MiniFlaskParser.IDENT, 0); }
		public TerminalNode EQUALS() { return getToken(MiniFlaskParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FlaskRouteArgKwContext(RouteArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskRouteArgKw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskRouteArgKw(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskRouteArgKw(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouteArgContext routeArg() throws RecognitionException {
		RouteArgContext _localctx = new RouteArgContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_routeArg);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new FlaskRouteArgStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(STRING);
				}
				break;
			case IDENT:
				_localctx = new FlaskRouteArgKwContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(IDENT);
				setState(121);
				match(EQUALS);
				setState(122);
				expr();
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
	public static class FuncDefContext extends ParserRuleContext {
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
	 
		public FuncDefContext() { }
		public void copyFrom(FuncDefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskFunctionDefContext extends FuncDefContext {
		public TerminalNode DEF() { return getToken(MiniFlaskParser.DEF, 0); }
		public TerminalNode IDENT() { return getToken(MiniFlaskParser.IDENT, 0); }
		public TerminalNode LPAREN() { return getToken(MiniFlaskParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniFlaskParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(MiniFlaskParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(MiniFlaskParser.NEWLINE, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FlaskFunctionDefContext(FuncDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskFunctionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskFunctionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcDef);
		int _la;
		try {
			int _alt;
			_localctx = new FlaskFunctionDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(DEF);
			setState(126);
			match(IDENT);
			setState(127);
			match(LPAREN);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 805339136L) != 0)) {
				{
				setState(128);
				params();
				}
			}

			setState(131);
			match(RPAREN);
			setState(132);
			match(COLON);
			setState(133);
			match(NEWLINE);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134);
					statement();
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
	public static class ParamsContext extends ParserRuleContext {
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	 
		public ParamsContext() { }
		public void copyFrom(ParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskParamsListContext extends ParamsContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniFlaskParser.COMMA, i);
		}
		public FlaskParamsListContext(ParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskParamsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskParamsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskParamsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_params);
		int _la;
		try {
			_localctx = new FlaskParamsListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			param();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(141);
				match(COMMA);
				setState(142);
				param();
				}
				}
				setState(147);
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
	public static class ParamContext extends ParserRuleContext {
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	 
		public ParamContext() { }
		public void copyFrom(ParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskParamDoubleStarContext extends ParamContext {
		public DoubleStarParamContext doubleStarParam() {
			return getRuleContext(DoubleStarParamContext.class,0);
		}
		public FlaskParamDoubleStarContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskParamDoubleStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskParamDoubleStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskParamDoubleStar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskParamTypeDefaultContext extends ParamContext {
		public TypeAnnotatedDefaultParamContext typeAnnotatedDefaultParam() {
			return getRuleContext(TypeAnnotatedDefaultParamContext.class,0);
		}
		public FlaskParamTypeDefaultContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskParamTypeDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskParamTypeDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskParamTypeDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskParamTypeContext extends ParamContext {
		public TypeAnnotatedParamContext typeAnnotatedParam() {
			return getRuleContext(TypeAnnotatedParamContext.class,0);
		}
		public FlaskParamTypeContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskParamType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskParamType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskParamType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskParamSimpleContext extends ParamContext {
		public SimpleParamContext simpleParam() {
			return getRuleContext(SimpleParamContext.class,0);
		}
		public FlaskParamSimpleContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskParamSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskParamSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskParamSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskParamDefaultContext extends ParamContext {
		public DefaultParamContext defaultParam() {
			return getRuleContext(DefaultParamContext.class,0);
		}
		public FlaskParamDefaultContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskParamDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskParamDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskParamDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskParamStarContext extends ParamContext {
		public StarParamContext starParam() {
			return getRuleContext(StarParamContext.class,0);
		}
		public FlaskParamStarContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskParamStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskParamStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskParamStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_param);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new FlaskParamSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				simpleParam();
				}
				break;
			case 2:
				_localctx = new FlaskParamDefaultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				defaultParam();
				}
				break;
			case 3:
				_localctx = new FlaskParamTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				typeAnnotatedParam();
				}
				break;
			case 4:
				_localctx = new FlaskParamTypeDefaultContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				typeAnnotatedDefaultParam();
				}
				break;
			case 5:
				_localctx = new FlaskParamStarContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				starParam();
				}
				break;
			case 6:
				_localctx = new FlaskParamDoubleStarContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(153);
				doubleStarParam();
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
	public static class SimpleParamContext extends ParserRuleContext {
		public SimpleParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleParam; }
	 
		public SimpleParamContext() { }
		public void copyFrom(SimpleParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskSimpleParamContext extends SimpleParamContext {
		public TerminalNode IDENT() { return getToken(MiniFlaskParser.IDENT, 0); }
		public FlaskSimpleParamContext(SimpleParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskSimpleParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskSimpleParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskSimpleParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleParamContext simpleParam() throws RecognitionException {
		SimpleParamContext _localctx = new SimpleParamContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_simpleParam);
		try {
			_localctx = new FlaskSimpleParamContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(IDENT);
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
	public static class DefaultParamContext extends ParserRuleContext {
		public DefaultParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultParam; }
	 
		public DefaultParamContext() { }
		public void copyFrom(DefaultParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskDefaultParamContext extends DefaultParamContext {
		public TerminalNode IDENT() { return getToken(MiniFlaskParser.IDENT, 0); }
		public TerminalNode EQUALS() { return getToken(MiniFlaskParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FlaskDefaultParamContext(DefaultParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskDefaultParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskDefaultParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskDefaultParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultParamContext defaultParam() throws RecognitionException {
		DefaultParamContext _localctx = new DefaultParamContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_defaultParam);
		try {
			_localctx = new FlaskDefaultParamContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(IDENT);
			setState(159);
			match(EQUALS);
			setState(160);
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
	public static class TypeAnnotatedParamContext extends ParserRuleContext {
		public TypeAnnotatedParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAnnotatedParam; }
	 
		public TypeAnnotatedParamContext() { }
		public void copyFrom(TypeAnnotatedParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskTypeAnnotatedParamContext extends TypeAnnotatedParamContext {
		public TerminalNode IDENT() { return getToken(MiniFlaskParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(MiniFlaskParser.COLON, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public FlaskTypeAnnotatedParamContext(TypeAnnotatedParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskTypeAnnotatedParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskTypeAnnotatedParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskTypeAnnotatedParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAnnotatedParamContext typeAnnotatedParam() throws RecognitionException {
		TypeAnnotatedParamContext _localctx = new TypeAnnotatedParamContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeAnnotatedParam);
		try {
			_localctx = new FlaskTypeAnnotatedParamContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(IDENT);
			setState(163);
			match(COLON);
			setState(164);
			typeExpr();
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
	public static class TypeAnnotatedDefaultParamContext extends ParserRuleContext {
		public TypeAnnotatedDefaultParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAnnotatedDefaultParam; }
	 
		public TypeAnnotatedDefaultParamContext() { }
		public void copyFrom(TypeAnnotatedDefaultParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskTypeAnnotatedDefaultParamContext extends TypeAnnotatedDefaultParamContext {
		public TerminalNode IDENT() { return getToken(MiniFlaskParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(MiniFlaskParser.COLON, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(MiniFlaskParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FlaskTypeAnnotatedDefaultParamContext(TypeAnnotatedDefaultParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskTypeAnnotatedDefaultParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskTypeAnnotatedDefaultParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskTypeAnnotatedDefaultParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAnnotatedDefaultParamContext typeAnnotatedDefaultParam() throws RecognitionException {
		TypeAnnotatedDefaultParamContext _localctx = new TypeAnnotatedDefaultParamContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeAnnotatedDefaultParam);
		try {
			_localctx = new FlaskTypeAnnotatedDefaultParamContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(IDENT);
			setState(167);
			match(COLON);
			setState(168);
			typeExpr();
			setState(169);
			match(EQUALS);
			setState(170);
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
	public static class StarParamContext extends ParserRuleContext {
		public StarParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starParam; }
	 
		public StarParamContext() { }
		public void copyFrom(StarParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskStarParamContext extends StarParamContext {
		public TerminalNode STAR() { return getToken(MiniFlaskParser.STAR, 0); }
		public TerminalNode IDENT() { return getToken(MiniFlaskParser.IDENT, 0); }
		public FlaskStarParamContext(StarParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskStarParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskStarParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskStarParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StarParamContext starParam() throws RecognitionException {
		StarParamContext _localctx = new StarParamContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_starParam);
		try {
			_localctx = new FlaskStarParamContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(STAR);
			setState(173);
			match(IDENT);
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
	public static class DoubleStarParamContext extends ParserRuleContext {
		public DoubleStarParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleStarParam; }
	 
		public DoubleStarParamContext() { }
		public void copyFrom(DoubleStarParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskDoubleStarParamContext extends DoubleStarParamContext {
		public TerminalNode DOUBLESTAR() { return getToken(MiniFlaskParser.DOUBLESTAR, 0); }
		public TerminalNode IDENT() { return getToken(MiniFlaskParser.IDENT, 0); }
		public FlaskDoubleStarParamContext(DoubleStarParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskDoubleStarParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskDoubleStarParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskDoubleStarParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleStarParamContext doubleStarParam() throws RecognitionException {
		DoubleStarParamContext _localctx = new DoubleStarParamContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_doubleStarParam);
		try {
			_localctx = new FlaskDoubleStarParamContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(DOUBLESTAR);
			setState(176);
			match(IDENT);
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
	public static class TypeExprContext extends ParserRuleContext {
		public TypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeExpr; }
	 
		public TypeExprContext() { }
		public void copyFrom(TypeExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskTypeExprContext extends TypeExprContext {
		public List<TerminalNode> IDENT() { return getTokens(MiniFlaskParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MiniFlaskParser.IDENT, i);
		}
		public List<TerminalNode> DOT() { return getTokens(MiniFlaskParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MiniFlaskParser.DOT, i);
		}
		public FlaskTypeExprContext(TypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskTypeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskTypeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskTypeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeExprContext typeExpr() throws RecognitionException {
		TypeExprContext _localctx = new TypeExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeExpr);
		int _la;
		try {
			_localctx = new FlaskTypeExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(IDENT);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(179);
				match(DOT);
				setState(180);
				match(IDENT);
				}
				}
				setState(185);
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
	public static class AssignContext extends ParserRuleContext {
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	 
		public AssignContext() { }
		public void copyFrom(AssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskAssignmentContext extends AssignContext {
		public TerminalNode EQUALS() { return getToken(MiniFlaskParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniFlaskParser.IDENT, 0); }
		public TerminalNode APP() { return getToken(MiniFlaskParser.APP, 0); }
		public FlaskAssignmentContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assign);
		int _la;
		try {
			_localctx = new FlaskAssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !(_la==APP || _la==IDENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(187);
			match(EQUALS);
			setState(188);
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
	public static class IfStmtContext extends ParserRuleContext {
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
	 
		public IfStmtContext() { }
		public void copyFrom(IfStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskIfStatementContext extends IfStmtContext {
		public TerminalNode IF() { return getToken(MiniFlaskParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MiniFlaskParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(MiniFlaskParser.NEWLINE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FlaskIfStatementContext(IfStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifStmt);
		try {
			int _alt;
			_localctx = new FlaskIfStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(IF);
			setState(191);
			expr();
			setState(192);
			match(COLON);
			setState(193);
			match(NEWLINE);
			setState(195); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(194);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(197); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends ParserRuleContext {
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
	 
		public ReturnStmtContext() { }
		public void copyFrom(ReturnStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskReturnStatementContext extends ReturnStmtContext {
		public TerminalNode RETURN() { return getToken(MiniFlaskParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FlaskReturnStatementContext(ReturnStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_returnStmt);
		try {
			_localctx = new FlaskReturnStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(RETURN);
			setState(200);
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
	public static class ExprStmtContext extends ParserRuleContext {
		public ExprStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStmt; }
	 
		public ExprStmtContext() { }
		public void copyFrom(ExprStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskExpressionStatementContext extends ExprStmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FlaskExpressionStatementContext(ExprStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprStmtContext exprStmt() throws RecognitionException {
		ExprStmtContext _localctx = new ExprStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exprStmt);
		try {
			_localctx = new FlaskExpressionStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
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
		public TerminalNode EQEQ() { return getToken(MiniFlaskParser.EQEQ, 0); }
		public FlaskEqualityExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr);
		int _la;
		try {
			_localctx = new FlaskEqualityExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			additive();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQEQ) {
				{
				setState(205);
				match(EQEQ);
				setState(206);
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
		public List<TerminalNode> PLUS() { return getTokens(MiniFlaskParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(MiniFlaskParser.PLUS, i);
		}
		public FlaskAdditiveExprContext(AdditiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveContext additive() throws RecognitionException {
		AdditiveContext _localctx = new AdditiveContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_additive);
		int _la;
		try {
			_localctx = new FlaskAdditiveExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			primary();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(210);
				match(PLUS);
				setState(211);
				primary();
				}
				}
				setState(216);
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
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_primary);
		try {
			int _alt;
			_localctx = new FlaskPrimaryExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			atom();
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(218);
					suffix();
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		public TerminalNode LPAREN() { return getToken(MiniFlaskParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniFlaskParser.RPAREN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(MiniFlaskParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MiniFlaskParser.NEWLINE, i);
		}
		public RouteArgKwsContext routeArgKws() {
			return getRuleContext(RouteArgKwsContext.class,0);
		}
		public FlaskCallSuffixContext(SuffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskCallSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskCallSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskCallSuffix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskGenExprContext extends SuffixContext {
		public GenExprContext genExpr() {
			return getRuleContext(GenExprContext.class,0);
		}
		public FlaskGenExprContext(SuffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskGenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskGenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskGenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskAttrAccessContext extends SuffixContext {
		public TerminalNode DOT() { return getToken(MiniFlaskParser.DOT, 0); }
		public TerminalNode IDENT() { return getToken(MiniFlaskParser.IDENT, 0); }
		public FlaskAttrAccessContext(SuffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskAttrAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskAttrAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskAttrAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskIndexingContext extends SuffixContext {
		public TerminalNode LBRACK() { return getToken(MiniFlaskParser.LBRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(MiniFlaskParser.RBRACK, 0); }
		public FlaskIndexingContext(SuffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskIndexing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskIndexing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskIndexing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuffixContext suffix() throws RecognitionException {
		SuffixContext _localctx = new SuffixContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_suffix);
		int _la;
		try {
			int _alt;
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new FlaskAttrAccessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(DOT);
				setState(225);
				match(IDENT);
				}
				break;
			case 2:
				_localctx = new FlaskIndexingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(LBRACK);
				setState(227);
				expr();
				setState(228);
				match(RBRACK);
				}
				break;
			case 3:
				_localctx = new FlaskCallSuffixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(LPAREN);
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(231);
						match(NEWLINE);
						}
						} 
					}
					setState(236);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5569552L) != 0)) {
					{
					setState(237);
					routeArgKws();
					}
				}

				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(240);
					match(NEWLINE);
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(246);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new FlaskGenExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				genExpr();
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
		public List<TerminalNode> COMMA() { return getTokens(MiniFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniFlaskParser.COMMA, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MiniFlaskParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MiniFlaskParser.NEWLINE, i);
		}
		public FlaskArgsListContext(RouteArgKwsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskArgsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskArgsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskArgsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouteArgKwsContext routeArgKws() throws RecognitionException {
		RouteArgKwsContext _localctx = new RouteArgKwsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_routeArgKws);
		int _la;
		try {
			int _alt;
			_localctx = new FlaskArgsListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			arg();
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(251);
						match(NEWLINE);
						}
						}
						setState(256);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(257);
					match(COMMA);
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(258);
						match(NEWLINE);
						}
						}
						setState(263);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(264);
					arg();
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		public TerminalNode IDENT() { return getToken(MiniFlaskParser.IDENT, 0); }
		public TerminalNode EQUALS() { return getToken(MiniFlaskParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FlaskKwArgContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskKwArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskKwArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskKwArg(this);
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
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskPosArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskPosArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskPosArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arg);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new FlaskKwArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(IDENT);
				setState(271);
				match(EQUALS);
				setState(272);
				expr();
				}
				break;
			case 2:
				_localctx = new FlaskPosArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
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
		public TerminalNode STRING() { return getToken(MiniFlaskParser.STRING, 0); }
		public FlaskAtomStringContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskAtomString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskAtomString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskAtomString(this);
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
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskAtomList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskAtomList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskAtomList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskAtomFalseContext extends AtomContext {
		public TerminalNode FALSE() { return getToken(MiniFlaskParser.FALSE, 0); }
		public FlaskAtomFalseContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskAtomFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskAtomFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskAtomFalse(this);
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
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskAtomGenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskAtomGenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskAtomGenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskAtomNumberContext extends AtomContext {
		public TerminalNode NUMBER() { return getToken(MiniFlaskParser.NUMBER, 0); }
		public FlaskAtomNumberContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskAtomNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskAtomNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskAtomNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlskAtomAppContext extends AtomContext {
		public TerminalNode APP() { return getToken(MiniFlaskParser.APP, 0); }
		public FlskAtomAppContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlskAtomApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlskAtomApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlskAtomApp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskAtomTrueContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(MiniFlaskParser.TRUE, 0); }
		public FlaskAtomTrueContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskAtomTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskAtomTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskAtomTrue(this);
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
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskAtomDict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskAtomDict(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskAtomDict(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskAtomNameContext extends AtomContext {
		public TerminalNode IDENT() { return getToken(MiniFlaskParser.IDENT, 0); }
		public FlaskAtomNameContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskAtomName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskAtomName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskAtomName(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskAtomParenContext extends AtomContext {
		public TerminalNode LPAREN() { return getToken(MiniFlaskParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniFlaskParser.RPAREN, 0); }
		public FlaskAtomParenContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskAtomParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskAtomParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskAtomParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskAtomNoneContext extends AtomContext {
		public TerminalNode NONE() { return getToken(MiniFlaskParser.NONE, 0); }
		public FlaskAtomNoneContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskAtomNone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskAtomNone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskAtomNone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_atom);
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new FlaskAtomNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(IDENT);
				}
				break;
			case 2:
				_localctx = new FlaskAtomStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(STRING);
				}
				break;
			case 3:
				_localctx = new FlaskAtomNumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				match(NUMBER);
				}
				break;
			case 4:
				_localctx = new FlskAtomAppContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				match(APP);
				}
				break;
			case 5:
				_localctx = new FlaskAtomNoneContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(280);
				match(NONE);
				}
				break;
			case 6:
				_localctx = new FlaskAtomTrueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(281);
				match(TRUE);
				}
				break;
			case 7:
				_localctx = new FlaskAtomFalseContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(282);
				match(FALSE);
				}
				break;
			case 8:
				_localctx = new FlaskAtomListContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(283);
				listLiteral();
				}
				break;
			case 9:
				_localctx = new FlaskAtomDictContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(284);
				dictLiteral();
				}
				break;
			case 10:
				_localctx = new FlaskAtomGenExprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(285);
				genExpr();
				}
				break;
			case 11:
				_localctx = new FlaskAtomParenContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(286);
				match(LPAREN);
				setState(287);
				expr();
				setState(288);
				match(RPAREN);
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
		public TerminalNode LBRACK() { return getToken(MiniFlaskParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(MiniFlaskParser.RBRACK, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(MiniFlaskParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MiniFlaskParser.NEWLINE, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniFlaskParser.COMMA, i);
		}
		public FlaskListLiteralContext(ListLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskListLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskListLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListLiteralContext listLiteral() throws RecognitionException {
		ListLiteralContext _localctx = new ListLiteralContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_listLiteral);
		int _la;
		try {
			int _alt;
			_localctx = new FlaskListLiteralContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(LBRACK);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(293);
					match(NEWLINE);
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5569552L) != 0)) {
				{
				setState(299);
				expr();
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(303);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(300);
							match(NEWLINE);
							}
							}
							setState(305);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(306);
						match(COMMA);
						setState(310);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(307);
							match(NEWLINE);
							}
							}
							setState(312);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(313);
						expr();
						}
						} 
					}
					setState(318);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(319);
						match(NEWLINE);
						}
						} 
					}
					setState(324);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(325);
					match(COMMA);
					}
				}

				}
			}

			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(330);
				match(NEWLINE);
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			match(RBRACK);
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
		public TerminalNode LBRACE() { return getToken(MiniFlaskParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MiniFlaskParser.RBRACE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(MiniFlaskParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MiniFlaskParser.NEWLINE, i);
		}
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniFlaskParser.COMMA, i);
		}
		public FlaskDictLiteralContext(DictLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskDictLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskDictLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskDictLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictLiteralContext dictLiteral() throws RecognitionException {
		DictLiteralContext _localctx = new DictLiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_dictLiteral);
		int _la;
		try {
			int _alt;
			_localctx = new FlaskDictLiteralContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(LBRACE);
			setState(342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(339);
					match(NEWLINE);
					}
					} 
				}
				setState(344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING || _la==IDENT) {
				{
				setState(345);
				pair();
				setState(362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(349);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(346);
							match(NEWLINE);
							}
							}
							setState(351);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(352);
						match(COMMA);
						setState(356);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(353);
							match(NEWLINE);
							}
							}
							setState(358);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(359);
						pair();
						}
						} 
					}
					setState(364);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(365);
						match(NEWLINE);
						}
						} 
					}
					setState(370);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(371);
					match(COMMA);
					}
				}

				}
			}

			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(376);
				match(NEWLINE);
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
			match(RBRACE);
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
		public TerminalNode COLON() { return getToken(MiniFlaskParser.COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(MiniFlaskParser.STRING, 0); }
		public TerminalNode IDENT() { return getToken(MiniFlaskParser.IDENT, 0); }
		public FlaskDictPairContext(PairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskDictPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskDictPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskDictPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_pair);
		int _la;
		try {
			_localctx = new FlaskDictPairContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(385);
			match(COLON);
			setState(386);
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
		public TerminalNode LPAREN() { return getToken(MiniFlaskParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode FOR() { return getToken(MiniFlaskParser.FOR, 0); }
		public TerminalNode IDENT() { return getToken(MiniFlaskParser.IDENT, 0); }
		public TerminalNode IN() { return getToken(MiniFlaskParser.IN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniFlaskParser.RPAREN, 0); }
		public TerminalNode IF() { return getToken(MiniFlaskParser.IF, 0); }
		public FlaskGeneratorExprContext(GenExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).enterFlaskGeneratorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniFlaskParserListener ) ((MiniFlaskParserListener)listener).exitFlaskGeneratorExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniFlaskParserVisitor ) return ((MiniFlaskParserVisitor<? extends T>)visitor).visitFlaskGeneratorExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenExprContext genExpr() throws RecognitionException {
		GenExprContext _localctx = new GenExprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_genExpr);
		int _la;
		try {
			_localctx = new FlaskGeneratorExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(LPAREN);
			setState(389);
			expr();
			setState(390);
			match(FOR);
			setState(391);
			match(IDENT);
			setState(392);
			match(IN);
			setState(393);
			expr();
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(394);
				match(IF);
				setState(395);
				expr();
				}
			}

			setState(398);
			match(RPAREN);
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
		"\u0004\u0001!\u0191\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"D\b\u0000\n\u0000\f\u0000G\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001R\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002Z\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003_\b\u0003\n\u0003\f\u0003b\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"j\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005s\b\u0005\n\u0005\f\u0005v\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006|\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0082\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0088\b\u0007"+
		"\n\u0007\f\u0007\u008b\t\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u0090\b"+
		"\b\n\b\f\b\u0093\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u009b\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00b6"+
		"\b\u0010\n\u0010\f\u0010\u00b9\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0004\u0012\u00c4\b\u0012\u000b\u0012\f\u0012\u00c5\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u00d0\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u00d5\b\u0016\n\u0016\f\u0016\u00d8\t\u0016\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u00dc\b\u0017\n\u0017\f\u0017\u00df\t\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u00e9\b\u0018\n\u0018\f\u0018\u00ec\t\u0018\u0001\u0018"+
		"\u0003\u0018\u00ef\b\u0018\u0001\u0018\u0005\u0018\u00f2\b\u0018\n\u0018"+
		"\f\u0018\u00f5\t\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00f9\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u00fd\b\u0019\n\u0019\f\u0019\u0100"+
		"\t\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0104\b\u0019\n\u0019\f\u0019"+
		"\u0107\t\u0019\u0001\u0019\u0005\u0019\u010a\b\u0019\n\u0019\f\u0019\u010d"+
		"\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0113"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0123\b\u001b\u0001\u001c\u0001"+
		"\u001c\u0005\u001c\u0127\b\u001c\n\u001c\f\u001c\u012a\t\u001c\u0001\u001c"+
		"\u0001\u001c\u0005\u001c\u012e\b\u001c\n\u001c\f\u001c\u0131\t\u001c\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u0135\b\u001c\n\u001c\f\u001c\u0138\t\u001c"+
		"\u0001\u001c\u0005\u001c\u013b\b\u001c\n\u001c\f\u001c\u013e\t\u001c\u0001"+
		"\u001c\u0005\u001c\u0141\b\u001c\n\u001c\f\u001c\u0144\t\u001c\u0001\u001c"+
		"\u0003\u001c\u0147\b\u001c\u0003\u001c\u0149\b\u001c\u0001\u001c\u0005"+
		"\u001c\u014c\b\u001c\n\u001c\f\u001c\u014f\t\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0005\u001d\u0155\b\u001d\n\u001d\f\u001d\u0158"+
		"\t\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u015c\b\u001d\n\u001d\f\u001d"+
		"\u015f\t\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0163\b\u001d\n\u001d"+
		"\f\u001d\u0166\t\u001d\u0001\u001d\u0005\u001d\u0169\b\u001d\n\u001d\f"+
		"\u001d\u016c\t\u001d\u0001\u001d\u0005\u001d\u016f\b\u001d\n\u001d\f\u001d"+
		"\u0172\t\u001d\u0001\u001d\u0003\u001d\u0175\b\u001d\u0003\u001d\u0177"+
		"\b\u001d\u0001\u001d\u0005\u001d\u017a\b\u001d\n\u001d\f\u001d\u017d\t"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u018d\b\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0000\u0000 \u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>\u0000\u0002"+
		"\u0002\u0000\u0004\u0004\u000f\u000f\u0002\u0000\r\r\u000f\u000f\u01ae"+
		"\u0000E\u0001\u0000\u0000\u0000\u0002Q\u0001\u0000\u0000\u0000\u0004Y"+
		"\u0001\u0000\u0000\u0000\u0006[\u0001\u0000\u0000\u0000\bc\u0001\u0000"+
		"\u0000\u0000\no\u0001\u0000\u0000\u0000\f{\u0001\u0000\u0000\u0000\u000e"+
		"}\u0001\u0000\u0000\u0000\u0010\u008c\u0001\u0000\u0000\u0000\u0012\u009a"+
		"\u0001\u0000\u0000\u0000\u0014\u009c\u0001\u0000\u0000\u0000\u0016\u009e"+
		"\u0001\u0000\u0000\u0000\u0018\u00a2\u0001\u0000\u0000\u0000\u001a\u00a6"+
		"\u0001\u0000\u0000\u0000\u001c\u00ac\u0001\u0000\u0000\u0000\u001e\u00af"+
		"\u0001\u0000\u0000\u0000 \u00b2\u0001\u0000\u0000\u0000\"\u00ba\u0001"+
		"\u0000\u0000\u0000$\u00be\u0001\u0000\u0000\u0000&\u00c7\u0001\u0000\u0000"+
		"\u0000(\u00ca\u0001\u0000\u0000\u0000*\u00cc\u0001\u0000\u0000\u0000,"+
		"\u00d1\u0001\u0000\u0000\u0000.\u00d9\u0001\u0000\u0000\u00000\u00f8\u0001"+
		"\u0000\u0000\u00002\u00fa\u0001\u0000\u0000\u00004\u0112\u0001\u0000\u0000"+
		"\u00006\u0122\u0001\u0000\u0000\u00008\u0124\u0001\u0000\u0000\u0000:"+
		"\u0152\u0001\u0000\u0000\u0000<\u0180\u0001\u0000\u0000\u0000>\u0184\u0001"+
		"\u0000\u0000\u0000@A\u0003\u0002\u0001\u0000AB\u0005!\u0000\u0000BD\u0001"+
		"\u0000\u0000\u0000C@\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000"+
		"EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000HI\u0005\u0000\u0000\u0001I\u0001\u0001"+
		"\u0000\u0000\u0000JR\u0003\u0004\u0002\u0000KR\u0003\b\u0004\u0000LR\u0003"+
		"\u000e\u0007\u0000MR\u0003\"\u0011\u0000NR\u0003$\u0012\u0000OR\u0003"+
		"&\u0013\u0000PR\u0003(\u0014\u0000QJ\u0001\u0000\u0000\u0000QK\u0001\u0000"+
		"\u0000\u0000QL\u0001\u0000\u0000\u0000QM\u0001\u0000\u0000\u0000QN\u0001"+
		"\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QP\u0001\u0000\u0000\u0000"+
		"R\u0003\u0001\u0000\u0000\u0000ST\u0005\t\u0000\u0000TZ\u0003\u0006\u0003"+
		"\u0000UV\u0005\b\u0000\u0000VW\u0005\u000f\u0000\u0000WX\u0005\t\u0000"+
		"\u0000XZ\u0003\u0006\u0003\u0000YS\u0001\u0000\u0000\u0000YU\u0001\u0000"+
		"\u0000\u0000Z\u0005\u0001\u0000\u0000\u0000[`\u0005\u000f\u0000\u0000"+
		"\\]\u0005\u0018\u0000\u0000]_\u0005\u000f\u0000\u0000^\\\u0001\u0000\u0000"+
		"\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000a\u0007\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000"+
		"cd\u0005\u0010\u0000\u0000de\u0005\u0004\u0000\u0000ef\u0005\u0011\u0000"+
		"\u0000fg\u0005\u0005\u0000\u0000gi\u0005\u0012\u0000\u0000hj\u0003\n\u0005"+
		"\u0000ih\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000kl\u0005\u0013\u0000\u0000lm\u0005!\u0000\u0000mn\u0003\u000e"+
		"\u0007\u0000n\t\u0001\u0000\u0000\u0000ot\u0003\f\u0006\u0000pq\u0005"+
		"\u0018\u0000\u0000qs\u0003\f\u0006\u0000rp\u0001\u0000\u0000\u0000sv\u0001"+
		"\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"u\u000b\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000w|\u0005\r\u0000"+
		"\u0000xy\u0005\u000f\u0000\u0000yz\u0005\u001a\u0000\u0000z|\u0003*\u0015"+
		"\u0000{w\u0001\u0000\u0000\u0000{x\u0001\u0000\u0000\u0000|\r\u0001\u0000"+
		"\u0000\u0000}~\u0005\u0001\u0000\u0000~\u007f\u0005\u000f\u0000\u0000"+
		"\u007f\u0081\u0005\u0012\u0000\u0000\u0080\u0082\u0003\u0010\b\u0000\u0081"+
		"\u0080\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0013\u0000\u0000\u0084"+
		"\u0085\u0005\u0019\u0000\u0000\u0085\u0089\u0005!\u0000\u0000\u0086\u0088"+
		"\u0003\u0002\u0001\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008b"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u000f\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008c\u0091\u0003\u0012\t\u0000\u008d\u008e\u0005"+
		"\u0018\u0000\u0000\u008e\u0090\u0003\u0012\t\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0011\u0001\u0000"+
		"\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u009b\u0003\u0014"+
		"\n\u0000\u0095\u009b\u0003\u0016\u000b\u0000\u0096\u009b\u0003\u0018\f"+
		"\u0000\u0097\u009b\u0003\u001a\r\u0000\u0098\u009b\u0003\u001c\u000e\u0000"+
		"\u0099\u009b\u0003\u001e\u000f\u0000\u009a\u0094\u0001\u0000\u0000\u0000"+
		"\u009a\u0095\u0001\u0000\u0000\u0000\u009a\u0096\u0001\u0000\u0000\u0000"+
		"\u009a\u0097\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000"+
		"\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u0013\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0005\u000f\u0000\u0000\u009d\u0015\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0005\u000f\u0000\u0000\u009f\u00a0\u0005\u001a\u0000\u0000"+
		"\u00a0\u00a1\u0003*\u0015\u0000\u00a1\u0017\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0005\u000f\u0000\u0000\u00a3\u00a4\u0005\u0019\u0000\u0000\u00a4"+
		"\u00a5\u0003 \u0010\u0000\u00a5\u0019\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0005\u000f\u0000\u0000\u00a7\u00a8\u0005\u0019\u0000\u0000\u00a8\u00a9"+
		"\u0003 \u0010\u0000\u00a9\u00aa\u0005\u001a\u0000\u0000\u00aa\u00ab\u0003"+
		"*\u0015\u0000\u00ab\u001b\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u001c"+
		"\u0000\u0000\u00ad\u00ae\u0005\u000f\u0000\u0000\u00ae\u001d\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0005\u001d\u0000\u0000\u00b0\u00b1\u0005\u000f"+
		"\u0000\u0000\u00b1\u001f\u0001\u0000\u0000\u0000\u00b2\u00b7\u0005\u000f"+
		"\u0000\u0000\u00b3\u00b4\u0005\u0011\u0000\u0000\u00b4\u00b6\u0005\u000f"+
		"\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8!\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0007\u0000\u0000\u0000\u00bb\u00bc\u0005\u001a\u0000"+
		"\u0000\u00bc\u00bd\u0003*\u0015\u0000\u00bd#\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0005\u0002\u0000\u0000\u00bf\u00c0\u0003*\u0015\u0000\u00c0\u00c1"+
		"\u0005\u0019\u0000\u0000\u00c1\u00c3\u0005!\u0000\u0000\u00c2\u00c4\u0003"+
		"\u0002\u0001\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c6%\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0003"+
		"\u0000\u0000\u00c8\u00c9\u0003*\u0015\u0000\u00c9\'\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0003*\u0015\u0000\u00cb)\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cf\u0003,\u0016\u0000\u00cd\u00ce\u0005\u001e\u0000\u0000\u00ce\u00d0"+
		"\u0003,\u0016\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d0+\u0001\u0000\u0000\u0000\u00d1\u00d6\u0003.\u0017"+
		"\u0000\u00d2\u00d3\u0005\u001b\u0000\u0000\u00d3\u00d5\u0003.\u0017\u0000"+
		"\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d7-\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9"+
		"\u00dd\u00036\u001b\u0000\u00da\u00dc\u00030\u0018\u0000\u00db\u00da\u0001"+
		"\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de/\u0001\u0000"+
		"\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0011"+
		"\u0000\u0000\u00e1\u00f9\u0005\u000f\u0000\u0000\u00e2\u00e3\u0005\u0014"+
		"\u0000\u0000\u00e3\u00e4\u0003*\u0015\u0000\u00e4\u00e5\u0005\u0015\u0000"+
		"\u0000\u00e5\u00f9\u0001\u0000\u0000\u0000\u00e6\u00ea\u0005\u0012\u0000"+
		"\u0000\u00e7\u00e9\u0005!\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00ef\u00032\u0019\u0000\u00ee"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f0\u00f2\u0005!\u0000\u0000\u00f1\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f9"+
		"\u0005\u0013\u0000\u0000\u00f7\u00f9\u0003>\u001f\u0000\u00f8\u00e0\u0001"+
		"\u0000\u0000\u0000\u00f8\u00e2\u0001\u0000\u0000\u0000\u00f8\u00e6\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f91\u0001\u0000"+
		"\u0000\u0000\u00fa\u010b\u00034\u001a\u0000\u00fb\u00fd\u0005!\u0000\u0000"+
		"\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000"+
		"\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000"+
		"\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000"+
		"\u0101\u0105\u0005\u0018\u0000\u0000\u0102\u0104\u0005!\u0000\u0000\u0103"+
		"\u0102\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105"+
		"\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106"+
		"\u0108\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108"+
		"\u010a\u00034\u001a\u0000\u0109\u00fe\u0001\u0000\u0000\u0000\u010a\u010d"+
		"\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0001\u0000\u0000\u0000\u010c3\u0001\u0000\u0000\u0000\u010d\u010b\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u0005\u000f\u0000\u0000\u010f\u0110\u0005"+
		"\u001a\u0000\u0000\u0110\u0113\u0003*\u0015\u0000\u0111\u0113\u0003*\u0015"+
		"\u0000\u0112\u010e\u0001\u0000\u0000\u0000\u0112\u0111\u0001\u0000\u0000"+
		"\u0000\u01135\u0001\u0000\u0000\u0000\u0114\u0123\u0005\u000f\u0000\u0000"+
		"\u0115\u0123\u0005\r\u0000\u0000\u0116\u0123\u0005\u000e\u0000\u0000\u0117"+
		"\u0123\u0005\u0004\u0000\u0000\u0118\u0123\u0005\n\u0000\u0000\u0119\u0123"+
		"\u0005\u000b\u0000\u0000\u011a\u0123\u0005\f\u0000\u0000\u011b\u0123\u0003"+
		"8\u001c\u0000\u011c\u0123\u0003:\u001d\u0000\u011d\u0123\u0003>\u001f"+
		"\u0000\u011e\u011f\u0005\u0012\u0000\u0000\u011f\u0120\u0003*\u0015\u0000"+
		"\u0120\u0121\u0005\u0013\u0000\u0000\u0121\u0123\u0001\u0000\u0000\u0000"+
		"\u0122\u0114\u0001\u0000\u0000\u0000\u0122\u0115\u0001\u0000\u0000\u0000"+
		"\u0122\u0116\u0001\u0000\u0000\u0000\u0122\u0117\u0001\u0000\u0000\u0000"+
		"\u0122\u0118\u0001\u0000\u0000\u0000\u0122\u0119\u0001\u0000\u0000\u0000"+
		"\u0122\u011a\u0001\u0000\u0000\u0000\u0122\u011b\u0001\u0000\u0000\u0000"+
		"\u0122\u011c\u0001\u0000\u0000\u0000\u0122\u011d\u0001\u0000\u0000\u0000"+
		"\u0122\u011e\u0001\u0000\u0000\u0000\u01237\u0001\u0000\u0000\u0000\u0124"+
		"\u0128\u0005\u0014\u0000\u0000\u0125\u0127\u0005!\u0000\u0000\u0126\u0125"+
		"\u0001\u0000\u0000\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128\u0126"+
		"\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u0148"+
		"\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012b\u013c"+
		"\u0003*\u0015\u0000\u012c\u012e\u0005!\u0000\u0000\u012d\u012c\u0001\u0000"+
		"\u0000\u0000\u012e\u0131\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0132\u0001\u0000"+
		"\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0132\u0136\u0005\u0018"+
		"\u0000\u0000\u0133\u0135\u0005!\u0000\u0000\u0134\u0133\u0001\u0000\u0000"+
		"\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000"+
		"\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0139\u0001\u0000\u0000"+
		"\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013b\u0003*\u0015\u0000"+
		"\u013a\u012f\u0001\u0000\u0000\u0000\u013b\u013e\u0001\u0000\u0000\u0000"+
		"\u013c\u013a\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000"+
		"\u013d\u0142\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000"+
		"\u013f\u0141\u0005!\u0000\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0141"+
		"\u0144\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142"+
		"\u0143\u0001\u0000\u0000\u0000\u0143\u0146\u0001\u0000\u0000\u0000\u0144"+
		"\u0142\u0001\u0000\u0000\u0000\u0145\u0147\u0005\u0018\u0000\u0000\u0146"+
		"\u0145\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147"+
		"\u0149\u0001\u0000\u0000\u0000\u0148\u012b\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u0001\u0000\u0000\u0000\u0149\u014d\u0001\u0000\u0000\u0000\u014a"+
		"\u014c\u0005!\u0000\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014c\u014f"+
		"\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014e"+
		"\u0001\u0000\u0000\u0000\u014e\u0150\u0001\u0000\u0000\u0000\u014f\u014d"+
		"\u0001\u0000\u0000\u0000\u0150\u0151\u0005\u0015\u0000\u0000\u01519\u0001"+
		"\u0000\u0000\u0000\u0152\u0156\u0005\u0016\u0000\u0000\u0153\u0155\u0005"+
		"!\u0000\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0155\u0158\u0001\u0000"+
		"\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000"+
		"\u0000\u0000\u0157\u0176\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000"+
		"\u0000\u0000\u0159\u016a\u0003<\u001e\u0000\u015a\u015c\u0005!\u0000\u0000"+
		"\u015b\u015a\u0001\u0000\u0000\u0000\u015c\u015f\u0001\u0000\u0000\u0000"+
		"\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000"+
		"\u015e\u0160\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000"+
		"\u0160\u0164\u0005\u0018\u0000\u0000\u0161\u0163\u0005!\u0000\u0000\u0162"+
		"\u0161\u0001\u0000\u0000\u0000\u0163\u0166\u0001\u0000\u0000\u0000\u0164"+
		"\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165"+
		"\u0167\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0167"+
		"\u0169\u0003<\u001e\u0000\u0168\u015d\u0001\u0000\u0000\u0000\u0169\u016c"+
		"\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a\u016b"+
		"\u0001\u0000\u0000\u0000\u016b\u0170\u0001\u0000\u0000\u0000\u016c\u016a"+
		"\u0001\u0000\u0000\u0000\u016d\u016f\u0005!\u0000\u0000\u016e\u016d\u0001"+
		"\u0000\u0000\u0000\u016f\u0172\u0001\u0000\u0000\u0000\u0170\u016e\u0001"+
		"\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0174\u0001"+
		"\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0173\u0175\u0005"+
		"\u0018\u0000\u0000\u0174\u0173\u0001\u0000\u0000\u0000\u0174\u0175\u0001"+
		"\u0000\u0000\u0000\u0175\u0177\u0001\u0000\u0000\u0000\u0176\u0159\u0001"+
		"\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u017b\u0001"+
		"\u0000\u0000\u0000\u0178\u017a\u0005!\u0000\u0000\u0179\u0178\u0001\u0000"+
		"\u0000\u0000\u017a\u017d\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000"+
		"\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017e\u0001\u0000"+
		"\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017e\u017f\u0005\u0017"+
		"\u0000\u0000\u017f;\u0001\u0000\u0000\u0000\u0180\u0181\u0007\u0001\u0000"+
		"\u0000\u0181\u0182\u0005\u0019\u0000\u0000\u0182\u0183\u0003*\u0015\u0000"+
		"\u0183=\u0001\u0000\u0000\u0000\u0184\u0185\u0005\u0012\u0000\u0000\u0185"+
		"\u0186\u0003*\u0015\u0000\u0186\u0187\u0005\u0006\u0000\u0000\u0187\u0188"+
		"\u0005\u000f\u0000\u0000\u0188\u0189\u0005\u0007\u0000\u0000\u0189\u018c"+
		"\u0003*\u0015\u0000\u018a\u018b\u0005\u0002\u0000\u0000\u018b\u018d\u0003"+
		"*\u0015\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000"+
		"\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u018f\u0005\u0013"+
		"\u0000\u0000\u018f?\u0001\u0000\u0000\u0000*EQY`it{\u0081\u0089\u0091"+
		"\u009a\u00b7\u00c5\u00cf\u00d6\u00dd\u00ea\u00ee\u00f3\u00f8\u00fe\u0105"+
		"\u010b\u0112\u0122\u0128\u012f\u0136\u013c\u0142\u0146\u0148\u014d\u0156"+
		"\u015d\u0164\u016a\u0170\u0174\u0176\u017b\u018c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}