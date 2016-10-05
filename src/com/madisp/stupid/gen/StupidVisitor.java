// Generated from C:\work\study\metrics_poc\src\com\madisp\stupid\Stupid.g4 by ANTLR 4.5.1

package com.madisp.stupid.gen;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StupidParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StupidVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StupidParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(StupidParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(StupidParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(StupidParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(StupidParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(StupidParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(StupidParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(StupidParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidParser#argslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgslist(StupidParser.ArgslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(StupidParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidParser#str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr(StupidParser.StrContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(StupidParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidParser#nil}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil(StupidParser.NilContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(StupidParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidParser#pckg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPckg(StupidParser.PckgContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(StupidParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(StupidParser.VarlistContext ctx);
}