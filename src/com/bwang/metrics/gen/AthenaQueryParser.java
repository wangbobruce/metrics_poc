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
		TIME_UNIT=10, QUOTED2_STRING=11, QUOTED1_STRING=12, ESC=13, K_AND=14, 
		K_OR=15, K_UNLESS=16, K_BY=17, K_WITHOUT=18, K_KEEP_COMMON=19, K_OFFSET=20, 
		K_BETWEEN=21, K_SUM=22, K_AVG=23, K_COUNT=24, K_MIN=25, K_MAX=26, K_STDDEV=27, 
		K_STDVAR=28, K_TOPK=29, K_BOTTOMK=30, K_COUNT_VALUES=31, NULL=32, TRUE=33, 
		FALSE=34, INT=35, DOUBLE=36, BANG=37, AND=38, EQUALS=39, OR=40, PLUS=41, 
		MINUS=42, SLASH=43, STAR=44, LANGLE=45, RANGLE=46, DOLLAR=47, ASK=48, 
		COLON=49, LPAREN=50, RPAREN=51, DOT=52, IDENTIFIER=53, WS=54, DIGIT=55;
	public static final int
		RULE_expr = 0, RULE_call = 1, RULE_argslist = 2, RULE_numberLiteral = 3, 
		RULE_identifierList = 4, RULE_aggregatorParam = 5, RULE_vectorSelector = 6, 
		RULE_matrixSelector = 7, RULE_labelMatcherList = 8, RULE_labelMatcher = 9, 
		RULE_offsetExpr = 10, RULE_rangeExpr = 11, RULE_from_time = 12, RULE_to_time = 13, 
		RULE_quoted_string = 14;
	public static final String[] ruleNames = {
		"expr", "call", "argslist", "numberLiteral", "identifierList", "aggregatorParam", 
		"vectorSelector", "matrixSelector", "labelMatcherList", "labelMatcher", 
		"offsetExpr", "rangeExpr", "from_time", "to_time", "quoted_string"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'{'", "'}'", "'=='", "'!='", "'=~'", "'!~'", "'['", "']'", 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "'null'", 
		"'true'", "'false'", null, null, "'!'", "'and'", "'='", "'or'", "'+'", 
		"'-'", "'/'", "'*'", "'<'", "'>'", "'$'", "'?'", "':'", "'('", "')'", 
		"'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "TIME_UNIT", 
		"QUOTED2_STRING", "QUOTED1_STRING", "ESC", "K_AND", "K_OR", "K_UNLESS", 
		"K_BY", "K_WITHOUT", "K_KEEP_COMMON", "K_OFFSET", "K_BETWEEN", "K_SUM", 
		"K_AVG", "K_COUNT", "K_MIN", "K_MAX", "K_STDDEV", "K_STDVAR", "K_TOPK", 
		"K_BOTTOMK", "K_COUNT_VALUES", "NULL", "TRUE", "FALSE", "INT", "DOUBLE", 
		"BANG", "AND", "EQUALS", "OR", "PLUS", "MINUS", "SLASH", "STAR", "LANGLE", 
		"RANGLE", "DOLLAR", "ASK", "COLON", "LPAREN", "RPAREN", "DOT", "IDENTIFIER", 
		"WS", "DIGIT"
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
		public Quoted_stringContext quoted_string() {
			return getRuleContext(Quoted_stringContext.class,0);
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
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_AND() { return getToken(AthenaQueryParser.K_AND, 0); }
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			setState(59);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(31);
				match(MINUS);
				setState(32);
				expr(15);
				}
				break;
			case 2:
				{
				_localctx = new AggregateExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33);
				((AggregateExpContext)_localctx).aggregator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_SUM) | (1L << K_AVG) | (1L << K_COUNT) | (1L << K_MIN) | (1L << K_MAX) | (1L << K_STDDEV) | (1L << K_STDVAR))) != 0)) ) {
					((AggregateExpContext)_localctx).aggregator = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(35);
				_la = _input.LA(1);
				if (_la==K_BY || _la==K_WITHOUT) {
					{
					setState(34);
					aggregatorParam();
					}
				}

				setState(37);
				expr(8);
				}
				break;
			case 3:
				{
				_localctx = new ParentEprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				match(LPAREN);
				setState(39);
				((ParentEprContext)_localctx).parent = expr(0);
				setState(40);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new AggregateExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				((AggregateExpContext)_localctx).aggregator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_SUM) | (1L << K_AVG) | (1L << K_COUNT) | (1L << K_MIN) | (1L << K_MAX) | (1L << K_STDDEV) | (1L << K_STDVAR))) != 0)) ) {
					((AggregateExpContext)_localctx).aggregator = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(43);
				expr(0);
				setState(45);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(44);
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
				setState(47);
				((AggregateExpContext)_localctx).aggregator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_TOPK) | (1L << K_BOTTOMK) | (1L << K_COUNT_VALUES))) != 0)) ) {
					((AggregateExpContext)_localctx).aggregator = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(48);
				match(LPAREN);
				setState(49);
				match(INT);
				setState(50);
				match(T__0);
				setState(51);
				expr(0);
				setState(52);
				match(RPAREN);
				}
				break;
			case 6:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				call();
				}
				break;
			case 7:
				{
				_localctx = new VectorSelectorExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				vectorSelector();
				}
				break;
			case 8:
				{
				_localctx = new MatrixSelectorExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				matrixSelector();
				}
				break;
			case 9:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				numberLiteral();
				}
				break;
			case 10:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				quoted_string();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(76);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(61);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(62);
						((BinaryExpContext)_localctx).op = match(K_AND);
						setState(63);
						((BinaryExpContext)_localctx).right = expr(14);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(64);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(65);
						((BinaryExpContext)_localctx).op = match(K_OR);
						setState(66);
						((BinaryExpContext)_localctx).right = expr(13);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(67);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(68);
						((BinaryExpContext)_localctx).op = match(K_UNLESS);
						setState(69);
						((BinaryExpContext)_localctx).right = expr(12);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(70);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(71);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SLASH || _la==STAR) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(72);
						((BinaryExpContext)_localctx).right = expr(11);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(73);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(74);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(75);
						((BinaryExpContext)_localctx).right = expr(10);
						}
						break;
					}
					} 
				}
				setState(80);
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
			setState(81);
			((CallContext)_localctx).callName = match(IDENTIFIER);
			setState(82);
			match(LPAREN);
			setState(84);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUOTED2_STRING) | (1L << QUOTED1_STRING) | (1L << K_SUM) | (1L << K_AVG) | (1L << K_COUNT) | (1L << K_MIN) | (1L << K_MAX) | (1L << K_STDDEV) | (1L << K_STDVAR) | (1L << K_TOPK) | (1L << K_BOTTOMK) | (1L << K_COUNT_VALUES) | (1L << INT) | (1L << DOUBLE) | (1L << MINUS) | (1L << LPAREN) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(83);
				argslist();
				}
			}

			setState(86);
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
			setState(88);
			expr(0);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(89);
				match(T__0);
				setState(90);
				expr(0);
				}
				}
				setState(95);
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
			setState(96);
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
			setState(98);
			match(IDENTIFIER);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(99);
				match(T__0);
				setState(100);
				match(IDENTIFIER);
				}
				}
				setState(105);
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
			setState(106);
			_la = _input.LA(1);
			if ( !(_la==K_BY || _la==K_WITHOUT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(107);
			match(LPAREN);
			setState(108);
			identifierList();
			setState(109);
			match(RPAREN);
			setState(111);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(110);
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
			setState(129);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(LPAREN);
				setState(114);
				match(IDENTIFIER);
				setState(116);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(115);
					labelMatcherList();
					}
				}

				setState(118);
				match(RPAREN);
				setState(120);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(119);
					offsetExpr();
					}
					break;
				}
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(IDENTIFIER);
				setState(124);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(123);
					labelMatcherList();
					}
					break;
				}
				setState(127);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(126);
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
			setState(149);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(LPAREN);
				setState(132);
				match(IDENTIFIER);
				setState(134);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(133);
					labelMatcherList();
					}
				}

				setState(136);
				match(RPAREN);
				setState(137);
				rangeExpr();
				setState(139);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(138);
					offsetExpr();
					}
					break;
				}
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(IDENTIFIER);
				setState(143);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(142);
					labelMatcherList();
					}
				}

				setState(145);
				rangeExpr();
				setState(147);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(146);
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
			setState(167);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(T__1);
				setState(153);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(152);
					labelMatcher();
					}
				}

				setState(155);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(T__1);
				setState(157);
				labelMatcher();
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(158);
					match(T__0);
					setState(159);
					labelMatcher();
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(165);
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
			setState(175);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(IDENTIFIER);
				setState(170);
				((LabelMatcherContext)_localctx).match_op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
					((LabelMatcherContext)_localctx).match_op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(171);
				numberLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(IDENTIFIER);
				setState(173);
				((LabelMatcherContext)_localctx).match_op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
					((LabelMatcherContext)_localctx).match_op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(174);
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
			setState(177);
			match(K_OFFSET);
			setState(178);
			numberLiteral();
			setState(179);
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
			setState(191);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(T__7);
				setState(182);
				numberLiteral();
				setState(183);
				match(TIME_UNIT);
				setState(184);
				match(T__8);
				}
				break;
			case K_BETWEEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(K_BETWEEN);
				setState(187);
				from_time();
				setState(188);
				match(K_AND);
				setState(189);
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
			setState(197);
			switch (_input.LA(1)) {
			case QUOTED2_STRING:
			case QUOTED1_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				quoted_string();
				}
				break;
			case INT:
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				numberLiteral();
				setState(195);
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
			setState(203);
			switch (_input.LA(1)) {
			case QUOTED2_STRING:
			case QUOTED1_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				quoted_string();
				}
				break;
			case INT:
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				numberLiteral();
				setState(201);
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
			setState(205);
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
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\39\u00d2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\5\2&\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\60\n\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2>\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2O\n\2\f\2\16\2R\13\2\3\3\3\3\3\3\5\3"+
		"W\n\3\3\3\3\3\3\4\3\4\3\4\7\4^\n\4\f\4\16\4a\13\4\3\5\3\5\3\6\3\6\3\6"+
		"\7\6h\n\6\f\6\16\6k\13\6\3\7\3\7\3\7\3\7\3\7\5\7r\n\7\3\b\3\b\3\b\5\b"+
		"w\n\b\3\b\3\b\5\b{\n\b\3\b\3\b\5\b\177\n\b\3\b\5\b\u0082\n\b\5\b\u0084"+
		"\n\b\3\t\3\t\3\t\5\t\u0089\n\t\3\t\3\t\3\t\5\t\u008e\n\t\3\t\3\t\5\t\u0092"+
		"\n\t\3\t\3\t\5\t\u0096\n\t\5\t\u0098\n\t\3\n\3\n\5\n\u009c\n\n\3\n\3\n"+
		"\3\n\3\n\3\n\7\n\u00a3\n\n\f\n\16\n\u00a6\13\n\3\n\3\n\5\n\u00aa\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b2\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c2\n\r\3\16\3\16\3\16\3\16\5\16"+
		"\u00c8\n\16\3\17\3\17\3\17\3\17\5\17\u00ce\n\17\3\20\3\20\3\20\2\3\2\21"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\13\3\2\30\36\3\2\37!\3\2-.\3"+
		"\2+,\3\2%&\3\2\23\24\3\2\6\7\3\2\6\t\3\2\r\16\u00e7\2=\3\2\2\2\4S\3\2"+
		"\2\2\6Z\3\2\2\2\bb\3\2\2\2\nd\3\2\2\2\fl\3\2\2\2\16\u0083\3\2\2\2\20\u0097"+
		"\3\2\2\2\22\u00a9\3\2\2\2\24\u00b1\3\2\2\2\26\u00b3\3\2\2\2\30\u00c1\3"+
		"\2\2\2\32\u00c7\3\2\2\2\34\u00cd\3\2\2\2\36\u00cf\3\2\2\2 !\b\2\1\2!\""+
		"\7,\2\2\">\5\2\2\21#%\t\2\2\2$&\5\f\7\2%$\3\2\2\2%&\3\2\2\2&\'\3\2\2\2"+
		"\'>\5\2\2\n()\7\64\2\2)*\5\2\2\2*+\7\65\2\2+>\3\2\2\2,-\t\2\2\2-/\5\2"+
		"\2\2.\60\5\f\7\2/.\3\2\2\2/\60\3\2\2\2\60>\3\2\2\2\61\62\t\3\2\2\62\63"+
		"\7\64\2\2\63\64\7%\2\2\64\65\7\3\2\2\65\66\5\2\2\2\66\67\7\65\2\2\67>"+
		"\3\2\2\28>\5\4\3\29>\5\16\b\2:>\5\20\t\2;>\5\b\5\2<>\5\36\20\2= \3\2\2"+
		"\2=#\3\2\2\2=(\3\2\2\2=,\3\2\2\2=\61\3\2\2\2=8\3\2\2\2=9\3\2\2\2=:\3\2"+
		"\2\2=;\3\2\2\2=<\3\2\2\2>P\3\2\2\2?@\f\17\2\2@A\7\20\2\2AO\5\2\2\20BC"+
		"\f\16\2\2CD\7\21\2\2DO\5\2\2\17EF\f\r\2\2FG\7\22\2\2GO\5\2\2\16HI\f\f"+
		"\2\2IJ\t\4\2\2JO\5\2\2\rKL\f\13\2\2LM\t\5\2\2MO\5\2\2\fN?\3\2\2\2NB\3"+
		"\2\2\2NE\3\2\2\2NH\3\2\2\2NK\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\3"+
		"\3\2\2\2RP\3\2\2\2ST\7\67\2\2TV\7\64\2\2UW\5\6\4\2VU\3\2\2\2VW\3\2\2\2"+
		"WX\3\2\2\2XY\7\65\2\2Y\5\3\2\2\2Z_\5\2\2\2[\\\7\3\2\2\\^\5\2\2\2][\3\2"+
		"\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\7\3\2\2\2a_\3\2\2\2bc\t\6\2\2c\t\3"+
		"\2\2\2di\7\67\2\2ef\7\3\2\2fh\7\67\2\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2i"+
		"j\3\2\2\2j\13\3\2\2\2ki\3\2\2\2lm\t\7\2\2mn\7\64\2\2no\5\n\6\2oq\7\65"+
		"\2\2pr\7\25\2\2qp\3\2\2\2qr\3\2\2\2r\r\3\2\2\2st\7\64\2\2tv\7\67\2\2u"+
		"w\5\22\n\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xz\7\65\2\2y{\5\26\f\2zy\3\2\2"+
		"\2z{\3\2\2\2{\u0084\3\2\2\2|~\7\67\2\2}\177\5\22\n\2~}\3\2\2\2~\177\3"+
		"\2\2\2\177\u0081\3\2\2\2\u0080\u0082\5\26\f\2\u0081\u0080\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083s\3\2\2\2\u0083|\3\2\2\2\u0084"+
		"\17\3\2\2\2\u0085\u0086\7\64\2\2\u0086\u0088\7\67\2\2\u0087\u0089\5\22"+
		"\n\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\7\65\2\2\u008b\u008d\5\30\r\2\u008c\u008e\5\26\f\2\u008d\u008c"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0098\3\2\2\2\u008f\u0091\7\67\2\2"+
		"\u0090\u0092\5\22\n\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0095\5\30\r\2\u0094\u0096\5\26\f\2\u0095\u0094\3\2\2\2"+
		"\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0085\3\2\2\2\u0097\u008f"+
		"\3\2\2\2\u0098\21\3\2\2\2\u0099\u009b\7\4\2\2\u009a\u009c\5\24\13\2\u009b"+
		"\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00aa\7\5"+
		"\2\2\u009e\u009f\7\4\2\2\u009f\u00a4\5\24\13\2\u00a0\u00a1\7\3\2\2\u00a1"+
		"\u00a3\5\24\13\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3"+
		"\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00a8\7\5\2\2\u00a8\u00aa\3\2\2\2\u00a9\u0099\3\2\2\2\u00a9\u009e\3\2"+
		"\2\2\u00aa\23\3\2\2\2\u00ab\u00ac\7\67\2\2\u00ac\u00ad\t\b\2\2\u00ad\u00b2"+
		"\5\b\5\2\u00ae\u00af\7\67\2\2\u00af\u00b0\t\t\2\2\u00b0\u00b2\5\36\20"+
		"\2\u00b1\u00ab\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b2\25\3\2\2\2\u00b3\u00b4"+
		"\7\26\2\2\u00b4\u00b5\5\b\5\2\u00b5\u00b6\7\f\2\2\u00b6\27\3\2\2\2\u00b7"+
		"\u00b8\7\n\2\2\u00b8\u00b9\5\b\5\2\u00b9\u00ba\7\f\2\2\u00ba\u00bb\7\13"+
		"\2\2\u00bb\u00c2\3\2\2\2\u00bc\u00bd\7\27\2\2\u00bd\u00be\5\32\16\2\u00be"+
		"\u00bf\7\20\2\2\u00bf\u00c0\5\34\17\2\u00c0\u00c2\3\2\2\2\u00c1\u00b7"+
		"\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c2\31\3\2\2\2\u00c3\u00c8\5\36\20\2\u00c4"+
		"\u00c5\5\b\5\2\u00c5\u00c6\7\f\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c3\3\2"+
		"\2\2\u00c7\u00c4\3\2\2\2\u00c8\33\3\2\2\2\u00c9\u00ce\5\36\20\2\u00ca"+
		"\u00cb\5\b\5\2\u00cb\u00cc\7\f\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00c9\3\2"+
		"\2\2\u00cd\u00ca\3\2\2\2\u00ce\35\3\2\2\2\u00cf\u00d0\t\n\2\2\u00d0\37"+
		"\3\2\2\2\34%/=NPV_iqvz~\u0081\u0083\u0088\u008d\u0091\u0095\u0097\u009b"+
		"\u00a4\u00a9\u00b1\u00c1\u00c7\u00cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}