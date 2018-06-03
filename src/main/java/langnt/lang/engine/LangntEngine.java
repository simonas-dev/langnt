package langnt.lang.engine;

import langnt.LangntLexer;
import langnt.LangntParser;
import langnt.lang.MainVisitor;
import langnt.lang.Block;
import langnt.lang.func.FunctionVisitor;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class LangntEngine {

    private final MainVisitor evaluationVisitor;
    private final FunctionVisitor symbolVisitor;
    private final LangntParser parser;
    private final LangntLexer lexer;
    private final ParseTree tree;
    private final Block scope;

    /**
     * Main engine constructor from char stream.
     *
     * @param charStream input stream of the code.
     */
    private LangntEngine(CharStream charStream) {
        this.lexer = new LangntLexer(charStream);
        this.parser = new LangntParser(new CommonTokenStream(lexer));
        this.parser.setBuildParseTree(true);

        this.tree = parser.parse();
        this.scope = new Block();
        this.symbolVisitor = new FunctionVisitor();
        this.symbolVisitor.visit(tree);
        this.evaluationVisitor = new MainVisitor(scope, symbolVisitor.getFunctions());
    }

    /**
     * Run the engine!
     *
     * @return value from the script.
     */
    public Object run() {
        return this.evaluationVisitor
                .visit(tree);
    }

    /**
     * Initialize the engine by providing a file location.
     *
     * @param file file location.
     */
    public static LangntEngine file(String file) throws Exception {
        return new LangntEngine(new ANTLRFileStream(file));
    }
}