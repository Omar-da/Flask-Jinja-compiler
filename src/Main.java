import grammers.MiniFlaskLexer;
import grammers.MiniFlaskParser;
import grammers.MiniTemplateLexer;
import grammers.MiniTemplateParser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

    public static void main(String[] args) throws Exception {

        // =========================
        // Flask source
        // =========================
        parseAndPrint(
                "===== Flask Parse Tree =====",
                "App/app.txt",
                MiniFlaskLexer::new,
                MiniFlaskParser::new,
                parser -> ((MiniFlaskParser) parser).file()
        );

        // =========================
        // Index template
        // =========================
        parseAndPrint(
                "===== Index Template Parse Tree =====",
                "App/indexTemplate.txt",
                MiniTemplateLexer::new,
                MiniTemplateParser::new,
                parser -> ((MiniTemplateParser) parser).template()
        );

        // =========================
        // Create template
        // =========================
        parseAndPrint(
                "===== Create Template Parse Tree =====",
                "App/createTemplate.txt",
                MiniTemplateLexer::new,
                MiniTemplateParser::new,
                parser -> ((MiniTemplateParser) parser).template()
        );

        // =========================
        // Show template
        // =========================
        parseAndPrint(
                "===== Show Template Parse Tree =====",
                "App/showTemplate.txt",
                MiniTemplateLexer::new,
                MiniTemplateParser::new,
                parser -> ((MiniTemplateParser) parser).template()
        );
    }

    // --------------------------------------------------
    // Generic parse + print pipeline
    // --------------------------------------------------
    private static <L extends Lexer, P extends Parser> void parseAndPrint(
            String title,
            String filePath,
            LexerFactory<L> lexerFactory,
            ParserFactory<P> parserFactory,
            ParseEntry<P> entryRule
    ) throws Exception {

        System.out.println("\n" + title);

        CharStream input = CharStreams.fromFileName(filePath);
        L lexer = lexerFactory.create(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        P parser = parserFactory.create(tokens);

        ParseTree tree = entryRule.parse(parser);
        printTree(tree, parser, 0);
    }

    // --------------------------------------------------
    // Pretty tree printer
    // --------------------------------------------------
    private static void printTree(ParseTree tree, Parser parser, int depth) {
        String indent = "  ".repeat(depth);

        if (tree instanceof RuleContext ctx) {
            String ruleName = parser.getRuleNames()[ctx.getRuleIndex()];
            System.out.println(indent + ruleName);

            for (int i = 0; i < tree.getChildCount(); i++) {
                printTree(tree.getChild(i), parser, depth + 1);
            }
        }
        else if (tree instanceof TerminalNode tn) {
            if (!tn.getText().equals("<EOF>")) {
                String tokenName = parser.getVocabulary()
                        .getSymbolicName(tn.getSymbol().getType());

                if (tokenName != null) {
                    System.out.println(
                            indent + tokenName + " → \"" + tn.getText() + "\""
                    );
                }
            }
        }
    }

    // --------------------------------------------------
    // Functional helpers (clean main)
    // --------------------------------------------------
    @FunctionalInterface
    interface LexerFactory<L extends Lexer> {
        L create(CharStream input);
    }

    @FunctionalInterface
    interface ParserFactory<P extends Parser> {
        P create(TokenStream tokens);
    }

    @FunctionalInterface
    interface ParseEntry<P extends Parser> {
        ParseTree parse(P parser);
    }
}
