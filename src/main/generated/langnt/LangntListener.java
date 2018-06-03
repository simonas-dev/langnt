// Generated from langnt/Langnt.g4 by ANTLR 4.5

   package langnt;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangntParser}.
 */
public interface LangntListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangntParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(LangntParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangntParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(LangntParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangntParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LangntParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangntParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LangntParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangntParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LangntParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangntParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LangntParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangntParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LangntParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangntParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LangntParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangntParser#reAssignment}.
	 * @param ctx the parse tree
	 */
	void enterReAssignment(LangntParser.ReAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangntParser#reAssignment}.
	 * @param ctx the parse tree
	 */
	void exitReAssignment(LangntParser.ReAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierFunctionCall}
	 * labeled alternative in {@link LangntParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierFunctionCall(LangntParser.IdentifierFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierFunctionCall}
	 * labeled alternative in {@link LangntParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierFunctionCall(LangntParser.IdentifierFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showFunctionCall}
	 * labeled alternative in {@link LangntParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctionCall(LangntParser.ShowFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showFunctionCall}
	 * labeled alternative in {@link LangntParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctionCall(LangntParser.ShowFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showLineFunctionCall}
	 * labeled alternative in {@link LangntParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterShowLineFunctionCall(LangntParser.ShowLineFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showLineFunctionCall}
	 * labeled alternative in {@link LangntParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitShowLineFunctionCall(LangntParser.ShowLineFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assertFunctionCall}
	 * labeled alternative in {@link LangntParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterAssertFunctionCall(LangntParser.AssertFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assertFunctionCall}
	 * labeled alternative in {@link LangntParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitAssertFunctionCall(LangntParser.AssertFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sizeFunctionCall}
	 * labeled alternative in {@link LangntParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterSizeFunctionCall(LangntParser.SizeFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sizeFunctionCall}
	 * labeled alternative in {@link LangntParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitSizeFunctionCall(LangntParser.SizeFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangntParser#completeIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompleteIfStatement(LangntParser.CompleteIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangntParser#completeIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompleteIfStatement(LangntParser.CompleteIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangntParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(LangntParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangntParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(LangntParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangntParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatement(LangntParser.ElseIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangntParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatement(LangntParser.ElseIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangntParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(LangntParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangntParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(LangntParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangntParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(LangntParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangntParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(LangntParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangntParser#eachLoopStatement}.
	 * @param ctx the parse tree
	 */
	void enterEachLoopStatement(LangntParser.EachLoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangntParser#eachLoopStatement}.
	 * @param ctx the parse tree
	 */
	void exitEachLoopStatement(LangntParser.EachLoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangntParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(LangntParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangntParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(LangntParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangntParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(LangntParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangntParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(LangntParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangntParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(LangntParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangntParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(LangntParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGtExpression(LangntParser.GtExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGtExpression(LangntParser.GtExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(LangntParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(LangntParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(LangntParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(LangntParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modulusExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModulusExpression(LangntParser.ModulusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modulusExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModulusExpression(LangntParser.ModulusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(LangntParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(LangntParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpression(LangntParser.MultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpression(LangntParser.MultiplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtEqExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGtEqExpression(LangntParser.GtEqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtEqExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGtEqExpression(LangntParser.GtEqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(LangntParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(LangntParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(LangntParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(LangntParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionExpression(LangntParser.ExpressionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionExpression(LangntParser.ExpressionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(LangntParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(LangntParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterListExpression(LangntParser.ListExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitListExpression(LangntParser.ListExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltEqExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLtEqExpression(LangntParser.LtEqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltEqExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLtEqExpression(LangntParser.LtEqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLtExpression(LangntParser.LtExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLtExpression(LangntParser.LtExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(LangntParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(LangntParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEqExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqExpression(LangntParser.NotEqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqExpression(LangntParser.NotEqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivideExpression(LangntParser.DivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivideExpression(LangntParser.DivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(LangntParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(LangntParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(LangntParser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(LangntParser.UnaryMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(LangntParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(LangntParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEmptyExpression(LangntParser.EmptyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEmptyExpression(LangntParser.EmptyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqExpression(LangntParser.EqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqExpression(LangntParser.EqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInExpression(LangntParser.InExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInExpression(LangntParser.InExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(LangntParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(LangntParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtractExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubtractExpression(LangntParser.SubtractExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtractExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubtractExpression(LangntParser.SubtractExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(LangntParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(LangntParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInputExpression(LangntParser.InputExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputExpression}
	 * labeled alternative in {@link LangntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInputExpression(LangntParser.InputExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangntParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(LangntParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangntParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(LangntParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangntParser#indexes}.
	 * @param ctx the parse tree
	 */
	void enterIndexes(LangntParser.IndexesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangntParser#indexes}.
	 * @param ctx the parse tree
	 */
	void exitIndexes(LangntParser.IndexesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangntParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(LangntParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangntParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(LangntParser.ArgumentContext ctx);
}