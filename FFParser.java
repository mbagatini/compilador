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
		EQUAL=16, DIFF=17, LESS=18, LESS_EQUAL=19, GREATER=20, GREATER_EQUAL=21, 
		CONSOLE=22, FUNCTION=23, IF=24, ELSE=25, NUMBER=26, STRING=27, VARIABLE=28, 
		COMMENT=29, SPACE=30;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_statement = 2, RULE_st_console = 3, 
		RULE_st_attrib = 4, RULE_st_if = 5, RULE_comparison = 6, RULE_arguments = 7, 
		RULE_function = 8, RULE_parameters = 9, RULE_expression = 10, RULE_term = 11, 
		RULE_factor = 12;
	public static final String[] ruleNames = {
		"program", "main", "statement", "st_console", "st_attrib", "st_if", "comparison", 
		"arguments", "function", "parameters", "expression", "term", "factor"
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
		private static ArrayList<String> symbol_table;
		private static ArrayList<Boolean> symbol_table_warning;
		private static ArrayList<Character> type_table;
		private static String argments;
		private static String compare_op;	
		private static int if_counter;
		private static char ret;

		private static void emit(String bytecode, int delta) 
		{
			System.out.println("    " + bytecode);	
		}

		public static void main(String[] args) throws Exception 
		{
			ANTLRInputStream input = new ANTLRInputStream(System.in);
			FFLexer lexer = new FFLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			FFParser parser = new FFParser(tokens);

			error_list = new ArrayList<String>();
			function_table = new ArrayList<String>();
			symbol_table = new ArrayList<String>();
	        symbol_table_warning = new ArrayList<Boolean>();
	        type_table = new ArrayList<Character>();

			if_counter = 0;
			argments = "";
			ret = 'V';
			
			parser.program();
	        System.out.println("\n; symbols: " + symbol_table);
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
					System.out.println(".super  java/lang/Object\n");
					System.out.println(".method public <init>()V");
					System.out.println("    aload_0");
					System.out.println("    invokenonvirtual java/lang/Object/<init>()V");
					System.out.println("    return");
					System.out.println(".end method\n");
			    
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(27);
				function();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			main();
			setState(34);
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
			   
					System.out.println(".method public static main([Ljava/lang/String;)V\n");
			        symbol_table.add("args");
			        type_table.add('-');
			        symbol_table_warning.add(true); 
			    
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSOLE) | (1L << IF) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(37);
				statement();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			   
					System.out.println("    return");
					System.out.println(".limit stack 10");
					System.out.println(".limit locals " + symbol_table.size());
					System.out.println(".end method"); 	

					// warnings
					for (int i = 0; i < symbol_table_warning.size(); i++) {
						if (symbol_table_warning.get(i) == false) {
							System.err.println("Warning: "+ symbol_table.get(i) + " declared but not used");  
						}
					}

					// errors
					if (error_list.size() > 0) {
						for (String s : error_list) {
							System.err.println(s);
						}
						System.exit(1);
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
		public St_consoleContext st_console() {
			return getRuleContext(St_consoleContext.class,0);
		}
		public St_attribContext st_attrib() {
			return getRuleContext(St_attribContext.class,0);
		}
		public St_ifContext st_if() {
			return getRuleContext(St_ifContext.class,0);
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
			setState(48);
			switch (_input.LA(1)) {
			case CONSOLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				st_console();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				st_attrib();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				st_if();
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
			setState(50);
			match(CONSOLE);
			setState(51);
			match(OP_PAR);
			   
			        emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1); 
			    
			setState(53);
			((St_consoleContext)_localctx).exp1 = expression();
			   
			        if (((St_consoleContext)_localctx).exp1.type == 'i') {
			            emit("invokevirtual java/io/PrintStream/print(I)V\n", -2);
			        }
					
			        if (((St_consoleContext)_localctx).exp1.type == 'a') {
			            emit("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", -2);
			        }             
			    
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(55);
				match(COMMA);
				   
				            emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1); 
				        
				setState(57);
				((St_consoleContext)_localctx).exp2 = expression();
				   
				        if (((St_consoleContext)_localctx).exp2.type == 'i') {
				            emit("invokevirtual java/io/PrintStream/print(I)V\n", -2);
				        }
						
				        if (((St_consoleContext)_localctx).exp2.type == 'a') {
				             emit("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", -2);
				        }  
				    
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(CL_PAR);
			   
			            emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1); 
			            emit("invokevirtual java/io/PrintStream/println()V", -1); 
			        
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

	public static class St_attribContext extends ParserRuleContext {
		public Token VARIABLE;
		public ExpressionContext exp;
		public TerminalNode VARIABLE() { return getToken(FFParser.VARIABLE, 0); }
		public TerminalNode ATTRIB() { return getToken(FFParser.ATTRIB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public St_attribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_attrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).enterSt_attrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).exitSt_attrib(this);
		}
	}

	public final St_attribContext st_attrib() throws RecognitionException {
		St_attribContext _localctx = new St_attribContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_st_attrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			((St_attribContext)_localctx).VARIABLE = match(VARIABLE);
			setState(69);
			match(ATTRIB);
			setState(70);
			((St_attribContext)_localctx).exp = expression();
			    
			        System.out.println("\n; --- cheguei aqui --- ");
			        System.out.println("\n; types size: " + type_table.size());
			        System.out.println("\n; symbols size: " + symbol_table.size());
					
			        int i = symbol_table.indexOf((((St_attribContext)_localctx).VARIABLE!=null?((St_attribContext)_localctx).VARIABLE.getText():null));
					
			        if (i > 0) {
			            if (type_table.get(i) == ((St_attribContext)_localctx).exp.type) {
			                if (((St_attribContext)_localctx).exp.type == 'i') 
							{
							    emit("istore "+i+"\n", -1);
							}
							
			                if (((St_attribContext)_localctx).exp.type == 'a') 
							{
								emit("astore "+i+"\n", -1);
							}
			            } else if (type_table.get(i) == 'i' && ((St_attribContext)_localctx).exp.type == 'a') {
			                error_list.add("ERROR ON LINE "+(((St_attribContext)_localctx).VARIABLE!=null?((St_attribContext)_localctx).VARIABLE.getLine():0)+ ": '"+ (((St_attribContext)_localctx).VARIABLE!=null?((St_attribContext)_localctx).VARIABLE.getText():null) +"' is integer ");

			            } else if (type_table.get(i) == 'a' && ((St_attribContext)_localctx).exp.type == 'i') {
			                error_list.add("ERROR ON LINE "+(((St_attribContext)_localctx).VARIABLE!=null?((St_attribContext)_localctx).VARIABLE.getLine():0)+ ": '"+ (((St_attribContext)_localctx).VARIABLE!=null?((St_attribContext)_localctx).VARIABLE.getText():null) +"' is string ");
			            }
			        } else { 
			            symbol_table.add((((St_attribContext)_localctx).VARIABLE!=null?((St_attribContext)_localctx).VARIABLE.getText():null));
						
			            if (((St_attribContext)_localctx).exp.type == 'i') { 
							type_table.add('i'); 
						}
						
			            if (((St_attribContext)_localctx).exp.type == 'a') { 
							type_table.add('a'); 
						}
						
			            symbol_table_warning.add(false);
			            i = symbol_table.indexOf((((St_attribContext)_localctx).VARIABLE!=null?((St_attribContext)_localctx).VARIABLE.getText():null));
						
			            if (((St_attribContext)_localctx).exp.type == 'i') { 
							emit("istore "+i+"\n", -1); 
						}
						
			            if (((St_attribContext)_localctx).exp.type == 'a') { 
					        emit("astore "+i+"\n", -1); 
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

	public static class St_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FFParser.IF, 0); }
		public TerminalNode OP_PAR() { return getToken(FFParser.OP_PAR, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode CL_PAR() { return getToken(FFParser.CL_PAR, 0); }
		public List<TerminalNode> OP_CUR() { return getTokens(FFParser.OP_CUR); }
		public TerminalNode OP_CUR(int i) {
			return getToken(FFParser.OP_CUR, i);
		}
		public List<TerminalNode> CL_CUR() { return getTokens(FFParser.CL_CUR); }
		public TerminalNode CL_CUR(int i) {
			return getToken(FFParser.CL_CUR, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(FFParser.ELSE, 0); }
		public St_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).enterSt_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).exitSt_if(this);
		}
	}

	public final St_ifContext st_if() throws RecognitionException {
		St_ifContext _localctx = new St_ifContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_st_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(IF);
			setState(74);
			match(OP_PAR);
			setState(75);
			comparison();
			  
			        int if_local = if_counter++;
			        boolean else_local = false;
			        emit(compare_op + " NOT_IF_"+if_local, -2);
			    
			setState(77);
			match(CL_PAR);
			setState(78);
			match(OP_CUR);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSOLE) | (1L << IF) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(79);
				statement();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(CL_CUR);
			setState(96);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{

				        else_local = true;
				        emit("goto END_ELSE_"+if_local, 0);
				        emit("NOT_IF_"+if_local+":", 0);
				    
				setState(87);
				match(ELSE);
				setState(88);
				match(OP_CUR);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSOLE) | (1L << IF) | (1L << VARIABLE))) != 0)) {
					{
					{
					setState(89);
					statement();
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(95);
				match(CL_CUR);
				}
			}

			  
			        if (else_local) 
					{
			            emit("END_ELSE_"+if_local+":", 0);
			        } else {
			            emit("NOT_IF_"+if_local+":", 0);
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

	public static class ComparisonContext extends ParserRuleContext {
		public ExpressionContext exp1;
		public Token op;
		public ExpressionContext exp2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(FFParser.EQUAL, 0); }
		public TerminalNode DIFF() { return getToken(FFParser.DIFF, 0); }
		public TerminalNode GREATER() { return getToken(FFParser.GREATER, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(FFParser.GREATER_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(FFParser.LESS, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(FFParser.LESS_EQUAL, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			((ComparisonContext)_localctx).exp1 = expression();
			setState(101);
			((ComparisonContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << DIFF) | (1L << LESS) | (1L << LESS_EQUAL) | (1L << GREATER) | (1L << GREATER_EQUAL))) != 0)) ) {
				((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(102);
			((ComparisonContext)_localctx).exp2 = expression();
			   
			        if (((ComparisonContext)_localctx).exp1.type == 'i' && ((ComparisonContext)_localctx).exp2.type == 'i') 
					{
			            if ((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == EQUAL) 
						{ 
							compare_op = "if_icmpne"; 
						}
						
			            if ((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == DIFF) 
						{
							compare_op = "if_icmpeq"; 
						}
						
			            if ((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == GREATER) 
						{ 
							compare_op = "if_icmple"; 
						}
						
			            if ((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == GREATER_EQUAL) 
						{ 
							compare_op = "if_icmplt"; 
						}
			               
						if ((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == LESS) 
						{ 
							compare_op = "if_icmpge";
						}
						
			            if ((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == LESS_EQUAL) 
						{ 
							compare_op = "if_icmpgt"; 
						}
						
			        } else{
			            error_list.add("ERROR ON LINE "+(((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getLine():0)+ ": mixed types ");
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
		enterRule(_localctx, 14, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			expression();
			argments +="I";
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(107);
				match(COMMA);
				setState(108);
				expression();
				argments +="I";
				}
				}
				setState(115);
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
		enterRule(_localctx, 16, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(FUNCTION);
			setState(117);
			((FunctionContext)_localctx).VARIABLE = match(VARIABLE);
			setState(118);
			match(OP_PAR);
			setState(120);
			_la = _input.LA(1);
			if (_la==VARIABLE) {
				{
				setState(119);
				parameters();
				}
			}

			setState(122);
			match(CL_PAR);
			setState(125);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(123);
				match(INT);
				ret = 'I';
				}
			}

			setState(127);
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
				
			setState(130); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129);
				statement();
				}
				}
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSOLE) | (1L << IF) | (1L << VARIABLE))) != 0) );
			setState(134);
			match(CL_CUR);
			   
					System.out.println("    return");
					System.out.println(".end method\n"); 	
					System.out.println("\n; symbols: " + symbol_table);
					System.out.println("\n; types: " + type_table);
					System.out.println("\n; used: " + symbol_table_warning);

					symbol_table = new ArrayList<String>();	
					type_table = new ArrayList<Character>();
					symbol_table_warning = new ArrayList<Boolean>();		
				
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
		public Token VARIABLE;
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
		enterRule(_localctx, 18, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			((ParametersContext)_localctx).VARIABLE = match(VARIABLE);
			 
					symbol_table.add((((ParametersContext)_localctx).VARIABLE!=null?((ParametersContext)_localctx).VARIABLE.getText():null));
					symbol_table_warning.add(false);
					type_table.add('i');
					argments += "I";
				
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(139);
				match(COMMA);
				setState(140);
				((ParametersContext)_localctx).VARIABLE = match(VARIABLE);
				 
							symbol_table.add((((ParametersContext)_localctx).VARIABLE!=null?((ParametersContext)_localctx).VARIABLE.getText():null));
							symbol_table_warning.add(false);
							type_table.add('i');
							argments += "I";
						
				}
				}
				setState(146);
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
		enterRule(_localctx, 20, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			((ExpressionContext)_localctx).t1 = term();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS || _la==PLUS) {
				{
				{
				setState(148);
				((ExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==PLUS) ) {
					((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(149);
				((ExpressionContext)_localctx).t2 = term();
				   
						if (((ExpressionContext)_localctx).t2.type == 'i') {
							emit(((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getType():0) == PLUS) ? "iadd" : "isub", -1);
						} else {
							error_list.add("ERROR ON LINE "+ (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0) + ": mixed types");
						}
					
				}
				}
				setState(156);
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
		enterRule(_localctx, 22, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			((TermContext)_localctx).f1 = factor();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OVER) | (1L << REMAINDER) | (1L << TIMES))) != 0)) {
				{
				{
				setState(160);
				((TermContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OVER) | (1L << REMAINDER) | (1L << TIMES))) != 0)) ) {
					((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(161);
				((TermContext)_localctx).f2 = factor();
				   
							if (((TermContext)_localctx).f2.type == 'i')
							{
								emit(((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == TIMES) ? "imul" : (((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0)  == OVER) ? "idiv" : "irem"), -1); 
							} else {
								error_list.add("ERROR ON LINE "+ (((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getLine():0) + ": mixed types");
							}  
						
				}
				}
				setState(168);
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
		public Token STRING;
		public ExpressionContext exp;
		public Token VARIABLE;
		public TerminalNode NUMBER() { return getToken(FFParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(FFParser.STRING, 0); }
		public TerminalNode OP_PAR() { return getToken(FFParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(FFParser.CL_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(FFParser.VARIABLE, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_factor);
		int _la;
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				((FactorContext)_localctx).NUMBER = match(NUMBER);
				   
							emit("ldc " + (((FactorContext)_localctx).NUMBER!=null?((FactorContext)_localctx).NUMBER.getText():null), +1); ((FactorContext)_localctx).type =  'i';
						
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				((FactorContext)_localctx).STRING = match(STRING);
				   
							emit("ldc " + (((FactorContext)_localctx).STRING!=null?((FactorContext)_localctx).STRING.getText():null), +1); ((FactorContext)_localctx).type =  'a';
						
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(OP_PAR);
				setState(176);
				((FactorContext)_localctx).exp = expression();
				setState(177);
				match(CL_PAR);
				 
							((FactorContext)_localctx).type =  ((FactorContext)_localctx).exp.type; 
						
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				((FactorContext)_localctx).VARIABLE = match(VARIABLE);
				setState(181);
				match(OP_PAR);
				setState(185);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_PAR) | (1L << NUMBER) | (1L << STRING) | (1L << VARIABLE))) != 0)) {
					{
					setState(182);
					arguments();
					ret = 'I';
					}
				}

				setState(187);
				match(CL_PAR);

							int i = function_table.indexOf((((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getText():null)+"("+argments+")"+ret);
							
							if (i >= 0) {
								emit("invokestatic Test/"+(((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getText():null)+"("+argments+")"+ret,0);
							} else {
								error_list.add("Invalid function on line: "+(((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getLine():0)+". Signiature: "+(((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getText():null)+"("+argments+")"+ret);
							}
							((FactorContext)_localctx).type =  'i';
						
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				((FactorContext)_localctx).VARIABLE = match(VARIABLE);

							int i = symbol_table.indexOf((((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getText():null));
							
							if (i >= 0) {
								symbol_table_warning.set(i, true);
								
								if (type_table.get(i) == 'i') { 
									emit("iload "+i, +1); ((FactorContext)_localctx).type =  'i'; 
								}
								
								if (type_table.get(i) == 'a') { 
									emit("aload "+i, +1); ((FactorContext)_localctx).type =  'a';
								}
								
								if (type_table.get(i) == 'v') { 
									emit("aload "+i, +1); 
								    emit("invokevirtual Array/string()Ljava/lang/String;", 0);
									((FactorContext)_localctx).type =  'a';
								}
							} else { 
								error_list.add("ERROR ON LINE "+(((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getLine():0)+ ": variable "+(((FactorContext)_localctx).VARIABLE!=null?((FactorContext)_localctx).VARIABLE.getText():null)+" is not declared!");
								((FactorContext)_localctx).type =  'i';
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u00c4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\2\3"+
		"\2\3\2\3\3\3\3\7\3)\n\3\f\3\16\3,\13\3\3\3\3\3\3\4\3\4\3\4\5\4\63\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5?\n\5\f\5\16\5B\13\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7S\n\7\f\7\16"+
		"\7V\13\7\3\7\3\7\3\7\3\7\3\7\7\7]\n\7\f\7\16\7`\13\7\3\7\5\7c\n\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tr\n\t\f\t\16\tu\13"+
		"\t\3\n\3\n\3\n\3\n\5\n{\n\n\3\n\3\n\3\n\5\n\u0080\n\n\3\n\3\n\3\n\6\n"+
		"\u0085\n\n\r\n\16\n\u0086\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u0091"+
		"\n\13\f\13\16\13\u0094\13\13\3\f\3\f\3\f\3\f\3\f\7\f\u009b\n\f\f\f\16"+
		"\f\u009e\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\r\u00a7\n\r\f\r\16\r\u00aa"+
		"\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00bc\n\16\3\16\3\16\3\16\3\16\5\16\u00c2\n\16\3\16"+
		"\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\5\3\2\22\27\4\2\r\r\17\17\4"+
		"\2\16\16\20\21\u00ca\2\34\3\2\2\2\4&\3\2\2\2\6\62\3\2\2\2\b\64\3\2\2\2"+
		"\nF\3\2\2\2\fK\3\2\2\2\16f\3\2\2\2\20k\3\2\2\2\22v\3\2\2\2\24\u008b\3"+
		"\2\2\2\26\u0095\3\2\2\2\30\u00a1\3\2\2\2\32\u00c1\3\2\2\2\34 \b\2\1\2"+
		"\35\37\5\22\n\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!#\3\2"+
		"\2\2\" \3\2\2\2#$\5\4\3\2$%\7\2\2\3%\3\3\2\2\2&*\b\3\1\2\')\5\6\4\2(\'"+
		"\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-.\b\3\1\2."+
		"\5\3\2\2\2/\63\5\b\5\2\60\63\5\n\6\2\61\63\5\f\7\2\62/\3\2\2\2\62\60\3"+
		"\2\2\2\62\61\3\2\2\2\63\7\3\2\2\2\64\65\7\30\2\2\65\66\7\b\2\2\66\67\b"+
		"\5\1\2\678\5\26\f\28@\b\5\1\29:\7\n\2\2:;\b\5\1\2;<\5\26\f\2<=\b\5\1\2"+
		"=?\3\2\2\2>9\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2"+
		"CD\7\t\2\2DE\b\5\1\2E\t\3\2\2\2FG\7\36\2\2GH\7\3\2\2HI\5\26\f\2IJ\b\6"+
		"\1\2J\13\3\2\2\2KL\7\32\2\2LM\7\b\2\2MN\5\16\b\2NO\b\7\1\2OP\7\t\2\2P"+
		"T\7\6\2\2QS\5\6\4\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2"+
		"VT\3\2\2\2Wb\7\7\2\2XY\b\7\1\2YZ\7\33\2\2Z^\7\6\2\2[]\5\6\4\2\\[\3\2\2"+
		"\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ac\7\7\2\2bX\3\2"+
		"\2\2bc\3\2\2\2cd\3\2\2\2de\b\7\1\2e\r\3\2\2\2fg\5\26\f\2gh\t\2\2\2hi\5"+
		"\26\f\2ij\b\b\1\2j\17\3\2\2\2kl\5\26\f\2ls\b\t\1\2mn\7\n\2\2no\5\26\f"+
		"\2op\b\t\1\2pr\3\2\2\2qm\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\21\3\2"+
		"\2\2us\3\2\2\2vw\7\31\2\2wx\7\36\2\2xz\7\b\2\2y{\5\24\13\2zy\3\2\2\2z"+
		"{\3\2\2\2{|\3\2\2\2|\177\7\t\2\2}~\7\f\2\2~\u0080\b\n\1\2\177}\3\2\2\2"+
		"\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7\6\2\2\u0082\u0084"+
		"\b\n\1\2\u0083\u0085\5\6\4\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\7"+
		"\2\2\u0089\u008a\b\n\1\2\u008a\23\3\2\2\2\u008b\u008c\7\36\2\2\u008c\u0092"+
		"\b\13\1\2\u008d\u008e\7\n\2\2\u008e\u008f\7\36\2\2\u008f\u0091\b\13\1"+
		"\2\u0090\u008d\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\25\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u009c\5\30\r\2\u0096"+
		"\u0097\t\3\2\2\u0097\u0098\5\30\r\2\u0098\u0099\b\f\1\2\u0099\u009b\3"+
		"\2\2\2\u009a\u0096\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\b\f"+
		"\1\2\u00a0\27\3\2\2\2\u00a1\u00a8\5\32\16\2\u00a2\u00a3\t\4\2\2\u00a3"+
		"\u00a4\5\32\16\2\u00a4\u00a5\b\r\1\2\u00a5\u00a7\3\2\2\2\u00a6\u00a2\3"+
		"\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\b\r\1\2\u00ac\31\3\2\2"+
		"\2\u00ad\u00ae\7\34\2\2\u00ae\u00c2\b\16\1\2\u00af\u00b0\7\35\2\2\u00b0"+
		"\u00c2\b\16\1\2\u00b1\u00b2\7\b\2\2\u00b2\u00b3\5\26\f\2\u00b3\u00b4\7"+
		"\t\2\2\u00b4\u00b5\b\16\1\2\u00b5\u00c2\3\2\2\2\u00b6\u00b7\7\36\2\2\u00b7"+
		"\u00bb\7\b\2\2\u00b8\u00b9\5\20\t\2\u00b9\u00ba\b\16\1\2\u00ba\u00bc\3"+
		"\2\2\2\u00bb\u00b8\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00be\7\t\2\2\u00be\u00c2\b\16\1\2\u00bf\u00c0\7\36\2\2\u00c0\u00c2\b"+
		"\16\1\2\u00c1\u00ad\3\2\2\2\u00c1\u00af\3\2\2\2\u00c1\u00b1\3\2\2\2\u00c1"+
		"\u00b6\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\33\3\2\2\2\22 *\62@T^bsz\177"+
		"\u0086\u0092\u009c\u00a8\u00bb\u00c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}