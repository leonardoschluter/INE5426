package org.schluter.compiler.gen;// Generated from /Users/x266483/Documents/projects/lexicalAnalyzer/compiler/src/main/antlr4/CC_2021_2.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CC_2021_2Parser}.
 */
public interface CC_2021_2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CC_2021_2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CC_2021_2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CC_2021_2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CC_2021_2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CC_2021_2Parser#funcList}.
	 * @param ctx the parse tree
	 */
	void enterFuncList(CC_2021_2Parser.FuncListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CC_2021_2Parser#funcList}.
	 * @param ctx the parse tree
	 */
	void exitFuncList(CC_2021_2Parser.FuncListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CC_2021_2Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(CC_2021_2Parser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CC_2021_2Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(CC_2021_2Parser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CC_2021_2Parser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(CC_2021_2Parser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CC_2021_2Parser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(CC_2021_2Parser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CC_2021_2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CC_2021_2Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CC_2021_2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CC_2021_2Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CC_2021_2Parser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(CC_2021_2Parser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CC_2021_2Parser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(CC_2021_2Parser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CC_2021_2Parser#atribStat}.
	 * @param ctx the parse tree
	 */
	void enterAtribStat(CC_2021_2Parser.AtribStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CC_2021_2Parser#atribStat}.
	 * @param ctx the parse tree
	 */
	void exitAtribStat(CC_2021_2Parser.AtribStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CC_2021_2Parser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(CC_2021_2Parser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CC_2021_2Parser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(CC_2021_2Parser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CC_2021_2Parser#paramListCall}.
	 * @param ctx the parse tree
	 */
	void enterParamListCall(CC_2021_2Parser.ParamListCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CC_2021_2Parser#paramListCall}.
	 * @param ctx the parse tree
	 */
	void exitParamListCall(CC_2021_2Parser.ParamListCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CC_2021_2Parser#printStat}.
	 * @param ctx the parse tree
	 */
	void enterPrintStat(CC_2021_2Parser.PrintStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CC_2021_2Parser#printStat}.
	 * @param ctx the parse tree
	 */
	void exitPrintStat(CC_2021_2Parser.PrintStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CC_2021_2Parser#readStat}.
	 * @param ctx the parse tree
	 */
	void enterReadStat(CC_2021_2Parser.ReadStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CC_2021_2Parser#readStat}.
	 * @param ctx the parse tree
	 */
	void exitReadStat(CC_2021_2Parser.ReadStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CC_2021_2Parser#returnStat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(CC_2021_2Parser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CC_2021_2Parser#returnStat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(CC_2021_2Parser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CC_2021_2Parser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(CC_2021_2Parser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CC_2021_2Parser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(CC_2021_2Parser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CC_2021_2Parser#forState}.
	 * @param ctx the parse tree
	 */
	void enterForState(CC_2021_2Parser.ForStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CC_2021_2Parser#forState}.
	 * @param ctx the parse tree
	 */
	void exitForState(CC_2021_2Parser.ForStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CC_2021_2Parser#stateList}.
	 * @param ctx the parse tree
	 */
	void enterStateList(CC_2021_2Parser.StateListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CC_2021_2Parser#stateList}.
	 * @param ctx the parse tree
	 */
	void exitStateList(CC_2021_2Parser.StateListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CC_2021_2Parser#allocExpression}.
	 * @param ctx the parse tree
	 */
	void enterAllocExpression(CC_2021_2Parser.AllocExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CC_2021_2Parser#allocExpression}.
	 * @param ctx the parse tree
	 */
	void exitAllocExpression(CC_2021_2Parser.AllocExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CC_2021_2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CC_2021_2Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CC_2021_2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CC_2021_2Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CC_2021_2Parser#numExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumExpression(CC_2021_2Parser.NumExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CC_2021_2Parser#numExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumExpression(CC_2021_2Parser.NumExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CC_2021_2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CC_2021_2Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CC_2021_2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CC_2021_2Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CC_2021_2Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CC_2021_2Parser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CC_2021_2Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CC_2021_2Parser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CC_2021_2Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(CC_2021_2Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CC_2021_2Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(CC_2021_2Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CC_2021_2Parser#lValue}.
	 * @param ctx the parse tree
	 */
	void enterLValue(CC_2021_2Parser.LValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CC_2021_2Parser#lValue}.
	 * @param ctx the parse tree
	 */
	void exitLValue(CC_2021_2Parser.LValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CC_2021_2Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CC_2021_2Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CC_2021_2Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CC_2021_2Parser.TypeContext ctx);
}