import ast.flask.FlaskASTPrinter;
import ast.template.TemplateASTNode;
import ast.template.TemplateASTPrinter;
import codegen.python.PythonInterpreter;
import codegen.python.RuntimeContext;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import gen.grammers.MiniFlaskLexer;
import gen.grammers.MiniFlaskParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import gen.grammers.MiniTemplateLexer;
import gen.grammers.MiniTemplateParser;
import ast.builder.FlaskASTBuilder;
import ast.builder.TemplateASTBuilder;
import ast.flask.FlaskASTNode;

public class Main {

    // ==================================================
    // Entry Point
    // ==================================================
    public static void main(String[] args) throws Exception {

//        printParseTree();

        printFlaskAST(
                "================================================================ Flask AST ================================================================",
                "App/app.txt"
        );

        printTemplateAST(
                "================================================================ Index Template AST ================================================================",
                "App/indexTemplate.txt"
        );

        printTemplateAST(
                "================================================================ Create Template AST ================================================================",
                "App/createTemplate.txt"
        );

        printTemplateAST(
                "================================================================ Show Template AST ================================================================",
                "App/showTemplate.txt"
        );

        // Errors Handling
        printFlaskAST(
                "================================================================ Errors Handling ================================================================",
                "tests/ErrorsHandling"
        );

        // Flask Tests
//        printFlaskAST(
//                "================================================================ Test 1 ================================================================",
//                "tests/FlaskTest1"
//        );
//
//        printFlaskAST(
//                "================================================================ Test 2 ================================================================",
//                "tests/FlaskTest2"
//        );

        // Runtime Context Test
        printRuntimeContextAST(
                "================================================================ Runtime Context Test (AST) ================================================================",
                "tests/RuntimeContextTest"
        );
        

        // Template Tests
//        printTemplateAST(
//                "================================================================ Test 1 ================================================================",
//                "tests/JinjaTest1"
//        );
//
//        printTemplateAST(
//                "================================================================ Test 2 ================================================================",
//                "tests/JinjaTest2"
//        );
//
//        printTemplateAST(
//                "================================================================ Test 3 ================================================================",
//                "tests/JinjaTest3"
//        );
    }

    // ==================================================
    // AST Printing
    // ==================================================
    private static void printFlaskAST(String title, String filePath) throws Exception {

        System.out.println("\n" + title);

        MiniFlaskParser parser = createFlaskParser(filePath);
        ParseTree tree = parser.file();

        FlaskASTBuilder builder = new FlaskASTBuilder();
        FlaskASTNode ast = builder.visit(tree);

        FlaskASTPrinter.writeJson(ast, "src/output/ast_python.json");
        System.out.println("Wrote Flask AST JSON to src/output/ast_python.json");

        if (builder.hasSemanticErrors()) {
                writeSemanticReport(builder.getSemanticErrors());

                System.out.println("Semantic errors found. See semantic_report.txt");
                return;
        }
    }

    private static void printTemplateAST(String title, String filePath) throws Exception {

            System.out.println("\n" + title);

            MiniTemplateParser parser = createTemplateParser(filePath);
            ParseTree tree = parser.template();

            TemplateASTNode ast = new TemplateASTBuilder().visit(tree);
            String path = "src/output/ast_" + filePath.substring(filePath.lastIndexOf("/") + 1, filePath.lastIndexOf(".")) + ".json";
            TemplateASTPrinter.writeJson(ast, path);
            System.out.println("Wrote Template AST JSON to " + path);
    }
    
    private static void printRuntimeContextAST(String title, String filePath) throws Exception {

        System.out.println("\n" + title);

        MiniFlaskParser parser = createFlaskParser(filePath);
        ParseTree tree = parser.file();

        FlaskASTBuilder builder = new FlaskASTBuilder();
        FlaskASTNode ast = builder.visit(tree);

        FlaskASTPrinter.writeJson(ast, "src/output/ast_python.json");
        System.out.println("Wrote Flask AST JSON to src/output/ast_python.json");

        if (builder.hasSemanticErrors()) {
            writeSemanticReport(builder.getSemanticErrors());
            System.out.println("Semantic errors found. See semantic_report.txt");
            return;
        }

        PythonInterpreter interpreter = new PythonInterpreter();

        RuntimeContext context = interpreter.execute(ast);


        System.out.println("Runtime Context:");
        System.out.println(context);
    }

