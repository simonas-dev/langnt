package langnt.util;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

public class LangntException extends RuntimeException {

    /**
     * @param token   token which caused the exception.
     * @param message exception message text
     * @param args    message arguments
     */
    public LangntException(Token token, String message, Object... args) {
        this("Error("
                + token.getLine()
                + ", "
                + token.getCharPositionInLine()
                + "): "
                + String.format(message, args));
    }

    public LangntException(String message, Object... args) {
        super(String.format(message, args));
    }

    /**
     * A generic exception with an attached context.
     *
     * @param context where the exception was thrown.
     */
    public LangntException(ParserRuleContext context) {
        this(context.start, String.format("Illegal expression: %s", context.getText()));
    }
}