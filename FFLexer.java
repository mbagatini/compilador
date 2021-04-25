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
		CONSOLE=16, FUNCTION=17, NUMBER=18, STRING=19, VARIABLE=20, COMMENT=21, 
		SPACE=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ATTRIB", "OP_BRT", "CL_BRT", "OP_CUR", "CL_CUR", "OP_PAR", "CL_PAR", 
		"COMMA", "DOT", "INT", "MINUS", "OVER", "PLUS", "REMAINDER", "TIMES", 
		"CONSOLE", "FUNCTION", "NUMBER", "STRING", "VARIABLE", "COMMENT", "SPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'['", "']'", "'{'", "'}'", "'('", "')'", "','", "'.'", "'int'", 
		"'-'", "'/'", "'+'", "'%'", "'*'", "'console'", "'function'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ATTRIB", "OP_BRT", "CL_BRT", "OP_CUR", "CL_CUR", "OP_PAR", "CL_PAR", 
		"COMMA", "DOT", "INT", "MINUS", "OVER", "PLUS", "REMAINDER", "TIMES", 
		"CONSOLE", "FUNCTION", "NUMBER", "STRING", "VARIABLE", "COMMENT", "SPACE"
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
		case 20:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u0085\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\6\23b\n\23\r\23\16\23c\3\24\3\24\7\24h\n\24\f\24\16\24k\13\24\3"+
		"\24\3\24\3\25\6\25p\n\25\r\25\16\25q\3\26\3\26\3\26\3\26\7\26x\n\26\f"+
		"\26\16\26{\13\26\3\26\3\26\3\27\6\27\u0080\n\27\r\27\16\27\u0081\3\27"+
		"\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\5\3\2$$\3\2\f\f\5"+
		"\2\13\f\17\17\"\"\u0089\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13\67"+
		"\3\2\2\2\r9\3\2\2\2\17;\3\2\2\2\21=\3\2\2\2\23?\3\2\2\2\25A\3\2\2\2\27"+
		"E\3\2\2\2\31G\3\2\2\2\33I\3\2\2\2\35K\3\2\2\2\37M\3\2\2\2!O\3\2\2\2#W"+
		"\3\2\2\2%a\3\2\2\2\'e\3\2\2\2)o\3\2\2\2+s\3\2\2\2-\177\3\2\2\2/\60\7?"+
		"\2\2\60\4\3\2\2\2\61\62\7]\2\2\62\6\3\2\2\2\63\64\7_\2\2\64\b\3\2\2\2"+
		"\65\66\7}\2\2\66\n\3\2\2\2\678\7\177\2\28\f\3\2\2\29:\7*\2\2:\16\3\2\2"+
		"\2;<\7+\2\2<\20\3\2\2\2=>\7.\2\2>\22\3\2\2\2?@\7\60\2\2@\24\3\2\2\2AB"+
		"\7k\2\2BC\7p\2\2CD\7v\2\2D\26\3\2\2\2EF\7/\2\2F\30\3\2\2\2GH\7\61\2\2"+
		"H\32\3\2\2\2IJ\7-\2\2J\34\3\2\2\2KL\7\'\2\2L\36\3\2\2\2MN\7,\2\2N \3\2"+
		"\2\2OP\7e\2\2PQ\7q\2\2QR\7p\2\2RS\7u\2\2ST\7q\2\2TU\7n\2\2UV\7g\2\2V\""+
		"\3\2\2\2WX\7h\2\2XY\7w\2\2YZ\7p\2\2Z[\7e\2\2[\\\7v\2\2\\]\7k\2\2]^\7q"+
		"\2\2^_\7p\2\2_$\3\2\2\2`b\4\62;\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2"+
		"\2\2d&\3\2\2\2ei\7$\2\2fh\n\2\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2"+
		"\2\2jl\3\2\2\2ki\3\2\2\2lm\7$\2\2m(\3\2\2\2np\4c|\2on\3\2\2\2pq\3\2\2"+
		"\2qo\3\2\2\2qr\3\2\2\2r*\3\2\2\2st\7\61\2\2tu\7\61\2\2uy\3\2\2\2vx\n\3"+
		"\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\b\26"+
		"\2\2},\3\2\2\2~\u0080\t\4\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\b\27\3\2"+
		"\u0084.\3\2\2\2\b\2ciqy\u0081\4\3\26\2\3\27\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}