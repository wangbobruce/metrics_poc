// Generated from E:\Study\github\metrics_poc\src\com\bwang\metrics\modal\AthenaQuery.g4 by ANTLR 4.5.1

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
		T__9=10, T__10=11, TIME_UNIT=12, QUOTED2_STRING=13, QUOTED1_STRING=14, 
		ESC=15, K_AND=16, K_OR=17, K_UNLESS=18, K_BY=19, K_WITHOUT=20, K_KEEP_COMMON=21, 
		K_OFFSET=22, K_BETWEEN=23, K_SUM=24, K_AVG=25, K_COUNT=26, K_MIN=27, K_MAX=28, 
		K_STDDEV=29, K_STDVAR=30, K_TOPK=31, K_BOTTOMK=32, K_COUNT_VALUES=33, 
		NULL=34, TRUE=35, FALSE=36, INT=37, DOUBLE=38, BANG=39, AND=40, EQUALS=41, 
		OR=42, PLUS=43, MINUS=44, SLASH=45, STAR=46, LANGLE=47, RANGLE=48, DOLLAR=49, 
		ASK=50, COLON=51, LPAREN=52, RPAREN=53, DOT=54, IDENTIFIER=55, WS=56, 
		DIGIT=57;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "TIME_UNIT", "QUOTED2_STRING", "QUOTED1_STRING", "Exponent", 
		"HexDigit", "ESC", "K_AND", "K_OR", "K_UNLESS", "K_BY", "K_WITHOUT", "K_KEEP_COMMON", 
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
		null, "'=='", "'!='", "'<='", "'>='", "','", "'{'", "'}'", "'=~'", "'!~'", 
		"'['", "']'", null, null, null, null, null, null, null, null, null, null, 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2;\u0206\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\3\2\3\2\3\2\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00d8\n\r\3\16\3\16\7\16\u00dc\n"+
		"\16\f\16\16\16\u00df\13\16\3\16\3\16\3\17\3\17\7\17\u00e5\n\17\f\17\16"+
		"\17\u00e8\13\17\3\17\3\17\3\20\3\20\5\20\u00ee\n\20\3\20\6\20\u00f1\n"+
		"\20\r\20\16\20\u00f2\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&"+
		"\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\6(\u017d\n(\r(\16(\u017e\3)\3"+
		")\3)\3)\3)\3)\3)\5)\u0188\n)\5)\u018a\n)\3*\3*\3+\3+\3+\3+\3,\3,\3-\3"+
		"-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\5:\u01b1\n:\3:\7:\u01b4\n"+
		":\f:\16:\u01b7\13:\3;\6;\u01ba\n;\r;\16;\u01bb\3;\3;\3<\3<\3=\3=\3>\3"+
		">\3?\3?\3@\3@\3@\5@\u01cb\n@\3A\3A\3A\3A\5A\u01d1\nA\3B\3B\3C\3C\3D\3"+
		"D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3"+
		"P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3"+
		"[\2\2\\\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\2!\2#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34"+
		";\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g\63i\64k\65"+
		"m\66o\67q8s9u:w;y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089"+
		"\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b"+
		"\2\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad"+
		"\2\u00af\2\u00b1\2\u00b3\2\u00b5\2\3\2%\3\2$$\3\2))\4\2GGgg\4\2--//\5"+
		"\2\62;CHch\7\2))^^ppttvv\4\2ffhh\5\2\13\f\16\17\"\"\3\2C\\\3\2c|\4\2C"+
		"Ccc\4\2DDdd\4\2EEee\4\2FFff\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4"+
		"\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUu"+
		"u\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\u01f6\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2"+
		")\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3\u00b7\3\2\2\2\5\u00ba\3\2\2\2\7\u00bd\3"+
		"\2\2\2\t\u00c0\3\2\2\2\13\u00c3\3\2\2\2\r\u00c5\3\2\2\2\17\u00c7\3\2\2"+
		"\2\21\u00c9\3\2\2\2\23\u00cc\3\2\2\2\25\u00cf\3\2\2\2\27\u00d1\3\2\2\2"+
		"\31\u00d7\3\2\2\2\33\u00d9\3\2\2\2\35\u00e2\3\2\2\2\37\u00eb\3\2\2\2!"+
		"\u00f4\3\2\2\2#\u00f6\3\2\2\2%\u00f9\3\2\2\2\'\u00fd\3\2\2\2)\u0100\3"+
		"\2\2\2+\u0107\3\2\2\2-\u010a\3\2\2\2/\u0112\3\2\2\2\61\u011e\3\2\2\2\63"+
		"\u0125\3\2\2\2\65\u012d\3\2\2\2\67\u0131\3\2\2\29\u0135\3\2\2\2;\u013b"+
		"\3\2\2\2=\u013f\3\2\2\2?\u0143\3\2\2\2A\u014a\3\2\2\2C\u0151\3\2\2\2E"+
		"\u0156\3\2\2\2G\u015e\3\2\2\2I\u016b\3\2\2\2K\u0170\3\2\2\2M\u0175\3\2"+
		"\2\2O\u017c\3\2\2\2Q\u0189\3\2\2\2S\u018b\3\2\2\2U\u018d\3\2\2\2W\u0191"+
		"\3\2\2\2Y\u0193\3\2\2\2[\u0196\3\2\2\2]\u0198\3\2\2\2_\u019a\3\2\2\2a"+
		"\u019c\3\2\2\2c\u019e\3\2\2\2e\u01a0\3\2\2\2g\u01a2\3\2\2\2i\u01a4\3\2"+
		"\2\2k\u01a6\3\2\2\2m\u01a8\3\2\2\2o\u01aa\3\2\2\2q\u01ac\3\2\2\2s\u01b0"+
		"\3\2\2\2u\u01b9\3\2\2\2w\u01bf\3\2\2\2y\u01c1\3\2\2\2{\u01c3\3\2\2\2}"+
		"\u01c5\3\2\2\2\177\u01ca\3\2\2\2\u0081\u01d0\3\2\2\2\u0083\u01d2\3\2\2"+
		"\2\u0085\u01d4\3\2\2\2\u0087\u01d6\3\2\2\2\u0089\u01d8\3\2\2\2\u008b\u01da"+
		"\3\2\2\2\u008d\u01dc\3\2\2\2\u008f\u01de\3\2\2\2\u0091\u01e0\3\2\2\2\u0093"+
		"\u01e2\3\2\2\2\u0095\u01e4\3\2\2\2\u0097\u01e6\3\2\2\2\u0099\u01e8\3\2"+
		"\2\2\u009b\u01ea\3\2\2\2\u009d\u01ec\3\2\2\2\u009f\u01ee\3\2\2\2\u00a1"+
		"\u01f0\3\2\2\2\u00a3\u01f2\3\2\2\2\u00a5\u01f4\3\2\2\2\u00a7\u01f6\3\2"+
		"\2\2\u00a9\u01f8\3\2\2\2\u00ab\u01fa\3\2\2\2\u00ad\u01fc\3\2\2\2\u00af"+
		"\u01fe\3\2\2\2\u00b1\u0200\3\2\2\2\u00b3\u0202\3\2\2\2\u00b5\u0204\3\2"+
		"\2\2\u00b7\u00b8\7?\2\2\u00b8\u00b9\7?\2\2\u00b9\4\3\2\2\2\u00ba\u00bb"+
		"\7#\2\2\u00bb\u00bc\7?\2\2\u00bc\6\3\2\2\2\u00bd\u00be\7>\2\2\u00be\u00bf"+
		"\7?\2\2\u00bf\b\3\2\2\2\u00c0\u00c1\7@\2\2\u00c1\u00c2\7?\2\2\u00c2\n"+
		"\3\2\2\2\u00c3\u00c4\7.\2\2\u00c4\f\3\2\2\2\u00c5\u00c6\7}\2\2\u00c6\16"+
		"\3\2\2\2\u00c7\u00c8\7\177\2\2\u00c8\20\3\2\2\2\u00c9\u00ca\7?\2\2\u00ca"+
		"\u00cb\7\u0080\2\2\u00cb\22\3\2\2\2\u00cc\u00cd\7#\2\2\u00cd\u00ce\7\u0080"+
		"\2\2\u00ce\24\3\2\2\2\u00cf\u00d0\7]\2\2\u00d0\26\3\2\2\2\u00d1\u00d2"+
		"\7_\2\2\u00d2\30\3\2\2\2\u00d3\u00d8\5\u0089E\2\u00d4\u00d8\5\u0091I\2"+
		"\u00d5\u00d8\5\u009bN\2\u00d6\u00d8\5\u00a7T\2\u00d7\u00d3\3\2\2\2\u00d7"+
		"\u00d4\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\32\3\2\2"+
		"\2\u00d9\u00dd\7$\2\2\u00da\u00dc\n\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00df"+
		"\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e1\7$\2\2\u00e1\34\3\2\2\2\u00e2\u00e6\7)\2\2"+
		"\u00e3\u00e5\n\3\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\u00ea\7)\2\2\u00ea\36\3\2\2\2\u00eb\u00ed\t\4\2\2\u00ec\u00ee\t\5\2\2"+
		"\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00f1"+
		"\4\62;\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3 \3\2\2\2\u00f4\u00f5\t\6\2\2\u00f5\"\3\2\2\2\u00f6"+
		"\u00f7\7^\2\2\u00f7\u00f8\t\7\2\2\u00f8$\3\2\2\2\u00f9\u00fa\5\u0083B"+
		"\2\u00fa\u00fb\5\u009dO\2\u00fb\u00fc\5\u0089E\2\u00fc&\3\2\2\2\u00fd"+
		"\u00fe\5\u009fP\2\u00fe\u00ff\5\u00a5S\2\u00ff(\3\2\2\2\u0100\u0101\5"+
		"\u00abV\2\u0101\u0102\5\u009dO\2\u0102\u0103\5\u0099M\2\u0103\u0104\5"+
		"\u008bF\2\u0104\u0105\5\u00a7T\2\u0105\u0106\5\u00a7T\2\u0106*\3\2\2\2"+
		"\u0107\u0108\5\u0085C\2\u0108\u0109\5\u00b3Z\2\u0109,\3\2\2\2\u010a\u010b"+
		"\5\u00afX\2\u010b\u010c\5\u0093J\2\u010c\u010d\5\u00a9U\2\u010d\u010e"+
		"\5\u0091I\2\u010e\u010f\5\u009fP\2\u010f\u0110\5\u00abV\2\u0110\u0111"+
		"\5\u00a9U\2\u0111.\3\2\2\2\u0112\u0113\5\u0097L\2\u0113\u0114\5\u008b"+
		"F\2\u0114\u0115\5\u008bF\2\u0115\u0116\5\u00a1Q\2\u0116\u0117\7a\2\2\u0117"+
		"\u0118\5\u0087D\2\u0118\u0119\5\u009fP\2\u0119\u011a\5\u009bN\2\u011a"+
		"\u011b\5\u009bN\2\u011b\u011c\5\u009fP\2\u011c\u011d\5\u009dO\2\u011d"+
		"\60\3\2\2\2\u011e\u011f\5\u009fP\2\u011f\u0120\5\u008dG\2\u0120\u0121"+
		"\5\u008dG\2\u0121\u0122\5\u00a7T\2\u0122\u0123\5\u008bF\2\u0123\u0124"+
		"\5\u00a9U\2\u0124\62\3\2\2\2\u0125\u0126\5\u0085C\2\u0126\u0127\5\u008b"+
		"F\2\u0127\u0128\5\u00a9U\2\u0128\u0129\5\u00afX\2\u0129\u012a\5\u008b"+
		"F\2\u012a\u012b\5\u008bF\2\u012b\u012c\5\u009dO\2\u012c\64\3\2\2\2\u012d"+
		"\u012e\5\u00a7T\2\u012e\u012f\5\u00abV\2\u012f\u0130\5\u009bN\2\u0130"+
		"\66\3\2\2\2\u0131\u0132\5\u0083B\2\u0132\u0133\5\u00adW\2\u0133\u0134"+
		"\5\u008fH\2\u01348\3\2\2\2\u0135\u0136\5\u0087D\2\u0136\u0137\5\u009f"+
		"P\2\u0137\u0138\5\u00abV\2\u0138\u0139\5\u009dO\2\u0139\u013a\5\u00a9"+
		"U\2\u013a:\3\2\2\2\u013b\u013c\5\u009bN\2\u013c\u013d\5\u0093J\2\u013d"+
		"\u013e\5\u009dO\2\u013e<\3\2\2\2\u013f\u0140\5\u009bN\2\u0140\u0141\5"+
		"\u0083B\2\u0141\u0142\5\u00b1Y\2\u0142>\3\2\2\2\u0143\u0144\5\u00a7T\2"+
		"\u0144\u0145\5\u00a9U\2\u0145\u0146\5\u0089E\2\u0146\u0147\5\u0089E\2"+
		"\u0147\u0148\5\u008bF\2\u0148\u0149\5\u00adW\2\u0149@\3\2\2\2\u014a\u014b"+
		"\5\u00a7T\2\u014b\u014c\5\u00a9U\2\u014c\u014d\5\u0089E\2\u014d\u014e"+
		"\5\u00adW\2\u014e\u014f\5\u0083B\2\u014f\u0150\5\u00a5S\2\u0150B\3\2\2"+
		"\2\u0151\u0152\5\u00a9U\2\u0152\u0153\5\u009fP\2\u0153\u0154\5\u00a1Q"+
		"\2\u0154\u0155\5\u0097L\2\u0155D\3\2\2\2\u0156\u0157\5\u0085C\2\u0157"+
		"\u0158\5\u009fP\2\u0158\u0159\5\u00a9U\2\u0159\u015a\5\u00a9U\2\u015a"+
		"\u015b\5\u009fP\2\u015b\u015c\5\u009bN\2\u015c\u015d\5\u0097L\2\u015d"+
		"F\3\2\2\2\u015e\u015f\5\u0087D\2\u015f\u0160\5\u009fP\2\u0160\u0161\5"+
		"\u00abV\2\u0161\u0162\5\u009dO\2\u0162\u0163\5\u00a9U\2\u0163\u0164\7"+
		"a\2\2\u0164\u0165\5\u00adW\2\u0165\u0166\5\u0083B\2\u0166\u0167\5\u0099"+
		"M\2\u0167\u0168\5\u00abV\2\u0168\u0169\5\u008bF\2\u0169\u016a\5\u00a7"+
		"T\2\u016aH\3\2\2\2\u016b\u016c\7p\2\2\u016c\u016d\7w\2\2\u016d\u016e\7"+
		"n\2\2\u016e\u016f\7n\2\2\u016fJ\3\2\2\2\u0170\u0171\7v\2\2\u0171\u0172"+
		"\7t\2\2\u0172\u0173\7w\2\2\u0173\u0174\7g\2\2\u0174L\3\2\2\2\u0175\u0176"+
		"\7h\2\2\u0176\u0177\7c\2\2\u0177\u0178\7n\2\2\u0178\u0179\7u\2\2\u0179"+
		"\u017a\7g\2\2\u017aN\3\2\2\2\u017b\u017d\5w<\2\u017c\u017b\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017fP\3\2\2\2"+
		"\u0180\u0181\5O(\2\u0181\u0182\t\b\2\2\u0182\u018a\3\2\2\2\u0183\u0184"+
		"\5O(\2\u0184\u0185\7\60\2\2\u0185\u0187\5O(\2\u0186\u0188\t\b\2\2\u0187"+
		"\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u0180\3\2"+
		"\2\2\u0189\u0183\3\2\2\2\u018aR\3\2\2\2\u018b\u018c\7#\2\2\u018cT\3\2"+
		"\2\2\u018d\u018e\7c\2\2\u018e\u018f\7p\2\2\u018f\u0190\7f\2\2\u0190V\3"+
		"\2\2\2\u0191\u0192\7?\2\2\u0192X\3\2\2\2\u0193\u0194\7q\2\2\u0194\u0195"+
		"\7t\2\2\u0195Z\3\2\2\2\u0196\u0197\7-\2\2\u0197\\\3\2\2\2\u0198\u0199"+
		"\7/\2\2\u0199^\3\2\2\2\u019a\u019b\7\61\2\2\u019b`\3\2\2\2\u019c\u019d"+
		"\7,\2\2\u019db\3\2\2\2\u019e\u019f\7>\2\2\u019fd\3\2\2\2\u01a0\u01a1\7"+
		"@\2\2\u01a1f\3\2\2\2\u01a2\u01a3\7&\2\2\u01a3h\3\2\2\2\u01a4\u01a5\7A"+
		"\2\2\u01a5j\3\2\2\2\u01a6\u01a7\7<\2\2\u01a7l\3\2\2\2\u01a8\u01a9\7*\2"+
		"\2\u01a9n\3\2\2\2\u01aa\u01ab\7+\2\2\u01abp\3\2\2\2\u01ac\u01ad\7\60\2"+
		"\2\u01adr\3\2\2\2\u01ae\u01b1\5\177@\2\u01af\u01b1\5g\64\2\u01b0\u01ae"+
		"\3\2\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b5\3\2\2\2\u01b2\u01b4\5\u0081A"+
		"\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6"+
		"\3\2\2\2\u01b6t\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01ba\t\t\2\2\u01b9"+
		"\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2"+
		"\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\b;\2\2\u01bev\3\2\2\2\u01bf\u01c0"+
		"\4\62;\2\u01c0x\3\2\2\2\u01c1\u01c2\t\n\2\2\u01c2z\3\2\2\2\u01c3\u01c4"+
		"\t\13\2\2\u01c4|\3\2\2\2\u01c5\u01c6\7a\2\2\u01c6~\3\2\2\2\u01c7\u01cb"+
		"\5y=\2\u01c8\u01cb\5{>\2\u01c9\u01cb\5}?\2\u01ca\u01c7\3\2\2\2\u01ca\u01c8"+
		"\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cb\u0080\3\2\2\2\u01cc\u01d1\5y=\2\u01cd"+
		"\u01d1\5{>\2\u01ce\u01d1\5}?\2\u01cf\u01d1\5w<\2\u01d0\u01cc\3\2\2\2\u01d0"+
		"\u01cd\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01cf\3\2\2\2\u01d1\u0082\3\2"+
		"\2\2\u01d2\u01d3\t\f\2\2\u01d3\u0084\3\2\2\2\u01d4\u01d5\t\r\2\2\u01d5"+
		"\u0086\3\2\2\2\u01d6\u01d7\t\16\2\2\u01d7\u0088\3\2\2\2\u01d8\u01d9\t"+
		"\17\2\2\u01d9\u008a\3\2\2\2\u01da\u01db\t\4\2\2\u01db\u008c\3\2\2\2\u01dc"+
		"\u01dd\t\20\2\2\u01dd\u008e\3\2\2\2\u01de\u01df\t\21\2\2\u01df\u0090\3"+
		"\2\2\2\u01e0\u01e1\t\22\2\2\u01e1\u0092\3\2\2\2\u01e2\u01e3\t\23\2\2\u01e3"+
		"\u0094\3\2\2\2\u01e4\u01e5\t\24\2\2\u01e5\u0096\3\2\2\2\u01e6\u01e7\t"+
		"\25\2\2\u01e7\u0098\3\2\2\2\u01e8\u01e9\t\26\2\2\u01e9\u009a\3\2\2\2\u01ea"+
		"\u01eb\t\27\2\2\u01eb\u009c\3\2\2\2\u01ec\u01ed\t\30\2\2\u01ed\u009e\3"+
		"\2\2\2\u01ee\u01ef\t\31\2\2\u01ef\u00a0\3\2\2\2\u01f0\u01f1\t\32\2\2\u01f1"+
		"\u00a2\3\2\2\2\u01f2\u01f3\t\33\2\2\u01f3\u00a4\3\2\2\2\u01f4\u01f5\t"+
		"\34\2\2\u01f5\u00a6\3\2\2\2\u01f6\u01f7\t\35\2\2\u01f7\u00a8\3\2\2\2\u01f8"+
		"\u01f9\t\36\2\2\u01f9\u00aa\3\2\2\2\u01fa\u01fb\t\37\2\2\u01fb\u00ac\3"+
		"\2\2\2\u01fc\u01fd\t \2\2\u01fd\u00ae\3\2\2\2\u01fe\u01ff\t!\2\2\u01ff"+
		"\u00b0\3\2\2\2\u0200\u0201\t\"\2\2\u0201\u00b2\3\2\2\2\u0202\u0203\t#"+
		"\2\2\u0203\u00b4\3\2\2\2\u0204\u0205\t$\2\2\u0205\u00b6\3\2\2\2\20\2\u00d7"+
		"\u00dd\u00e6\u00ed\u00f2\u017e\u0187\u0189\u01b0\u01b5\u01bb\u01ca\u01d0"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}