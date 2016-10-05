// Generated from C:\work\study\metrics_poc\src\com\madisp\stupid\Stupid.g4 by ANTLR 4.5.1

package com.madisp.stupid.gen;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StupidLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, STRING=7, NULL=8, TRUE=9, 
		FALSE=10, INT=11, DOUBLE=12, BANG=13, AND=14, EQUALS=15, OR=16, PLUS=17, 
		MINUS=18, SLASH=19, STAR=20, LANGLE=21, RANGLE=22, DOLLAR=23, ASK=24, 
		COLON=25, LPAREN=26, RPAREN=27, DOT=28, IDENTIFIER=29, WS=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "STRING", "NULL", "TRUE", 
		"FALSE", "INT", "DOUBLE", "BANG", "AND", "EQUALS", "OR", "PLUS", "MINUS", 
		"SLASH", "STAR", "LANGLE", "RANGLE", "DOLLAR", "ASK", "COLON", "LPAREN", 
		"RPAREN", "DOT", "IDENTIFIER", "WS", "ESC", "DIGIT", "UPPERC", "LOWERC", 
		"UNDERS", "ALPHA", "ALPHANUMERIC"
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


	public StupidLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Stupid.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u00cd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\7\b]\n\b\f\b\16\b`\13\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\6\fu\n"+
		"\f\r\f\16\fv\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0080\n\r\5\r\u0082\n\r\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\5\36\u00a9\n\36\3\36\7\36"+
		"\u00ac\n\36\f\36\16\36\u00af\13\36\3\37\6\37\u00b2\n\37\r\37\16\37\u00b3"+
		"\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\5%\u00c6\n%\3&"+
		"\3&\3&\3&\5&\u00cc\n&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?\2A\2C\2E\2G\2I\2K\2\3\2\b\4\2))^^\4\2ff"+
		"hh\5\2\13\f\16\17\"\"\7\2))^^ppttvv\3\2C\\\3\2c|\u00d2\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\3M\3\2\2\2\5O\3\2\2\2\7Q\3\2\2\2\tS\3\2\2\2\13U\3\2\2\2\rW\3\2\2\2\17"+
		"Y\3\2\2\2\21c\3\2\2\2\23h\3\2\2\2\25m\3\2\2\2\27t\3\2\2\2\31\u0081\3\2"+
		"\2\2\33\u0083\3\2\2\2\35\u0085\3\2\2\2\37\u0089\3\2\2\2!\u008b\3\2\2\2"+
		"#\u008e\3\2\2\2%\u0090\3\2\2\2\'\u0092\3\2\2\2)\u0094\3\2\2\2+\u0096\3"+
		"\2\2\2-\u0098\3\2\2\2/\u009a\3\2\2\2\61\u009c\3\2\2\2\63\u009e\3\2\2\2"+
		"\65\u00a0\3\2\2\2\67\u00a2\3\2\2\29\u00a4\3\2\2\2;\u00a8\3\2\2\2=\u00b1"+
		"\3\2\2\2?\u00b7\3\2\2\2A\u00ba\3\2\2\2C\u00bc\3\2\2\2E\u00be\3\2\2\2G"+
		"\u00c0\3\2\2\2I\u00c5\3\2\2\2K\u00cb\3\2\2\2MN\7=\2\2N\4\3\2\2\2OP\7."+
		"\2\2P\6\3\2\2\2QR\7B\2\2R\b\3\2\2\2ST\7}\2\2T\n\3\2\2\2UV\7~\2\2V\f\3"+
		"\2\2\2WX\7\177\2\2X\16\3\2\2\2Y^\7)\2\2Z]\5? \2[]\n\2\2\2\\Z\3\2\2\2\\"+
		"[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\7)\2\2"+
		"b\20\3\2\2\2cd\7p\2\2de\7w\2\2ef\7n\2\2fg\7n\2\2g\22\3\2\2\2hi\7v\2\2"+
		"ij\7t\2\2jk\7w\2\2kl\7g\2\2l\24\3\2\2\2mn\7h\2\2no\7c\2\2op\7n\2\2pq\7"+
		"u\2\2qr\7g\2\2r\26\3\2\2\2su\5A!\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2"+
		"\2\2w\30\3\2\2\2xy\5\27\f\2yz\t\3\2\2z\u0082\3\2\2\2{|\5\27\f\2|}\7\60"+
		"\2\2}\177\5\27\f\2~\u0080\t\3\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0082\3\2\2\2\u0081x\3\2\2\2\u0081{\3\2\2\2\u0082\32\3\2\2\2\u0083\u0084"+
		"\7#\2\2\u0084\34\3\2\2\2\u0085\u0086\7c\2\2\u0086\u0087\7p\2\2\u0087\u0088"+
		"\7f\2\2\u0088\36\3\2\2\2\u0089\u008a\7?\2\2\u008a \3\2\2\2\u008b\u008c"+
		"\7q\2\2\u008c\u008d\7t\2\2\u008d\"\3\2\2\2\u008e\u008f\7-\2\2\u008f$\3"+
		"\2\2\2\u0090\u0091\7/\2\2\u0091&\3\2\2\2\u0092\u0093\7\61\2\2\u0093(\3"+
		"\2\2\2\u0094\u0095\7,\2\2\u0095*\3\2\2\2\u0096\u0097\7>\2\2\u0097,\3\2"+
		"\2\2\u0098\u0099\7@\2\2\u0099.\3\2\2\2\u009a\u009b\7&\2\2\u009b\60\3\2"+
		"\2\2\u009c\u009d\7A\2\2\u009d\62\3\2\2\2\u009e\u009f\7<\2\2\u009f\64\3"+
		"\2\2\2\u00a0\u00a1\7*\2\2\u00a1\66\3\2\2\2\u00a2\u00a3\7+\2\2\u00a38\3"+
		"\2\2\2\u00a4\u00a5\7\60\2\2\u00a5:\3\2\2\2\u00a6\u00a9\5I%\2\u00a7\u00a9"+
		"\5/\30\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ad\3\2\2\2\u00aa"+
		"\u00ac\5K&\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2"+
		"\2\u00ad\u00ae\3\2\2\2\u00ae<\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b2"+
		"\t\4\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\b\37\2\2\u00b6>\3\2\2\2"+
		"\u00b7\u00b8\7^\2\2\u00b8\u00b9\t\5\2\2\u00b9@\3\2\2\2\u00ba\u00bb\4\62"+
		";\2\u00bbB\3\2\2\2\u00bc\u00bd\t\6\2\2\u00bdD\3\2\2\2\u00be\u00bf\t\7"+
		"\2\2\u00bfF\3\2\2\2\u00c0\u00c1\7a\2\2\u00c1H\3\2\2\2\u00c2\u00c6\5C\""+
		"\2\u00c3\u00c6\5E#\2\u00c4\u00c6\5G$\2\u00c5\u00c2\3\2\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6J\3\2\2\2\u00c7\u00cc\5C\"\2\u00c8\u00cc"+
		"\5E#\2\u00c9\u00cc\5G$\2\u00ca\u00cc\5A!\2\u00cb\u00c7\3\2\2\2\u00cb\u00c8"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00ccL\3\2\2\2\r\2\\"+
		"^v\177\u0081\u00a8\u00ad\u00b3\u00c5\u00cb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}