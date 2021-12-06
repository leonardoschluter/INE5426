package org.schluter.compiler.gen;// Generated from /Users/x266483/Documents/projects/lexicalAnalyzer/compiler/src/main/antlr4/CC_2021_2.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CC_2021_2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CC_2021_2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CC_2021_2Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CC_2021_2Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CC_2021_2Parser#funcList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncList(CC_2021_2Parser.FuncListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CC_2021_2Parser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(CC_2021_2Parser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CC_2021_2Parser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(CC_2021_2Parser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CC_2021_2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CC_2021_2Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CC_2021_2Parser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(CC_2021_2Parser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CC_2021_2Parser#atribStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribStat(CC_2021_2Parser.AtribStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CC_2021_2Parser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(CC_2021_2Parser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CC_2021_2Parser#paramListCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamListCall(CC_2021_2Parser.ParamListCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CC_2021_2Parser#printStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStat(CC_2021_2Parser.PrintStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CC_2021_2Parser#readStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStat(CC_2021_2Parser.ReadStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CC_2021_2Parser#returnStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStat(CC_2021_2Parser.ReturnStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CC_2021_2Parser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(CC_2021_2Parser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CC_2021_2Parser#forState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForState(CC_2021_2Parser.ForStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link CC_2021_2Parser#stateList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateList(CC_2021_2Parser.StateListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CC_2021_2Parser#allocExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocExpression(CC_2021_2Parser.AllocExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CC_2021_2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CC_2021_2Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CC_2021_2Parser#numExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpression(CC_2021_2Parser.NumExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CC_2021_2Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(CC_2021_2Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link CC_2021_2Parser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(CC_2021_2Parser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CC_2021_2Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(CC_2021_2Parser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CC_2021_2Parser#lValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLValue(CC_2021_2Parser.LValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CC_2021_2Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CC_2021_2Parser.TypeContext ctx);
}