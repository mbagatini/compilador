// Generated from FF.g by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FFLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ATTRIB=1, OP_BRT=2, CL_BRT=3, OP_CUR=4, CL_CUR=5, OP_PAR=6, CL_PAR=7, 
		COMMA=8, DOT=9, INT=10, MINUS=11, OVER=12, PLUS=13, REMAINDER=14, TIMES=15, 
		EQUAL=16, DIFF=17, LESS=18, LESS_EQUAL=19, GREATER=20, GREATER_EQUAL=21, 
		CONSOLE=22, FUNCTION=23, IF=24, ELSE=25, NUMBER=26, STRING=27, VARIABLE=28, 
		COMMENT=29, SPACE=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ATTRIB", "OP_BRT", "CL_BRT", "OP_CUR", "CL_CUR", "OP_PAR", "CL_PAR", 
		"COMMA", "DOT", "INT", "MINUS", "OVER", "PLUS", "REMAINDER", "TIMES", 
		"EQUAL", "DIFF", "LESS", "LESS_EQUAL", "GREATER", "GREATER_EQUAL", "CONSOLE", 
		"FUNCTION", "IF", "ELSE", "NUMBER", "STRING", "VARIABLE", "COMMENT", "SPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'['", "']'", "'{'", "'}'", "'('", "')'", "','", "'.'", "'int'", 
		"'-'", "'/'", "'+'", "'%'", "'*'", "'=='", "'!='", "'<'", "'<='", "'>'", 
		"'>='", "'console'", "'function'", "'if'", "'else'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ATTRIB", "OP_BRT", "CL_BRT", "OP_CUR", "CL_CUR", "OP_PAR", "CL_PAR", 
		"COMMA", "DOT", "INT", "MINUS", "OVER", "PLUS", "REMAINDER", "TIMES", 
		"EQUAL", "DIFF", "LESS", "LESS_EQUAL", "GREATER", "GREATER_EQUAL", "CONSOLE", 
		"FUNCTION", "IF", "ELSE", "NUMBER", "STRING", "VARIABLE", "COMMENT", "SPACE"
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


	public FFLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FF.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 28:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 29:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u00ad\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\6\33\u008a"+
		"\n\33\r\33\16\33\u008b\3\34\3\34\7\34\u0090\n\34\f\34\16\34\u0093\13\34"+
		"\3\34\3\34\3\35\6\35\u0098\n\35\r\35\16\35\u0099\3\36\3\36\3\36\3\36\7"+
		"\36\u00a0\n\36\f\36\16\36\u00a3\13\36\3\36\3\36\3\37\6\37\u00a8\n\37\r"+
		"\37\16\37\u00a9\3\37\3\37\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= \3\2\5\3\2$$\3\2\f\f\5\2\13\f\17\17\"\""+
		"\u00b1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2\tE\3\2\2\2\13"+
		"G\3\2\2\2\rI\3\2\2\2\17K\3\2\2\2\21M\3\2\2\2\23O\3\2\2\2\25Q\3\2\2\2\27"+
		"U\3\2\2\2\31W\3\2\2\2\33Y\3\2\2\2\35[\3\2\2\2\37]\3\2\2\2!_\3\2\2\2#b"+
		"\3\2\2\2%e\3\2\2\2\'g\3\2\2\2)j\3\2\2\2+l\3\2\2\2-o\3\2\2\2/w\3\2\2\2"+
		"\61\u0080\3\2\2\2\63\u0083\3\2\2\2\65\u0089\3\2\2\2\67\u008d\3\2\2\29"+
		"\u0097\3\2\2\2;\u009b\3\2\2\2=\u00a7\3\2\2\2?@\7?\2\2@\4\3\2\2\2AB\7]"+
		"\2\2B\6\3\2\2\2CD\7_\2\2D\b\3\2\2\2EF\7}\2\2F\n\3\2\2\2GH\7\177\2\2H\f"+
		"\3\2\2\2IJ\7*\2\2J\16\3\2\2\2KL\7+\2\2L\20\3\2\2\2MN\7.\2\2N\22\3\2\2"+
		"\2OP\7\60\2\2P\24\3\2\2\2QR\7k\2\2RS\7p\2\2ST\7v\2\2T\26\3\2\2\2UV\7/"+
		"\2\2V\30\3\2\2\2WX\7\61\2\2X\32\3\2\2\2YZ\7-\2\2Z\34\3\2\2\2[\\\7\'\2"+
		"\2\\\36\3\2\2\2]^\7,\2\2^ \3\2\2\2_`\7?\2\2`a\7?\2\2a\"\3\2\2\2bc\7#\2"+
		"\2cd\7?\2\2d$\3\2\2\2ef\7>\2\2f&\3\2\2\2gh\7>\2\2hi\7?\2\2i(\3\2\2\2j"+
		"k\7@\2\2k*\3\2\2\2lm\7@\2\2mn\7?\2\2n,\3\2\2\2op\7e\2\2pq\7q\2\2qr\7p"+
		"\2\2rs\7u\2\2st\7q\2\2tu\7n\2\2uv\7g\2\2v.\3\2\2\2wx\7h\2\2xy\7w\2\2y"+
		"z\7p\2\2z{\7e\2\2{|\7v\2\2|}\7k\2\2}~\7q\2\2~\177\7p\2\2\177\60\3\2\2"+
		"\2\u0080\u0081\7k\2\2\u0081\u0082\7h\2\2\u0082\62\3\2\2\2\u0083\u0084"+
		"\7g\2\2\u0084\u0085\7n\2\2\u0085\u0086\7u\2\2\u0086\u0087\7g\2\2\u0087"+
		"\64\3\2\2\2\u0088\u008a\4\62;\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2"+
		"\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\66\3\2\2\2\u008d\u0091"+
		"\7$\2\2\u008e\u0090\n\2\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0094\u0095\7$\2\2\u00958\3\2\2\2\u0096\u0098\4c|\2\u0097\u0096\3"+
		"\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		":\3\2\2\2\u009b\u009c\7\61\2\2\u009c\u009d\7\61\2\2\u009d\u00a1\3\2\2"+
		"\2\u009e\u00a0\n\3\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a5\b\36\2\2\u00a5<\3\2\2\2\u00a6\u00a8\t\4\2\2\u00a7\u00a6\3\2\2\2"+
		"\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\u00ac\b\37\3\2\u00ac>\3\2\2\2\b\2\u008b\u0091\u0099\u00a1"+
		"\u00a9\4\3\36\2\3\37\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}