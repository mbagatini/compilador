grammar FF;

/*---------------- PARSER INTERNALS ----------------*/

@parser::header {
}

@parser::members {
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
}

/*---------------- LEXER RULES ----------------*/

ATTRIB: '=';
OP_BRT: '[';
CL_BRT: ']';
OP_CUR: '{';
CL_CUR: '}';
OP_PAR: '(';
CL_PAR: ')';
COMMA: ',';
DOT: '.';
INT: 'int';
MINUS: '-';
OVER: '/';
PLUS: '+';
REMAINDER: '%';
TIMES: '*';

EQUAL: '==';
DIFF: '!=';
LESS: '<';
LESS_EQUAL: '<=';
GREATER: '>';
GREATER_EQUAL: '>=';

CONSOLE: 'console';
FUNCTION: 'function';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
CONTINUE: 'continue';
BREAK: 'break';

NUMBER: '0' ..'9'+;
STRING: '"' ~["]* '"';
VARIABLE: 'a' ..'z'+;

COMMENT: '//' ~('\n')* { skip(); };
SPACE: (' ' | '\t' | '\r' | '\n')+ { skip(); };

/*---------------- PARSER RULES ----------------*/

program:
	{  
		System.out.println(".source Test.j");
		System.out.println(".class  public Test");
		System.out.println(".super  java/lang/Object\n");
		System.out.println(".method public <init>()V");
		System.out.println("    aload_0");
		System.out.println("    invokenonvirtual java/lang/Object/<init>()V");
		System.out.println("    return");
		System.out.println(".end method\n");
    }( function )* main EOF;

main:
	{   
		System.out.println(".method public static main([Ljava/lang/String;)V\n");
        symbol_table.add("args");
        type_table.add('-');
        symbol_table_warning.add(true); 
    } 
    (statement)* 
	{   
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

    };

statement: st_console | st_attrib | st_if | st_while | st_break | st_continue;

st_console:   
	CONSOLE OP_PAR 
    {   
        emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1); 
    }
	
    exp1 = expression
    {   
        if ($exp1.type == 'i') {
            emit("invokevirtual java/io/PrintStream/print(I)V\n", -2);
        }
		
        if ($exp1.type == 'a') {
            emit("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", -2);
        }             
    }( COMMA
        {   
            emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1); 
        }
    exp2 = expression
    {   
        if ($exp2.type == 'i') {
            emit("invokevirtual java/io/PrintStream/print(I)V\n", -2);
        }
		
        if ($exp2.type == 'a') {
             emit("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", -2);
        }  
    } ) * CL_PAR
        {   
            emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1); 
            emit("invokevirtual java/io/PrintStream/println()V", -1); 
        }
;
    
st_attrib:  
    VARIABLE ATTRIB exp = expression
    {    
        System.out.println("\n; --- cheguei aqui --- ");
        System.out.println("\n; types size: " + type_table.size());
        System.out.println("\n; symbols size: " + symbol_table.size());
		
        int i = symbol_table.indexOf($VARIABLE.text);
		
        if (i > 0) {
            if (type_table.get(i) == $exp.type) {
                if ($exp.type == 'i') 
				{
				    emit("istore "+i+"\n", -1);
				}
				
                if ($exp.type == 'a') 
				{
					emit("astore "+i+"\n", -1);
				}
            } else if (type_table.get(i) == 'i' && $exp.type == 'a') {
                error_list.add("ERROR ON LINE "+$VARIABLE.line+ ": '"+ $VARIABLE.text +"' is integer ");

            } else if (type_table.get(i) == 'a' && $exp.type == 'i') {
                error_list.add("ERROR ON LINE "+$VARIABLE.line+ ": '"+ $VARIABLE.text +"' is string ");
            }
        } else { 
            symbol_table.add($VARIABLE.text);
			
            if ($exp.type == 'i') { 
				type_table.add('i'); 
			}
			
            if ($exp.type == 'a') { 
				type_table.add('a'); 
			}
			
            symbol_table_warning.add(false);
            i = symbol_table.indexOf($VARIABLE.text);
			
            if ($exp.type == 'i') { 
				emit("istore "+i+"\n", -1); 
			}
			
            if ($exp.type == 'a') { 
		        emit("astore "+i+"\n", -1); 
			}
        }  
    }      
;

st_if:
    IF OP_PAR comparison 
    {  
        int if_local = if_counter++;
        boolean else_local = false;
        emit(compare_op + " NOT_IF_"+if_local, -2);
    } 
	CL_PAR OP_CUR (statement)* CL_CUR ( 
    {
        else_local = true;
        emit("goto END_ELSE_"+if_local, 0);
        emit("NOT_IF_"+if_local+":", 0);
    } 
	ELSE OP_CUR (statement)* CL_CUR)?
    {  
        if (else_local) 
		{
            emit("END_ELSE_"+if_local+":", 0);
        } else {
            emit("NOT_IF_"+if_local+":", 0);
        }
    }	
;

st_while:  
	WHILE  
    {  
        int while_local = while_counter++;
        emit("BEGIN_WHILE_" + while_local + ":", 0);
        while_stack.add(while_local);
    }
    OP_PAR comparison CL_PAR 
    {  
        emit(compare_op + " END_WHILE_" + while_local, -2);
    }
    OP_CUR ( statement ) * CL_CUR
    { 
        emit("goto BEGIN_WHILE_" + while_local, 0);
    }
    {  
        emit("END_WHILE_" + while_local + ":", 0); 
        while_stack.remove(while_stack.size()-1);
    }
;

