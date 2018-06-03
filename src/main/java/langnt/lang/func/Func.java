package langnt.lang.func;

import langnt.LangntParser;
import langnt.lang.Block;
import langnt.lang.MainVisitor;
import langnt.lang.value.Value;
import langnt.lang.value.ReturnValue;
import langnt.util.LangntException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;
import java.util.Map;

public class Func {

    private final List<FuncParameter> parameters;
    private final String identifier;
    private final ParseTree block;

    private final int realParameterCount;

    public Func(
            List<FuncParameter> parameters,
            String identifier,
            ParseTree block,
            int realParameterCount) {

        this.parameters = parameters;
        this.identifier = identifier;
        this.block = block;
        this.realParameterCount = realParameterCount;
    }

    /**
     * Invoke a function.
     *
     * @param params    function parameters.
     * @param functions functions that this function refers to.
     * @param scope     scope of the function.
     * @return value.
     */
    public Value invoke(
            List<LangntParser.ExpressionContext> params,
            Map<String, Func> functions,
            Block scope) {

        if (params.size() > params.size()) {
            throw new LangntException("Invalid parameter count of on function: %s", identifier);
        }

        // Block of the function.
        scope = new Block(scope);

        MainVisitor evaluationVisitor = new MainVisitor(scope, functions);

        for (int i = 0; i < this.parameters.size(); i++) {

            FuncParameter virtual = this.parameters.get(i);

            Value value;
            if (i < params.size()) {

                // Assign real parameters.
                value = evaluationVisitor.visit(params.get(i));
            } else {

                // Assign optional parameters.
                value = evaluationVisitor.visit(virtual.getContext());
            }
            scope.assignParam(virtual.getIdentifier(), value);
        }

        Value value = Value.VOID;
        try {
            evaluationVisitor.visit(this.block);
        } catch (ReturnValue returnValue) {
            value = returnValue.value;
        }
        return value;
    }

    /**
     * Check if function has only optional params.
     *
     * @return true if function has only optional params.
     */
    public boolean isPurelyOptional() {
        return realParameterCount == 0;
    }
}