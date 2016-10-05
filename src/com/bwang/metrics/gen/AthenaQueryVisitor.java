// Generated from C:\work\study\metrics_poc\src\com\bwang\metrics\modal\AthenaQuery.g4 by ANTLR 4.5.1

package com.bwang.metrics.gen;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AthenaQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AthenaQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link AthenaQueryParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(AthenaQueryParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link AthenaQueryParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(AthenaQueryParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExp}
	 * labeled alternative in {@link AthenaQueryParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExp(AthenaQueryParser.BinaryExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vectorSelectorExpr}
	 * labeled alternative in {@link AthenaQueryParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectorSelectorExpr(AthenaQueryParser.VectorSelectorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aggregateExp}
	 * labeled alternative in {@link AthenaQueryParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateExp(AthenaQueryParser.AggregateExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code matrixSelectorExpr}
	 * labeled alternative in {@link AthenaQueryParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixSelectorExpr(AthenaQueryParser.MatrixSelectorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link AthenaQueryParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpr(AthenaQueryParser.NumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentEpr}
	 * labeled alternative in {@link AthenaQueryParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentEpr(AthenaQueryParser.ParentEprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link AthenaQueryParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpr(AthenaQueryParser.FunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AthenaQueryParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(AthenaQueryParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AthenaQueryParser#argslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgslist(AthenaQueryParser.ArgslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link AthenaQueryParser#numberLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(AthenaQueryParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AthenaQueryParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(AthenaQueryParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AthenaQueryParser#aggregatorParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregatorParam(AthenaQueryParser.AggregatorParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link AthenaQueryParser#vectorSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectorSelector(AthenaQueryParser.VectorSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AthenaQueryParser#matrixSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixSelector(AthenaQueryParser.MatrixSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AthenaQueryParser#labelMatcherList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelMatcherList(AthenaQueryParser.LabelMatcherListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AthenaQueryParser#labelMatcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelMatcher(AthenaQueryParser.LabelMatcherContext ctx);
	/**
	 * Visit a parse tree produced by {@link AthenaQueryParser#offsetExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffsetExpr(AthenaQueryParser.OffsetExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AthenaQueryParser#rangeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeExpr(AthenaQueryParser.RangeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AthenaQueryParser#from_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_time(AthenaQueryParser.From_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AthenaQueryParser#to_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTo_time(AthenaQueryParser.To_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AthenaQueryParser#quoted_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuoted_string(AthenaQueryParser.Quoted_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link AthenaQueryParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(AthenaQueryParser.StringLiteralContext ctx);
}