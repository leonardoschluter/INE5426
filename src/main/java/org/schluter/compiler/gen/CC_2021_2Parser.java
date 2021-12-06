package org.schluter.compiler.gen;// Generated from /Users/x266483/Documents/projects/lexicalAnalyzer/compiler/src/main/antlr4/CC_2021_2.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CC_2021_2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, INT=2, FLOAT=3, STRING=4, BREAK=5, PRINT=6, READ=7, RETURN=8, IF=9, 
		ELSE=10, FOR=11, NEW=12, NULL=13, OPEN_PAR=14, CLOSE_PAR=15, OPEN_CHAVE=16, 
		CLOSE_CHAVE=17, SEMI_COLON=18, OPEN_COL=19, CLOSE_COL=20, ASSIGN=21, COLON=22, 
		LESS=23, GREATER=24, LESS_EQUAL=25, GREATER_EQUAL=26, EQUAL=27, DIFFERENT=28, 
		PLUS=29, SUBTR=30, MULT=31, DIV=32, REMINDER=33, Identifier=34, IntegerConstant=35, 
		FloatConstant=36, WhiteSpace=37, StringConstant=38, Invalid=39;
	public static final int
		RULE_program = 0, RULE_funcList = 1, RULE_funcDef = 2, RULE_paramList = 3, 
		RULE_statement = 4, RULE_varDecl = 5, RULE_atribStat = 6, RULE_funcCall = 7, 
		RULE_paramListCall = 8, RULE_printStat = 9, RULE_readStat = 10, RULE_returnStat = 11, 
		RULE_ifStat = 12, RULE_forState = 13, RULE_stateList = 14, RULE_allocExpression = 15, 
		RULE_expression = 16, RULE_numExpression = 17, RULE_term = 18, RULE_unaryExpression = 19, 
		RULE_factor = 20, RULE_lValue = 21, RULE_type = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "funcList", "funcDef", "paramList", "statement", "varDecl", 
			"atribStat", "funcCall", "paramListCall", "printStat", "readStat", "returnStat", 
			"ifStat", "forState", "stateList", "allocExpression", "expression", "numExpression", 
			"term", "unaryExpression", "factor", "lValue", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'int'", "'float'", "'string'", "'break'", "'print'", 
			"'read'", "'return'", "'if'", "'else'", "'for'", "'new'", "'null'", "'('", 
			"')'", "'{'", "'}'", "';'", "'['", "']'", "'='", "','", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEF", "INT", "FLOAT", "STRING", "BREAK", "PRINT", "READ", "RETURN", 
			"IF", "ELSE", "FOR", "NEW", "NULL", "OPEN_PAR", "CLOSE_PAR", "OPEN_CHAVE", 
			"CLOSE_CHAVE", "SEMI_COLON", "OPEN_COL", "CLOSE_COL", "ASSIGN", "COLON", 
			"LESS", "GREATER", "LESS_EQUAL", "GREATER_EQUAL", "EQUAL", "DIFFERENT", 
			"PLUS", "SUBTR", "MULT", "DIV", "REMINDER", "Identifier", "IntegerConstant", 
			"FloatConstant", "WhiteSpace", "StringConstant", "Invalid"
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
	public String getGrammarFileName() { return "CC_2021_2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CC_2021_2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FuncListContext funcList() {
			return getRuleContext(FuncListContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CC_2021_2Visitor ) return ((CC_2021_2Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case STRING:
			case BREAK:
			case PRINT:
			case READ:
			case RETURN:
			case IF:
			case FOR:
			case OPEN_CHAVE:
			case SEMI_COLON:
			case Identifier:
				{
				setState(46);
				statement();
				}
				break;
			case DEF:
				{
				setState(47);
				funcList();
				}
				break;
			case EOF:
				break;
			default:
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

	public static class FuncListContext extends ParserRuleContext {
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public FuncListContext funcList() {
			return getRuleContext(FuncListContext.class,0);
		}
		public FuncListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).enterFuncList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).exitFuncList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CC_2021_2Visitor ) return ((CC_2021_2Visitor<? extends T>)visitor).visitFuncList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncListContext funcList() throws RecognitionException {
		FuncListContext _localctx = new FuncListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcList);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				funcDef();
				setState(51);
				funcList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				funcDef();
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

	public static class FuncDefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(CC_2021_2Parser.DEF, 0); }
		public TerminalNode Identifier() { return getToken(CC_2021_2Parser.Identifier, 0); }
		public TerminalNode OPEN_PAR() { return getToken(CC_2021_2Parser.OPEN_PAR, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(CC_2021_2Parser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_CHAVE() { return getToken(CC_2021_2Parser.OPEN_CHAVE, 0); }
		public StateListContext stateList() {
			return getRuleContext(StateListContext.class,0);
		}
		public TerminalNode CLOSE_CHAVE() { return getToken(CC_2021_2Parser.CLOSE_CHAVE, 0); }
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CC_2021_2Visitor ) return ((CC_2021_2Visitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(DEF);
			setState(57);
			match(Identifier);
			setState(58);
			match(OPEN_PAR);
			setState(59);
			paramList();
			setState(60);
			match(CLOSE_PAR);
			setState(61);
			match(OPEN_CHAVE);
			setState(62);
			stateList();
			setState(63);
			match(CLOSE_CHAVE);
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

	public static class ParamListContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CC_2021_2Parser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(CC_2021_2Parser.COLON, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CC_2021_2Visitor ) return ((CC_2021_2Visitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_paramList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				{
				setState(65);
				type();
				setState(66);
				match(Identifier);
				setState(67);
				match(COLON);
				setState(68);
				paramList();
				}
				}
				break;
			case 2:
				{
				{
				setState(70);
				type();
				setState(71);
				match(Identifier);
				}
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SEMI_COLON() { return getToken(CC_2021_2Parser.SEMI_COLON, 0); }
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public AtribStatContext atribStat() {
			return getRuleContext(AtribStatContext.class,0);
		}
		public PrintStatContext printStat() {
			return getRuleContext(PrintStatContext.class,0);
		}
		public ReadStatContext readStat() {
			return getRuleContext(ReadStatContext.class,0);
		}
		public ReturnStatContext returnStat() {
			return getRuleContext(ReturnStatContext.class,0);
		}
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public ForStateContext forState() {
			return getRuleContext(ForStateContext.class,0);
		}
		public TerminalNode OPEN_CHAVE() { return getToken(CC_2021_2Parser.OPEN_CHAVE, 0); }
		public StateListContext stateList() {
			return getRuleContext(StateListContext.class,0);
		}
		public TerminalNode CLOSE_CHAVE() { return getToken(CC_2021_2Parser.CLOSE_CHAVE, 0); }
		public TerminalNode BREAK() { return getToken(CC_2021_2Parser.BREAK, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CC_2021_2Visitor ) return ((CC_2021_2Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case STRING:
				{
				{
				setState(75);
				varDecl();
				setState(76);
				match(SEMI_COLON);
				}
				}
				break;
			case Identifier:
				{
				{
				setState(78);
				atribStat();
				setState(79);
				match(SEMI_COLON);
				}
				}
				break;
			case PRINT:
				{
				{
				setState(81);
				printStat();
				setState(82);
				match(SEMI_COLON);
				}
				}
				break;
			case READ:
				{
				{
				setState(84);
				readStat();
				setState(85);
				match(SEMI_COLON);
				}
				}
				break;
			case RETURN:
				{
				{
				setState(87);
				returnStat();
				setState(88);
				match(SEMI_COLON);
				}
				}
				break;
			case IF:
				{
				{
				setState(90);
				ifStat();
				setState(91);
				match(SEMI_COLON);
				}
				}
				break;
			case FOR:
				{
				{
				setState(93);
				forState();
				setState(94);
				match(SEMI_COLON);
				}
				}
				break;
			case OPEN_CHAVE:
				{
				{
				setState(96);
				match(OPEN_CHAVE);
				setState(97);
				stateList();
				setState(98);
				match(CLOSE_CHAVE);
				}
				}
				break;
			case BREAK:
				{
				{
				setState(100);
				match(BREAK);
				setState(101);
				match(SEMI_COLON);
				}
				}
				break;
			case SEMI_COLON:
				{
				setState(102);
				match(SEMI_COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CC_2021_2Parser.Identifier, 0); }
		public List<TerminalNode> OPEN_COL() { return getTokens(CC_2021_2Parser.OPEN_COL); }
		public TerminalNode OPEN_COL(int i) {
			return getToken(CC_2021_2Parser.OPEN_COL, i);
		}
		public List<TerminalNode> IntegerConstant() { return getTokens(CC_2021_2Parser.IntegerConstant); }
		public TerminalNode IntegerConstant(int i) {
			return getToken(CC_2021_2Parser.IntegerConstant, i);
		}
		public List<TerminalNode> CLOSE_COL() { return getTokens(CC_2021_2Parser.CLOSE_COL); }
		public TerminalNode CLOSE_COL(int i) {
			return getToken(CC_2021_2Parser.CLOSE_COL, i);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CC_2021_2Visitor ) return ((CC_2021_2Visitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			type();
			setState(106);
			match(Identifier);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_COL) {
				{
				{
				setState(107);
				match(OPEN_COL);
				setState(108);
				match(IntegerConstant);
				setState(109);
				match(CLOSE_COL);
				}
				}
				setState(114);
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

	public static class AtribStatContext extends ParserRuleContext {
		public LValueContext lValue() {
			return getRuleContext(LValueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CC_2021_2Parser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AllocExpressionContext allocExpression() {
			return getRuleContext(AllocExpressionContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public AtribStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).enterAtribStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).exitAtribStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CC_2021_2Visitor ) return ((CC_2021_2Visitor<? extends T>)visitor).visitAtribStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribStatContext atribStat() throws RecognitionException {
		AtribStatContext _localctx = new AtribStatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atribStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			lValue();
			setState(116);
			match(ASSIGN);
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(117);
				expression();
				}
				break;
			case 2:
				{
				setState(118);
				allocExpression();
				}
				break;
			case 3:
				{
				setState(119);
				funcCall();
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

	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CC_2021_2Parser.Identifier, 0); }
		public TerminalNode OPEN_PAR() { return getToken(CC_2021_2Parser.OPEN_PAR, 0); }
		public ParamListCallContext paramListCall() {
			return getRuleContext(ParamListCallContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(CC_2021_2Parser.CLOSE_PAR, 0); }
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CC_2021_2Visitor ) return ((CC_2021_2Visitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(Identifier);
			setState(123);
			match(OPEN_PAR);
			setState(124);
			paramListCall();
			setState(125);
			match(CLOSE_PAR);
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

	public static class ParamListCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CC_2021_2Parser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(CC_2021_2Parser.COLON, 0); }
		public ParamListCallContext paramListCall() {
			return getRuleContext(ParamListCallContext.class,0);
		}
		public ParamListCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramListCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).enterParamListCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).exitParamListCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CC_2021_2Visitor ) return ((CC_2021_2Visitor<? extends T>)visitor).visitParamListCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListCallContext paramListCall() throws RecognitionException {
		ParamListCallContext _localctx = new ParamListCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_paramListCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(127);
				match(Identifier);
				setState(128);
				match(COLON);
				setState(129);
				paramListCall();
				}
				break;
			case 2:
				{
				setState(130);
				match(Identifier);
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

	public static class PrintStatContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(CC_2021_2Parser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).enterPrintStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).exitPrintStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CC_2021_2Visitor ) return ((CC_2021_2Visitor<? extends T>)visitor).visitPrintStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatContext printStat() throws RecognitionException {
		PrintStatContext _localctx = new PrintStatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(PRINT);
			setState(134);
			expression();
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

	public static class ReadStatContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(CC_2021_2Parser.READ, 0); }
		public LValueContext lValue() {
			return getRuleContext(LValueContext.class,0);
		}
		public ReadStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).enterReadStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).exitReadStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CC_2021_2Visitor ) return ((CC_2021_2Visitor<? extends T>)visitor).visitReadStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStatContext readStat() throws RecognitionException {
		ReadStatContext _localctx = new ReadStatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_readStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(READ);
			setState(137);
			lValue();
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

	public static class ReturnStatContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CC_2021_2Parser.RETURN, 0); }
		public ReturnStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).enterReturnStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).exitReturnStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CC_2021_2Visitor ) return ((CC_2021_2Visitor<? extends T>)visitor).visitReturnStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatContext returnStat() throws RecognitionException {
		ReturnStatContext _localctx = new ReturnStatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_returnStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(RETURN);
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

	public static class IfStatContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CC_2021_2Parser.IF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(CC_2021_2Parser.OPEN_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(CC_2021_2Parser.CLOSE_PAR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CC_2021_2Parser.ELSE, 0); }
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CC_2021_2Visitor ) return ((CC_2021_2Visitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(IF);
			setState(142);
			match(OPEN_PAR);
			setState(143);
			expression();
			setState(144);
			match(CLOSE_PAR);
			setState(145);
			statement();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(146);
				match(ELSE);
				setState(147);
				statement();
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

	public static class ForStateContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CC_2021_2Parser.FOR, 0); }
		public TerminalNode OPEN_PAR() { return getToken(CC_2021_2Parser.OPEN_PAR, 0); }
		public List<AtribStatContext> atribStat() {
			return getRuleContexts(AtribStatContext.class);
		}
		public AtribStatContext atribStat(int i) {
			return getRuleContext(AtribStatContext.class,i);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(CC_2021_2Parser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(CC_2021_2Parser.SEMI_COLON, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(CC_2021_2Parser.CLOSE_PAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).enterForState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).exitForState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CC_2021_2Visitor ) return ((CC_2021_2Visitor<? extends T>)visitor).visitForState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStateContext forState() throws RecognitionException {
		ForStateContext _localctx = new ForStateContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(FOR);
			setState(151);
			match(OPEN_PAR);
			setState(152);
			atribStat();
			setState(153);
			match(SEMI_COLON);
			setState(154);
			expression();
			setState(155);
			match(SEMI_COLON);
			setState(156);
			atribStat();
			setState(157);
			match(CLOSE_PAR);
			setState(158);
			statement();
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

	public static class StateListContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StateListContext stateList() {
			return getRuleContext(StateListContext.class,0);
		}
		public StateListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).enterStateList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).exitStateList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CC_2021_2Visitor ) return ((CC_2021_2Visitor<? extends T>)visitor).visitStateList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateListContext stateList() throws RecognitionException {
		StateListContext _localctx = new StateListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stateList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			statement();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BREAK) | (1L << PRINT) | (1L << READ) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << OPEN_CHAVE) | (1L << SEMI_COLON) | (1L << Identifier))) != 0)) {
				{
				setState(161);
				stateList();
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

	public static class AllocExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(CC_2021_2Parser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> OPEN_COL() { return getTokens(CC_2021_2Parser.OPEN_COL); }
		public TerminalNode OPEN_COL(int i) {
			return getToken(CC_2021_2Parser.OPEN_COL, i);
		}
		public List<TerminalNode> IntegerConstant() { return getTokens(CC_2021_2Parser.IntegerConstant); }
		public TerminalNode IntegerConstant(int i) {
			return getToken(CC_2021_2Parser.IntegerConstant, i);
		}
		public List<TerminalNode> CLOSE_COL() { return getTokens(CC_2021_2Parser.CLOSE_COL); }
		public TerminalNode CLOSE_COL(int i) {
			return getToken(CC_2021_2Parser.CLOSE_COL, i);
		}
		public AllocExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).enterAllocExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).exitAllocExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CC_2021_2Visitor ) return ((CC_2021_2Visitor<? extends T>)visitor).visitAllocExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllocExpressionContext allocExpression() throws RecognitionException {
		AllocExpressionContext _localctx = new AllocExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_allocExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(NEW);
			setState(165);
			type();
			setState(169); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(166);
				match(OPEN_COL);
				setState(167);
				match(IntegerConstant);
				setState(168);
				match(CLOSE_COL);
				}
				}
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN_COL );
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<NumExpressionContext> numExpression() {
			return getRuleContexts(NumExpressionContext.class);
		}
		public NumExpressionContext numExpression(int i) {
			return getRuleContext(NumExpressionContext.class,i);
		}
		public TerminalNode LESS() { return getToken(CC_2021_2Parser.LESS, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(CC_2021_2Parser.LESS_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(CC_2021_2Parser.EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(CC_2021_2Parser.GREATER, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(CC_2021_2Parser.GREATER_EQUAL, 0); }
		public TerminalNode DIFFERENT() { return getToken(CC_2021_2Parser.DIFFERENT, 0); }
		public TerminalNode StringConstant() { return getToken(CC_2021_2Parser.StringConstant, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CC_2021_2Visitor ) return ((CC_2021_2Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression);
		int _la;
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(173);
				numExpression();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << GREATER) | (1L << LESS_EQUAL) | (1L << GREATER_EQUAL) | (1L << EQUAL) | (1L << DIFFERENT))) != 0)) {
					{
					setState(174);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << GREATER) | (1L << LESS_EQUAL) | (1L << GREATER_EQUAL) | (1L << EQUAL) | (1L << DIFFERENT))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(175);
					numExpression();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(StringConstant);
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

	public static class NumExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CC_2021_2Parser.PLUS, 0); }
		public TerminalNode SUBTR() { return getToken(CC_2021_2Parser.SUBTR, 0); }
		public NumExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).enterNumExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).exitNumExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CC_2021_2Visitor ) return ((CC_2021_2Visitor<? extends T>)visitor).visitNumExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumExpressionContext numExpression() throws RecognitionException {
		NumExpressionContext _localctx = new NumExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_numExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			term();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==SUBTR) {
				{
				setState(182);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==SUBTR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(183);
				term();
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

	public static class TermContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(CC_2021_2Parser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(CC_2021_2Parser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(CC_2021_2Parser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(CC_2021_2Parser.DIV, i);
		}
		public List<TerminalNode> REMINDER() { return getTokens(CC_2021_2Parser.REMINDER); }
		public TerminalNode REMINDER(int i) {
			return getToken(CC_2021_2Parser.REMINDER, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CC_2021_2Visitor ) return ((CC_2021_2Visitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			unaryExpression();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << REMINDER))) != 0)) {
				{
				{
				setState(187);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << REMINDER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(188);
				unaryExpression();
				}
				}
				setState(193);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CC_2021_2Parser.PLUS, 0); }
		public TerminalNode SUBTR() { return getToken(CC_2021_2Parser.SUBTR, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CC_2021_2Visitor ) return ((CC_2021_2Visitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==SUBTR) {
				{
				setState(194);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==SUBTR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(197);
			factor();
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode IntegerConstant() { return getToken(CC_2021_2Parser.IntegerConstant, 0); }
		public TerminalNode FloatConstant() { return getToken(CC_2021_2Parser.FloatConstant, 0); }
		public TerminalNode StringConstant() { return getToken(CC_2021_2Parser.StringConstant, 0); }
		public TerminalNode NULL() { return getToken(CC_2021_2Parser.NULL, 0); }
		public LValueContext lValue() {
			return getRuleContext(LValueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(CC_2021_2Parser.OPEN_PAR, 0); }
		public NumExpressionContext numExpression() {
			return getRuleContext(NumExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(CC_2021_2Parser.CLOSE_PAR, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CC_2021_2Visitor ) return ((CC_2021_2Visitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerConstant:
				{
				setState(199);
				match(IntegerConstant);
				}
				break;
			case FloatConstant:
				{
				setState(200);
				match(FloatConstant);
				}
				break;
			case StringConstant:
				{
				setState(201);
				match(StringConstant);
				}
				break;
			case NULL:
				{
				setState(202);
				match(NULL);
				}
				break;
			case Identifier:
				{
				setState(203);
				lValue();
				}
				break;
			case OPEN_PAR:
				{
				setState(204);
				match(OPEN_PAR);
				setState(205);
				numExpression();
				setState(206);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LValueContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CC_2021_2Parser.Identifier, 0); }
		public List<TerminalNode> OPEN_COL() { return getTokens(CC_2021_2Parser.OPEN_COL); }
		public TerminalNode OPEN_COL(int i) {
			return getToken(CC_2021_2Parser.OPEN_COL, i);
		}
		public List<NumExpressionContext> numExpression() {
			return getRuleContexts(NumExpressionContext.class);
		}
		public NumExpressionContext numExpression(int i) {
			return getRuleContext(NumExpressionContext.class,i);
		}
		public List<TerminalNode> CLOSE_COL() { return getTokens(CC_2021_2Parser.CLOSE_COL); }
		public TerminalNode CLOSE_COL(int i) {
			return getToken(CC_2021_2Parser.CLOSE_COL, i);
		}
		public LValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).enterLValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).exitLValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CC_2021_2Visitor ) return ((CC_2021_2Visitor<? extends T>)visitor).visitLValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LValueContext lValue() throws RecognitionException {
		LValueContext _localctx = new LValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(Identifier);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_COL) {
				{
				{
				setState(211);
				match(OPEN_COL);
				setState(212);
				numExpression();
				setState(213);
				match(CLOSE_COL);
				}
				}
				setState(219);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CC_2021_2Parser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(CC_2021_2Parser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(CC_2021_2Parser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CC_2021_2Listener ) ((CC_2021_2Listener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CC_2021_2Visitor ) return ((CC_2021_2Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00e1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\5"+
		"\2\63\n\2\3\3\3\3\3\3\3\3\5\39\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5L\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6j\n\6\3\7\3\7\3\7\3\7\3\7\7\7q\n\7\f\7\16\7t\13\7\3"+
		"\b\3\b\3\b\3\b\3\b\5\b{\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u0086"+
		"\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0097\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\5\20\u00a5\n\20\3\21\3\21\3\21\3\21\3\21\6\21\u00ac\n\21\r"+
		"\21\16\21\u00ad\3\22\3\22\3\22\5\22\u00b3\n\22\3\22\5\22\u00b6\n\22\3"+
		"\23\3\23\3\23\5\23\u00bb\n\23\3\24\3\24\3\24\7\24\u00c0\n\24\f\24\16\24"+
		"\u00c3\13\24\3\25\5\25\u00c6\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u00d3\n\26\3\27\3\27\3\27\3\27\3\27\7\27\u00da"+
		"\n\27\f\27\16\27\u00dd\13\27\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\2\6\3\2\31\36\3\2\37 \3\2!#\3\2\4\6\2\u00ea"+
		"\2\62\3\2\2\2\48\3\2\2\2\6:\3\2\2\2\bK\3\2\2\2\ni\3\2\2\2\fk\3\2\2\2\16"+
		"u\3\2\2\2\20|\3\2\2\2\22\u0085\3\2\2\2\24\u0087\3\2\2\2\26\u008a\3\2\2"+
		"\2\30\u008d\3\2\2\2\32\u008f\3\2\2\2\34\u0098\3\2\2\2\36\u00a2\3\2\2\2"+
		" \u00a6\3\2\2\2\"\u00b5\3\2\2\2$\u00b7\3\2\2\2&\u00bc\3\2\2\2(\u00c5\3"+
		"\2\2\2*\u00d2\3\2\2\2,\u00d4\3\2\2\2.\u00de\3\2\2\2\60\63\5\n\6\2\61\63"+
		"\5\4\3\2\62\60\3\2\2\2\62\61\3\2\2\2\62\63\3\2\2\2\63\3\3\2\2\2\64\65"+
		"\5\6\4\2\65\66\5\4\3\2\669\3\2\2\2\679\5\6\4\28\64\3\2\2\28\67\3\2\2\2"+
		"9\5\3\2\2\2:;\7\3\2\2;<\7$\2\2<=\7\20\2\2=>\5\b\5\2>?\7\21\2\2?@\7\22"+
		"\2\2@A\5\36\20\2AB\7\23\2\2B\7\3\2\2\2CD\5.\30\2DE\7$\2\2EF\7\30\2\2F"+
		"G\5\b\5\2GL\3\2\2\2HI\5.\30\2IJ\7$\2\2JL\3\2\2\2KC\3\2\2\2KH\3\2\2\2K"+
		"L\3\2\2\2L\t\3\2\2\2MN\5\f\7\2NO\7\24\2\2Oj\3\2\2\2PQ\5\16\b\2QR\7\24"+
		"\2\2Rj\3\2\2\2ST\5\24\13\2TU\7\24\2\2Uj\3\2\2\2VW\5\26\f\2WX\7\24\2\2"+
		"Xj\3\2\2\2YZ\5\30\r\2Z[\7\24\2\2[j\3\2\2\2\\]\5\32\16\2]^\7\24\2\2^j\3"+
		"\2\2\2_`\5\34\17\2`a\7\24\2\2aj\3\2\2\2bc\7\22\2\2cd\5\36\20\2de\7\23"+
		"\2\2ej\3\2\2\2fg\7\7\2\2gj\7\24\2\2hj\7\24\2\2iM\3\2\2\2iP\3\2\2\2iS\3"+
		"\2\2\2iV\3\2\2\2iY\3\2\2\2i\\\3\2\2\2i_\3\2\2\2ib\3\2\2\2if\3\2\2\2ih"+
		"\3\2\2\2j\13\3\2\2\2kl\5.\30\2lr\7$\2\2mn\7\25\2\2no\7%\2\2oq\7\26\2\2"+
		"pm\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\r\3\2\2\2tr\3\2\2\2uv\5,\27"+
		"\2vz\7\27\2\2w{\5\"\22\2x{\5 \21\2y{\5\20\t\2zw\3\2\2\2zx\3\2\2\2zy\3"+
		"\2\2\2{\17\3\2\2\2|}\7$\2\2}~\7\20\2\2~\177\5\22\n\2\177\u0080\7\21\2"+
		"\2\u0080\21\3\2\2\2\u0081\u0082\7$\2\2\u0082\u0083\7\30\2\2\u0083\u0086"+
		"\5\22\n\2\u0084\u0086\7$\2\2\u0085\u0081\3\2\2\2\u0085\u0084\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\23\3\2\2\2\u0087\u0088\7\b\2\2\u0088\u0089\5\"\22"+
		"\2\u0089\25\3\2\2\2\u008a\u008b\7\t\2\2\u008b\u008c\5,\27\2\u008c\27\3"+
		"\2\2\2\u008d\u008e\7\n\2\2\u008e\31\3\2\2\2\u008f\u0090\7\13\2\2\u0090"+
		"\u0091\7\20\2\2\u0091\u0092\5\"\22\2\u0092\u0093\7\21\2\2\u0093\u0096"+
		"\5\n\6\2\u0094\u0095\7\f\2\2\u0095\u0097\5\n\6\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\33\3\2\2\2\u0098\u0099\7\r\2\2\u0099\u009a\7\20\2"+
		"\2\u009a\u009b\5\16\b\2\u009b\u009c\7\24\2\2\u009c\u009d\5\"\22\2\u009d"+
		"\u009e\7\24\2\2\u009e\u009f\5\16\b\2\u009f\u00a0\7\21\2\2\u00a0\u00a1"+
		"\5\n\6\2\u00a1\35\3\2\2\2\u00a2\u00a4\5\n\6\2\u00a3\u00a5\5\36\20\2\u00a4"+
		"\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\37\3\2\2\2\u00a6\u00a7\7\16\2"+
		"\2\u00a7\u00ab\5.\30\2\u00a8\u00a9\7\25\2\2\u00a9\u00aa\7%\2\2\u00aa\u00ac"+
		"\7\26\2\2\u00ab\u00a8\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2"+
		"\u00ad\u00ae\3\2\2\2\u00ae!\3\2\2\2\u00af\u00b2\5$\23\2\u00b0\u00b1\t"+
		"\2\2\2\u00b1\u00b3\5$\23\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b6\3\2\2\2\u00b4\u00b6\7(\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b4\3\2"+
		"\2\2\u00b6#\3\2\2\2\u00b7\u00ba\5&\24\2\u00b8\u00b9\t\3\2\2\u00b9\u00bb"+
		"\5&\24\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb%\3\2\2\2\u00bc"+
		"\u00c1\5(\25\2\u00bd\u00be\t\4\2\2\u00be\u00c0\5(\25\2\u00bf\u00bd\3\2"+
		"\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\'\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\t\3\2\2\u00c5\u00c4\3\2\2\2"+
		"\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\5*\26\2\u00c8)\3"+
		"\2\2\2\u00c9\u00d3\7%\2\2\u00ca\u00d3\7&\2\2\u00cb\u00d3\7(\2\2\u00cc"+
		"\u00d3\7\17\2\2\u00cd\u00d3\5,\27\2\u00ce\u00cf\7\20\2\2\u00cf\u00d0\5"+
		"$\23\2\u00d0\u00d1\7\21\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00c9\3\2\2\2\u00d2"+
		"\u00ca\3\2\2\2\u00d2\u00cb\3\2\2\2\u00d2\u00cc\3\2\2\2\u00d2\u00cd\3\2"+
		"\2\2\u00d2\u00ce\3\2\2\2\u00d3+\3\2\2\2\u00d4\u00db\7$\2\2\u00d5\u00d6"+
		"\7\25\2\2\u00d6\u00d7\5$\23\2\u00d7\u00d8\7\26\2\2\u00d8\u00da\3\2\2\2"+
		"\u00d9\u00d5\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc-\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\t\5\2\2\u00df"+
		"/\3\2\2\2\23\628Kirz\u0085\u0096\u00a4\u00ad\u00b2\u00b5\u00ba\u00c1\u00c5"+
		"\u00d2\u00db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}