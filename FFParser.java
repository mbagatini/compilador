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
		CONSOLE=22, FUNCTION=23, IF=24, ELSE=25, WHILE=26, CONTINUE=27, BREAK=28, 
		READ_INT=29, READ_STRING=30, NUMBER=31, STRING=32, VARIABLE=33, COMMENT=34, 
		SPACE=35;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_statement = 2, RULE_st_console = 3, 
		RULE_st_attrib = 4, RULE_st_if = 5, RULE_st_while = 6, RULE_st_break = 7, 
		RULE_st_continue = 8, RULE_comparison = 9, RULE_arguments = 10, RULE_function = 11, 
		RULE_parameters = 12, RULE_expression = 13, RULE_term = 14, RULE_factor = 15;
	public static final String[] ruleNames = {
		"program", "main", "statement", "st_console", "st_attrib", "st_if", "st_while", 
		"st_break", "st_continue", "comparison", "arguments", "function", "parameters", 
		"expression", "term", "factor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'['", "']'", "'{'", "'}'", "'('", "')'", "','", "'.'", "'int'", 
		"'-'", "'/'", "'+'", "'%'", "'*'", "'=='", "'!='", "'<'", "'<='", "'>'", 
		"'>='", "'console'", "'function'", "'if'", "'else'", "'while'", "'continue'", 
		"'break'", "'readInt'", "'readString'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ATTRIB", "OP_BRT", "CL_BRT", "OP_CUR", "CL_CUR", "OP_PAR", "CL_PAR", 
		"COMMA", "DOT", "INT", "MINUS", "OVER", "PLUS", "REMAINDER", "TIMES", 
		"EQUAL", "DIFF", "LESS", "LESS_EQUAL", "GREATER", "GREATER_EQUAL", "CONSOLE", 
		"FUNCTION", "IF", "ELSE", "WHILE", "CONTINUE", "BREAK", "READ_INT", "READ_STRING", 
		"NUMBER", "STRING", "VARIABLE", "COMMENT", "SPACE"
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
		private static ArrayList<Integer> while_stack;
		private static String argments;
		private static String compare_op;	
		private static int if_counter;
		private static int while_counter;
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
	        while_stack = new ArrayList<Integer>();

			if_counter = 0;
	        while_counter = 0;

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
			    
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(33);
				function();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			main();
			setState(40);
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
			    
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSOLE) | (1L << IF) | (1L << WHILE) | (1L << CONTINUE) | (1L << BREAK) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(43);
				statement();
				}
				}
				setState(48);
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
		public St_whileContext st_while() {
			return getRuleContext(St_whileContext.class,0);
		}
		public St_breakContext st_break() {
			return getRuleContext(St_breakContext.class,0);
		}
		public St_continueContext st_continue() {
			return getRuleContext(St_continueContext.class,0);
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
			setState(57);
			switch (_input.LA(1)) {
			case CONSOLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				st_console();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				st_attrib();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				st_if();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				st_while();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				st_break();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(56);
				st_continue();
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
			setState(59);
			match(CONSOLE);
			setState(60);
			match(OP_PAR);
			   
			        emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1); 
			    
			setState(62);
			((St_consoleContext)_localctx).exp1 = expression();
			   
			        if (((St_consoleContext)_localctx).exp1.type == 'i') {
			            emit("invokevirtual java/io/PrintStream/print(I)V\n", -2);
			        }
					
			        if (((St_consoleContext)_localctx).exp1.type == 'a') {
			            emit("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", -2);
			        }             
			    
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(64);
				match(COMMA);
				   
				            emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1); 
				        
				setState(66);
				((St_consoleContext)_localctx).exp2 = expression();
				   
				        if (((St_consoleContext)_localctx).exp2.type == 'i') {
				            emit("invokevirtual java/io/PrintStream/print(I)V\n", -2);
				        }
						
				        if (((St_consoleContext)_localctx).exp2.type == 'a') {
				             emit("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", -2);
				        }  
				    
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
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
			setState(77);
			((St_attribContext)_localctx).VARIABLE = match(VARIABLE);
			setState(78);
			match(ATTRIB);
			setState(79);
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
			setState(82);
			match(IF);
			setState(83);
			match(OP_PAR);
			setState(84);
			comparison();
			  
			        int if_local = if_counter++;
			        boolean else_local = false;
			        emit(compare_op + " NOT_IF_"+if_local, -2);
			    
			setState(86);
			match(CL_PAR);
			setState(87);
			match(OP_CUR);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSOLE) | (1L << IF) | (1L << WHILE) | (1L << CONTINUE) | (1L << BREAK) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(88);
				statement();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(CL_CUR);
			setState(105);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{

				        else_local = true;
				        emit("goto END_ELSE_"+if_local, 0);
				        emit("NOT_IF_"+if_local+":", 0);
				    
				setState(96);
				match(ELSE);
				setState(97);
				match(OP_CUR);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSOLE) | (1L << IF) | (1L << WHILE) | (1L << CONTINUE) | (1L << BREAK) | (1L << VARIABLE))) != 0)) {
					{
					{
					setState(98);
					statement();
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(104);
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

	public static class St_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(FFParser.WHILE, 0); }
		public TerminalNode OP_PAR() { return getToken(FFParser.OP_PAR, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode CL_PAR() { return getToken(FFParser.CL_PAR, 0); }
		public TerminalNode OP_CUR() { return getToken(FFParser.OP_CUR, 0); }
		public TerminalNode CL_CUR() { return getToken(FFParser.CL_CUR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public St_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).enterSt_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).exitSt_while(this);
		}
	}

	public final St_whileContext st_while() throws RecognitionException {
		St_whileContext _localctx = new St_whileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_st_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(WHILE);
			  
			        int while_local = while_counter++;
			        emit("BEGIN_WHILE_" + while_local + ":", 0);
			        while_stack.add(while_local);
			    
			setState(111);
			match(OP_PAR);
			setState(112);
			comparison();
			setState(113);
			match(CL_PAR);
			  
			        emit(compare_op + " END_WHILE_" + while_local, -2);
			    
			setState(115);
			match(OP_CUR);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSOLE) | (1L << IF) | (1L << WHILE) | (1L << CONTINUE) | (1L << BREAK) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(116);
				statement();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(CL_CUR);
			 
			        emit("goto BEGIN_WHILE_" + while_local, 0);
			    
			  
			        emit("END_WHILE_" + while_local + ":", 0); 
			        while_stack.remove(while_stack.size()-1);
			    
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

	public static class St_breakContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(FFParser.BREAK, 0); }
		public St_breakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_break; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).enterSt_break(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).exitSt_break(this);
		}
	}

	public final St_breakContext st_break() throws RecognitionException {
		St_breakContext _localctx = new St_breakContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_st_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(BREAK);
			  
			        if (while_stack.size() != 0)
					{
			            emit("goto END_WHILE_" + while_stack.get(while_stack.size() - 1), 0); 
			        } else {
			            error_list.add("ERROR: break outside a while!");
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

	public static class St_continueContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(FFParser.CONTINUE, 0); }
		public St_continueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_continue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).enterSt_continue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FFListener ) ((FFListener)listener).exitSt_continue(this);
		}
	}

	public final St_continueContext st_continue() throws RecognitionException {
		St_continueContext _localctx = new St_continueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_st_continue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(CONTINUE);
			  
			        if (while_stack.size() != 0)
					{
			            emit("goto BEGIN_WHILE_" + while_stack.get(while_stack.size() - 1), 0); 
			        } else {
			            error_list.add("ERROR: continue outside a while!");
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
		enterRule(_localctx, 18, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			((ComparisonContext)_localctx).exp1 = expression();
			setState(133);
			((ComparisonContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << DIFF) | (1L << LESS) | (1L << LESS_EQUAL) | (1L << GREATER) | (1L << GREATER_EQUAL))) != 0)) ) {
				((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(134);
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
		enterRule(_localctx, 20, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			expression();
			argments +="I";
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(139);
				match(COMMA);
				setState(140);
				expression();
				argments +="I";
				}
				}
				setState(147);
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
		enterRule(_localctx, 22, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(FUNCTION);
			setState(149);
			((FunctionContext)_localctx).VARIABLE = match(VARIABLE);
			setState(150);
			match(OP_PAR);
			setState(152);
			_la = _input.LA(1);
			if (_la==VARIABLE) {
				{
				setState(151);
				parameters();
				}
			}

			setState(154);
			match(CL_PAR);
			setState(157);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(155);
				match(INT);
				ret = 'I';
				}
			}

			setState(159);
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
				
			setState(162); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(161);
				statement();
				}
				}
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSOLE) | (1L << IF) | (1L << WHILE) | (1L << CONTINUE) | (1L << BREAK) | (1L << VARIABLE))) != 0) );
			setState(166);
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
		enterRule(_localctx, 24, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			((ParametersContext)_localctx).VARIABLE = match(VARIABLE);
			 
					symbol_table.add((((ParametersContext)_localctx).VARIABLE!=null?((ParametersContext)_localctx).VARIABLE.getText():null));
					symbol_table_warning.add(false);
					type_table.add('i');
					argments += "I";
				
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(171);
				match(COMMA);
				setState(172);
				((ParametersContext)_localctx).VARIABLE = match(VARIABLE);
				 
							symbol_table.add((((ParametersContext)_localctx).VARIABLE!=null?((ParametersContext)_localctx).VARIABLE.getText():null));
							symbol_table_warning.add(false);
							type_table.add('i');
							argments += "I";
						
				}
				}
				setState(178);
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
		enterRule(_localctx, 26, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			((ExpressionContext)_localctx).t1 = term();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS || _la==PLUS) {
				{
				{
				setState(180);
				((ExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==PLUS) ) {
					((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(181);
				((ExpressionContext)_localctx).t2 = term();
				   
						if (((ExpressionContext)_localctx).t2.type == 'i') {
							emit(((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getType():0) == PLUS) ? "iadd" : "isub", -1);
						} else {
							error_list.add("ERROR ON LINE "+ (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0) + ": mixed types");
						}
					
				}
				}
				setState(188);
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
		enterRule(_localctx, 28, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			((TermContext)_localctx).f1 = factor();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OVER) | (1L << REMAINDER) | (1L << TIMES))) != 0)) {
				{
				{
				setState(192);
				((TermContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OVER) | (1L << REMAINDER) | (1L << TIMES))) != 0)) ) {
					((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(193);
				((TermContext)_localctx).f2 = factor();
				   
							if (((TermContext)_localctx).f2.type == 'i')
							{
								emit(((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == TIMES) ? "imul" : (((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0)  == OVER) ? "idiv" : "irem"), -1); 
							} else {
								error_list.add("ERROR ON LINE "+ (((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getLine():0) + ": mixed types");
							}  
						
				}
				}
				setState(200);
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
		public TerminalNode READ_INT() { return getToken(FFParser.READ_INT, 0); }
		public TerminalNode READ_STRING() { return getToken(FFParser.READ_STRING, 0); }
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
		enterRule(_localctx, 30, RULE_factor);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				((FactorContext)_localctx).NUMBER = match(NUMBER);
				   
							emit("ldc " + (((FactorContext)_localctx).NUMBER!=null?((FactorContext)_localctx).NUMBER.getText():null), +1); ((FactorContext)_localctx).type =  'i';
						
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				((FactorContext)_localctx).STRING = match(STRING);
				   
							emit("ldc " + (((FactorContext)_localctx).STRING!=null?((FactorContext)_localctx).STRING.getText():null), +1); ((FactorContext)_localctx).type =  'a';
						
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				match(OP_PAR);
				setState(208);
				((FactorContext)_localctx).exp = expression();
				setState(209);
				match(CL_PAR);
				 
							((FactorContext)_localctx).type =  ((FactorContext)_localctx).exp.type; 
						
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				((FactorContext)_localctx).VARIABLE = match(VARIABLE);
				setState(213);
				match(OP_PAR);
				setState(217);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_PAR) | (1L << READ_INT) | (1L << READ_STRING) | (1L << NUMBER) | (1L << STRING) | (1L << VARIABLE))) != 0)) {
					{
					setState(214);
					arguments();
					ret = 'I';
					}
				}

				setState(219);
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
				setState(221);
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
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(223);
				match(READ_INT);
				setState(224);
				match(OP_PAR);
				setState(225);
				match(CL_PAR);
					
							emit("invokestatic Runtime/readInt()I", +1); ((FactorContext)_localctx).type =  'i'; 
						
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(227);
				match(READ_STRING);
				setState(228);
				match(OP_PAR);
				setState(229);
				match(CL_PAR);
					
							emit("invokestatic Runtime/readString()Ljava/lang/String;", +1); ((FactorContext)_localctx).type =  'a'; 
						
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u00ec\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\7"+
		"\2%\n\2\f\2\16\2(\13\2\3\2\3\2\3\2\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5H\n\5\f\5\16\5K\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7\\\n\7\f\7\16\7_\13\7\3\7\3\7\3\7\3\7\3\7"+
		"\7\7f\n\7\f\7\16\7i\13\7\3\7\5\7l\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\7\bx\n\b\f\b\16\b{\13\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0092\n\f\f\f"+
		"\16\f\u0095\13\f\3\r\3\r\3\r\3\r\5\r\u009b\n\r\3\r\3\r\3\r\5\r\u00a0\n"+
		"\r\3\r\3\r\3\r\6\r\u00a5\n\r\r\r\16\r\u00a6\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\7\16\u00b1\n\16\f\16\16\16\u00b4\13\16\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u00bb\n\17\f\17\16\17\u00be\13\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u00c7\n\20\f\20\16\20\u00ca\13\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00dc"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u00ea\n\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\5\3"+
		"\2\22\27\4\2\r\r\17\17\4\2\16\16\20\21\u00f5\2\"\3\2\2\2\4,\3\2\2\2\6"+
		";\3\2\2\2\b=\3\2\2\2\nO\3\2\2\2\fT\3\2\2\2\16o\3\2\2\2\20\u0080\3\2\2"+
		"\2\22\u0083\3\2\2\2\24\u0086\3\2\2\2\26\u008b\3\2\2\2\30\u0096\3\2\2\2"+
		"\32\u00ab\3\2\2\2\34\u00b5\3\2\2\2\36\u00c1\3\2\2\2 \u00e9\3\2\2\2\"&"+
		"\b\2\1\2#%\5\30\r\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2"+
		"\2(&\3\2\2\2)*\5\4\3\2*+\7\2\2\3+\3\3\2\2\2,\60\b\3\1\2-/\5\6\4\2.-\3"+
		"\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2"+
		"\2\63\64\b\3\1\2\64\5\3\2\2\2\65<\5\b\5\2\66<\5\n\6\2\67<\5\f\7\28<\5"+
		"\16\b\29<\5\20\t\2:<\5\22\n\2;\65\3\2\2\2;\66\3\2\2\2;\67\3\2\2\2;8\3"+
		"\2\2\2;9\3\2\2\2;:\3\2\2\2<\7\3\2\2\2=>\7\30\2\2>?\7\b\2\2?@\b\5\1\2@"+
		"A\5\34\17\2AI\b\5\1\2BC\7\n\2\2CD\b\5\1\2DE\5\34\17\2EF\b\5\1\2FH\3\2"+
		"\2\2GB\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\t"+
		"\2\2MN\b\5\1\2N\t\3\2\2\2OP\7#\2\2PQ\7\3\2\2QR\5\34\17\2RS\b\6\1\2S\13"+
		"\3\2\2\2TU\7\32\2\2UV\7\b\2\2VW\5\24\13\2WX\b\7\1\2XY\7\t\2\2Y]\7\6\2"+
		"\2Z\\\5\6\4\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2"+
		"\2\2`k\7\7\2\2ab\b\7\1\2bc\7\33\2\2cg\7\6\2\2df\5\6\4\2ed\3\2\2\2fi\3"+
		"\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jl\7\7\2\2ka\3\2\2\2kl\3"+
		"\2\2\2lm\3\2\2\2mn\b\7\1\2n\r\3\2\2\2op\7\34\2\2pq\b\b\1\2qr\7\b\2\2r"+
		"s\5\24\13\2st\7\t\2\2tu\b\b\1\2uy\7\6\2\2vx\5\6\4\2wv\3\2\2\2x{\3\2\2"+
		"\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7\7\2\2}~\b\b\1\2~\177\b"+
		"\b\1\2\177\17\3\2\2\2\u0080\u0081\7\36\2\2\u0081\u0082\b\t\1\2\u0082\21"+
		"\3\2\2\2\u0083\u0084\7\35\2\2\u0084\u0085\b\n\1\2\u0085\23\3\2\2\2\u0086"+
		"\u0087\5\34\17\2\u0087\u0088\t\2\2\2\u0088\u0089\5\34\17\2\u0089\u008a"+
		"\b\13\1\2\u008a\25\3\2\2\2\u008b\u008c\5\34\17\2\u008c\u0093\b\f\1\2\u008d"+
		"\u008e\7\n\2\2\u008e\u008f\5\34\17\2\u008f\u0090\b\f\1\2\u0090\u0092\3"+
		"\2\2\2\u0091\u008d\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\27\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7\31\2"+
		"\2\u0097\u0098\7#\2\2\u0098\u009a\7\b\2\2\u0099\u009b\5\32\16\2\u009a"+
		"\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009f\7\t"+
		"\2\2\u009d\u009e\7\f\2\2\u009e\u00a0\b\r\1\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\6\2\2\u00a2\u00a4\b\r"+
		"\1\2\u00a3\u00a5\5\6\4\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7\7"+
		"\2\2\u00a9\u00aa\b\r\1\2\u00aa\31\3\2\2\2\u00ab\u00ac\7#\2\2\u00ac\u00b2"+
		"\b\16\1\2\u00ad\u00ae\7\n\2\2\u00ae\u00af\7#\2\2\u00af\u00b1\b\16\1\2"+
		"\u00b0\u00ad\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\33\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00bc\5\36\20\2\u00b6"+
		"\u00b7\t\3\2\2\u00b7\u00b8\5\36\20\2\u00b8\u00b9\b\17\1\2\u00b9\u00bb"+
		"\3\2\2\2\u00ba\u00b6\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\b\17"+
		"\1\2\u00c0\35\3\2\2\2\u00c1\u00c8\5 \21\2\u00c2\u00c3\t\4\2\2\u00c3\u00c4"+
		"\5 \21\2\u00c4\u00c5\b\20\1\2\u00c5\u00c7\3\2\2\2\u00c6\u00c2\3\2\2\2"+
		"\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\b\20\1\2\u00cc\37\3\2\2\2\u00cd"+
		"\u00ce\7!\2\2\u00ce\u00ea\b\21\1\2\u00cf\u00d0\7\"\2\2\u00d0\u00ea\b\21"+
		"\1\2\u00d1\u00d2\7\b\2\2\u00d2\u00d3\5\34\17\2\u00d3\u00d4\7\t\2\2\u00d4"+
		"\u00d5\b\21\1\2\u00d5\u00ea\3\2\2\2\u00d6\u00d7\7#\2\2\u00d7\u00db\7\b"+
		"\2\2\u00d8\u00d9\5\26\f\2\u00d9\u00da\b\21\1\2\u00da\u00dc\3\2\2\2\u00db"+
		"\u00d8\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\7\t"+
		"\2\2\u00de\u00ea\b\21\1\2\u00df\u00e0\7#\2\2\u00e0\u00ea\b\21\1\2\u00e1"+
		"\u00e2\7\37\2\2\u00e2\u00e3\7\b\2\2\u00e3\u00e4\7\t\2\2\u00e4\u00ea\b"+
		"\21\1\2\u00e5\u00e6\7 \2\2\u00e6\u00e7\7\b\2\2\u00e7\u00e8\7\t\2\2\u00e8"+
		"\u00ea\b\21\1\2\u00e9\u00cd\3\2\2\2\u00e9\u00cf\3\2\2\2\u00e9\u00d1\3"+
		"\2\2\2\u00e9\u00d6\3\2\2\2\u00e9\u00df\3\2\2\2\u00e9\u00e1\3\2\2\2\u00e9"+
		"\u00e5\3\2\2\2\u00ea!\3\2\2\2\23&\60;I]gky\u0093\u009a\u009f\u00a6\u00b2"+
		"\u00bc\u00c8\u00db\u00e9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}