st_break: 
	BREAK
    {  
        if (while_stack.size() != 0)
		{
            emit("goto END_WHILE_" + while_stack.get(while_stack.size() - 1), 0); 
        } else {
            error_list.add("ERROR: break outside a while!");
        }
    }
;

st_continue:
    CONTINUE
    {  
        if (while_stack.size() != 0)
		{
            emit("goto BEGIN_WHILE_" + while_stack.get(while_stack.size() - 1), 0); 
        } else {
            error_list.add("ERROR: continue outside a while!");
        }
    }
;

comparison: 
    exp1 = expression op = (EQUAL | DIFF | GREATER | GREATER_EQUAL | LESS | LESS_EQUAL) exp2 = expression
    {   
        if ($exp1.type == 'i' && $exp2.type == 'i') 
		{
            if ($op.type == EQUAL) 
			{ 
				compare_op = "if_icmpne"; 
			}
			
            if ($op.type == DIFF) 
			{
				compare_op = "if_icmpeq"; 
			}
			
            if ($op.type == GREATER) 
			{ 
				compare_op = "if_icmple"; 
			}
			
            if ($op.type == GREATER_EQUAL) 
			{ 
				compare_op = "if_icmplt"; 
			}
               
			if ($op.type == LESS) 
			{ 
				compare_op = "if_icmpge";
			}
			
            if ($op.type == LESS_EQUAL) 
			{ 
				compare_op = "if_icmpgt"; 
			}
			
        } else{
            error_list.add("ERROR ON LINE "+$op.line+ ": mixed types ");
        }
    }
;

arguments:	
	expression {argments +="I";} (COMMA expression {argments +="I";})*
;

function: 
	FUNCTION VARIABLE OP_PAR (parameters)? CL_PAR (INT {ret = 'I';})?  OP_CUR 
	{   
		int i = function_table.indexOf($VARIABLE.text+"("+argments+")"+ret);
		
		if (i >= 0)
		{
			error_list.add("ERROR ON LINE "+$VARIABLE.line+ ": '"+ $VARIABLE.text +"' function is already declared!");
		} else {
			function_table.add($VARIABLE.text+"("+argments+")"+ret);
		}
		System.out.println(".method public static "+$VARIABLE.text+"("+argments+")"+ret); 
		argments =  "";
		ret = 'V';
	}
	(statement) + CL_CUR
	{   
		System.out.println("    return");
		System.out.println(".end method\n"); 	
		System.out.println("\n; symbols: " + symbol_table);
		System.out.println("\n; types: " + type_table);
		System.out.println("\n; used: " + symbol_table_warning);

		symbol_table = new ArrayList<String>();	
		type_table = new ArrayList<Character>();
		symbol_table_warning = new ArrayList<Boolean>();		
	}
;

parameters:
	VARIABLE 
	{ 
		symbol_table.add($VARIABLE.text);
		symbol_table_warning.add(false);
		type_table.add('i');
		argments += "I";
	}
	( COMMA VARIABLE 		
		{ 
			symbol_table.add($VARIABLE.text);
			symbol_table_warning.add(false);
			type_table.add('i');
			argments += "I";
		}
	)*
;

expression returns [char type]:   
	t1 = term ( op = ( PLUS | MINUS ) t2 = term
	{   
		if ($t2.type == 'i') {
			emit(($op.type == PLUS) ? "iadd" : "isub", -1);
		} else {
			error_list.add("ERROR ON LINE "+ $op.line + ": mixed types");
		}
	}
	)*
	{    
		$type = $t1.type; 
	}
;

term returns [char type]:
	f1 = factor ( op = (TIMES | OVER | REMAINDER) f2 = factor 
		{   
			if ($f2.type == 'i')
			{
				emit(($op.type == TIMES) ? "imul" : (($op.type  == OVER) ? "idiv" : "irem"), -1); 
			} else {
				error_list.add("ERROR ON LINE "+ $op.line + ": mixed types");
			}  
		}
	)*
	{   
		$type = $f1.type; 
	}    
;

factor returns [char type]:   
	NUMBER
		{   
			emit("ldc " + $NUMBER.text, +1); $type = 'i';
		}

	| STRING
		{   
			emit("ldc " + $STRING.text, +1); $type = 'a';
		}

	| OP_PAR exp = expression CL_PAR
		{ 
			$type = $exp.type; 
		}

	| VARIABLE OP_PAR (arguments{ret = 'I';})? CL_PAR
		{
			int i = function_table.indexOf($VARIABLE.text+"("+argments+")"+ret);
			
			if (i >= 0) {
				emit("invokestatic Test/"+$VARIABLE.text+"("+argments+")"+ret,0);
			} else {
				error_list.add("Invalid function on line: "+$VARIABLE.line+". Signiature: "+$VARIABLE.text+"("+argments+")"+ret);
			}
			$type = 'i';
		}

	| VARIABLE
		{
			int i = symbol_table.indexOf($VARIABLE.text);
			
			if (i >= 0) {
				symbol_table_warning.set(i, true);
				
				if (type_table.get(i) == 'i') { 
					emit("iload "+i, +1); $type = 'i'; 
				}
				
				if (type_table.get(i) == 'a') { 
					emit("aload "+i, +1); $type = 'a';
				}
				
				if (type_table.get(i) == 'v') { 
					emit("aload "+i, +1); 
				    emit("invokevirtual Array/string()Ljava/lang/String;", 0);
					$type = 'a';
				}
			} else { 
				error_list.add("ERROR ON LINE "+$VARIABLE.line+ ": variable "+$VARIABLE.text+" is not declared!");
				$type = 'i';
			}
		}
;