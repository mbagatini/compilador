// Generated from FF.g by ANTLR 4.5.3


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FFParser}.
 */
public interface FFListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FFParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FFParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FFParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FFParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FFParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(FFParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FFParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(FFParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FFParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FFParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FFParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FFParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FFParser#st_console}.
	 * @param ctx the parse tree
	 */
	void enterSt_console(FFParser.St_consoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FFParser#st_console}.
	 * @param ctx the parse tree
	 */
	void exitSt_console(FFParser.St_consoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FFParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(FFParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FFParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(FFParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FFParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FFParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FFParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FFParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FFParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(FFParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FFParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(FFParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FFParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FFParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FFParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FFParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FFParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(FFParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FFParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(FFParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link FFParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(FFParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FFParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(FFParser.FactorContext ctx);
}