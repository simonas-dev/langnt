package langnt.lang.func;

import langnt.LangntBaseVisitor;
import langnt.LangntParser;
import langnt.lang.value.Value;
import langnt.util.LangntException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class FunctionVisitor extends LangntBaseVisitor<Value> {

    private final Map<String, Func> functions;

    public FunctionVisitor() {
        this.functions = new HashMap<>();
    }

    @Override
    public Value visitFunctionDeclaration(LangntParser.FunctionDeclarationContext context) {

        // Get func parameters and func name.
        List<FuncParameter> params = new ArrayList<>();

        boolean optionalsStarted = false;

        int realParameterCount = 0;

        // Parse function arguments.
        if (context.argumentList() != null) {
            for (LangntParser.ArgumentContext argumentContext : context.argumentList().argument()) {

                LangntParser.ExpressionContext expression = argumentContext.expression();
                String id = argumentContext.Identifier().getText();

                if (expression != null) {
                    optionalsStarted = true;
                } else if (optionalsStarted) {
                    throw new LangntException(argumentContext.start,
                            "Optional arguments must be at the end of function args");
                }

                // Parameters must not duplicate (by id).
                for (FuncParameter parameter : params) {
                    if (parameter.getIdentifier().equals(id)) {
                        throw new LangntException(argumentContext.start,
                                "Function declaration must not contain duplicate ids");
                    }
                }

                FuncParameter parameter = new FuncParameter(id, expression);

                // Count non-optional parameters for func id.
                if (!parameter.isOptional()) {
                    realParameterCount++;
                }
                params.add(new FuncParameter(id, expression));
            }
        }

        // Function block.
        ParseTree block = context.block();

        // Function name identified.
        String identifier = context
                .Identifier()
                .getText();

        if (realParameterCount > 0) {

            // Only non-optional parameters count!
            identifier += realParameterCount;
        }

        // Add a new function to our list.
        this.functions.put(identifier, new Func(params,
                identifier,
                block,
                realParameterCount));

        return Value.VOID;
    }

    /**
     * Get functions of symbol visitor.
     *
     * @return visible functions.
     */
    public Map<String, Func> getFunctions() {
        return functions;
    }
}