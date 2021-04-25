grammar FF;

/*---------------- PARSER INTERNALS ----------------*/

@parser::header {
}

@parser::members {
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

CONSOLE: 'console';
FUNCTION: 'function';

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
		System.out.println(".super  java/lang/Object");
		System.out.println(".method public <init>()V");
		System.out.println("    aload_0");
		System.out.println("    invokenonvirtual java/lang/Object/<init>()V");
		System.out.println("    return");
		System.out.println(".end method");
    }( function )* main EOF;

main:
	{   
        System.out.println(".method public static main([Ljava/lang/String;)V"); 
    } 
    (statement)* 
	{   
            System.out.println("    return");
			System.out.println(".limit stack 10");
            System.out.println(".end method"); 		
    };

statement: st_console;

st_console:   
	CONSOLE OP_PAR 
	{   
		print("getstatic java/lang/System/out Ljava/io/PrintStream;", 1); 
	}

	exp1 = expression
	{   
		if ($exp1.type == 'i')
		{
			print("invokevirtual java/io/PrintStream/print(I)V\n", -2);
		}
		
		if ($exp1.type == 'a')
		{
			print("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", -2);
		}             
	}( COMMA
		{   
			print("getstatic java/lang/System/out Ljava/io/PrintStream;", 1); 
		}
		exp2 = expression
		{   
			if ($exp2.type == 'i')
			{
				print("invokevirtual java/io/PrintStream/print(I)V\n", -2);
			}
			
			if ($exp2.type == 'a')
			{
				print("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", -2);
			}  
		} 
	) * CL_PAR
		{   
			print("getstatic java/lang/System/out Ljava/io/PrintStream;", 1); 
			print("invokevirtual java/io/PrintStream/println()V", -1); 
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
	(statement)+ CL_CUR
	{   
		System.out.println("    return");
		System.out.println(".end method\n"); 			
	}
;

parameters:
	VARIABLE 
	{ 
		argments += "I";
	}
	( COMMA VARIABLE 		
		{ 
			argments += "I";
		}
	)*
;

expression returns [char type]:   
	t1 = term ( op = ( PLUS | MINUS ) t2 = term
	{   
		if ($t2.type == 'i')
		{
			print(($op.type == PLUS) ? "iadd" : "isub", -1);
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
			print(($op.type == TIMES) ? "imul" : (($op.type  == OVER) ? "idiv" : "irem"), -1); 
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
		print("ldc " + $NUMBER.text, +1); $type = 'i';
	}

	|   OP_PAR exp = expression CL_PAR
	{ 
		$type = $exp.type; 
	}

	|	VARIABLE OP_PAR (arguments{ret = 'I';})? CL_PAR
	{
		int i = function_table.indexOf($VARIABLE.text+"("+argments+")"+ret);
		
		if (i >= 0) 
		{
			print("invokestatic Test/"+$VARIABLE.text+"("+argments+")"+ret,0);
		}else {
			error_list.add("Invalid function on line: "+$VARIABLE.line+". Signiature: "+$VARIABLE.text+"("+argments+")"+ret);
		}
		$type = 'i';
	}

	|	STRING
	{   
		print("ldc " + $STRING.text, +1); $type = 'a';
	}
;