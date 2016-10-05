// Generated from C:\work\study\metrics_poc\src\com\madisp\stupid\Stupid.g4 by ANTLR 4.5.1

package com.madisp.stupid.gen;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StupidParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, STRING=7, NULL=8, TRUE=9, 
		FALSE=10, INT=11, DOUBLE=12, BANG=13, AND=14, EQUALS=15, OR=16, PLUS=17, 
		MINUS=18, SLASH=19, STAR=20, LANGLE=21, RANGLE=22, DOLLAR=23, ASK=24, 
		COLON=25, LPAREN=26, RPAREN=27, DOT=28, IDENTIFIER=29, WS=30;
	public static final int
		RULE_prog = 0, RULE_statements = 1, RULE_expr = 2, RULE_value = 3, RULE_assign = 4, 
		RULE_var = 5, RULE_call = 6, RULE_argslist = 7, RULE_bool = 8, RULE_str = 9, 
		RULE_num = 10, RULE_nil = 11, RULE_resource = 12, RULE_pckg = 13, RULE_block = 14, 
		RULE_varlist = 15;
	public static final String[] ruleNames = {
		"prog", "statements", "expr", "value", "assign", "var", "call", "argslist", 
		"bool", "str", "num", "nil", "resource", "pckg", "block", "varlist"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "','", "'@'", "'{'", "'|'", "'}'", null, "'null'", "'true'", 
		"'false'", null, null, "'!'", "'and'", "'='", "'or'", "'+'", "'-'", "'/'", 
		"'*'", "'<'", "'>'", "'$'", "'?'", "':'", "'('", "')'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "STRING", "NULL", "TRUE", "FALSE", 
		"INT", "DOUBLE", "BANG", "AND", "EQUALS", "OR", "PLUS", "MINUS", "SLASH", 
		"STAR", "LANGLE", "RANGLE", "DOLLAR", "ASK", "COLON", "LPAREN", "RPAREN", 
		"DOT", "IDENTIFIER", "WS"
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
	public String getGrammarFileName() { return "Stupid.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StupidParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(StupidParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidVisitor ) return ((StupidVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			statements();
			setState(33);
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

	public static class StatementsContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidVisitor ) return ((StupidVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		try {
			setState(40);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				expr(0);
				setState(36);
				match(T__0);
				setState(37);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext left;
		public ExprContext center;
		public ExprContext right;
		public TerminalNode BANG() { return getToken(StupidParser.BANG, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(StupidParser.MINUS, 0); }
		public TerminalNode LPAREN() { return getToken(StupidParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(StupidParser.RPAREN, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode STAR() { return getToken(StupidParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(StupidParser.SLASH, 0); }
		public TerminalNode PLUS() { return getToken(StupidParser.PLUS, 0); }
		public TerminalNode LANGLE() { return getToken(StupidParser.LANGLE, 0); }
		public TerminalNode RANGLE() { return getToken(StupidParser.RANGLE, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(StupidParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(StupidParser.EQUALS, i);
		}
		public TerminalNode AND() { return getToken(StupidParser.AND, 0); }
		public TerminalNode OR() { return getToken(StupidParser.OR, 0); }
		public TerminalNode ASK() { return getToken(StupidParser.ASK, 0); }
		public TerminalNode COLON() { return getToken(StupidParser.COLON, 0); }
		public TerminalNode DOT() { return getToken(StupidParser.DOT, 0); }
		public ArgslistContext argslist() {
			return getRuleContext(ArgslistContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidVisitor ) return ((StupidVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(43);
				match(BANG);
				setState(44);
				((ExprContext)_localctx).center = expr(21);
				}
				break;
			case 2:
				{
				setState(45);
				match(MINUS);
				setState(46);
				((ExprContext)_localctx).center = expr(20);
				}
				break;
			case 3:
				{
				setState(47);
				match(LPAREN);
				setState(48);
				((ExprContext)_localctx).center = expr(0);
				setState(49);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(51);
				var();
				}
				break;
			case 5:
				{
				setState(52);
				call();
				}
				break;
			case 6:
				{
				setState(53);
				assign();
				}
				break;
			case 7:
				{
				setState(54);
				value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(107);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(57);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(58);
						match(STAR);
						setState(59);
						((ExprContext)_localctx).right = expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(60);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(61);
						match(SLASH);
						setState(62);
						((ExprContext)_localctx).right = expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(63);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(64);
						match(PLUS);
						setState(65);
						((ExprContext)_localctx).right = expr(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(66);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(67);
						match(MINUS);
						setState(68);
						((ExprContext)_localctx).right = expr(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(69);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(70);
						match(LANGLE);
						setState(71);
						((ExprContext)_localctx).right = expr(10);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(72);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(73);
						match(RANGLE);
						setState(74);
						((ExprContext)_localctx).right = expr(9);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(75);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(76);
						match(EQUALS);
						setState(77);
						match(EQUALS);
						setState(78);
						((ExprContext)_localctx).right = expr(8);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(79);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(80);
						match(AND);
						setState(81);
						((ExprContext)_localctx).right = expr(7);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(82);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(83);
						match(OR);
						setState(84);
						((ExprContext)_localctx).right = expr(6);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(85);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(86);
						match(ASK);
						setState(87);
						((ExprContext)_localctx).center = expr(0);
						setState(88);
						match(COLON);
						setState(89);
						((ExprContext)_localctx).right = expr(5);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(91);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(92);
						match(DOT);
						setState(93);
						var();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(94);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(95);
						match(DOT);
						setState(96);
						call();
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(97);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(98);
						match(DOT);
						setState(99);
						match(LPAREN);
						setState(101);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << STRING) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << INT) | (1L << DOUBLE) | (1L << BANG) | (1L << MINUS) | (1L << LPAREN) | (1L << IDENTIFIER))) != 0)) {
							{
							setState(100);
							argslist();
							}
						}

						setState(103);
						match(RPAREN);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(104);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(105);
						match(DOT);
						setState(106);
						assign();
						}
						break;
					}
					} 
				}
				setState(111);
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

	public static class ValueContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public NilContext nil() {
			return getRuleContext(NilContext.class,0);
		}
		public ResourceContext resource() {
			return getRuleContext(ResourceContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidVisitor ) return ((StupidVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_value);
		try {
			setState(118);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				bool();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				str();
				}
				break;
			case INT:
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				num();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				nil();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				resource();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				block();
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(StupidParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(StupidParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidVisitor ) return ((StupidVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(IDENTIFIER);
			setState(121);
			match(EQUALS);
			setState(122);
			expr(0);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(StupidParser.IDENTIFIER, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidVisitor ) return ((StupidVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(IDENTIFIER);
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(StupidParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(StupidParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(StupidParser.RPAREN, 0); }
		public ArgslistContext argslist() {
			return getRuleContext(ArgslistContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidVisitor ) return ((StupidVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(IDENTIFIER);
			setState(127);
			match(LPAREN);
			setState(129);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << STRING) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << INT) | (1L << DOUBLE) | (1L << BANG) | (1L << MINUS) | (1L << LPAREN) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(128);
				argslist();
				}
			}

			setState(131);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgslistContext argslist() {
			return getRuleContext(ArgslistContext.class,0);
		}
		public ArgslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argslist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidVisitor ) return ((StupidVisitor<? extends T>)visitor).visitArgslist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgslistContext argslist() throws RecognitionException {
		ArgslistContext _localctx = new ArgslistContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argslist);
		try {
			setState(138);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				expr(0);
				setState(134);
				match(T__1);
				setState(135);
				argslist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				expr(0);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(StupidParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(StupidParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidVisitor ) return ((StupidVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class StrContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(StupidParser.STRING, 0); }
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidVisitor ) return ((StupidVisitor<? extends T>)visitor).visitStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(STRING);
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(StupidParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(StupidParser.DOUBLE, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidVisitor ) return ((StupidVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
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

	public static class NilContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(StupidParser.NULL, 0); }
		public NilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidVisitor ) return ((StupidVisitor<? extends T>)visitor).visitNil(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NilContext nil() throws RecognitionException {
		NilContext _localctx = new NilContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_nil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(NULL);
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

	public static class ResourceContext extends ParserRuleContext {
		public Token type;
		public Token name;
		public TerminalNode NULL() { return getToken(StupidParser.NULL, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(StupidParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(StupidParser.IDENTIFIER, i);
		}
		public PckgContext pckg() {
			return getRuleContext(PckgContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidVisitor ) return ((StupidVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__2);
			setState(158);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(152);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(149);
					pckg();
					setState(150);
					match(COLON);
					}
					break;
				}
				setState(154);
				((ResourceContext)_localctx).type = match(IDENTIFIER);
				setState(155);
				match(SLASH);
				setState(156);
				((ResourceContext)_localctx).name = match(IDENTIFIER);
				}
				break;
			case NULL:
				{
				setState(157);
				match(NULL);
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

	public static class PckgContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(StupidParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(StupidParser.IDENTIFIER, i);
		}
		public PckgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pckg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidVisitor ) return ((StupidVisitor<? extends T>)visitor).visitPckg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PckgContext pckg() throws RecognitionException {
		PckgContext _localctx = new PckgContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pckg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(IDENTIFIER);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(161);
				match(DOT);
				setState(162);
				match(IDENTIFIER);
				}
				}
				setState(167);
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

	public static class BlockContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidVisitor ) return ((StupidVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__3);
			setState(173);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(169);
				match(T__4);
				setState(170);
				varlist();
				setState(171);
				match(T__4);
				}
			}

			setState(175);
			statements();
			setState(176);
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

	public static class VarlistContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(StupidParser.IDENTIFIER, 0); }
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StupidVisitor ) return ((StupidVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varlist);
		try {
			setState(182);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(IDENTIFIER);
				setState(179);
				match(T__1);
				setState(180);
				varlist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(IDENTIFIER);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
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
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 17);
		case 11:
			return precpred(_ctx, 15);
		case 12:
			return precpred(_ctx, 14);
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u00bb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4:\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4h\n\4"+
		"\3\4\3\4\3\4\3\4\7\4n\n\4\f\4\16\4q\13\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5y"+
		"\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\b\u0084\n\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u008d\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\5\16\u009b\n\16\3\16\3\16\3\16\3\16\5\16\u00a1\n\16\3\17\3"+
		"\17\3\17\7\17\u00a6\n\17\f\17\16\17\u00a9\13\17\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u00b0\n\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00b9\n\21"+
		"\3\21\2\3\6\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\4\3\2\13\f\3"+
		"\2\r\16\u00cc\2\"\3\2\2\2\4*\3\2\2\2\69\3\2\2\2\bx\3\2\2\2\nz\3\2\2\2"+
		"\f~\3\2\2\2\16\u0080\3\2\2\2\20\u008c\3\2\2\2\22\u008e\3\2\2\2\24\u0090"+
		"\3\2\2\2\26\u0092\3\2\2\2\30\u0094\3\2\2\2\32\u0096\3\2\2\2\34\u00a2\3"+
		"\2\2\2\36\u00aa\3\2\2\2 \u00b8\3\2\2\2\"#\5\4\3\2#$\7\2\2\3$\3\3\2\2\2"+
		"%&\5\6\4\2&\'\7\3\2\2\'(\5\4\3\2(+\3\2\2\2)+\5\6\4\2*%\3\2\2\2*)\3\2\2"+
		"\2+\5\3\2\2\2,-\b\4\1\2-.\7\17\2\2.:\5\6\4\27/\60\7\24\2\2\60:\5\6\4\26"+
		"\61\62\7\34\2\2\62\63\5\6\4\2\63\64\7\35\2\2\64:\3\2\2\2\65:\5\f\7\2\66"+
		":\5\16\b\2\67:\5\n\6\28:\5\b\5\29,\3\2\2\29/\3\2\2\29\61\3\2\2\29\65\3"+
		"\2\2\29\66\3\2\2\29\67\3\2\2\298\3\2\2\2:o\3\2\2\2;<\f\17\2\2<=\7\26\2"+
		"\2=n\5\6\4\20>?\f\16\2\2?@\7\25\2\2@n\5\6\4\17AB\f\r\2\2BC\7\23\2\2Cn"+
		"\5\6\4\16DE\f\f\2\2EF\7\24\2\2Fn\5\6\4\rGH\f\13\2\2HI\7\27\2\2In\5\6\4"+
		"\fJK\f\n\2\2KL\7\30\2\2Ln\5\6\4\13MN\f\t\2\2NO\7\21\2\2OP\7\21\2\2Pn\5"+
		"\6\4\nQR\f\b\2\2RS\7\20\2\2Sn\5\6\4\tTU\f\7\2\2UV\7\22\2\2Vn\5\6\4\bW"+
		"X\f\6\2\2XY\7\32\2\2YZ\5\6\4\2Z[\7\33\2\2[\\\5\6\4\7\\n\3\2\2\2]^\f\23"+
		"\2\2^_\7\36\2\2_n\5\f\7\2`a\f\21\2\2ab\7\36\2\2bn\5\16\b\2cd\f\20\2\2"+
		"de\7\36\2\2eg\7\34\2\2fh\5\20\t\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2in\7\35"+
		"\2\2jk\f\4\2\2kl\7\36\2\2ln\5\n\6\2m;\3\2\2\2m>\3\2\2\2mA\3\2\2\2mD\3"+
		"\2\2\2mG\3\2\2\2mJ\3\2\2\2mM\3\2\2\2mQ\3\2\2\2mT\3\2\2\2mW\3\2\2\2m]\3"+
		"\2\2\2m`\3\2\2\2mc\3\2\2\2mj\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\7"+
		"\3\2\2\2qo\3\2\2\2ry\5\22\n\2sy\5\24\13\2ty\5\26\f\2uy\5\30\r\2vy\5\32"+
		"\16\2wy\5\36\20\2xr\3\2\2\2xs\3\2\2\2xt\3\2\2\2xu\3\2\2\2xv\3\2\2\2xw"+
		"\3\2\2\2y\t\3\2\2\2z{\7\37\2\2{|\7\21\2\2|}\5\6\4\2}\13\3\2\2\2~\177\7"+
		"\37\2\2\177\r\3\2\2\2\u0080\u0081\7\37\2\2\u0081\u0083\7\34\2\2\u0082"+
		"\u0084\5\20\t\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3"+
		"\2\2\2\u0085\u0086\7\35\2\2\u0086\17\3\2\2\2\u0087\u0088\5\6\4\2\u0088"+
		"\u0089\7\4\2\2\u0089\u008a\5\20\t\2\u008a\u008d\3\2\2\2\u008b\u008d\5"+
		"\6\4\2\u008c\u0087\3\2\2\2\u008c\u008b\3\2\2\2\u008d\21\3\2\2\2\u008e"+
		"\u008f\t\2\2\2\u008f\23\3\2\2\2\u0090\u0091\7\t\2\2\u0091\25\3\2\2\2\u0092"+
		"\u0093\t\3\2\2\u0093\27\3\2\2\2\u0094\u0095\7\n\2\2\u0095\31\3\2\2\2\u0096"+
		"\u00a0\7\5\2\2\u0097\u0098\5\34\17\2\u0098\u0099\7\33\2\2\u0099\u009b"+
		"\3\2\2\2\u009a\u0097\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\7\37\2\2\u009d\u009e\7\25\2\2\u009e\u00a1\7\37\2\2\u009f\u00a1"+
		"\7\n\2\2\u00a0\u009a\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\33\3\2\2\2\u00a2"+
		"\u00a7\7\37\2\2\u00a3\u00a4\7\36\2\2\u00a4\u00a6\7\37\2\2\u00a5\u00a3"+
		"\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\35\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00af\7\6\2\2\u00ab\u00ac\7\7\2"+
		"\2\u00ac\u00ad\5 \21\2\u00ad\u00ae\7\7\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ab"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\5\4\3\2\u00b2"+
		"\u00b3\7\b\2\2\u00b3\37\3\2\2\2\u00b4\u00b5\7\37\2\2\u00b5\u00b6\7\4\2"+
		"\2\u00b6\u00b9\5 \21\2\u00b7\u00b9\7\37\2\2\u00b8\u00b4\3\2\2\2\u00b8"+
		"\u00b7\3\2\2\2\u00b9!\3\2\2\2\17*9gmox\u0083\u008c\u009a\u00a0\u00a7\u00af"+
		"\u00b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}