// Generated from langnt/Langnt.g4 by ANTLR 4.5

   package langnt;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangntParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Open=1, Close=2, Keb=3, Return=4, If=5, Else=6, ElseIf=7, Show=8, ShowL=9, 
		EachLoop=10, Loop=11, Func=12, Input=13, Assert=14, Size=15, In=16, Empty=17, 
		Or=18, And=19, Equals=20, NEquals=21, GTEquals=22, LTEquals=23, Pow=24, 
		Excl=25, GT=26, LT=27, Add=28, Subtract=29, Multiply=30, Divide=31, Modulus=32, 
		OBracket=33, CBracket=34, OParen=35, CParen=36, SColon=37, Assign=38, 
		Comma=39, QMark=40, Colon=41, Bool=42, Number=43, Identifier=44, String=45, 
		Comment=46, Space=47;
	public static final int
		RULE_parse = 0, RULE_block = 1, RULE_statement = 2, RULE_assignment = 3, 
		RULE_reAssignment = 4, RULE_functionCall = 5, RULE_completeIfStatement = 6, 
		RULE_ifStatement = 7, RULE_elseIfStatement = 8, RULE_elseStatement = 9, 
		RULE_functionDeclaration = 10, RULE_eachLoopStatement = 11, RULE_loopStatement = 12, 
		RULE_argumentList = 13, RULE_expressionList = 14, RULE_expression = 15, 
		RULE_list = 16, RULE_indexes = 17, RULE_argument = 18;
	public static final String[] ruleNames = {
		"parse", "block", "statement", "assignment", "reAssignment", "functionCall", 
		"completeIfStatement", "ifStatement", "elseIfStatement", "elseStatement", 
		"functionDeclaration", "eachLoopStatement", "loopStatement", "argumentList", 
		"expressionList", "expression", "list", "indexes", "argument"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'keb'", "'_ret'", "'_if'", "'_el'", "'_elif'", "'show'", 
		"'showl'", "'_each'", "'_loop'", "'_func'", "'input'", "'assert'", "'size'", 
		"'in'", "'empty'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'^'", 
		"'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'['", "']'", 
		"'('", "')'", "';'", "'='", "','", "'?'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Open", "Close", "Keb", "Return", "If", "Else", "ElseIf", "Show", 
		"ShowL", "EachLoop", "Loop", "Func", "Input", "Assert", "Size", "In", 
		"Empty", "Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", "Pow", 
		"Excl", "GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", 
		"OBracket", "CBracket", "OParen", "CParen", "SColon", "Assign", "Comma", 
		"QMark", "Colon", "Bool", "Number", "Identifier", "String", "Comment", 
		"Space"
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
	public String getGrammarFileName() { return "Langnt.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangntParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LangntParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			block();
			setState(39);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public TerminalNode Return() { return getToken(LangntParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Keb) | (1L << If) | (1L << Show) | (1L << ShowL) | (1L << Loop) | (1L << Func) | (1L << Assert) | (1L << Size) | (1L << Identifier))) != 0)) {
				{
				setState(43);
				switch (_input.LA(1)) {
				case Keb:
				case If:
				case Show:
				case ShowL:
				case Loop:
				case Assert:
				case Size:
				case Identifier:
					{
					setState(41);
					statement();
					}
					break;
				case Func:
					{
					setState(42);
					functionDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			_la = _input.LA(1);
			if (_la==Return) {
				{
				setState(48);
				match(Return);
				setState(49);
				expression(0);
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

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ReAssignmentContext reAssignment() {
			return getRuleContext(ReAssignmentContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public CompleteIfStatementContext completeIfStatement() {
			return getRuleContext(CompleteIfStatementContext.class,0);
		}
		public EachLoopStatementContext eachLoopStatement() {
			return getRuleContext(EachLoopStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(58);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				reAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				completeIfStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				eachLoopStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				loopStatement();
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode Keb() { return getToken(LangntParser.Keb, 0); }
		public TerminalNode Identifier() { return getToken(LangntParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		int _la;
		try {
			setState(72);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(Keb);
				setState(61);
				match(Identifier);
				setState(63);
				_la = _input.LA(1);
				if (_la==OBracket) {
					{
					setState(62);
					indexes();
					}
				}

				setState(65);
				match(Colon);
				setState(66);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(Keb);
				setState(68);
				match(Identifier);
				setState(70);
				_la = _input.LA(1);
				if (_la==OBracket) {
					{
					setState(69);
					indexes();
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

	public static class ReAssignmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(LangntParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public ReAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterReAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitReAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitReAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReAssignmentContext reAssignment() throws RecognitionException {
		ReAssignmentContext _localctx = new ReAssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_reAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(Identifier);
			setState(76);
			_la = _input.LA(1);
			if (_la==OBracket) {
				{
				setState(75);
				indexes();
				}
			}

			setState(78);
			match(Colon);
			setState(79);
			expression(0);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssertFunctionCallContext extends FunctionCallContext {
		public TerminalNode Assert() { return getToken(LangntParser.Assert, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssertFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterAssertFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitAssertFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitAssertFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SizeFunctionCallContext extends FunctionCallContext {
		public TerminalNode Size() { return getToken(LangntParser.Size, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SizeFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterSizeFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitSizeFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitSizeFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionCallContext extends FunctionCallContext {
		public TerminalNode Show() { return getToken(LangntParser.Show, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ShowFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterShowFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitShowFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitShowFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierFunctionCallContext extends FunctionCallContext {
		public TerminalNode Identifier() { return getToken(LangntParser.Identifier, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public IdentifierFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterIdentifierFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitIdentifierFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitIdentifierFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowLineFunctionCallContext extends FunctionCallContext {
		public TerminalNode ShowL() { return getToken(LangntParser.ShowL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ShowLineFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterShowLineFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitShowLineFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitShowLineFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionCall);
		int _la;
		try {
			setState(108);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new IdentifierFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(Identifier);
				setState(82);
				match(OParen);
				setState(84);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Show) | (1L << ShowL) | (1L << Input) | (1L << Assert) | (1L << Size) | (1L << Empty) | (1L << Excl) | (1L << Subtract) | (1L << OBracket) | (1L << OParen) | (1L << Bool) | (1L << Number) | (1L << Identifier) | (1L << String))) != 0)) {
					{
					setState(83);
					expressionList();
					}
				}

				setState(86);
				match(CParen);
				}
				break;
			case Show:
				_localctx = new ShowFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(Show);
				setState(88);
				match(OParen);
				setState(89);
				expression(0);
				setState(90);
				match(CParen);
				}
				break;
			case ShowL:
				_localctx = new ShowLineFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(ShowL);
				setState(93);
				match(OParen);
				setState(95);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Show) | (1L << ShowL) | (1L << Input) | (1L << Assert) | (1L << Size) | (1L << Empty) | (1L << Excl) | (1L << Subtract) | (1L << OBracket) | (1L << OParen) | (1L << Bool) | (1L << Number) | (1L << Identifier) | (1L << String))) != 0)) {
					{
					setState(94);
					expression(0);
					}
				}

				setState(97);
				match(CParen);
				}
				break;
			case Assert:
				_localctx = new AssertFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				match(Assert);
				setState(99);
				match(OParen);
				setState(100);
				expression(0);
				setState(101);
				match(CParen);
				}
				break;
			case Size:
				_localctx = new SizeFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				match(Size);
				setState(104);
				match(OParen);
				setState(105);
				expression(0);
				setState(106);
				match(CParen);
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

	public static class CompleteIfStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public TerminalNode Close() { return getToken(LangntParser.Close, 0); }
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public CompleteIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_completeIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterCompleteIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitCompleteIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitCompleteIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompleteIfStatementContext completeIfStatement() throws RecognitionException {
		CompleteIfStatementContext _localctx = new CompleteIfStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_completeIfStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			ifStatement();
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111);
					elseIfStatement();
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(118);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(117);
				elseStatement();
				}
				break;
			}
			setState(120);
			match(Close);
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(LangntParser.If, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Open() { return getToken(LangntParser.Open, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(If);
			setState(123);
			match(OParen);
			setState(124);
			expression(0);
			setState(125);
			match(CParen);
			setState(126);
			match(Open);
			setState(127);
			block();
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

	public static class ElseIfStatementContext extends ParserRuleContext {
		public TerminalNode Close() { return getToken(LangntParser.Close, 0); }
		public TerminalNode ElseIf() { return getToken(LangntParser.ElseIf, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Open() { return getToken(LangntParser.Open, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitElseIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(Close);
			setState(130);
			match(ElseIf);
			setState(131);
			match(OParen);
			setState(132);
			expression(0);
			setState(133);
			match(CParen);
			setState(134);
			match(Open);
			setState(135);
			block();
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

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode Close() { return getToken(LangntParser.Close, 0); }
		public TerminalNode Else() { return getToken(LangntParser.Else, 0); }
		public TerminalNode Open() { return getToken(LangntParser.Open, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(Close);
			setState(138);
			match(Else);
			setState(139);
			match(Open);
			setState(140);
			block();
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Func() { return getToken(LangntParser.Func, 0); }
		public TerminalNode Identifier() { return getToken(LangntParser.Identifier, 0); }
		public TerminalNode Open() { return getToken(LangntParser.Open, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Close() { return getToken(LangntParser.Close, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(Func);
			setState(143);
			match(Identifier);
			setState(144);
			match(OParen);
			setState(146);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(145);
				argumentList();
				}
			}

			setState(148);
			match(CParen);
			setState(149);
			match(Open);
			setState(150);
			block();
			setState(151);
			match(Close);
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

	public static class EachLoopStatementContext extends ParserRuleContext {
		public TerminalNode Loop() { return getToken(LangntParser.Loop, 0); }
		public TerminalNode Identifier() { return getToken(LangntParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(LangntParser.Colon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Open() { return getToken(LangntParser.Open, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Close() { return getToken(LangntParser.Close, 0); }
		public EachLoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eachLoopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterEachLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitEachLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitEachLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EachLoopStatementContext eachLoopStatement() throws RecognitionException {
		EachLoopStatementContext _localctx = new EachLoopStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_eachLoopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(Loop);
			setState(154);
			match(OParen);
			setState(155);
			match(Identifier);
			setState(156);
			match(Colon);
			setState(157);
			expression(0);
			setState(158);
			match(CParen);
			setState(159);
			match(Open);
			setState(160);
			block();
			setState(161);
			match(Close);
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

	public static class LoopStatementContext extends ParserRuleContext {
		public TerminalNode Loop() { return getToken(LangntParser.Loop, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Open() { return getToken(LangntParser.Open, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Close() { return getToken(LangntParser.Close, 0); }
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_loopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(Loop);
			setState(164);
			match(OParen);
			setState(165);
			expression(0);
			setState(166);
			match(CParen);
			setState(167);
			match(Open);
			setState(168);
			block();
			setState(169);
			match(Close);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			argument();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(172);
				match(Comma);
				setState(173);
				argument();
				}
				}
				setState(178);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			expression(0);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(180);
				match(Comma);
				setState(181);
				expression(0);
				}
				}
				setState(186);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GtExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GtExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterGtExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitGtExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitGtExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberExpressionContext extends ExpressionContext {
		public TerminalNode Number() { return getToken(LangntParser.Number, 0); }
		public NumberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitNumberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(LangntParser.Identifier, 0); }
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModulusExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ModulusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterModulusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitModulusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitModulusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplyExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultiplyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterMultiplyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitMultiplyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitMultiplyExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GtEqExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GtEqExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterGtEqExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitGtEqExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitGtEqExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringExpressionContext extends ExpressionContext {
		public TerminalNode String() { return getToken(LangntParser.String, 0); }
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public ExpressionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterExpressionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitExpressionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitExpressionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListExpressionContext extends ExpressionContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public ListExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterListExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitListExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitListExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtEqExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LtEqExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterLtEqExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitLtEqExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitLtEqExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LtExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterLtExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitLtExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitLtExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExpressionContext extends ExpressionContext {
		public TerminalNode Bool() { return getToken(LangntParser.Bool, 0); }
		public BoolExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitBoolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotEqExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterNotEqExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitNotEqExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitNotEqExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivideExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DivideExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterDivideExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitDivideExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitDivideExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterUnaryMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitUnaryMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitUnaryMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PowerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterPowerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitPowerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitPowerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyExpressionContext extends ExpressionContext {
		public TerminalNode Empty() { return getToken(LangntParser.Empty, 0); }
		public EmptyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterEmptyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitEmptyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitEmptyExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterEqExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitEqExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitEqExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode In() { return getToken(LangntParser.In, 0); }
		public InExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitInExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitInExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SubtractExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterSubtractExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitSubtractExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitSubtractExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TernaryExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TernaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InputExpressionContext extends ExpressionContext {
		public TerminalNode Input() { return getToken(LangntParser.Input, 0); }
		public TerminalNode String() { return getToken(LangntParser.String, 0); }
		public InputExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterInputExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitInputExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitInputExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(188);
				match(Subtract);
				setState(189);
				expression(27);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(Excl);
				setState(191);
				expression(26);
				}
				break;
			case 3:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(Number);
				}
				break;
			case 4:
				{
				_localctx = new BoolExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				match(Bool);
				}
				break;
			case 5:
				{
				_localctx = new EmptyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				match(Empty);
				}
				break;
			case 6:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				functionCall();
				setState(197);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(196);
					indexes();
					}
					break;
				}
				}
				break;
			case 7:
				{
				_localctx = new ListExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				list();
				setState(201);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(200);
					indexes();
					}
					break;
				}
				}
				break;
			case 8:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				match(Identifier);
				setState(205);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(204);
					indexes();
					}
					break;
				}
				}
				break;
			case 9:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				match(String);
				setState(209);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(208);
					indexes();
					}
					break;
				}
				}
				break;
			case 10:
				{
				_localctx = new ExpressionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				match(OParen);
				setState(212);
				expression(0);
				setState(213);
				match(CParen);
				setState(215);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(214);
					indexes();
					}
					break;
				}
				}
				break;
			case 11:
				{
				_localctx = new InputExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(Input);
				setState(218);
				match(OParen);
				setState(220);
				_la = _input.LA(1);
				if (_la==String) {
					{
					setState(219);
					match(String);
					}
				}

				setState(222);
				match(CParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(276);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(225);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(226);
						match(Pow);
						setState(227);
						expression(26);
						}
						break;
					case 2:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(228);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(229);
						match(Multiply);
						setState(230);
						expression(25);
						}
						break;
					case 3:
						{
						_localctx = new DivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(231);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(232);
						match(Divide);
						setState(233);
						expression(24);
						}
						break;
					case 4:
						{
						_localctx = new ModulusExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(234);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(235);
						match(Modulus);
						setState(236);
						expression(23);
						}
						break;
					case 5:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(237);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(238);
						match(Add);
						setState(239);
						expression(22);
						}
						break;
					case 6:
						{
						_localctx = new SubtractExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(240);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(241);
						match(Subtract);
						setState(242);
						expression(21);
						}
						break;
					case 7:
						{
						_localctx = new GtEqExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(243);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(244);
						match(GTEquals);
						setState(245);
						expression(20);
						}
						break;
					case 8:
						{
						_localctx = new LtEqExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(246);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(247);
						match(LTEquals);
						setState(248);
						expression(19);
						}
						break;
					case 9:
						{
						_localctx = new GtExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(249);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(250);
						match(GT);
						setState(251);
						expression(18);
						}
						break;
					case 10:
						{
						_localctx = new LtExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(252);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(253);
						match(LT);
						setState(254);
						expression(17);
						}
						break;
					case 11:
						{
						_localctx = new EqExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(255);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(256);
						match(Equals);
						setState(257);
						expression(16);
						}
						break;
					case 12:
						{
						_localctx = new NotEqExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(258);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(259);
						match(NEquals);
						setState(260);
						expression(15);
						}
						break;
					case 13:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(261);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(262);
						match(And);
						setState(263);
						expression(14);
						}
						break;
					case 14:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(264);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(265);
						match(Or);
						setState(266);
						expression(13);
						}
						break;
					case 15:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(267);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(268);
						match(QMark);
						setState(269);
						expression(0);
						setState(270);
						match(Colon);
						setState(271);
						expression(12);
						}
						break;
					case 16:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(273);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(274);
						match(In);
						setState(275);
						expression(11);
						}
						break;
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(OBracket);
			setState(283);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Show) | (1L << ShowL) | (1L << Input) | (1L << Assert) | (1L << Size) | (1L << Empty) | (1L << Excl) | (1L << Subtract) | (1L << OBracket) | (1L << OParen) | (1L << Bool) | (1L << Number) | (1L << Identifier) | (1L << String))) != 0)) {
				{
				setState(282);
				expressionList();
				}
			}

			setState(285);
			match(CBracket);
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

	public static class IndexesContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IndexesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterIndexes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitIndexes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitIndexes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexesContext indexes() throws RecognitionException {
		IndexesContext _localctx = new IndexesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_indexes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(287);
					match(OBracket);
					setState(288);
					expression(0);
					setState(289);
					match(CBracket);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(293); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(LangntParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangntListener ) ((LangntListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangntVisitor ) return ((LangntVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(Identifier);
			setState(298);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(296);
				match(Colon);
				setState(297);
				expression(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 25);
		case 1:
			return precpred(_ctx, 24);
		case 2:
			return precpred(_ctx, 23);
		case 3:
			return precpred(_ctx, 22);
		case 4:
			return precpred(_ctx, 21);
		case 5:
			return precpred(_ctx, 20);
		case 6:
			return precpred(_ctx, 19);
		case 7:
			return precpred(_ctx, 18);
		case 8:
			return precpred(_ctx, 17);
		case 9:
			return precpred(_ctx, 16);
		case 10:
			return precpred(_ctx, 15);
		case 11:
			return precpred(_ctx, 14);
		case 12:
			return precpred(_ctx, 13);
		case 13:
			return precpred(_ctx, 12);
		case 14:
			return precpred(_ctx, 11);
		case 15:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u012f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3"+
		"\3\3\5\3\65\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\5\5B\n\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5I\n\5\5\5K\n\5\3\6\3\6\5\6O\n\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\5\7W\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7b\n\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7o\n\7\3\b\3\b\7\bs\n\b\f\b\16"+
		"\bv\13\b\3\b\5\by\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u0095"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u00b1\n\17\f\17"+
		"\16\17\u00b4\13\17\3\20\3\20\3\20\7\20\u00b9\n\20\f\20\16\20\u00bc\13"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c8\n\21"+
		"\3\21\3\21\5\21\u00cc\n\21\3\21\3\21\5\21\u00d0\n\21\3\21\3\21\5\21\u00d4"+
		"\n\21\3\21\3\21\3\21\3\21\5\21\u00da\n\21\3\21\3\21\3\21\5\21\u00df\n"+
		"\21\3\21\5\21\u00e2\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\7\21\u0117\n\21\f\21\16\21\u011a\13\21\3\22\3\22\5\22\u011e\n\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\6\23\u0126\n\23\r\23\16\23\u0127\3\24\3\24\3"+
		"\24\5\24\u012d\n\24\3\24\2\3 \25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&\2\2\u0155\2(\3\2\2\2\4/\3\2\2\2\6<\3\2\2\2\bJ\3\2\2\2\nL\3\2\2\2"+
		"\fn\3\2\2\2\16p\3\2\2\2\20|\3\2\2\2\22\u0083\3\2\2\2\24\u008b\3\2\2\2"+
		"\26\u0090\3\2\2\2\30\u009b\3\2\2\2\32\u00a5\3\2\2\2\34\u00ad\3\2\2\2\36"+
		"\u00b5\3\2\2\2 \u00e1\3\2\2\2\"\u011b\3\2\2\2$\u0125\3\2\2\2&\u0129\3"+
		"\2\2\2()\5\4\3\2)*\7\2\2\3*\3\3\2\2\2+.\5\6\4\2,.\5\26\f\2-+\3\2\2\2-"+
		",\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\64\3\2\2\2\61/\3\2\2\2"+
		"\62\63\7\6\2\2\63\65\5 \21\2\64\62\3\2\2\2\64\65\3\2\2\2\65\5\3\2\2\2"+
		"\66=\5\b\5\2\67=\5\n\6\28=\5\f\7\29=\5\16\b\2:=\5\30\r\2;=\5\32\16\2<"+
		"\66\3\2\2\2<\67\3\2\2\2<8\3\2\2\2<9\3\2\2\2<:\3\2\2\2<;\3\2\2\2=\7\3\2"+
		"\2\2>?\7\5\2\2?A\7.\2\2@B\5$\23\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7+\2"+
		"\2DK\5 \21\2EF\7\5\2\2FH\7.\2\2GI\5$\23\2HG\3\2\2\2HI\3\2\2\2IK\3\2\2"+
		"\2J>\3\2\2\2JE\3\2\2\2K\t\3\2\2\2LN\7.\2\2MO\5$\23\2NM\3\2\2\2NO\3\2\2"+
		"\2OP\3\2\2\2PQ\7+\2\2QR\5 \21\2R\13\3\2\2\2ST\7.\2\2TV\7%\2\2UW\5\36\20"+
		"\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2Xo\7&\2\2YZ\7\n\2\2Z[\7%\2\2[\\\5 \21"+
		"\2\\]\7&\2\2]o\3\2\2\2^_\7\13\2\2_a\7%\2\2`b\5 \21\2a`\3\2\2\2ab\3\2\2"+
		"\2bc\3\2\2\2co\7&\2\2de\7\20\2\2ef\7%\2\2fg\5 \21\2gh\7&\2\2ho\3\2\2\2"+
		"ij\7\21\2\2jk\7%\2\2kl\5 \21\2lm\7&\2\2mo\3\2\2\2nS\3\2\2\2nY\3\2\2\2"+
		"n^\3\2\2\2nd\3\2\2\2ni\3\2\2\2o\r\3\2\2\2pt\5\20\t\2qs\5\22\n\2rq\3\2"+
		"\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2vt\3\2\2\2wy\5\24\13\2xw\3"+
		"\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\4\2\2{\17\3\2\2\2|}\7\7\2\2}~\7%\2\2~\177"+
		"\5 \21\2\177\u0080\7&\2\2\u0080\u0081\7\3\2\2\u0081\u0082\5\4\3\2\u0082"+
		"\21\3\2\2\2\u0083\u0084\7\4\2\2\u0084\u0085\7\t\2\2\u0085\u0086\7%\2\2"+
		"\u0086\u0087\5 \21\2\u0087\u0088\7&\2\2\u0088\u0089\7\3\2\2\u0089\u008a"+
		"\5\4\3\2\u008a\23\3\2\2\2\u008b\u008c\7\4\2\2\u008c\u008d\7\b\2\2\u008d"+
		"\u008e\7\3\2\2\u008e\u008f\5\4\3\2\u008f\25\3\2\2\2\u0090\u0091\7\16\2"+
		"\2\u0091\u0092\7.\2\2\u0092\u0094\7%\2\2\u0093\u0095\5\34\17\2\u0094\u0093"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7&\2\2\u0097"+
		"\u0098\7\3\2\2\u0098\u0099\5\4\3\2\u0099\u009a\7\4\2\2\u009a\27\3\2\2"+
		"\2\u009b\u009c\7\r\2\2\u009c\u009d\7%\2\2\u009d\u009e\7.\2\2\u009e\u009f"+
		"\7+\2\2\u009f\u00a0\5 \21\2\u00a0\u00a1\7&\2\2\u00a1\u00a2\7\3\2\2\u00a2"+
		"\u00a3\5\4\3\2\u00a3\u00a4\7\4\2\2\u00a4\31\3\2\2\2\u00a5\u00a6\7\r\2"+
		"\2\u00a6\u00a7\7%\2\2\u00a7\u00a8\5 \21\2\u00a8\u00a9\7&\2\2\u00a9\u00aa"+
		"\7\3\2\2\u00aa\u00ab\5\4\3\2\u00ab\u00ac\7\4\2\2\u00ac\33\3\2\2\2\u00ad"+
		"\u00b2\5&\24\2\u00ae\u00af\7)\2\2\u00af\u00b1\5&\24\2\u00b0\u00ae\3\2"+
		"\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\35\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00ba\5 \21\2\u00b6\u00b7\7)\2\2"+
		"\u00b7\u00b9\5 \21\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\37\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd"+
		"\u00be\b\21\1\2\u00be\u00bf\7\37\2\2\u00bf\u00e2\5 \21\35\u00c0\u00c1"+
		"\7\33\2\2\u00c1\u00e2\5 \21\34\u00c2\u00e2\7-\2\2\u00c3\u00e2\7,\2\2\u00c4"+
		"\u00e2\7\23\2\2\u00c5\u00c7\5\f\7\2\u00c6\u00c8\5$\23\2\u00c7\u00c6\3"+
		"\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00e2\3\2\2\2\u00c9\u00cb\5\"\22\2\u00ca"+
		"\u00cc\5$\23\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00e2\3\2"+
		"\2\2\u00cd\u00cf\7.\2\2\u00ce\u00d0\5$\23\2\u00cf\u00ce\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00e2\3\2\2\2\u00d1\u00d3\7/\2\2\u00d2\u00d4\5$\23"+
		"\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00e2\3\2\2\2\u00d5\u00d6"+
		"\7%\2\2\u00d6\u00d7\5 \21\2\u00d7\u00d9\7&\2\2\u00d8\u00da\5$\23\2\u00d9"+
		"\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00e2\3\2\2\2\u00db\u00dc\7\17"+
		"\2\2\u00dc\u00de\7%\2\2\u00dd\u00df\7/\2\2\u00de\u00dd\3\2\2\2\u00de\u00df"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\7&\2\2\u00e1\u00bd\3\2\2\2\u00e1"+
		"\u00c0\3\2\2\2\u00e1\u00c2\3\2\2\2\u00e1\u00c3\3\2\2\2\u00e1\u00c4\3\2"+
		"\2\2\u00e1\u00c5\3\2\2\2\u00e1\u00c9\3\2\2\2\u00e1\u00cd\3\2\2\2\u00e1"+
		"\u00d1\3\2\2\2\u00e1\u00d5\3\2\2\2\u00e1\u00db\3\2\2\2\u00e2\u0118\3\2"+
		"\2\2\u00e3\u00e4\f\33\2\2\u00e4\u00e5\7\32\2\2\u00e5\u0117\5 \21\34\u00e6"+
		"\u00e7\f\32\2\2\u00e7\u00e8\7 \2\2\u00e8\u0117\5 \21\33\u00e9\u00ea\f"+
		"\31\2\2\u00ea\u00eb\7!\2\2\u00eb\u0117\5 \21\32\u00ec\u00ed\f\30\2\2\u00ed"+
		"\u00ee\7\"\2\2\u00ee\u0117\5 \21\31\u00ef\u00f0\f\27\2\2\u00f0\u00f1\7"+
		"\36\2\2\u00f1\u0117\5 \21\30\u00f2\u00f3\f\26\2\2\u00f3\u00f4\7\37\2\2"+
		"\u00f4\u0117\5 \21\27\u00f5\u00f6\f\25\2\2\u00f6\u00f7\7\30\2\2\u00f7"+
		"\u0117\5 \21\26\u00f8\u00f9\f\24\2\2\u00f9\u00fa\7\31\2\2\u00fa\u0117"+
		"\5 \21\25\u00fb\u00fc\f\23\2\2\u00fc\u00fd\7\34\2\2\u00fd\u0117\5 \21"+
		"\24\u00fe\u00ff\f\22\2\2\u00ff\u0100\7\35\2\2\u0100\u0117\5 \21\23\u0101"+
		"\u0102\f\21\2\2\u0102\u0103\7\26\2\2\u0103\u0117\5 \21\22\u0104\u0105"+
		"\f\20\2\2\u0105\u0106\7\27\2\2\u0106\u0117\5 \21\21\u0107\u0108\f\17\2"+
		"\2\u0108\u0109\7\25\2\2\u0109\u0117\5 \21\20\u010a\u010b\f\16\2\2\u010b"+
		"\u010c\7\24\2\2\u010c\u0117\5 \21\17\u010d\u010e\f\r\2\2\u010e\u010f\7"+
		"*\2\2\u010f\u0110\5 \21\2\u0110\u0111\7+\2\2\u0111\u0112\5 \21\16\u0112"+
		"\u0117\3\2\2\2\u0113\u0114\f\f\2\2\u0114\u0115\7\22\2\2\u0115\u0117\5"+
		" \21\r\u0116\u00e3\3\2\2\2\u0116\u00e6\3\2\2\2\u0116\u00e9\3\2\2\2\u0116"+
		"\u00ec\3\2\2\2\u0116\u00ef\3\2\2\2\u0116\u00f2\3\2\2\2\u0116\u00f5\3\2"+
		"\2\2\u0116\u00f8\3\2\2\2\u0116\u00fb\3\2\2\2\u0116\u00fe\3\2\2\2\u0116"+
		"\u0101\3\2\2\2\u0116\u0104\3\2\2\2\u0116\u0107\3\2\2\2\u0116\u010a\3\2"+
		"\2\2\u0116\u010d\3\2\2\2\u0116\u0113\3\2\2\2\u0117\u011a\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119!\3\2\2\2\u011a\u0118\3\2\2\2"+
		"\u011b\u011d\7#\2\2\u011c\u011e\5\36\20\2\u011d\u011c\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\7$\2\2\u0120#\3\2\2\2\u0121\u0122"+
		"\7#\2\2\u0122\u0123\5 \21\2\u0123\u0124\7$\2\2\u0124\u0126\3\2\2\2\u0125"+
		"\u0121\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128%\3\2\2\2\u0129\u012c\7.\2\2\u012a\u012b\7+\2\2\u012b\u012d"+
		"\5 \21\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\'\3\2\2\2\36-/"+
		"\64<AHJNVantx\u0094\u00b2\u00ba\u00c7\u00cb\u00cf\u00d3\u00d9\u00de\u00e1"+
		"\u0116\u0118\u011d\u0127\u012c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}