package langnt.lang.func;

import langnt.LangntParser;

/**
 * Holder class for function parameter.
 */
public class FuncParameter {

    private final LangntParser.ExpressionContext context;
    private final String identifier;
    private final boolean optional;

    public FuncParameter(String identifier,
                         LangntParser.ExpressionContext context) {

        this.identifier = identifier;
        this.context = context;
        this.optional = context != null;
    }

    public LangntParser.ExpressionContext getContext() {
        return context;
    }

    public String getIdentifier() {
        return identifier;
    }

    public boolean isOptional() {
        return optional;
    }
}