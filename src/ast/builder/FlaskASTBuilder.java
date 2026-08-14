package ast.builder;

import ast.flask.expr.*;
import ast.flask.misc.*;
import ast.flask.stmt.*;
import ast.flask.*;
import ast.flask.symbols.Symbol;
import ast.flask.symbols.SymbolKind;
import ast.flask.symbols.SymbolTable;
import gen.grammers.MiniFlaskParser;
import gen.grammers.MiniFlaskParserBaseVisitor;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlaskASTBuilder extends MiniFlaskParserBaseVisitor<FlaskASTNode> {

    private final SymbolTable symbolTable;
    private final List<String> semanticErrors = new ArrayList<>();

    public FlaskASTBuilder() {
        this.symbolTable = new SymbolTable();
    }

    public List<String> getSemanticErrors() {
        return Collections.unmodifiableList(semanticErrors);
    }

    public boolean hasSemanticErrors() {
        return !semanticErrors.isEmpty();
    }

    private void recordSemanticError(String message, Token token) {
        String full = message + " (line " + token.getLine() + ", column " + token.getCharPositionInLine() + ")";
        semanticErrors.add(full);
    }

    private boolean isInsideFunction(ParseTree node) {
        ParseTree current = node;
        while (current != null) {
            if (current instanceof MiniFlaskParser.FlaskFunctionDefContext) {
                return true;
            }
            if (current instanceof MiniFlaskParser.FileContext) {
                return false;
            }
            current = current.getParent();
        }
        return false;
    }

    @Override
    public FlaskASTNode visitFile(MiniFlaskParser.FileContext ctx) {
        // Use the existing global scope defined in the SymbolTable constructor
//        System.out.println("Using global scope: " + symbolTable.getCurrentScope().getName());

        List<Stmt> statements = new ArrayList<>();

        for (MiniFlaskParser.StatementContext stmtLineCtx : ctx.statement()) {
            statements.add((Stmt) visit(stmtLineCtx));
        }

//        System.out.println("Global Scope Symbols: " + symbolTable.getCurrentScope().getSymbols().keySet());

        Token t = ctx.getStart();
        FileNodeFlask file = new FileNodeFlask(statements, t.getLine(), t.getCharPositionInLine());
//        this.symbolTable.printTable();

        return file;
    }

    @Override
    public FlaskASTNode visitFlaskAssignStmt(MiniFlaskParser.FlaskAssignStmtContext ctx) {
        return visit(ctx.assign());
    }

    @Override
    public FlaskASTNode visitFlaskAssignment(MiniFlaskParser.FlaskAssignmentContext ctx) {

        String varName = ctx.IDENT() != null
                ? ctx.IDENT().getText()
                : ctx.APP().getText();

        Token t = ctx.getStart();

        Symbol existingInCurrentScope = symbolTable.getCurrentScope().getSymbols().get(varName);
        Symbol existingAnywhere = symbolTable.resolve(varName);
        if (existingInCurrentScope == null) {
            Symbol symbol = new Symbol(varName, SymbolKind.VARIABLE, null, t.getLine(), t.getCharPositionInLine());
            symbolTable.define(symbol);
        } else if (existingAnywhere != null && existingAnywhere != existingInCurrentScope) {
            // allow shadowing from an outer scope while keeping the local binding visible for later references
            Symbol symbol = new Symbol(varName, SymbolKind.VARIABLE, null, t.getLine(), t.getCharPositionInLine());
            symbolTable.define(symbol);
        }

        Expr value = (Expr) visit(ctx.expr());

        AssignStmt assignStmt = new AssignStmt(varName, value, t.getLine(), t.getCharPositionInLine());

        return assignStmt;
    }


    @Override
    public FlaskASTNode visitFlaskReturnStmt(MiniFlaskParser.FlaskReturnStmtContext ctx) {
        return visit(ctx.returnStmt());
    }

    @Override
    public FlaskASTNode visitFlaskExprStmt(MiniFlaskParser.FlaskExprStmtContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public FlaskASTNode visitFlaskEqualityExpr(MiniFlaskParser.FlaskEqualityExprContext ctx) {
        Expr left = (Expr) visit(ctx.additive(0));

        if (ctx.EQEQ() != null) {
            Expr right = (Expr) visit(ctx.additive(1));
            Token t = ctx.getStart();
            return new BinaryExpr(left, "==", right, t.getLine(), t.getCharPositionInLine());
        }

        return left;
    }

    @Override
    public FlaskASTNode visitFlaskAdditiveExpr(MiniFlaskParser.FlaskAdditiveExprContext ctx) {
        Expr left = (Expr) visit(ctx.primary(0));

        for (int i = 1; i < ctx.primary().size(); i++) {
            Expr right = (Expr) visit(ctx.primary(i));

            Token plusToken = (Token) ctx.getChild(2 * i - 1).getPayload();

            left = new BinaryExpr(left, "+", right, plusToken.getLine(), plusToken.getCharPositionInLine());
        }

        return left;
    }

    @Override
    public FlaskASTNode visitFlaskPrimaryExpr(MiniFlaskParser.FlaskPrimaryExprContext ctx) {
        Expr base = (Expr) visit(ctx.atom());

        List<Expr> suffixes = ctx.suffix().stream().map(suf -> (Expr) visit(suf)).toList();

        Token t = ctx.getStart();
        return new PrimaryExpr(base, suffixes, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskAttrAccess(MiniFlaskParser.FlaskAttrAccessContext ctx) {
        String attrName = ctx.IDENT().getText();
        Token t = ctx.getStart();
        return new AttrAccessExpr(attrName, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskIndexing(MiniFlaskParser.FlaskIndexingContext ctx) {
        Expr index = (Expr) visit(ctx.expr());

        Token t = ctx.getStart();

        return new IndexExpr(index, t.getLine(), t.getCharPositionInLine());
    }


    @Override
    public FlaskASTNode visitFlaskCallSuffix(MiniFlaskParser.FlaskCallSuffixContext ctx) {
        List<ArgKw> argKws = new ArrayList<>();

        if (ctx.routeArgKws() != null) {
            Args argsNode = (Args) visit(ctx.routeArgKws());
            argKws.addAll(argsNode.argKws);
        }

        Token t = ctx.getStart();
        return new CallExpr(argKws, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskArgsList(MiniFlaskParser.FlaskArgsListContext ctx) {
        List<ArgKw> argKws = new ArrayList<>();

        for (MiniFlaskParser.ArgContext aCtx : ctx.arg()) {
            argKws.add((ArgKw) visit(aCtx));
        }
        Token t = ctx.getStart();
        return new Args(argKws, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskKwArg(MiniFlaskParser.FlaskKwArgContext ctx) {
        String name = ctx.IDENT().getText();
        Expr value = (Expr) visit(ctx.expr());
        Token t = ctx.getStart();
        return new ArgKw(name, value, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskPosArg(MiniFlaskParser.FlaskPosArgContext ctx) {
        Expr value = (Expr) visit(ctx.expr());
        Token t = ctx.getStart();
        return new ArgKw(null, value, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskGenExpr(MiniFlaskParser.FlaskGenExprContext ctx) {
        return visit(ctx.genExpr());
    }

    @Override
    public FlaskASTNode visitFlaskGeneratorExpr(MiniFlaskParser.FlaskGeneratorExprContext ctx) {

        symbolTable.enterScope("generator");
//        System.out.println("Entered generator scope: " + symbolTable.getCurrentScope().getName());

        String var = ctx.IDENT().getText();
        Token t = ctx.getStart();
        Symbol symbol = new Symbol(var, SymbolKind.VARIABLE, null, t.getLine(), t.getCharPositionInLine());
        symbolTable.define(symbol);

//        System.out.println("Defined generator variable '" + var + "' in scope '" +
//                symbolTable.getCurrentScope().getName() + "'. Current symbols: " +
//                symbolTable.getCurrentScope().getSymbols().keySet());


        Expr element = (Expr) visit(ctx.expr(0));
        Expr iterable = (Expr) visit(ctx.expr(1));
        Expr condition = ctx.expr().size() > 2 ? (Expr) visit(ctx.expr(2)) : null;

        GenExpr genExpr = new GenExpr(element, var, iterable, condition, t.getLine(), t.getCharPositionInLine());


        symbolTable.exitScope();
//        System.out.println("Exited generator scope, back to: " + symbolTable.getCurrentScope().getName());

        return genExpr;
    }


    @Override
    public FlaskASTNode visitFlaskAtomName(MiniFlaskParser.FlaskAtomNameContext ctx) {
        String name = ctx.IDENT().getText();
        Token t = ctx.getStart();

        Symbol symbol = symbolTable.resolve(name);
        if (symbol == null) {
            recordSemanticError("Undefined variable '" + name + "'", t);
            return new NameExpr(name, t.getLine(), t.getCharPositionInLine());
        }

        return new NameExpr(name, t.getLine(), t.getCharPositionInLine());
    }



    @Override
    public FlaskASTNode visitFlaskAtomString(MiniFlaskParser.FlaskAtomStringContext ctx) {
        Token t = ctx.getStart();
        String raw = ctx.STRING().getText();
        String value = raw.length() >= 2 ? raw.substring(1, raw.length() - 1) : raw;
        return new LiteralExpr(value, LiteralType.STRING, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskAtomNumber(MiniFlaskParser.FlaskAtomNumberContext ctx) {
        Token t = ctx.getStart();
        String text = ctx.NUMBER().getText();

        Object value;
        LiteralType type;

        if (text.contains(".")) {
            value = Double.parseDouble(text);
            type = LiteralType.FLOAT;
        } else {
            value = Integer.parseInt(text);
            type = LiteralType.INTEGER;
        }

        return new LiteralExpr(value, type, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlskAtomApp(MiniFlaskParser.FlskAtomAppContext ctx) {
        Token t = ctx.getStart();
        return new AppExpr(t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskAtomNone(MiniFlaskParser.FlaskAtomNoneContext ctx) {
        Token t = ctx.getStart();
        return new NoneExpr(t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskAtomTrue(MiniFlaskParser.FlaskAtomTrueContext ctx) {
        Token t = ctx.getStart();
        return new BoolExpr(true, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskAtomFalse(MiniFlaskParser.FlaskAtomFalseContext ctx) {
        Token t = ctx.getStart();
        return new BoolExpr(false, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskAtomList(MiniFlaskParser.FlaskAtomListContext ctx) {
        return visit(ctx.listLiteral());
    }

    @Override
    public FlaskASTNode visitFlaskAtomDict(MiniFlaskParser.FlaskAtomDictContext ctx) {
        DictPairs pairsNode = (DictPairs) visit(ctx.dictLiteral());

        Token t = ctx.getStart();
        return new DictExpr(pairsNode.pairs, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskAtomGenExpr(MiniFlaskParser.FlaskAtomGenExprContext ctx) {
        return visit(ctx.genExpr());
    }

    @Override
    public FlaskASTNode visitFlaskListLiteral(MiniFlaskParser.FlaskListLiteralContext ctx) {
        List<Expr> elements = new ArrayList<>();

        for (MiniFlaskParser.ExprContext eCtx : ctx.expr()) {
            elements.add((Expr) visit(eCtx));
        }

        Token t = ctx.getStart();
        return new ListExpr(elements, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskDictLiteral(MiniFlaskParser.FlaskDictLiteralContext ctx) {
        List<DictPair> pairs = new ArrayList<>();

        for (MiniFlaskParser.PairContext pCtx : ctx.pair()) {
            pairs.add((DictPair) visit(pCtx));
        }

        Token t = ctx.getStart();
        return new DictPairs(pairs, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskDictPair(MiniFlaskParser.FlaskDictPairContext ctx) {
        String key;

        if (ctx.STRING() != null) {
            String raw = ctx.STRING().getText();
            key = raw.length() >= 2 ? raw.substring(1, raw.length() - 1) : raw;
        } else {
            key = ctx.IDENT().getText();
        }

        Expr value = (Expr) visit(ctx.expr());
        Token t = ctx.getStart();
        return new DictPair(t.getLine(), t.getCharPositionInLine(), key, value);
    }

    @Override
    public FlaskASTNode visitFlaskImportNamesStmt(MiniFlaskParser.FlaskImportNamesStmtContext ctx) {
        ImportNames namesNode = (ImportNames) visit(ctx.importNames());
        Token t = ctx.getStart();

        for (String name : namesNode.names) {
            if (symbolTable.getCurrentScope().resolve(name) != null && symbolTable.getCurrentScope().getSymbols().containsKey(name)) {
                recordSemanticError("Symbol '" + name + "' already defined in current scope", t);
                continue;
            }
            Symbol symbol = new Symbol(name, SymbolKind.VARIABLE, null,t.getLine(),t.getCharPositionInLine());
            symbolTable.define(symbol);

//            System.out.println("Imported symbol '" + name + "' in scope '" +
//                    symbolTable.getCurrentScope().getName() + "'. Current symbols: " +
//                    symbolTable.getCurrentScope().getSymbols().keySet());
        }

        return new ImportStmt(namesNode.names, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskFromImportStmt(MiniFlaskParser.FlaskFromImportStmtContext ctx) {
        String module = ctx.IDENT().getText();
        ImportNames namesNode = (ImportNames) visit(ctx.importNames());
        Token t = ctx.getStart();

        for (String name : namesNode.names) {
            if (symbolTable.getCurrentScope().resolve(name) != null &&
                    symbolTable.getCurrentScope().getSymbols().containsKey(name)) {
                recordSemanticError("Symbol '" + name + "' already defined in current scope", t);
                continue;
            }

            Symbol symbol = new Symbol(name, SymbolKind.VARIABLE, null, t.getLine(), t.getCharPositionInLine());
            symbolTable.define(symbol);

//            System.out.println("Imported symbol '" + name + "' in scope '" +
//                    symbolTable.getCurrentScope().getName() + "'. Current symbols: " +
//                    symbolTable.getCurrentScope().getSymbols().keySet());
        }

        return new FromImportStmt(module, namesNode.names, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskImportNameList(MiniFlaskParser.FlaskImportNameListContext ctx) {
        List<String> names = new ArrayList<>();
        for (TerminalNode id : ctx.IDENT()) {
            names.add(id.getText());
        }
        return new ImportNames(names);
    }


    @Override
    public FlaskASTNode visitFlaskRouteDefinition(MiniFlaskParser.FlaskRouteDefinitionContext ctx) {
        Token t = ctx.getStart();

        List<RouteArg> routeArgs = new ArrayList<>();
        if (ctx.routeArgs() != null) {
            RouteArgs routeArgsNode = (RouteArgs) visit(ctx.routeArgs());
            routeArgs.addAll(routeArgsNode.routeArgs);
        }

        FuncDefStmt function = (FuncDefStmt) visit(ctx.funcDef());
        String methodName = ctx.routeMethod() != null ? ctx.routeMethod().getText().toUpperCase() : "ANY";
        if ("ROUTE".equals(methodName)) {
            methodName = "ANY";
        }

        return new RouteDefStmt(routeArgs, function, methodName, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskRouteArgsList(MiniFlaskParser.FlaskRouteArgsListContext ctx) {

        List<RouteArg> routeArgs = new ArrayList<>();

        for (MiniFlaskParser.RouteArgContext a : ctx.routeArg()) {
            routeArgs.add((RouteArg) visit(a));
        }
        Token t = ctx.getStart();
        return new RouteArgs(routeArgs, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskRouteArgString(MiniFlaskParser.FlaskRouteArgStringContext ctx) {
        Token t = ctx.getStart();
        String raw = ctx.STRING().getText();
        String path = raw.substring(1, raw.length() - 1);
        return new RouteArgString(path, t.getLine(), t.getCharPositionInLine());
    }


    @Override
    public FlaskASTNode visitFlaskRouteArgKw(MiniFlaskParser.FlaskRouteArgKwContext ctx) {

        String name = ctx.IDENT().getText();
        Expr value = (Expr) visit(ctx.expr());
        Token t = ctx.getStart();

        return new RouteArgKw(name, value, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskFunctionDef(MiniFlaskParser.FlaskFunctionDefContext ctx) {
        String name = ctx.IDENT().getText();
        Token t = ctx.getStart();

        boolean duplicateFunction = symbolTable.getCurrentScope().resolve(name) != null &&
                symbolTable.getCurrentScope().getSymbols().containsKey(name);
        if (duplicateFunction) {
            recordSemanticError("Function '" + name + "' already defined in current scope", t);
        }

        Symbol funcSymbol = new Symbol(name, SymbolKind.FUNCTION, null, t.getLine(), t.getCharPositionInLine());
        if (!duplicateFunction) {
            symbolTable.define(funcSymbol);
        }

        symbolTable.enterScope(name);
//        System.out.println("Entered function definition scope: " + symbolTable.getCurrentScope().getName());

        // First pass: predefine top-level assignment targets in this function so
        // later references (e.g. in return/render_template) resolve correctly.
        // This helps with patterns like: assign; return render_template(..., product=product)
        for (MiniFlaskParser.StatementContext preStmtCtx : ctx.statement()) {
            if (preStmtCtx instanceof MiniFlaskParser.FlaskAssignStmtContext preAssignCtx) {
                // Fallback-safe extraction of assignment target name by parsing the statement text
                String raw = preAssignCtx.getText();
                int eq = raw.indexOf('=');
                String candidate;
                if (eq > 0) {
                    candidate = raw.substring(0, eq);
                } else {
                    // fallback: some contexts return only the lhs text (e.g. "product")
                    candidate = raw;
                }
                // strip possible parentheses or whitespace
                candidate = candidate.replaceAll("[()\\s]", "");
                // when assignment is like app = ..., IDENT or APP could be the name
                String preVarName = candidate;
                Token tt = preAssignCtx.getStart();
                if (preVarName != null && !preVarName.isBlank()) {
                    if (symbolTable.getCurrentScope().resolve(preVarName) == null) {
                        symbolTable.define(new Symbol(preVarName, SymbolKind.VARIABLE, null, tt.getLine(), tt.getCharPositionInLine()));
                    }
                }
            }
        }

        List<Param> params = new ArrayList<>();
        if (ctx.params() != null) {
            Params p = (Params) visit(ctx.params());
            params = p.params;

            for (Param param : params) {
                if (symbolTable.getCurrentScope().resolve(param.name) != null &&
                        symbolTable.getCurrentScope().getSymbols().containsKey(param.name)) {
                    recordSemanticError("Parameter '" + param.name + "' already defined in current scope", t);
                    continue;
                }

                symbolTable.define(new Symbol(param.name, SymbolKind.VARIABLE, null, t.getLine(), t.getCharPositionInLine()));
//                System.out.println("Defined variable '" + param.name + "' in scope '" +
//                        symbolTable.getCurrentScope().getName() + "'. Current symbols: " +
//                        symbolTable.getCurrentScope().getSymbols().keySet());
            }
        }

        List<Stmt> body = new ArrayList<>();
        List<MiniFlaskParser.StatementContext> statements = ctx.statement();
        for (int i = 0; i < statements.size(); i++) {
            MiniFlaskParser.StatementContext stmtCtx = statements.get(i);
            Token st = stmtCtx.getStart();

            if (stmtCtx instanceof MiniFlaskParser.FlaskIfStmtContext ifCtx) {
                MiniFlaskParser.IfStmtContext ifInner = ifCtx.ifStmt();
                if (ifInner instanceof MiniFlaskParser.FlaskIfStatementContext) {
                }
                IfStmtWithSiblings result = buildIfStmtWithSiblings(ifInner, statements, i + 1);
                body.add(result.ifStmt);
                body.addAll(result.trailingStatements);
                i += result.consumedSiblingCount;
                continue;
            }

            Stmt stmt = (Stmt) visit(stmtCtx);
            if (stmt != null) body.add(stmt);
        }

        symbolTable.exitScope();
        return new FuncDefStmt(name, params, body, t.getLine(), t.getCharPositionInLine());
    }

    private IfStmtWithSiblings buildIfStmtWithSiblings(MiniFlaskParser.IfStmtContext ctx) {
        return buildIfStmtWithSiblings(ctx, null, -1);
    }

    private IfStmtWithSiblings buildIfStmtWithSiblings(MiniFlaskParser.IfStmtContext ctx,
                                                       List<MiniFlaskParser.StatementContext> outerStatements,
                                                       int nextIndex) {
        MiniFlaskParser.FlaskIfStatementContext ifCtx = (MiniFlaskParser.FlaskIfStatementContext) ctx;
        Token t = ifCtx.getStart();
        Expr condition = (Expr) visit(ifCtx.expr());

        symbolTable.enterScope("if");

        int ifIndent = t.getCharPositionInLine();
        List<Stmt> body = new ArrayList<>();
        List<Stmt> trailingStatements = new ArrayList<>();
        int consumedSiblingCount = 0;
        var processedPositions = new java.util.HashSet<String>();

        for (MiniFlaskParser.StatementContext sCtx : ifCtx.statement()) {
            String positionKey = sCtx.getStart().getLine() + ":" + sCtx.getStart().getCharPositionInLine();
            processedPositions.add(positionKey);

            int stmtIndent = sCtx.getStart().getCharPositionInLine();
            Stmt stmt = (Stmt) visit(sCtx);
            if (stmt == null) {
                continue;
            }

            if (stmtIndent <= ifIndent) {
                trailingStatements.add(stmt);
            } else {
                body.add(stmt);
            }
        }

        if (outerStatements != null && nextIndex >= 0) {
            for (int i = nextIndex; i < outerStatements.size(); i++) {
                MiniFlaskParser.StatementContext sCtx = outerStatements.get(i);
                int stmtIndent = sCtx.getStart().getCharPositionInLine();
                if (stmtIndent <= ifIndent) {
                    break;
                }

                String positionKey = sCtx.getStart().getLine() + ":" + sCtx.getStart().getCharPositionInLine();
                if (processedPositions.contains(positionKey)) {
                    consumedSiblingCount++;
                    continue;
                }

                if (sCtx instanceof MiniFlaskParser.FlaskIfStmtContext nestedIfCtx) {
                    MiniFlaskParser.IfStmtContext nestedIfInner = nestedIfCtx.ifStmt();
                    IfStmtWithSiblings nestedResult = buildIfStmtWithSiblings(nestedIfInner, outerStatements, i + 1);
                    body.add(nestedResult.ifStmt);
                    i += nestedResult.consumedSiblingCount;
                    consumedSiblingCount += nestedResult.consumedSiblingCount + 1;
                    continue;
                }

                Stmt stmt = (Stmt) visit(sCtx);
                if (stmt != null) {
                    body.add(stmt);
                }
                consumedSiblingCount++;
            }
        }

        symbolTable.exitScope();

        return new IfStmtWithSiblings(new IfStmt(condition, body, t.getLine(), t.getCharPositionInLine()), trailingStatements, consumedSiblingCount);
    }

    private static class IfStmtWithSiblings {
        private final IfStmt ifStmt;
        private final List<Stmt> trailingStatements;
        private final int consumedSiblingCount;

        private IfStmtWithSiblings(IfStmt ifStmt, List<Stmt> trailingStatements, int consumedSiblingCount) {
            this.ifStmt = ifStmt;
            this.trailingStatements = trailingStatements;
            this.consumedSiblingCount = consumedSiblingCount;
        }
    }

    @Override
    public FlaskASTNode visitFlaskIfStatement(MiniFlaskParser.FlaskIfStatementContext ctx) {
        return buildIfStmtWithSiblings(ctx).ifStmt;
    }

    @Override
    public FlaskASTNode visitFlaskParamsList(MiniFlaskParser.FlaskParamsListContext ctx) {
        List<Param> params = new ArrayList<>();

        for (MiniFlaskParser.ParamContext p : ctx.param()) {
            params.add((Param) visit(p));
        }

        return new Params(params);
    }

    @Override
    public FlaskASTNode visitFlaskSimpleParam(MiniFlaskParser.FlaskSimpleParamContext ctx) {
        String name = ctx.IDENT().getText();
        Token t = ctx.getStart();
        return new Param(name, null, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskDefaultParam(MiniFlaskParser.FlaskDefaultParamContext ctx) {
        String name = ctx.IDENT().getText();
        Expr defaultValue = (Expr) visit(ctx.expr());
        Token t = ctx.getStart();
        return new Param(name, defaultValue, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskTypeAnnotatedParam(MiniFlaskParser.FlaskTypeAnnotatedParamContext ctx) {
        String name = ctx.IDENT().getText();
        Expr defaultValue = null;
        Token t = ctx.getStart();
        return new Param(name, defaultValue, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskTypeAnnotatedDefaultParam(MiniFlaskParser.FlaskTypeAnnotatedDefaultParamContext ctx) {
        String name = ctx.IDENT().getText();
        Expr defaultValue = (Expr) visit(ctx.expr());
        Token t = ctx.getStart();
        return new Param(name, defaultValue, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskStarParam(MiniFlaskParser.FlaskStarParamContext ctx) {
        String name = "*" + ctx.IDENT().getText(); // encode star in name
        Token t = ctx.getStart();
        return new Param(name, null, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskDoubleStarParam(MiniFlaskParser.FlaskDoubleStarParamContext ctx) {
        String name = "**" + ctx.IDENT().getText(); // encode double star
        Token t = ctx.getStart();
        return new Param(name, null, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskTypeExpr(MiniFlaskParser.FlaskTypeExprContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(ctx.IDENT(0).getText());
        for (int i = 1; i < ctx.IDENT().size(); i++) {
            sb.append(".").append(ctx.IDENT(i).getText());
        }

        Token t = ctx.getStart();
        return new TypeExpr(sb.toString(), t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskReturnStatement(MiniFlaskParser.FlaskReturnStatementContext ctx) {
        Token t = ctx.getStart();

        if (!isInsideFunction(ctx)) {
            recordSemanticError("Return statement is not allowed in global scope", t);
        }

        Expr value = null;
        for (ParseTree child : ctx.children) {
            if (child instanceof MiniFlaskParser.FlaskEqualityExprContext) {
                value = (Expr) visit(child);
                break;
            }
        }

        return new ReturnStmt(value, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskExpressionStatement(MiniFlaskParser.FlaskExpressionStatementContext ctx) {
        Token t = ctx.getStart();

        Expr expr = (Expr) visit(ctx.expr());

        return new ExprStmt(expr, t.getLine(), t.getCharPositionInLine());
    }

//    private boolean isRead(MiniFlaskParser.FlaskAtomNameContext ctx) {
//        ParseTree parent = ctx.getParent().getParent().getParent().getParent().getParent().getParent();
//        if (parent instanceof MiniFlaskParser.FuncDefContext) {
//            return false;
//        }
//
//        return true;
//    }


}