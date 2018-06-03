// Generated from langnt/Langnt.g4 by ANTLR 4.5

   package langnt;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LangntParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LangntVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LangntParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(LangntParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangntParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LangntParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangntParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LangntParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangntParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(LangntParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangntParser#reAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReAssignment(LangntParser.ReAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierFunctionCall}
	 * labeled alternative in {@link LangntParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierFunctionCall(LangntParser.IdentifierFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showFunctionCall}
	 * labeled alternative in {@link LangntParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFunctionCall(LangntParser.ShowFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showLineFunctionCall}
	 * labeled alternative in {@link LangntParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowLineFunctionCall(LangntParser.ShowLineFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assertFunctionCall}
	 * labeled alternative in {@link LangntParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertFunctionCall(LangntParser.AssertFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sizeFunctionCall}
	 * labeled alternative in {@link LangntParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeFunctionCall(LangntParser.SizeFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangntParser#completeIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompleteIfStatement(LangntParser.CompleteIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangntParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(LangntParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangntParser#elseIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatement(LangntParser.ElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangntParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(LangntParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangntParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(LangntParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangntParser#eachLoopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEachLoopStatement(LangntParser.EachLoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangntParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(LangntParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangntParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(LangntParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangntParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(LangntParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gtExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtExpression(LangntParser.GtExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpression(LangntParser.NumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(LangntParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modulusExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulusExpression(LangntParser.ModulusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(LangntParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExpression(LangntParser.MultiplyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gtEqExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtEqExpression(LangntParser.GtEqExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(LangntParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(LangntParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionExpression(LangntParser.ExpressionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(LangntParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpression(LangntParser.ListExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ltEqExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtEqExpression(LangntParser.LtEqExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ltExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtExpression(LangntParser.LtExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(LangntParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notEqExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqExpression(LangntParser.NotEqExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideExpression(LangntParser.DivideExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(LangntParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpression(LangntParser.UnaryMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpression(LangntParser.PowerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyExpression(LangntParser.EmptyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpression(LangntParser.EqExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInExpression(LangntParser.InExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(LangntParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtractExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractExpression(LangntParser.SubtractExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(LangntParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inputExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputExpression(LangntParser.InputExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangntParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(LangntParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangntParser#indexes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexes(LangntParser.IndexesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangntParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(LangntParser.ArgumentContext ctx);
}