package langnt.lang;

import langnt.LangntBaseVisitor;
import langnt.LangntParser;
import langnt.lang.func.Func;
import langnt.lang.value.Value;
import langnt.lang.value.ReturnValue;
import langnt.util.KebabException;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainVisitor extends LangntBaseVisitor<Value> {

    private static final String BOOL_TRUE = "yes";

    private static ReturnValue returnValue = new ReturnValue();
    private Block scope;
    private Map<String, Func> functions;

    public MainVisitor(Block scope, Map<String, Func> functions) {
        this.scope = scope;
        this.functions = functions;
    }

    /**
     * Function declaration.
     * functionDeclaration
     * : Func Identifier '(' identifierList? ')' block Close
     * ;
     */
    @Override
    public Value visitFunctionDeclaration(LangntParser.FunctionDeclarationContext context) {
        return Value.VOID;
    }

    // '-' expression                           #unaryMinusExpression
    @Override
    public Value visitUnaryMinusExpression(LangntParser.UnaryMinusExpressionContext ctx) {
        Value v = this.visit(ctx.expression());
        if (!v.isNumber()) {
            throw new KebabException(ctx);
        }
        return new Value(-1 * v.asDouble());
    }

    /**
     * Visit no expression.
     * <pre>
     * | '!' expression
     * </pre>
     */
    @Override
    public Value visitNotExpression(LangntParser.NotExpressionContext ctx) {
        Value value = this.visit(ctx.expression());

        // Not expressions only allowed for booleans and nulls.
        if (!value.isBoolean() && !value.isEmpty()) {
            throw new KebabException(ctx);
        }
        return new Value(!value.asBoolean());
    }

    // expression '^' expression                #powerExpression
    @Override
    public Value visitPowerExpression(LangntParser.PowerExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new Value(Math.pow(lhs.asDouble(), rhs.asDouble()));
        }
        throw new KebabException(ctx);
    }

    // expression '*' expression                #multiplyExpression
    @Override
    public Value visitMultiplyExpression(LangntParser.MultiplyExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));
        if (lhs == null || rhs == null) {
            System.err.println("lhs " + lhs + " rhs " + rhs);
            throw new KebabException(ctx);
        }

        // number * number
        if (lhs.isNumber() && rhs.isNumber()) {
            return new Value(lhs.asDouble() * rhs.asDouble());
        }

        // string * number
        if (lhs.isString() && rhs.isNumber()) {
            StringBuilder str = new StringBuilder();
            int stop = rhs.asDouble().intValue();
            for (int i = 0; i < stop; i++) {
                str.append(lhs.asString());
            }
            return new Value(str.toString());
        }

        // list * number
        if (lhs.isList() && rhs.isNumber()) {
            List<Value> total = new ArrayList<>();
            int stop = rhs.asDouble().intValue();
            for (int i = 0; i < stop; i++) {
                total.addAll(lhs.asList());
            }
            return new Value(total);
        }
        throw new KebabException(ctx);
    }

    // list: '[' exprList? ']'
    @Override
    public Value visitList(LangntParser.ListContext context) {
        List<Value> list = new ArrayList<>();
        if (context.expressionList() != null) {
            for (LangntParser.ExpressionContext ex : context.expressionList().expression()) {
                list.add(this.visit(ex));
            }
        }
        return new Value(list);
    }

    // expression '/' expression                #divideExpression
    @Override
    public Value visitDivideExpression(LangntParser.DivideExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new Value(lhs.asDouble() / rhs.asDouble());
        }
        throw new KebabException(ctx);
    }

    // expression '%' expression                #modulusExpression
    @Override
    public Value visitModulusExpression(LangntParser.ModulusExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new Value(lhs.asDouble() % rhs.asDouble());
        }
        throw new KebabException(ctx);
    }

    // expression '+' expression                #addExpression
    @Override
    public Value visitAddExpression(@NotNull LangntParser.AddExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));

        if (lhs == null || rhs == null) {
            throw new KebabException(ctx);
        }

        // number + number
        if (lhs.isNumber() && rhs.isNumber()) {
            return new Value(lhs.asDouble() + rhs.asDouble());
        }

        // list + any
        if (lhs.isList()) {
            List<Value> list = lhs.asList();
            list.add(rhs);
            return new Value(list);
        }

        // string + any
        if (lhs.isString()) {
            return new Value(lhs.asString() + "" + rhs.toString());
        }

        // any + string
        if (rhs.isString()) {
            return new Value(lhs.toString() + "" + rhs.asString());
        }

        return new Value(lhs.toString() + rhs.toString());
    }

    // expression '-' expression                #subtractExpression
    @Override
    public Value visitSubtractExpression(LangntParser.SubtractExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new Value(lhs.asDouble() - rhs.asDouble());
        }
        if (lhs.isList()) {
            List<Value> list = lhs.asList();
            list.remove(rhs);
            return new Value(list);
        }
        throw new KebabException(ctx);
    }

    // expression '>=' expression               #gtEqExpression
    @Override
    public Value visitGtEqExpression(LangntParser.GtEqExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new Value(lhs.asDouble() >= rhs.asDouble());
        }
        if (lhs.isString() && rhs.isString()) {
            return new Value(lhs.asString().compareTo(rhs.asString()) >= 0);
        }
        throw new KebabException(ctx);
    }

    // expression '<=' expression               #ltEqExpression
    @Override
    public Value visitLtEqExpression(LangntParser.LtEqExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new Value(lhs.asDouble() <= rhs.asDouble());
        }
        if (lhs.isString() && rhs.isString()) {
            return new Value(lhs.asString().compareTo(rhs.asString()) <= 0);
        }
        throw new KebabException(ctx);
    }

    // expression '>' expression                #gtExpression
    @Override
    public Value visitGtExpression(LangntParser.GtExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new Value(lhs.asDouble() > rhs.asDouble());
        }
        if (lhs.isString() && rhs.isString()) {
            return new Value(lhs.asString().compareTo(rhs.asString()) > 0);
        }
        throw new KebabException(ctx);
    }

    // expression '<' expression                #ltExpression
    @Override
    public Value visitLtExpression(LangntParser.LtExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new Value(lhs.asDouble() < rhs.asDouble());
        }
        if (lhs.isString() && rhs.isString()) {
            return new Value(lhs.asString().compareTo(rhs.asString()) < 0);
        }
        throw new KebabException(ctx);
    }

    // expression '==' expression               #eqExpression
    @Override
    public Value visitEqExpression(@NotNull LangntParser.EqExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));
        if (lhs == null) {
            throw new KebabException(ctx);
        }
        return new Value(lhs.equals(rhs));
    }

    // expression '!=' expression               #notEqExpression
    @Override
    public Value visitNotEqExpression(@NotNull LangntParser.NotEqExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));
        return new Value(!lhs.equals(rhs));
    }

    // expression '&&' expression               #andExpression
    @Override
    public Value visitAndExpression(LangntParser.AndExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));

        if (!lhs.isBoolean() || !rhs.isBoolean()) {
            throw new KebabException(ctx);
        }
        return new Value(lhs.asBoolean() && rhs.asBoolean());
    }

    // expression '||' expression               #orExpression
    @Override
    public Value visitOrExpression(LangntParser.OrExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));

        if (!lhs.isBoolean() || !rhs.isBoolean()) {
            throw new KebabException(ctx);
        }
        return new Value(lhs.asBoolean() || rhs.asBoolean());
    }

    // expression '?' expression ':' expression #ternaryExpression
    @Override
    public Value visitTernaryExpression(LangntParser.TernaryExpressionContext ctx) {
        Value condition = this.visit(ctx.expression(0));
        if (condition.asBoolean()) {
            return new Value(this.visit(ctx.expression(1)));
        } else {
            return new Value(this.visit(ctx.expression(2)));
        }
    }

    // expression In expression                 #inExpression
    @Override
    public Value visitInExpression(LangntParser.InExpressionContext ctx) {
        Value lhs = this.visit(ctx.expression(0));
        Value rhs = this.visit(ctx.expression(1));

        if (rhs.isList()) {
            for (Value val : rhs.asList()) {
                if (val.equals(lhs)) {
                    return new Value(true);
                }
            }
            return new Value(false);
        }
        throw new KebabException(ctx);
    }

    // Number                                   #numberExpression
    @Override
    public Value visitNumberExpression(@NotNull LangntParser.NumberExpressionContext ctx) {
        return new Value(Double.valueOf(ctx.getText()));
    }

    // Bool                                     #boolExpression
    @Override
    public Value visitBoolExpression(@NotNull LangntParser.BoolExpressionContext ctx) {
        return new Value(BOOL_TRUE.equals(ctx.getText()));
    }

    /**
     * Null, empty expression.
     * <pre>
     * | Empty
     * </pre>
     */
    @Override
    public Value visitEmptyExpression(@NotNull LangntParser.EmptyExpressionContext ctx) {
        return Value.EMPTY;
    }

    private Value resolveIndexes(ParserRuleContext ctx, Value val, List<LangntParser.ExpressionContext> indexes) {
        for (LangntParser.ExpressionContext ec : indexes) {
            Value idx = this.visit(ec);
            if (!idx.isNumber() || (!val.isList() && !val.isString())) {
                throw new KebabException(ec.start, "Could not resolve indexes on: '%s' at: %s", val, idx);
            }
            int i = idx.asDouble().intValue();
            if (val.isString()) {
                val = new Value(val.asString().substring(i, i + 1));
            } else {
                val = val.asList().get(i);
            }
        }
        return val;
    }

    private void setAtIndex(ParserRuleContext ctx, List<LangntParser.ExpressionContext> indexes, Value val, Value newVal) {
        if (!val.isList()) {
            throw new KebabException(ctx);
        }
        // TODO some more list size checking in here
        for (int i = 0; i < indexes.size() - 1; i++) {
            Value idx = this.visit(indexes.get(i));
            if (!idx.isNumber()) {
                throw new KebabException(ctx);
            }
            val = val.asList().get(idx.asDouble().intValue());
        }
        Value idx = this.visit(indexes.get(indexes.size() - 1));
        if (!idx.isNumber()) {
            throw new KebabException(ctx);
        }
        val.asList().set(idx.asDouble().intValue(), newVal);
    }

    /**
     * Call a function, either a custom or pre-defined.
     */
    @Override
    public Value visitFunctionCallExpression(LangntParser.FunctionCallExpressionContext ctx) {
        Value val = this.visit(ctx.functionCall());
        if (ctx.indexes() != null) {
            List<LangntParser.ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(ctx, val, exps);
        }
        return val;
    }

    // list indexes?                            #listExpression
    @Override
    public Value visitListExpression(LangntParser.ListExpressionContext ctx) {
        Value val = this.visit(ctx.list());
        if (ctx.indexes() != null) {
            List<LangntParser.ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(ctx, val, exps);
        }
        return val;
    }

    // Identifier indexes?                      #identifierExpression
    @Override
    public Value visitIdentifierExpression(@NotNull LangntParser.IdentifierExpressionContext ctx) {
        String id = ctx.Identifier().getText();
        Value val = scope.resolve(id);

        if (ctx.indexes() != null) {
            List<LangntParser.ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(ctx, val, exps);
        }
        return val;
    }

    // String indexes?                          #stringExpression
    // todo fix replacing
    @Override
    public Value visitStringExpression(@NotNull LangntParser.StringExpressionContext ctx) {
        String text = ctx.getText();
        text = text.substring(1, text.length() - 1).replaceAll("\\\\(.)", "$1");
        Value val = new Value(text);
        if (ctx.indexes() != null) {
            List<LangntParser.ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(ctx, val, exps);
        }
        return val;
    }

    // '(' expression ')' indexes?              #expressionExpression
    @Override
    public Value visitExpressionExpression(LangntParser.ExpressionExpressionContext ctx) {
        Value val = this.visit(ctx.expression());
        if (ctx.indexes() != null) {
            List<LangntParser.ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(ctx, val, exps);
        }
        return val;
    }

    // Input '(' String? ')'                    #inputExpression
    @Override
    public Value visitInputExpression(LangntParser.InputExpressionContext ctx) {
        TerminalNode inputString = ctx.String();
        try {
            if (inputString != null) {
                String text = inputString.getText();
                text = text.substring(1, text.length() - 1).replaceAll("\\\\(.)", "$1");
                return new Value(new String(Files.readAllBytes(Paths.get(text))));
            } else {
                BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
                return new Value(buffer.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Reassignment to variable.
     * <pre>
     * reAssignment
     * : Identifier indexes? ':' expression
     * ;
     * </pre>
     */
    @Override
    public Value visitReAssignment(@NotNull LangntParser.ReAssignmentContext ctx) {
        scope.reAssign(ctx.start,
                ctx.Identifier().getText(),
                this.visit(ctx.expression()));

        return Value.VOID;
    }

    /**
     * Assignment/creation of a variable.
     * <pre>
     * assignment
     * : 'keb' Identifier indexes? ':' expression
     * ;
     * </pre>
     */
    @Override
    public Value visitAssignment(@NotNull LangntParser.AssignmentContext ctx) {

        // Variable created without assignment.
        if (ctx.expression() == null) {
            scope.assign(ctx.start, ctx.Identifier().getText(), Value.EMPTY);
            return Value.VOID;
        }

        Value newVal = this.visit(ctx.expression());
        if (ctx.indexes() != null) {
            Value val = scope.resolve(ctx.Identifier().getText());
            List<LangntParser.ExpressionContext> expression = ctx.indexes().expression();
            setAtIndex(ctx, expression, val, newVal);
        } else {
            String id = ctx.Identifier().getText();
            scope.assign(ctx.start, id, newVal);
        }
        return Value.VOID;
    }

    /**
     * Function call with args or no args.
     * <pre>
     * : Identifier (('(' expressionList? ')') | '()') #identifierFunctionCall
     * </pre>
     */
    @Override
    public Value visitIdentifierFunctionCall(LangntParser.IdentifierFunctionCallContext ctx) {
        List<LangntParser.ExpressionContext> params = ctx.expressionList() != null ? ctx.expressionList().expression() : new ArrayList<>();
        String id = ctx.Identifier().getText();

        Func function;
        if ((function = functions.get(id + params.size())) != null) {

            // Try to get a function by real parameter count.
            return function.invoke(params, functions, scope);
        } else if ((function = functions.get(id)) != null && function.isPurelyOptional()) {

            // Try to get a purely optional function.
            return function.invoke(params, functions, scope);
        }
        throw new KebabException(ctx);
    }

    /**
     * Printing of variables.
     * <pre>
     * | Show '(' expression ')'
     * </pre>
     */
    @Override
    public Value visitShowFunctionCall(LangntParser.ShowFunctionCallContext ctx) {
        System.out.print(this.visit(ctx.expression()));
        return Value.VOID;
    }

    /**
     * Printing of stuff, multiline.
     * <pre>
     * | ShowL (('(' expression ')') | '()')
     * </pre>
     */
    @Override
    public Value visitShowLineFunctionCall(LangntParser.ShowLineFunctionCallContext ctx) {
        if (ctx.expression() == null) {
            System.out.println();
        } else {
            System.out.println(this.visit(ctx.expression()));
        }
        return Value.VOID;
    }

    // Assert '(' expression ')'    #assertFunctionCall
    @Override
    public Value visitAssertFunctionCall(LangntParser.AssertFunctionCallContext ctx) {
        Value value = this.visit(ctx.expression());

        if (!value.isBoolean()) {
            throw new KebabException(ctx);
        }

        if (!value.asBoolean()) {
            throw new AssertionError("Failed Assertion " + ctx.expression().getText() + " line:" + ctx.start.getLine());
        }

        return Value.VOID;
    }

    // Size '(' expression ')'      #sizeFunctionCall
    @Override
    public Value visitSizeFunctionCall(LangntParser.SizeFunctionCallContext ctx) {
        Value value = this.visit(ctx.expression());

        if (value.isString()) {
            return new Value(value.asString().length());
        }

        if (value.isList()) {
            return new Value(value.asList().size());
        }

        throw new KebabException(ctx);
    }

    /**
     * Complete if statement.
     * <pre>
     * completeIfStatement
     *  : ifStatement elseIfStatement* elseStatement? Close
     *  ;
     *
     * ifStatement
     *  : If '(' expression ')' Open block
     *  ;
     *
     * elseIfStatement
     *  : Close ElseIf '(' expression ')' Open block
     *  ;
     *
     * elseStatement
     *  : Close Else Open block
     *  ;
     * </pre>
     */
    @Override
    public Value visitCompleteIfStatement(@NotNull LangntParser.CompleteIfStatementContext ctx) {

        // _if(...)
        if (this.visit(ctx.ifStatement().expression()).asBoolean()) {
            return this.visit(ctx.ifStatement().block());
        }

        // _elif(...)
        for (int i = 0; i < ctx.elseIfStatement().size(); i++) {
            if (this.visit(ctx.elseIfStatement(i).expression()).asBoolean()) {
                return this.visit(ctx.elseIfStatement(i).block());
            }
        }

        // _el(...)
        if (ctx.elseStatement() != null) {
            return this.visit(ctx.elseStatement().block());
        }

        return Value.VOID;
    }

    /**
     * Code block - scope.
     * <pre>
     * block
     *  : (statement | functionDeclaration)* (Return expression)?
     *  ;
     * </pre>
     */
    @Override
    public Value visitBlock(LangntParser.BlockContext ctx) {

        scope = new Block(scope); // create new local scope
        ctx.statement().forEach(this::visit);
        LangntParser.ExpressionContext ex;
        if ((ex = ctx.expression()) != null) {
            returnValue.value = this.visit(ex);
            scope = scope.parent();
            throw returnValue;
        }
        scope = scope.parent();
        return Value.VOID;
    }

    /**
     * A for-each loop for strings and lists.
     * <pre>
     * eachLoopStatement
     * : EachLoop '(' Identifier Colon expression ')' Open block Close
     * ;
     * </pre>
     */
    @Override
    public Value visitEachLoopStatement(LangntParser.EachLoopStatementContext ctx) {

        Value iterate = this.visit(ctx.expression());
        if (!iterate.isString() && !iterate.isList()) {
            throw new KebabException(ctx.start, "Cannot iterate a non-string or a non-list in a _loop");
        }

        // Loop inner scope identifier.
        String id = ctx.Identifier().getText();

        // Make sure scope doesn't have a variable like this already.
        scope.assign(ctx.start, id, Value.EMPTY);
        if (iterate.isString()) {

            // Iterate a list of string.
            for (char c : iterate.asString().toCharArray()) {
                scope.reAssign(ctx.start, id, new Value(String.valueOf(c)));

                Value returnValue = this.visit(ctx.block());
                if (returnValue != Value.VOID) {
                    return returnValue;
                }
            }

        } else if (iterate.isList()) {

            // Iterate a list.
            for (Value value : iterate.asList()) {
                scope.reAssign(ctx.start, id, value);

                Value returnValue = this.visit(ctx.block());
                if (returnValue != Value.VOID) {
                    return returnValue;
                }
            }
        }

        // Clear the local for loop variable.
        scope.remove(ctx.start, id);
        return Value.VOID;
    }

    /**
     * A simple while loop.
     * loopStatement
     * : Loop '(' expression ')' Open block Close
     * ;
     */
    @Override
    public Value visitLoopStatement(LangntParser.LoopStatementContext ctx) {

        // Gotta check initial while loop condition.
        Value expression = this.visit(ctx.expression());
        while (expression.asBoolean()) {

            Value returnValue = this.visit(ctx.block());
            if (returnValue != Value.VOID) {
                return returnValue;
            }

            // Check loop condition all the time.
            expression = this.visit(ctx.expression());
        }
        return Value.VOID;
    }
}