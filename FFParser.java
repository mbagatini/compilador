// Generated from FF.g by ANTLR 4.5.3


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FFParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ATTRIB=1, OP_BRT=2, CL_BRT=3, OP_CUR=4, CL_CUR=5, OP_PAR=6, CL_PAR=7, 
		COMMA=8, DOT=9, INT=10, MINUS=11, OVER=12, PLUS=13, REMAINDER=14, TIMES=15, 
		CONSOLE=16, FUNCTION=17, NUMBER=18, STRING=19, VARIABLE=20, COMMENT=21, 
		SPACE=22;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_statement = 2, RULE_st_console = 3, 
		RULE_arguments = 4, RULE_function = 5, RULE_parameters = 6, RULE_expression = 7, 
		RULE_term = 8, RULE_factor = 9;
	public static final String[] ruleNames = {
		"program", "main", "statement", "st_console", "arguments", "function", 
		"parameters", "expression", "term", "factor"
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

	@Override
	public String getGrammarFileName() { return "FF.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		private static ArrayList<String> error_list;
		private static ArrayList<String> function_table; 
		private static String argments;
		private static char ret;

		private static void print(String bytecode, int delta) 
		{
			System.out.println("    " + bytecode);	
		}

		public static void main(String[] args) throws Exception {
			ANTLRInputStream input = new ANTLRInputStream(System.in);
			FFLexer lexer = new FFLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			FFParser parser = new FFParser(tokens);

			error_list = new ArrayList<String>();
			function_table = new ArrayList<String>();

			argments = "";
			ret = 'V';
			
			parser.program();
		}

	public FFParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(FFParser.EOF, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			  
					System.out.println(".source Test.j");
					System.out.println(".class  public Test");
					System.out.println(".super  java/lang/Object");
					System.out.println(".method public <init>()V");
					System.out.println("    aload_0");
					System.out.println("    invokenonvirtual java/lang/Object/<init>()V");
					System.out.println("    return");
					System.out.println(".end method");
			    
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(21);
				function();
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
			main();
			setState(28);
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

	public static class MainContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			   
			        System.out.println(".method public static main([Ljava/lang/String;)V"); 
			    
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONSOLE) {
				{
				{
				setState(31);
				statement();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			   
			            System.out.println("    return");
						System.out.println(".limit stack 10");
			            System.out.println(".end method"); 		
			    
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
		public St_consoleContext st_console() {
			return getRuleContext(St_consoleContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			st_console();
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

	public static class St_consoleContext extends ParserRuleContext {
		public ExpressionContext exp1;
		public ExpressionContext exp2;
		public TerminalNode CONSOLE() { return getToken(FFParser.CONSOLE, 0); }
		public TerminalNode OP_PAR() { return getToken(FFParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(FFParser.CL_PAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FFParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FFParser.COMMA, i);
		}
		public St_consoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_console; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).enterSt_console(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).exitSt_console(this);
		}
	}

	public final St_consoleContext st_console() throws RecognitionException {
		St_consoleContext _localctx = new St_consoleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_st_console);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(CONSOLE);
			setState(42);
			match(OP_PAR);
			   
					print("getstatic java/lang/System/out Ljava/io/PrintStream;", 1); 
				
			setState(44);
			((St_consoleContext)_localctx).exp1 = expression();
			   
					if (((St_consoleContext)_localctx).exp1.type == 'i')
					{
						print("invokevirtual java/io/PrintStream/print(I)V\n", -2);
					}
					
					if (((St_consoleContext)_localctx).exp1.type == 'a')
					{
						print("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", -2);
					}             
				
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(46);
				match(COMMA);
				   
							print("getstatic java/lang/System/out Ljava/io/PrintStream;", 1); 
						
				setState(48);
				((St_consoleContext)_localctx).exp2 = expression();
				   
							if (((St_consoleContext)_localctx).exp2.type == 'i')
							{
								print("invokevirtual java/io/PrintStream/print(I)V\n", -2);
							}
							
							if (((St_consoleContext)_localctx).exp2.type == 'a')
							{
								print("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", -2);
							}  
						
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(CL_PAR);
			   
						print("getstatic java/lang/System/out Ljava/io/PrintStream;", 1); 
						print("invokevirtual java/io/PrintStream/println()V", -1); 
					
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FFParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FFParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			expression();
			argments +="I";
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(61);
				match(COMMA);
				setState(62);
				expression();
				argments +="I";
				}
				}
				setState(69);
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

	public static class FunctionContext extends ParserRuleContext {
		public Token VARIABLE;
		public TerminalNode FUNCTION() { return getToken(FFParser.FUNCTION, 0); }
		public TerminalNode VARIABLE() { return getToken(FFParser.VARIABLE, 0); }
		public TerminalNode OP_PAR() { return getToken(FFParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(FFParser.CL_PAR, 0); }
		public TerminalNode OP_CUR() { return getToken(FFParser.OP_CUR, 0); }
		public TerminalNode CL_CUR() { return getToken(FFParser.CL_CUR, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode INT() { return getToken(FFParser.INT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(FUNCTION);
			setState(71);
			((FunctionContext)_localctx).VARIABLE = match(VARIABLE);
			setState(72);
			match(OP_PAR);
			setState(74);
			_la = _input.LA(1);
			if (_la==VARIABLE) {
				{
				setState(73);
				parameters();
				}
			}

			setState(76);
			match(CL_PAR);
			setState(79);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(77);
				match(INT);
				ret = 'I';
				}
			}

			setState(81);
			match(OP_CUR);
			   
					int i = function_table.indexOf((((FunctionContext)_localctx).VARIABLE!=null?((FunctionContext)_localctx).VARIABLE.getText():null)+"("+argments+")"+ret);
					
					if (i >= 0)
					{
						error_list.add("ERROR ON LINE "+(((FunctionContext)_localctx).VARIABLE!=null?((FunctionContext)_localctx).VARIABLE.getLine():0)+ ": '"+ (((FunctionContext)_localctx).VARIABLE!=null?((FunctionContext)_localctx).VARIABLE.getText():null) +"' function is already declared!");
					} else {
						function_table.add((((FunctionContext)_localctx).VARIABLE!=null?((FunctionContext)_localctx).VARIABLE.getText():null)+"("+argments+")"+ret);
					}
					System.out.println(".method public static "+(((FunctionContext)_localctx).VARIABLE!=null?((FunctionContext)_localctx).VARIABLE.getText():null)+"("+argments+")"+ret); 
					argments =  "";
					ret = 'V';
				
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				statement();
				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CONSOLE );
			setState(88);
			match(CL_CUR);
			   
					System.out.println("    return");
					System.out.println(".end method\n"); 			
				
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

	public static class ParametersContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE() { return getTokens(FFParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(FFParser.VARIABLE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FFParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FFParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(VARIABLE);
			 
					argments += "I";
				
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(93);
				match(COMMA);
				setState(94);
				match(VARIABLE);
				 
							argments += "I";
						
				}
				}
				setState(100);
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
		public char type;
		public TermContext t1;
		public Token op;
		public TermContext t2;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(FFParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(FFParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(FFParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(FFParser.MINUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			((ExpressionContext)_localctx).t1 = term();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS || _la==PLUS) {
				{
				{
				setState(102);
				((ExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==PLUS) ) {
					((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(103);
				((ExpressionContext)_localctx).t2 = term();
				   
						if (((ExpressionContext)_localctx).t2.type == 'i')
						{
							print(((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getType():0) == PLUS) ? "iadd" : "isub", -1);
						} else {
							error_list.add("ERROR ON LINE "+ (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0) + ": mixed types");
						}
					
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			    
					((ExpressionContext)_localctx).type =  ((ExpressionContext)_localctx).t1.type; 
				
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
		public char type;
		public FactorContext f1;
		public Token op;
		public FactorContext f2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(FFParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(FFParser.TIMES, i);
		}
		public List<TerminalNode> OVER() { return getTokens(FFParser.OVER); }
		public TerminalNode OVER(int i) {
			return getToken(FFParser.OVER, i);
		}
		public List<TerminalNode> REMAINDER() { return getTokens(FFParser.REMAINDER); }
		public TerminalNode REMAINDER(int i) {
			return getToken(FFParser.REMAINDER, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			((TermContext)_localctx).f1 = factor();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OVER) | (1L << REMAINDER) | (1L << TIMES))) != 0)) {
				{
				{
				setState(114);
				((TermContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OVER) | (1L << REMAINDER) | (1L << TIMES))) != 0)) ) {
					((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(115);
				((TermContext)_localctx).f2 = factor();
				   
						if (((TermContext)_localctx).f2.type == 'i')
						{
							print(((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == TIMES) ? "imul" : (((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0)  == OVER) ? "idiv" : "irem"), -1); 
						} else {
							error_list.add("ERROR ON LINE "+ (((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getLine():0) + ": mixed types");
						}  
					
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			   
					((TermContext)_localctx).type =  ((TermContext)_localctx).f1.type; 
				
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
		public char type;
		public Token NUMBER;
		public ExpressionContext exp;
		public Token VARIABLE;
		public Token STRING;
		public TerminalNode NUMBER() { return getToken(FFParser.NUMBER, 0); }
		public TerminalNode OP_PAR() { return getToken(FFParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(FFParser.CL_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(FFParser.VARIABLE, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode STRING() { return getToken(FFParser.STRING, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_factor);
		int _la;
		try {
			setState(143);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				((FactorContext)_localctx).NUMBER = match(NUMBER);
				   
						print("ldc " + (((FactorContext)_localctx).NUMBER!=null?((FactorContext)_localctx).NUMBER.getText():null), +1); ((FactorContext)_localctx).type =  'i';
					
				}
				break;
			case OP_PAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(OP_PAR);
				setState(128);
				((FactorContext)_localctx).exp = expression();
				setState(129);
				match(CL_PAR);
				 
						((FactorContext)_localctx).type =  ((FactorContext)_localctx).exp.type; 
					
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				((FactorContext)_localctx).VARIABLE = match(VARIABLE);
				setState(133);
				match(OP_PAR);
				setState(137);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_PAR) | (1L << NUMBER) | (1L << STRING) | (1L << VARIABLE))) != 0)) {
					{
					setState(134);
					arguments();
					ret = 'I';
					}
				}

				setState(139);
				match(CL_PAR);

						int i = function_table.indexOf((((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getText():null)+"("+argments+")"+ret);
						
						if (i >= 0) 
						{
							print("invokestatic Test/"+(((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getText():null)+"("+argments+")"+ret,0);
						}else {
							error_list.add("Invalid function on line: "+(((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getLine():0)+". Signiature: "+(((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getText():null)+"("+argments+")"+ret);
						}
						((FactorContext)_localctx).type =  'i';
					
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				((FactorContext)_localctx).STRING = match(STRING);
				   
						print("ldc " + (((FactorContext)_localctx).STRING!=null?((FactorContext)_localctx).STRING.getText():null), +1); ((FactorContext)_localctx).type =  'a';
					
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\u0094\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\2\3\2\3\2\3\3\3\3\7\3#\n\3"+
		"\f\3\16\3&\13\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5\66\n\5\f\5\16\59\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6D"+
		"\n\6\f\6\16\6G\13\6\3\7\3\7\3\7\3\7\5\7M\n\7\3\7\3\7\3\7\5\7R\n\7\3\7"+
		"\3\7\3\7\6\7W\n\7\r\7\16\7X\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\bc\n\b\f"+
		"\b\16\bf\13\b\3\t\3\t\3\t\3\t\3\t\7\tm\n\t\f\t\16\tp\13\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\7\ny\n\n\f\n\16\n|\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008c\n\13\3\13\3\13\3\13"+
		"\3\13\5\13\u0092\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\4\4\2\r\r\17"+
		"\17\4\2\16\16\20\21\u0097\2\26\3\2\2\2\4 \3\2\2\2\6)\3\2\2\2\b+\3\2\2"+
		"\2\n=\3\2\2\2\fH\3\2\2\2\16]\3\2\2\2\20g\3\2\2\2\22s\3\2\2\2\24\u0091"+
		"\3\2\2\2\26\32\b\2\1\2\27\31\5\f\7\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30"+
		"\3\2\2\2\32\33\3\2\2\2\33\35\3\2\2\2\34\32\3\2\2\2\35\36\5\4\3\2\36\37"+
		"\7\2\2\3\37\3\3\2\2\2 $\b\3\1\2!#\5\6\4\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2"+
		"\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\b\3\1\2(\5\3\2\2\2)*\5\b\5\2*\7"+
		"\3\2\2\2+,\7\22\2\2,-\7\b\2\2-.\b\5\1\2./\5\20\t\2/\67\b\5\1\2\60\61\7"+
		"\n\2\2\61\62\b\5\1\2\62\63\5\20\t\2\63\64\b\5\1\2\64\66\3\2\2\2\65\60"+
		"\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:"+
		";\7\t\2\2;<\b\5\1\2<\t\3\2\2\2=>\5\20\t\2>E\b\6\1\2?@\7\n\2\2@A\5\20\t"+
		"\2AB\b\6\1\2BD\3\2\2\2C?\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\13\3\2"+
		"\2\2GE\3\2\2\2HI\7\23\2\2IJ\7\26\2\2JL\7\b\2\2KM\5\16\b\2LK\3\2\2\2LM"+
		"\3\2\2\2MN\3\2\2\2NQ\7\t\2\2OP\7\f\2\2PR\b\7\1\2QO\3\2\2\2QR\3\2\2\2R"+
		"S\3\2\2\2ST\7\6\2\2TV\b\7\1\2UW\5\6\4\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2"+
		"XY\3\2\2\2YZ\3\2\2\2Z[\7\7\2\2[\\\b\7\1\2\\\r\3\2\2\2]^\7\26\2\2^d\b\b"+
		"\1\2_`\7\n\2\2`a\7\26\2\2ac\b\b\1\2b_\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3"+
		"\2\2\2e\17\3\2\2\2fd\3\2\2\2gn\5\22\n\2hi\t\2\2\2ij\5\22\n\2jk\b\t\1\2"+
		"km\3\2\2\2lh\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2"+
		"qr\b\t\1\2r\21\3\2\2\2sz\5\24\13\2tu\t\3\2\2uv\5\24\13\2vw\b\n\1\2wy\3"+
		"\2\2\2xt\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\b"+
		"\n\1\2~\23\3\2\2\2\177\u0080\7\24\2\2\u0080\u0092\b\13\1\2\u0081\u0082"+
		"\7\b\2\2\u0082\u0083\5\20\t\2\u0083\u0084\7\t\2\2\u0084\u0085\b\13\1\2"+
		"\u0085\u0092\3\2\2\2\u0086\u0087\7\26\2\2\u0087\u008b\7\b\2\2\u0088\u0089"+
		"\5\n\6\2\u0089\u008a\b\13\1\2\u008a\u008c\3\2\2\2\u008b\u0088\3\2\2\2"+
		"\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\t\2\2\u008e\u0092"+
		"\b\13\1\2\u008f\u0090\7\25\2\2\u0090\u0092\b\13\1\2\u0091\177\3\2\2\2"+
		"\u0091\u0081\3\2\2\2\u0091\u0086\3\2\2\2\u0091\u008f\3\2\2\2\u0092\25"+
		"\3\2\2\2\16\32$\67ELQXdnz\u008b\u0091";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}