    // ==================================================
    // Parser Creation Helpers
    // ==================================================
    private static MiniFlaskParser createFlaskParser(String filePath) throws Exception {

        CharStream input = CharStreams.fromFileName(filePath);

        MiniFlaskLexer lexer = new MiniFlaskLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        return new MiniFlaskParser(tokens);
    }

    private static MiniTemplateParser createTemplateParser(String filePath) throws Exception {

        CharStream input = CharStreams.fromFileName(filePath);

        MiniTemplateLexer lexer = new MiniTemplateLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        return new MiniTemplateParser(tokens);
    }

    // ==================================================
    // Parse Tree Printing
    // ==================================================
    private static void printParseTree() throws Exception {

        parseAndPrint(
                "================================================================ Flask Parse Tree ================================================================",
                "tests/FlaskTest3(scopes)",
                MiniFlaskLexer::new,
                MiniFlaskParser::new,
                parser -> ((MiniFlaskParser) parser).file()
        );

        parseAndPrint(
                "================================================================ Index Template Parse Tree ================================================================",
                "App/indexTemplate.txt",
                MiniTemplateLexer::new,
                MiniTemplateParser::new,
                parser -> ((MiniTemplateParser) parser).template()
        );

        parseAndPrint(
                "================================================================ Create Template Parse Tree ================================================================",
                "App/createTemplate.txt",
                MiniTemplateLexer::new,
                MiniTemplateParser::new,
                parser -> ((MiniTemplateParser) parser).template()
        );

        parseAndPrint(
                "================================================================ Show Template Parse Tree ================================================================",
                "App/showTemplate.txt",
                MiniTemplateLexer::new,
                MiniTemplateParser::new,
                parser -> ((MiniTemplateParser) parser).template()
        );

        parseAndPrint(
                "================================================================ Runtime Context Test (Parser) ================================================================",
                "tests/RuntimeContextTest",
                MiniFlaskLexer::new,
                MiniFlaskParser::new,
                parser -> ((MiniFlaskParser) parser).file()
        );
    }

    // ==================================================
    // Generic Parse Pipeline
    // ==================================================
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

        printTree(tree, parser);
    }

    // ==================================================
    // Pretty Tree Printer
    // ==================================================
    private static void printTree(ParseTree tree, Parser parser) {

        printTree(tree, parser, "", true);
    }

    private static void printTree(
            ParseTree tree,
            Parser parser,
            String prefix,
            boolean isLast
    ) {

        String connector = isLast ? "└── " : "├── ";

        if (tree instanceof RuleContext ctx) {

            String ruleName =
                    parser.getRuleNames()[ctx.getRuleIndex()];

            System.out.println(prefix + connector + ruleName);

            String childPrefix =
                    prefix + (isLast ? "    " : "│   ");

            for (int i = 0; i < tree.getChildCount(); i++) {

                boolean childIsLast =
                        i == tree.getChildCount() - 1;

                printTree(
                        tree.getChild(i),
                        parser,
                        childPrefix,
                        childIsLast
                );
            }
        }
        else if (tree instanceof TerminalNode terminal) {

            String text = terminal.getText();

            if ("<EOF>".equals(text)) {
                return;
            }

            String tokenName =
                    parser.getVocabulary()
                            .getSymbolicName(
                                    terminal.getSymbol().getType()
                            );

            if (tokenName == null) {
                tokenName = text;
            }

            System.out.println(
                    prefix +
                            connector +
                            tokenName +
                            " → \"" +
                            text +
                            "\""
            );
        }
    }

    // ==================================================
    // Functional Interfaces
    // ==================================================
    private static void writeSemanticReport(java.util.List<String> errors) throws IOException {
        Path reportPath = Path.of("src/output/semantic_report.txt");
        Files.createDirectories(reportPath.getParent());

        StringBuilder content = new StringBuilder();
        content.append("Semantic errors found during Flask AST build:\n");
        for (String error : errors) {
            content.append("- ").append(error).append("\n");
        }

        Files.writeString(reportPath, content.toString(), StandardCharsets.UTF_8);
    }

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