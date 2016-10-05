// Generated from C:\work\study\metrics_poc\src\com\bwang\metrics\modal\AthenaQuery.g4 by ANTLR 4.5.1

package com.bwang.metrics.gen;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AthenaQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, TIME_UNIT=12, QUOTED2_STRING=13, QUOTED1_STRING=14, 
		ESC=15, K_AND=16, K_OR=17, K_UNLESS=18, K_BY=19, K_WITHOUT=20, K_KEEP_COMMON=21, 
		K_OFFSET=22, K_BETWEEN=23, K_SUM=24, K_AVG=25, K_COUNT=26, K_MIN=27, K_MAX=28, 
		K_STDDEV=29, K_STDVAR=30, K_TOPK=31, K_BOTTOMK=32, K_COUNT_VALUES=33, 
		NULL=34, TRUE=35, FALSE=36, INT=37, DOUBLE=38, BANG=39, AND=40, EQUALS=41, 
		OR=42, PLUS=43, MINUS=44, SLASH=45, STAR=46, LANGLE=47, RANGLE=48, DOLLAR=49, 
		ASK=50, COLON=51, LPAREN=52, RPAREN=53, DOT=54, IDENTIFIER=55, WS=56, 
		DIGIT=57;
	public static final int
		RULE_expr = 0, RULE_call = 1, RULE_argslist = 2, RULE_numberLiteral = 3, 
		RULE_identifierList = 4, RULE_aggregatorParam = 5, RULE_vectorSelector = 6, 
		RULE_matrixSelector = 7, RULE_labelMatcherList = 8, RULE_labelMatcher = 9, 
		RULE_offsetExpr = 10, RULE_rangeExpr = 11, RULE_from_time = 12, RULE_to_time = 13, 
		RULE_quoted_string = 14, RULE_stringLiteral = 15;
	public static final String[] ruleNames = {
		"expr", "call", "argslist", "numberLiteral", "identifierList", "aggregatorParam", 
		"vectorSelector", "matrixSelector", "labelMatcherList", "labelMatcher", 
		"offsetExpr", "rangeExpr", "from_time", "to_time", "quoted_string", "stringLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'{'", "'}'", "'=='", "'!='", "'=~'", "'!~'", "'['", "']'", 
		"'''", "'\\'", null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'null'", "'true'", "'false'", null, null, "'!'", "'and'", "'='", "'or'", 
		"'+'", "'-'", "'/'", "'*'", "'<'", "'>'", "'$'", "'?'", "':'", "'('", 
		"')'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"TIME_UNIT", "QUOTED2_STRING", "QUOTED1_STRING", "ESC", "K_AND", "K_OR", 
		"K_UNLESS", "K_BY", "K_WITHOUT", "K_KEEP_COMMON", "K_OFFSET", "K_BETWEEN", 
		"K_SUM", "K_AVG", "K_COUNT", "K_MIN", "K_MAX", "K_STDDEV", "K_STDVAR", 
		"K_TOPK", "K_BOTTOMK", "K_COUNT_VALUES", "NULL", "TRUE", "FALSE", "INT", 
		"DOUBLE", "BANG", "AND", "EQUALS", "OR", "PLUS", "MINUS", "SLASH", "STAR", 
		"LANGLE", "RANGLE", "DOLLAR", "ASK", "COLON", "LPAREN", "RPAREN", "DOT", 
		"IDENTIFIER", "WS", "DIGIT"
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
	public String getGrammarFileName() { return "AthenaQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AthenaQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
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
	public static class StringExprContext extends ExprContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public StringExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AthenaQueryVisitor ) return ((AthenaQueryVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(AthenaQueryParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AthenaQueryVisitor ) return ((AthenaQueryVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExpContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public Token op;
		public TerminalNode K_AND() { return getToken(AthenaQueryParser.K_AND, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_OR() { return getToken(AthenaQueryParser.K_OR, 0); }
		public TerminalNode K_UNLESS() { return getToken(AthenaQueryParser.K_UNLESS, 0); }
		public BinaryExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AthenaQueryVisitor ) return ((AthenaQueryVisitor<? extends T>)visitor).visitBinaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VectorSelectorExprContext extends ExprContext {
		public VectorSelectorContext vectorSelector() {
			return getRuleContext(VectorSelectorContext.class,0);
		}
		public VectorSelectorExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AthenaQueryVisitor ) return ((AthenaQueryVisitor<? extends T>)visitor).visitVectorSelectorExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AggregateExpContext extends ExprContext {
		public Token aggregator;
		public VectorSelectorContext vectorSelector() {
			return getRuleContext(VectorSelectorContext.class,0);
		}
		public TerminalNode K_SUM() { return getToken(AthenaQueryParser.K_SUM, 0); }
		public TerminalNode K_AVG() { return getToken(AthenaQueryParser.K_AVG, 0); }
		public TerminalNode K_COUNT() { return getToken(AthenaQueryParser.K_COUNT, 0); }
		public TerminalNode K_MIN() { return getToken(AthenaQueryParser.K_MIN, 0); }
		public TerminalNode K_MAX() { return getToken(AthenaQueryParser.K_MAX, 0); }
		public TerminalNode K_STDDEV() { return getToken(AthenaQueryParser.K_STDDEV, 0); }
		public TerminalNode K_STDVAR() { return getToken(AthenaQueryParser.K_STDVAR, 0); }
		public AggregatorParamContext aggregatorParam() {
			return getRuleContext(AggregatorParamContext.class,0);
		}
		public TerminalNode INT() { return getToken(AthenaQueryParser.INT, 0); }
		public TerminalNode K_TOPK() { return getToken(AthenaQueryParser.K_TOPK, 0); }
		public TerminalNode K_BOTTOMK() { return getToken(AthenaQueryParser.K_BOTTOMK, 0); }
		public TerminalNode K_COUNT_VALUES() { return getToken(AthenaQueryParser.K_COUNT_VALUES, 0); }
		public AggregateExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AthenaQueryVisitor ) return ((AthenaQueryVisitor<? extends T>)visitor).visitAggregateExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MatrixSelectorExprContext extends ExprContext {
		public MatrixSelectorContext matrixSelector() {
			return getRuleContext(MatrixSelectorContext.class,0);
		}
		public MatrixSelectorExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AthenaQueryVisitor ) return ((AthenaQueryVisitor<? extends T>)visitor).visitMatrixSelectorExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberExprContext extends ExprContext {
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public NumberExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AthenaQueryVisitor ) return ((AthenaQueryVisitor<? extends T>)visitor).visitNumberExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentEprContext extends ExprContext {
		public ExprContext parent;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParentEprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AthenaQueryVisitor ) return ((AthenaQueryVisitor<? extends T>)visitor).visitParentEpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionExprContext extends ExprContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public FunctionExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AthenaQueryVisitor ) return ((AthenaQueryVisitor<? extends T>)visitor).visitFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(33);
				match(MINUS);
				setState(34);
				expr(14);
				}
				break;
			case 2:
				{
				_localctx = new ParentEprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				match(LPAREN);
				setState(36);
				((ParentEprContext)_localctx).parent = expr(0);
				setState(37);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new AggregateExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				((AggregateExpContext)_localctx).aggregator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_SUM) | (1L << K_AVG) | (1L << K_COUNT) | (1L << K_MIN) | (1L << K_MAX) | (1L << K_STDDEV) | (1L << K_STDVAR))) != 0)) ) {
					((AggregateExpContext)_localctx).aggregator = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(41);
				_la = _input.LA(1);
				if (_la==K_BY || _la==K_WITHOUT) {
					{
					setState(40);
					aggregatorParam();
					}
				}

				setState(43);
				vectorSelector();
				}
				break;
			case 4:
				{
				_localctx = new AggregateExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44);
				((AggregateExpContext)_localctx).aggregator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_SUM) | (1L << K_AVG) | (1L << K_COUNT) | (1L << K_MIN) | (1L << K_MAX) | (1L << K_STDDEV) | (1L << K_STDVAR))) != 0)) ) {
					((AggregateExpContext)_localctx).aggregator = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(45);
				vectorSelector();
				setState(47);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(46);
					aggregatorParam();
					}
					break;
				}
				}
				break;
			case 5:
				{
				_localctx = new AggregateExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_TOPK) | (1L << K_BOTTOMK) | (1L << K_COUNT_VALUES))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(50);
				match(LPAREN);
				setState(51);
				match(INT);
				setState(52);
				match(T__0);
				setState(53);
				vectorSelector();
				setState(54);
				match(RPAREN);
				}
				break;
			case 6:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				call();
				}
				break;
			case 7:
				{
				_localctx = new VectorSelectorExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				vectorSelector();
				}
				break;
			case 8:
				{
				_localctx = new MatrixSelectorExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				matrixSelector();
				}
				break;
			case 9:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				numberLiteral();
				}
				break;
			case 10:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				stringLiteral();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(75);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(63);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(64);
						match(K_AND);
						setState(65);
						((BinaryExpContext)_localctx).right = expr(13);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(66);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(67);
						match(K_OR);
						setState(68);
						((BinaryExpContext)_localctx).right = expr(12);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(69);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(70);
						match(K_UNLESS);
						setState(71);
						((BinaryExpContext)_localctx).right = expr(11);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(72);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(73);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << SLASH) | (1L << STAR))) != 0)) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(74);
						((BinaryExpContext)_localctx).right = expr(10);
						}
						break;
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class CallContext extends ParserRuleContext {
		public Token callName;
		public TerminalNode LPAREN() { return getToken(AthenaQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AthenaQueryParser.RPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AthenaQueryParser.IDENTIFIER, 0); }
		public ArgslistContext argslist() {
			return getRuleContext(ArgslistContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AthenaQueryVisitor ) return ((AthenaQueryVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			((CallContext)_localctx).callName = match(IDENTIFIER);
			setState(81);
			match(LPAREN);
			setState(83);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << K_SUM) | (1L << K_AVG) | (1L << K_COUNT) | (1L << K_MIN) | (1L << K_MAX) | (1L << K_STDDEV) | (1L << K_STDVAR) | (1L << K_TOPK) | (1L << K_BOTTOMK) | (1L << K_COUNT_VALUES) | (1L << INT) | (1L << DOUBLE) | (1L << MINUS) | (1L << LPAREN) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(82);
				argslist();
				}
			}

			setState(85);
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

	public static class ArgslistContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argslist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AthenaQueryVisitor ) return ((AthenaQueryVisitor<? extends T>)visitor).visitArgslist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgslistContext argslist() throws RecognitionException {
		ArgslistContext _localctx = new ArgslistContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_argslist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			expr(0);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(88);
				match(T__0);
				setState(89);
				expr(0);
				}
				}
				setState(94);
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

	public static class NumberLiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(AthenaQueryParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(AthenaQueryParser.DOUBLE, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AthenaQueryVisitor ) return ((AthenaQueryVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AthenaQueryParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AthenaQueryParser.IDENTIFIER, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AthenaQueryVisitor ) return ((AthenaQueryVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(IDENTIFIER);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(98);
				match(T__0);
				setState(99);
				match(IDENTIFIER);
				}
				}
				setState(104);
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

	public static class AggregatorParamContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode K_BY() { return getToken(AthenaQueryParser.K_BY, 0); }
		public TerminalNode K_WITHOUT() { return getToken(AthenaQueryParser.K_WITHOUT, 0); }
		public TerminalNode K_KEEP_COMMON() { return getToken(AthenaQueryParser.K_KEEP_COMMON, 0); }
		public AggregatorParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregatorParam; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AthenaQueryVisitor ) return ((AthenaQueryVisitor<? extends T>)visitor).visitAggregatorParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregatorParamContext aggregatorParam() throws RecognitionException {
		AggregatorParamContext _localctx = new AggregatorParamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_aggregatorParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !(_la==K_BY || _la==K_WITHOUT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(106);
			match(LPAREN);
			setState(107);
			identifierList();
			setState(108);
			match(RPAREN);
			setState(110);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(109);
				match(K_KEEP_COMMON);
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

	public static class VectorSelectorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AthenaQueryParser.IDENTIFIER, 0); }
		public LabelMatcherListContext labelMatcherList() {
			return getRuleContext(LabelMatcherListContext.class,0);
		}
		public OffsetExprContext offsetExpr() {
			return getRuleContext(OffsetExprContext.class,0);
		}
		public VectorSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorSelector; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AthenaQueryVisitor ) return ((AthenaQueryVisitor<? extends T>)visitor).visitVectorSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorSelectorContext vectorSelector() throws RecognitionException {
		VectorSelectorContext _localctx = new VectorSelectorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_vectorSelector);
		int _la;
		try {
			setState(128);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(LPAREN);
				setState(113);
				match(IDENTIFIER);
				setState(115);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(114);
					labelMatcherList();
					}
				}

				setState(117);
				match(RPAREN);
				setState(119);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(118);
					offsetExpr();
					}
					break;
				}
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(IDENTIFIER);
				setState(123);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(122);
					labelMatcherList();
					}
					break;
				}
				setState(126);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(125);
					offsetExpr();
					}
					break;
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

	public static class MatrixSelectorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AthenaQueryParser.IDENTIFIER, 0); }
		public RangeExprContext rangeExpr() {
			return getRuleContext(RangeExprContext.class,0);
		}
		public LabelMatcherListContext labelMatcherList() {
			return getRuleContext(LabelMatcherListContext.class,0);
		}
		public OffsetExprContext offsetExpr() {
			return getRuleContext(OffsetExprContext.class,0);
		}
		public MatrixSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixSelector; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AthenaQueryVisitor ) return ((AthenaQueryVisitor<? extends T>)visitor).visitMatrixSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixSelectorContext matrixSelector() throws RecognitionException {
		MatrixSelectorContext _localctx = new MatrixSelectorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_matrixSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(LPAREN);
			setState(131);
			match(IDENTIFIER);
			setState(133);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(132);
				labelMatcherList();
				}
			}

			setState(135);
			match(RPAREN);
			setState(136);
			rangeExpr();
			setState(138);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(137);
				offsetExpr();
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

	public static class LabelMatcherListContext extends ParserRuleContext {
		public List<LabelMatcherContext> labelMatcher() {
			return getRuleContexts(LabelMatcherContext.class);
		}
		public LabelMatcherContext labelMatcher(int i) {
			return getRuleContext(LabelMatcherContext.class,i);
		}
		public LabelMatcherListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelMatcherList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AthenaQueryVisitor ) return ((AthenaQueryVisitor<? extends T>)visitor).visitLabelMatcherList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelMatcherListContext labelMatcherList() throws RecognitionException {
		LabelMatcherListContext _localctx = new LabelMatcherListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_labelMatcherList);
		int _la;
		try {
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(T__1);
				setState(142);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(141);
					labelMatcher();
					}
				}

				setState(144);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(T__1);
				setState(146);
				labelMatcher();
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(147);
					match(T__0);
					setState(148);
					labelMatcher();
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(154);
				match(T__2);
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

	public static class LabelMatcherContext extends ParserRuleContext {
		public Token match_op;
		public TerminalNode IDENTIFIER() { return getToken(AthenaQueryParser.IDENTIFIER, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public Quoted_stringContext quoted_string() {
			return getRuleContext(Quoted_stringContext.class,0);
		}
		public LabelMatcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelMatcher; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AthenaQueryVisitor ) return ((AthenaQueryVisitor<? extends T>)visitor).visitLabelMatcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelMatcherContext labelMatcher() throws RecognitionException {
		LabelMatcherContext _localctx = new LabelMatcherContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_labelMatcher);
		int _la;
		try {
			setState(164);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(IDENTIFIER);
				setState(159);
				((LabelMatcherContext)_localctx).match_op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
					((LabelMatcherContext)_localctx).match_op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(160);
				numberLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(IDENTIFIER);
				setState(162);
				((LabelMatcherContext)_localctx).match_op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
					((LabelMatcherContext)_localctx).match_op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(163);
				quoted_string();
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

	public static class OffsetExprContext extends ParserRuleContext {
		public TerminalNode K_OFFSET() { return getToken(AthenaQueryParser.K_OFFSET, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode TIME_UNIT() { return getToken(AthenaQueryParser.TIME_UNIT, 0); }
		public OffsetExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offsetExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AthenaQueryVisitor ) return ((AthenaQueryVisitor<? extends T>)visitor).visitOffsetExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetExprContext offsetExpr() throws RecognitionException {
		OffsetExprContext _localctx = new OffsetExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_offsetExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(K_OFFSET);
			setState(167);
			numberLiteral();
			setState(168);
			match(TIME_UNIT);
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

	public static class RangeExprContext extends ParserRuleContext {
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode TIME_UNIT() { return getToken(AthenaQueryParser.TIME_UNIT, 0); }
		public TerminalNode K_BETWEEN() { return getToken(AthenaQueryParser.K_BETWEEN, 0); }
		public From_timeContext from_time() {
			return getRuleContext(From_timeContext.class,0);
		}
		public TerminalNode K_AND() { return getToken(AthenaQueryParser.K_AND, 0); }
		public To_timeContext to_time() {
			return getRuleContext(To_timeContext.class,0);
		}
		public RangeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AthenaQueryVisitor ) return ((AthenaQueryVisitor<? extends T>)visitor).visitRangeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeExprContext rangeExpr() throws RecognitionException {
		RangeExprContext _localctx = new RangeExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_rangeExpr);
		try {
			setState(180);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(T__7);
				setState(171);
				numberLiteral();
				setState(172);
				match(TIME_UNIT);
				setState(173);
				match(T__8);
				}
				break;
			case K_BETWEEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(K_BETWEEN);
				setState(176);
				from_time();
				setState(177);
				match(K_AND);
				setState(178);
				to_time();
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

	public static class From_timeContext extends ParserRuleContext {
		public Quoted_stringContext quoted_string() {
			return getRuleContext(Quoted_stringContext.class,0);
		}
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode TIME_UNIT() { return getToken(AthenaQueryParser.TIME_UNIT, 0); }
		public From_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_time; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AthenaQueryVisitor ) return ((AthenaQueryVisitor<? extends T>)visitor).visitFrom_time(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_timeContext from_time() throws RecognitionException {
		From_timeContext _localctx = new From_timeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_from_time);
		try {
			setState(186);
			switch (_input.LA(1)) {
			case QUOTED2_STRING:
			case QUOTED1_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				quoted_string();
				}
				break;
			case INT:
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				numberLiteral();
				setState(184);
				match(TIME_UNIT);
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

	public static class To_timeContext extends ParserRuleContext {
		public Quoted_stringContext quoted_string() {
			return getRuleContext(Quoted_stringContext.class,0);
		}
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode TIME_UNIT() { return getToken(AthenaQueryParser.TIME_UNIT, 0); }
		public To_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to_time; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AthenaQueryVisitor ) return ((AthenaQueryVisitor<? extends T>)visitor).visitTo_time(this);
			else return visitor.visitChildren(this);
		}
	}

	public final To_timeContext to_time() throws RecognitionException {
		To_timeContext _localctx = new To_timeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_to_time);
		try {
			setState(192);
			switch (_input.LA(1)) {
			case QUOTED2_STRING:
			case QUOTED1_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				quoted_string();
				}
				break;
			case INT:
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				numberLiteral();
				setState(190);
				match(TIME_UNIT);
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

	public static class Quoted_stringContext extends ParserRuleContext {
		public TerminalNode QUOTED1_STRING() { return getToken(AthenaQueryParser.QUOTED1_STRING, 0); }
		public TerminalNode QUOTED2_STRING() { return getToken(AthenaQueryParser.QUOTED2_STRING, 0); }
		public Quoted_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quoted_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AthenaQueryVisitor ) return ((AthenaQueryVisitor<? extends T>)visitor).visitQuoted_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quoted_stringContext quoted_string() throws RecognitionException {
		Quoted_stringContext _localctx = new Quoted_stringContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_quoted_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !(_la==QUOTED2_STRING || _la==QUOTED1_STRING) ) {
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

	public static class StringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> ESC() { return getTokens(AthenaQueryParser.ESC); }
		public TerminalNode ESC(int i) {
			return getToken(AthenaQueryParser.ESC, i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AthenaQueryVisitor ) return ((AthenaQueryVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__9);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << TIME_UNIT) | (1L << QUOTED2_STRING) | (1L << QUOTED1_STRING) | (1L << ESC) | (1L << K_AND) | (1L << K_OR) | (1L << K_UNLESS) | (1L << K_BY) | (1L << K_WITHOUT) | (1L << K_KEEP_COMMON) | (1L << K_OFFSET) | (1L << K_BETWEEN) | (1L << K_SUM) | (1L << K_AVG) | (1L << K_COUNT) | (1L << K_MIN) | (1L << K_MAX) | (1L << K_STDDEV) | (1L << K_STDVAR) | (1L << K_TOPK) | (1L << K_BOTTOMK) | (1L << K_COUNT_VALUES) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << INT) | (1L << DOUBLE) | (1L << BANG) | (1L << AND) | (1L << EQUALS) | (1L << OR) | (1L << PLUS) | (1L << MINUS) | (1L << SLASH) | (1L << STAR) | (1L << LANGLE) | (1L << RANGLE) | (1L << DOLLAR) | (1L << ASK) | (1L << COLON) | (1L << LPAREN) | (1L << RPAREN) | (1L << DOT) | (1L << IDENTIFIER) | (1L << WS) | (1L << DIGIT))) != 0)) {
				{
				setState(199);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(197);
					match(ESC);
					}
					break;
				case 2:
					{
					setState(198);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__9 || _la==T__10) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			match(T__9);
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
		case 0:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3;\u00d1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2,\n\2\3\2\3\2\3\2\3\2\5\2\62\n\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2@\n\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2N\n\2\f\2\16\2Q\13\2\3\3\3\3\3\3\5\3V"+
		"\n\3\3\3\3\3\3\4\3\4\3\4\7\4]\n\4\f\4\16\4`\13\4\3\5\3\5\3\6\3\6\3\6\7"+
		"\6g\n\6\f\6\16\6j\13\6\3\7\3\7\3\7\3\7\3\7\5\7q\n\7\3\b\3\b\3\b\5\bv\n"+
		"\b\3\b\3\b\5\bz\n\b\3\b\3\b\5\b~\n\b\3\b\5\b\u0081\n\b\5\b\u0083\n\b\3"+
		"\t\3\t\3\t\5\t\u0088\n\t\3\t\3\t\3\t\5\t\u008d\n\t\3\n\3\n\5\n\u0091\n"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\n\u0098\n\n\f\n\16\n\u009b\13\n\3\n\3\n\5\n\u009f"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a7\n\13\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b7\n\r\3\16\3\16\3\16\3\16"+
		"\5\16\u00bd\n\16\3\17\3\17\3\17\3\17\5\17\u00c3\n\17\3\20\3\20\3\21\3"+
		"\21\3\21\7\21\u00ca\n\21\f\21\16\21\u00cd\13\21\3\21\3\21\3\21\2\3\2\22"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\13\3\2\32 \3\2!#\3\2-\60\3"+
		"\2\'(\3\2\25\26\3\2\6\7\3\2\6\t\3\2\17\20\3\2\f\r\u00e3\2?\3\2\2\2\4R"+
		"\3\2\2\2\6Y\3\2\2\2\ba\3\2\2\2\nc\3\2\2\2\fk\3\2\2\2\16\u0082\3\2\2\2"+
		"\20\u0084\3\2\2\2\22\u009e\3\2\2\2\24\u00a6\3\2\2\2\26\u00a8\3\2\2\2\30"+
		"\u00b6\3\2\2\2\32\u00bc\3\2\2\2\34\u00c2\3\2\2\2\36\u00c4\3\2\2\2 \u00c6"+
		"\3\2\2\2\"#\b\2\1\2#$\7.\2\2$@\5\2\2\20%&\7\66\2\2&\'\5\2\2\2\'(\7\67"+
		"\2\2(@\3\2\2\2)+\t\2\2\2*,\5\f\7\2+*\3\2\2\2+,\3\2\2\2,-\3\2\2\2-@\5\16"+
		"\b\2./\t\2\2\2/\61\5\16\b\2\60\62\5\f\7\2\61\60\3\2\2\2\61\62\3\2\2\2"+
		"\62@\3\2\2\2\63\64\t\3\2\2\64\65\7\66\2\2\65\66\7\'\2\2\66\67\7\3\2\2"+
		"\678\5\16\b\289\7\67\2\29@\3\2\2\2:@\5\4\3\2;@\5\16\b\2<@\5\20\t\2=@\5"+
		"\b\5\2>@\5 \21\2?\"\3\2\2\2?%\3\2\2\2?)\3\2\2\2?.\3\2\2\2?\63\3\2\2\2"+
		"?:\3\2\2\2?;\3\2\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@O\3\2\2\2AB\f\16\2"+
		"\2BC\7\22\2\2CN\5\2\2\17DE\f\r\2\2EF\7\23\2\2FN\5\2\2\16GH\f\f\2\2HI\7"+
		"\24\2\2IN\5\2\2\rJK\f\13\2\2KL\t\4\2\2LN\5\2\2\fMA\3\2\2\2MD\3\2\2\2M"+
		"G\3\2\2\2MJ\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\3\3\2\2\2QO\3\2\2\2"+
		"RS\79\2\2SU\7\66\2\2TV\5\6\4\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7\67\2"+
		"\2X\5\3\2\2\2Y^\5\2\2\2Z[\7\3\2\2[]\5\2\2\2\\Z\3\2\2\2]`\3\2\2\2^\\\3"+
		"\2\2\2^_\3\2\2\2_\7\3\2\2\2`^\3\2\2\2ab\t\5\2\2b\t\3\2\2\2ch\79\2\2de"+
		"\7\3\2\2eg\79\2\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\13\3\2\2\2"+
		"jh\3\2\2\2kl\t\6\2\2lm\7\66\2\2mn\5\n\6\2np\7\67\2\2oq\7\27\2\2po\3\2"+
		"\2\2pq\3\2\2\2q\r\3\2\2\2rs\7\66\2\2su\79\2\2tv\5\22\n\2ut\3\2\2\2uv\3"+
		"\2\2\2vw\3\2\2\2wy\7\67\2\2xz\5\26\f\2yx\3\2\2\2yz\3\2\2\2z\u0083\3\2"+
		"\2\2{}\79\2\2|~\5\22\n\2}|\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177\u0081"+
		"\5\26\f\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082"+
		"r\3\2\2\2\u0082{\3\2\2\2\u0083\17\3\2\2\2\u0084\u0085\7\66\2\2\u0085\u0087"+
		"\79\2\2\u0086\u0088\5\22\n\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008a\7\67\2\2\u008a\u008c\5\30\r\2\u008b\u008d\5"+
		"\26\f\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\21\3\2\2\2\u008e"+
		"\u0090\7\4\2\2\u008f\u0091\5\24\13\2\u0090\u008f\3\2\2\2\u0090\u0091\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0092\u009f\7\5\2\2\u0093\u0094\7\4\2\2\u0094"+
		"\u0099\5\24\13\2\u0095\u0096\7\3\2\2\u0096\u0098\5\24\13\2\u0097\u0095"+
		"\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\5\2\2\u009d\u009f\3\2"+
		"\2\2\u009e\u008e\3\2\2\2\u009e\u0093\3\2\2\2\u009f\23\3\2\2\2\u00a0\u00a1"+
		"\79\2\2\u00a1\u00a2\t\7\2\2\u00a2\u00a7\5\b\5\2\u00a3\u00a4\79\2\2\u00a4"+
		"\u00a5\t\b\2\2\u00a5\u00a7\5\36\20\2\u00a6\u00a0\3\2\2\2\u00a6\u00a3\3"+
		"\2\2\2\u00a7\25\3\2\2\2\u00a8\u00a9\7\30\2\2\u00a9\u00aa\5\b\5\2\u00aa"+
		"\u00ab\7\16\2\2\u00ab\27\3\2\2\2\u00ac\u00ad\7\n\2\2\u00ad\u00ae\5\b\5"+
		"\2\u00ae\u00af\7\16\2\2\u00af\u00b0\7\13\2\2\u00b0\u00b7\3\2\2\2\u00b1"+
		"\u00b2\7\31\2\2\u00b2\u00b3\5\32\16\2\u00b3\u00b4\7\22\2\2\u00b4\u00b5"+
		"\5\34\17\2\u00b5\u00b7\3\2\2\2\u00b6\u00ac\3\2\2\2\u00b6\u00b1\3\2\2\2"+
		"\u00b7\31\3\2\2\2\u00b8\u00bd\5\36\20\2\u00b9\u00ba\5\b\5\2\u00ba\u00bb"+
		"\7\16\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00b9\3\2\2\2"+
		"\u00bd\33\3\2\2\2\u00be\u00c3\5\36\20\2\u00bf\u00c0\5\b\5\2\u00c0\u00c1"+
		"\7\16\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00be\3\2\2\2\u00c2\u00bf\3\2\2\2"+
		"\u00c3\35\3\2\2\2\u00c4\u00c5\t\t\2\2\u00c5\37\3\2\2\2\u00c6\u00cb\7\f"+
		"\2\2\u00c7\u00ca\7\21\2\2\u00c8\u00ca\n\n\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7\f\2\2\u00cf"+
		"!\3\2\2\2\33+\61?MOU^hpuy}\u0080\u0082\u0087\u008c\u0090\u0099\u009e\u00a6"+
		"\u00b6\u00bc\u00c2\u00c9\u00cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}