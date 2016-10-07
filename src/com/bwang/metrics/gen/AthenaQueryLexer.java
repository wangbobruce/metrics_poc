// Generated from C:\work\study\metrics_poc\src\com\bwang\metrics\modal\AthenaQuery.g4 by ANTLR 4.5.1

package com.bwang.metrics.gen;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AthenaQueryLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"TIME_UNIT", "QUOTED2_STRING", "QUOTED1_STRING", "Exponent", "HexDigit", 
		"ESC", "K_AND", "K_OR", "K_UNLESS", "K_BY", "K_WITHOUT", "K_KEEP_COMMON", 
		"K_OFFSET", "K_BETWEEN", "K_SUM", "K_AVG", "K_COUNT", "K_MIN", "K_MAX", 
		"K_STDDEV", "K_STDVAR", "K_TOPK", "K_BOTTOMK", "K_COUNT_VALUES", "NULL", 
		"TRUE", "FALSE", "INT", "DOUBLE", "BANG", "AND", "EQUALS", "OR", "PLUS", 
		"MINUS", "SLASH", "STAR", "LANGLE", "RANGLE", "DOLLAR", "ASK", "COLON", 
		"LPAREN", "RPAREN", "DOT", "IDENTIFIER", "WS", "DIGIT", "UPPERC", "LOWERC", 
		"UNDERS", "ALPHA", "ALPHANUMERIC", "A", "B", "C", "D", "E", "F", "G", 
		"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", 
		"V", "W", "X", "Y", "Z"
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


	public AthenaQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AthenaQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\29\u01fc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\5"+
		"\13\u00ce\n\13\3\f\3\f\7\f\u00d2\n\f\f\f\16\f\u00d5\13\f\3\f\3\f\3\r\3"+
		"\r\7\r\u00db\n\r\f\r\16\r\u00de\13\r\3\r\3\r\3\16\3\16\5\16\u00e4\n\16"+
		"\3\16\6\16\u00e7\n\16\r\16\16\16\u00e8\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3&\6&\u0173\n&\r&\16&\u0174\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\5\'\u017e\n\'\5\'\u0180\n\'\3(\3(\3)\3)\3)\3)\3*\3*\3+\3+\3+\3,\3,\3"+
		"-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\38\38\58\u01a7\n8\38\78\u01aa\n8\f8\168\u01ad"+
		"\138\39\69\u01b0\n9\r9\169\u01b1\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3"+
		">\5>\u01c1\n>\3?\3?\3?\3?\5?\u01c7\n?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3"+
		"E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3"+
		"P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\2\2Z\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\2\35\2\37\17!\20#\21"+
		"%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!"+
		"E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g\63i\64k\65m\66o\67q8s9u\2"+
		"w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d"+
		"\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f"+
		"\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af\2\u00b1"+
		"\2\3\2%\3\2$$\3\2))\4\2GGgg\4\2--//\5\2\62;CHch\7\2))^^ppttvv\4\2ffhh"+
		"\5\2\13\f\16\17\"\"\3\2C\\\3\2c|\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2H"+
		"Hhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4"+
		"\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYy"+
		"y\4\2ZZzz\4\2[[{{\4\2\\\\||\u01ec\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3\u00b3\3\2\2\2\5\u00b5\3\2"+
		"\2\2\7\u00b7\3\2\2\2\t\u00b9\3\2\2\2\13\u00bc\3\2\2\2\r\u00bf\3\2\2\2"+
		"\17\u00c2\3\2\2\2\21\u00c5\3\2\2\2\23\u00c7\3\2\2\2\25\u00cd\3\2\2\2\27"+
		"\u00cf\3\2\2\2\31\u00d8\3\2\2\2\33\u00e1\3\2\2\2\35\u00ea\3\2\2\2\37\u00ec"+
		"\3\2\2\2!\u00ef\3\2\2\2#\u00f3\3\2\2\2%\u00f6\3\2\2\2\'\u00fd\3\2\2\2"+
		")\u0100\3\2\2\2+\u0108\3\2\2\2-\u0114\3\2\2\2/\u011b\3\2\2\2\61\u0123"+
		"\3\2\2\2\63\u0127\3\2\2\2\65\u012b\3\2\2\2\67\u0131\3\2\2\29\u0135\3\2"+
		"\2\2;\u0139\3\2\2\2=\u0140\3\2\2\2?\u0147\3\2\2\2A\u014c\3\2\2\2C\u0154"+
		"\3\2\2\2E\u0161\3\2\2\2G\u0166\3\2\2\2I\u016b\3\2\2\2K\u0172\3\2\2\2M"+
		"\u017f\3\2\2\2O\u0181\3\2\2\2Q\u0183\3\2\2\2S\u0187\3\2\2\2U\u0189\3\2"+
		"\2\2W\u018c\3\2\2\2Y\u018e\3\2\2\2[\u0190\3\2\2\2]\u0192\3\2\2\2_\u0194"+
		"\3\2\2\2a\u0196\3\2\2\2c\u0198\3\2\2\2e\u019a\3\2\2\2g\u019c\3\2\2\2i"+
		"\u019e\3\2\2\2k\u01a0\3\2\2\2m\u01a2\3\2\2\2o\u01a6\3\2\2\2q\u01af\3\2"+
		"\2\2s\u01b5\3\2\2\2u\u01b7\3\2\2\2w\u01b9\3\2\2\2y\u01bb\3\2\2\2{\u01c0"+
		"\3\2\2\2}\u01c6\3\2\2\2\177\u01c8\3\2\2\2\u0081\u01ca\3\2\2\2\u0083\u01cc"+
		"\3\2\2\2\u0085\u01ce\3\2\2\2\u0087\u01d0\3\2\2\2\u0089\u01d2\3\2\2\2\u008b"+
		"\u01d4\3\2\2\2\u008d\u01d6\3\2\2\2\u008f\u01d8\3\2\2\2\u0091\u01da\3\2"+
		"\2\2\u0093\u01dc\3\2\2\2\u0095\u01de\3\2\2\2\u0097\u01e0\3\2\2\2\u0099"+
		"\u01e2\3\2\2\2\u009b\u01e4\3\2\2\2\u009d\u01e6\3\2\2\2\u009f\u01e8\3\2"+
		"\2\2\u00a1\u01ea\3\2\2\2\u00a3\u01ec\3\2\2\2\u00a5\u01ee\3\2\2\2\u00a7"+
		"\u01f0\3\2\2\2\u00a9\u01f2\3\2\2\2\u00ab\u01f4\3\2\2\2\u00ad\u01f6\3\2"+
		"\2\2\u00af\u01f8\3\2\2\2\u00b1\u01fa\3\2\2\2\u00b3\u00b4\7.\2\2\u00b4"+
		"\4\3\2\2\2\u00b5\u00b6\7}\2\2\u00b6\6\3\2\2\2\u00b7\u00b8\7\177\2\2\u00b8"+
		"\b\3\2\2\2\u00b9\u00ba\7?\2\2\u00ba\u00bb\7?\2\2\u00bb\n\3\2\2\2\u00bc"+
		"\u00bd\7#\2\2\u00bd\u00be\7?\2\2\u00be\f\3\2\2\2\u00bf\u00c0\7?\2\2\u00c0"+
		"\u00c1\7\u0080\2\2\u00c1\16\3\2\2\2\u00c2\u00c3\7#\2\2\u00c3\u00c4\7\u0080"+
		"\2\2\u00c4\20\3\2\2\2\u00c5\u00c6\7]\2\2\u00c6\22\3\2\2\2\u00c7\u00c8"+
		"\7_\2\2\u00c8\24\3\2\2\2\u00c9\u00ce\5\u0085C\2\u00ca\u00ce\5\u008dG\2"+
		"\u00cb\u00ce\5\u0097L\2\u00cc\u00ce\5\u00a3R\2\u00cd\u00c9\3\2\2\2\u00cd"+
		"\u00ca\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\26\3\2\2"+
		"\2\u00cf\u00d3\7$\2\2\u00d0\u00d2\n\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5"+
		"\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6\u00d7\7$\2\2\u00d7\30\3\2\2\2\u00d8\u00dc\7)\2\2"+
		"\u00d9\u00db\n\3\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e0\7)\2\2\u00e0\32\3\2\2\2\u00e1\u00e3\t\4\2\2\u00e2\u00e4\t\5\2\2"+
		"\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e7"+
		"\4\62;\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\34\3\2\2\2\u00ea\u00eb\t\6\2\2\u00eb\36\3\2\2\2\u00ec"+
		"\u00ed\7^\2\2\u00ed\u00ee\t\7\2\2\u00ee \3\2\2\2\u00ef\u00f0\5\177@\2"+
		"\u00f0\u00f1\5\u0099M\2\u00f1\u00f2\5\u0085C\2\u00f2\"\3\2\2\2\u00f3\u00f4"+
		"\5\u009bN\2\u00f4\u00f5\5\u00a1Q\2\u00f5$\3\2\2\2\u00f6\u00f7\5\u00a7"+
		"T\2\u00f7\u00f8\5\u0099M\2\u00f8\u00f9\5\u0095K\2\u00f9\u00fa\5\u0087"+
		"D\2\u00fa\u00fb\5\u00a3R\2\u00fb\u00fc\5\u00a3R\2\u00fc&\3\2\2\2\u00fd"+
		"\u00fe\5\u0081A\2\u00fe\u00ff\5\u00afX\2\u00ff(\3\2\2\2\u0100\u0101\5"+
		"\u00abV\2\u0101\u0102\5\u008fH\2\u0102\u0103\5\u00a5S\2\u0103\u0104\5"+
		"\u008dG\2\u0104\u0105\5\u009bN\2\u0105\u0106\5\u00a7T\2\u0106\u0107\5"+
		"\u00a5S\2\u0107*\3\2\2\2\u0108\u0109\5\u0093J\2\u0109\u010a\5\u0087D\2"+
		"\u010a\u010b\5\u0087D\2\u010b\u010c\5\u009dO\2\u010c\u010d\7a\2\2\u010d"+
		"\u010e\5\u0083B\2\u010e\u010f\5\u009bN\2\u010f\u0110\5\u0097L\2\u0110"+
		"\u0111\5\u0097L\2\u0111\u0112\5\u009bN\2\u0112\u0113\5\u0099M\2\u0113"+
		",\3\2\2\2\u0114\u0115\5\u009bN\2\u0115\u0116\5\u0089E\2\u0116\u0117\5"+
		"\u0089E\2\u0117\u0118\5\u00a3R\2\u0118\u0119\5\u0087D\2\u0119\u011a\5"+
		"\u00a5S\2\u011a.\3\2\2\2\u011b\u011c\5\u0081A\2\u011c\u011d\5\u0087D\2"+
		"\u011d\u011e\5\u00a5S\2\u011e\u011f\5\u00abV\2\u011f\u0120\5\u0087D\2"+
		"\u0120\u0121\5\u0087D\2\u0121\u0122\5\u0099M\2\u0122\60\3\2\2\2\u0123"+
		"\u0124\5\u00a3R\2\u0124\u0125\5\u00a7T\2\u0125\u0126\5\u0097L\2\u0126"+
		"\62\3\2\2\2\u0127\u0128\5\177@\2\u0128\u0129\5\u00a9U\2\u0129\u012a\5"+
		"\u008bF\2\u012a\64\3\2\2\2\u012b\u012c\5\u0083B\2\u012c\u012d\5\u009b"+
		"N\2\u012d\u012e\5\u00a7T\2\u012e\u012f\5\u0099M\2\u012f\u0130\5\u00a5"+
		"S\2\u0130\66\3\2\2\2\u0131\u0132\5\u0097L\2\u0132\u0133\5\u008fH\2\u0133"+
		"\u0134\5\u0099M\2\u01348\3\2\2\2\u0135\u0136\5\u0097L\2\u0136\u0137\5"+
		"\177@\2\u0137\u0138\5\u00adW\2\u0138:\3\2\2\2\u0139\u013a\5\u00a3R\2\u013a"+
		"\u013b\5\u00a5S\2\u013b\u013c\5\u0085C\2\u013c\u013d\5\u0085C\2\u013d"+
		"\u013e\5\u0087D\2\u013e\u013f\5\u00a9U\2\u013f<\3\2\2\2\u0140\u0141\5"+
		"\u00a3R\2\u0141\u0142\5\u00a5S\2\u0142\u0143\5\u0085C\2\u0143\u0144\5"+
		"\u00a9U\2\u0144\u0145\5\177@\2\u0145\u0146\5\u00a1Q\2\u0146>\3\2\2\2\u0147"+
		"\u0148\5\u00a5S\2\u0148\u0149\5\u009bN\2\u0149\u014a\5\u009dO\2\u014a"+
		"\u014b\5\u0093J\2\u014b@\3\2\2\2\u014c\u014d\5\u0081A\2\u014d\u014e\5"+
		"\u009bN\2\u014e\u014f\5\u00a5S\2\u014f\u0150\5\u00a5S\2\u0150\u0151\5"+
		"\u009bN\2\u0151\u0152\5\u0097L\2\u0152\u0153\5\u0093J\2\u0153B\3\2\2\2"+
		"\u0154\u0155\5\u0083B\2\u0155\u0156\5\u009bN\2\u0156\u0157\5\u00a7T\2"+
		"\u0157\u0158\5\u0099M\2\u0158\u0159\5\u00a5S\2\u0159\u015a\7a\2\2\u015a"+
		"\u015b\5\u00a9U\2\u015b\u015c\5\177@\2\u015c\u015d\5\u0095K\2\u015d\u015e"+
		"\5\u00a7T\2\u015e\u015f\5\u0087D\2\u015f\u0160\5\u00a3R\2\u0160D\3\2\2"+
		"\2\u0161\u0162\7p\2\2\u0162\u0163\7w\2\2\u0163\u0164\7n\2\2\u0164\u0165"+
		"\7n\2\2\u0165F\3\2\2\2\u0166\u0167\7v\2\2\u0167\u0168\7t\2\2\u0168\u0169"+
		"\7w\2\2\u0169\u016a\7g\2\2\u016aH\3\2\2\2\u016b\u016c\7h\2\2\u016c\u016d"+
		"\7c\2\2\u016d\u016e\7n\2\2\u016e\u016f\7u\2\2\u016f\u0170\7g\2\2\u0170"+
		"J\3\2\2\2\u0171\u0173\5s:\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175L\3\2\2\2\u0176\u0177\5K&\2\u0177"+
		"\u0178\t\b\2\2\u0178\u0180\3\2\2\2\u0179\u017a\5K&\2\u017a\u017b\7\60"+
		"\2\2\u017b\u017d\5K&\2\u017c\u017e\t\b\2\2\u017d\u017c\3\2\2\2\u017d\u017e"+
		"\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u0176\3\2\2\2\u017f\u0179\3\2\2\2\u0180"+
		"N\3\2\2\2\u0181\u0182\7#\2\2\u0182P\3\2\2\2\u0183\u0184\7c\2\2\u0184\u0185"+
		"\7p\2\2\u0185\u0186\7f\2\2\u0186R\3\2\2\2\u0187\u0188\7?\2\2\u0188T\3"+
		"\2\2\2\u0189\u018a\7q\2\2\u018a\u018b\7t\2\2\u018bV\3\2\2\2\u018c\u018d"+
		"\7-\2\2\u018dX\3\2\2\2\u018e\u018f\7/\2\2\u018fZ\3\2\2\2\u0190\u0191\7"+
		"\61\2\2\u0191\\\3\2\2\2\u0192\u0193\7,\2\2\u0193^\3\2\2\2\u0194\u0195"+
		"\7>\2\2\u0195`\3\2\2\2\u0196\u0197\7@\2\2\u0197b\3\2\2\2\u0198\u0199\7"+
		"&\2\2\u0199d\3\2\2\2\u019a\u019b\7A\2\2\u019bf\3\2\2\2\u019c\u019d\7<"+
		"\2\2\u019dh\3\2\2\2\u019e\u019f\7*\2\2\u019fj\3\2\2\2\u01a0\u01a1\7+\2"+
		"\2\u01a1l\3\2\2\2\u01a2\u01a3\7\60\2\2\u01a3n\3\2\2\2\u01a4\u01a7\5{>"+
		"\2\u01a5\u01a7\5c\62\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01ab"+
		"\3\2\2\2\u01a8\u01aa\5}?\2\u01a9\u01a8\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab"+
		"\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01acp\3\2\2\2\u01ad\u01ab\3\2\2\2"+
		"\u01ae\u01b0\t\t\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01af"+
		"\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\b9\2\2\u01b4"+
		"r\3\2\2\2\u01b5\u01b6\4\62;\2\u01b6t\3\2\2\2\u01b7\u01b8\t\n\2\2\u01b8"+
		"v\3\2\2\2\u01b9\u01ba\t\13\2\2\u01bax\3\2\2\2\u01bb\u01bc\7a\2\2\u01bc"+
		"z\3\2\2\2\u01bd\u01c1\5u;\2\u01be\u01c1\5w<\2\u01bf\u01c1\5y=\2\u01c0"+
		"\u01bd\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1|\3\2\2\2"+
		"\u01c2\u01c7\5u;\2\u01c3\u01c7\5w<\2\u01c4\u01c7\5y=\2\u01c5\u01c7\5s"+
		":\2\u01c6\u01c2\3\2\2\2\u01c6\u01c3\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6"+
		"\u01c5\3\2\2\2\u01c7~\3\2\2\2\u01c8\u01c9\t\f\2\2\u01c9\u0080\3\2\2\2"+
		"\u01ca\u01cb\t\r\2\2\u01cb\u0082\3\2\2\2\u01cc\u01cd\t\16\2\2\u01cd\u0084"+
		"\3\2\2\2\u01ce\u01cf\t\17\2\2\u01cf\u0086\3\2\2\2\u01d0\u01d1\t\4\2\2"+
		"\u01d1\u0088\3\2\2\2\u01d2\u01d3\t\20\2\2\u01d3\u008a\3\2\2\2\u01d4\u01d5"+
		"\t\21\2\2\u01d5\u008c\3\2\2\2\u01d6\u01d7\t\22\2\2\u01d7\u008e\3\2\2\2"+
		"\u01d8\u01d9\t\23\2\2\u01d9\u0090\3\2\2\2\u01da\u01db\t\24\2\2\u01db\u0092"+
		"\3\2\2\2\u01dc\u01dd\t\25\2\2\u01dd\u0094\3\2\2\2\u01de\u01df\t\26\2\2"+
		"\u01df\u0096\3\2\2\2\u01e0\u01e1\t\27\2\2\u01e1\u0098\3\2\2\2\u01e2\u01e3"+
		"\t\30\2\2\u01e3\u009a\3\2\2\2\u01e4\u01e5\t\31\2\2\u01e5\u009c\3\2\2\2"+
		"\u01e6\u01e7\t\32\2\2\u01e7\u009e\3\2\2\2\u01e8\u01e9\t\33\2\2\u01e9\u00a0"+
		"\3\2\2\2\u01ea\u01eb\t\34\2\2\u01eb\u00a2\3\2\2\2\u01ec\u01ed\t\35\2\2"+
		"\u01ed\u00a4\3\2\2\2\u01ee\u01ef\t\36\2\2\u01ef\u00a6\3\2\2\2\u01f0\u01f1"+
		"\t\37\2\2\u01f1\u00a8\3\2\2\2\u01f2\u01f3\t \2\2\u01f3\u00aa\3\2\2\2\u01f4"+
		"\u01f5\t!\2\2\u01f5\u00ac\3\2\2\2\u01f6\u01f7\t\"\2\2\u01f7\u00ae\3\2"+
		"\2\2\u01f8\u01f9\t#\2\2\u01f9\u00b0\3\2\2\2\u01fa\u01fb\t$\2\2\u01fb\u00b2"+
		"\3\2\2\2\20\2\u00cd\u00d3\u00dc\u00e3\u00e8\u0174\u017d\u017f\u01a6\u01ab"+
		"\u01b1\u01c0\u01c6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}