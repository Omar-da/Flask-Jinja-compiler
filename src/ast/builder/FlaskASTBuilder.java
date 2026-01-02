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
import java.util.List;

public class FlaskASTBuilder extends MiniFlaskParserBaseVisitor<FlaskASTNode> {

    private final SymbolTable symbolTable;

    public FlaskASTBuilder() {
        this.symbolTable = new SymbolTable();
    }

    @Override
    public FlaskASTNode visitFile(MiniFlaskParser.FileContext ctx) {
        symbolTable.enterScope("global");
        System.out.println("Entered global scope: " + symbolTable.getCurrentScope().getName());

        List<Stmt> statements = new ArrayList<>();

        for (MiniFlaskParser.StatementContext stmtCtx : ctx.statement()) {
            statements.add((Stmt) visit(stmtCtx));
        }

        System.out.println("Global Scope Symbols: " + symbolTable.getCurrentScope().getSymbols().keySet());

        symbolTable.exitScope();
        System.out.println("Exited global scope. Current scope: " + symbolTable.getCurrentScope().getName());

        Token t = ctx.getStart();
        return new FileNodeFlask(statements, t.getLine(), t.getCharPositionInLine());
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

        Expr value = (Expr) visit(ctx.expr());

        AssignStmt assignStmt = new AssignStmt(varName, value, t.getLine(), t.getCharPositionInLine());

        Symbol existing = symbolTable.getCurrentScope().getSymbols().get(varName);
        if (existing != null) {
            System.out.println(
                    "Variable '" + varName + "' already exists in current scope '" +
                            symbolTable.getCurrentScope().getName() + "'. Skipping redefine."
            );
        } else {
            Symbol symbol = new Symbol(varName, SymbolKind.VARIABLE, assignStmt, t.getLine(), t.getCharPositionInLine());
            symbolTable.define(symbol);

            System.out.println("Defined variable '" + varName + "' in scope '" +
                    symbolTable.getCurrentScope().getName() + "'. Current symbols: " +
                    symbolTable.getCurrentScope().getSymbols().keySet());
        }

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
        System.out.println("Entered generator scope: " + symbolTable.getCurrentScope().getName());

        String var = ctx.IDENT().getText();
        Token t = ctx.getStart();
        Symbol symbol = new Symbol(var, SymbolKind.VARIABLE, null, t.getLine(), t.getCharPositionInLine());
        symbolTable.define(symbol);

        System.out.println("Defined generator variable '" + var + "' in scope '" +
                symbolTable.getCurrentScope().getName() + "'. Current symbols: " +
                symbolTable.getCurrentScope().getSymbols().keySet());


        Expr element = (Expr) visit(ctx.expr(0));
        Expr iterable = (Expr) visit(ctx.expr(1));
        Expr condition = ctx.expr().size() > 2 ? (Expr) visit(ctx.expr(2)) : null;

        GenExpr genExpr = new GenExpr(element, var, iterable, condition, t.getLine(), t.getCharPositionInLine());


        symbolTable.exitScope();
        System.out.println("Exited generator scope, back to: " + symbolTable.getCurrentScope().getName());

        return genExpr;
    }


    @Override
    public FlaskASTNode visitFlaskAtomName(MiniFlaskParser.FlaskAtomNameContext ctx) {
        String name = ctx.IDENT().getText();
        Token t = ctx.getStart();

        Symbol symbol = symbolTable.resolve(name);

        if (symbol == null) {
            throw new RuntimeException(
                    "Undefined variable '" + name + "' at line " +
                            t.getLine() + ", column " + t.getCharPositionInLine()
            );
        }

        System.out.println("Resolved variable '" + name + "' in scope '" +
                symbolTable.getCurrentScope().getName() + "'. Symbol info: " + symbol);

        return new NameExpr(name, t.getLine(), t.getCharPositionInLine());
    }


    @Override
    public FlaskASTNode visitFlaskAtomString(MiniFlaskParser.FlaskAtomStringContext ctx) {
        Token t = ctx.getStart();
        return new LiteralExpr(ctx.STRING().getText(), t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskAtomNumber(MiniFlaskParser.FlaskAtomNumberContext ctx) {
        Token t = ctx.getStart();
        return new LiteralExpr(ctx.NUMBER().getText(), t.getLine(), t.getCharPositionInLine());
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
            key = ctx.STRING().getText();
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
                throw new RuntimeException(
                        "Symbol '" + name + "' already defined in current scope at line " +
                                t.getLine() + ", column " + t.getCharPositionInLine()
                );
            }
            Symbol symbol = new Symbol(name, SymbolKind.VARIABLE, null,t.getLine(),t.getCharPositionInLine());
            symbolTable.define(symbol);

            System.out.println("Imported symbol '" + name + "' in scope '" +
                    symbolTable.getCurrentScope().getName() + "'. Current symbols: " +
                    symbolTable.getCurrentScope().getSymbols().keySet());
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
                throw new RuntimeException(
                        "Symbol '" + name + "' already defined in current scope at line " +
                                t.getLine() + ", column " + t.getCharPositionInLine()
                );
            }

            Symbol symbol = new Symbol(name, SymbolKind.VARIABLE, null, t.getLine(), t.getCharPositionInLine());
            symbolTable.define(symbol);

            System.out.println("Imported symbol '" + name + "' in scope '" +
                    symbolTable.getCurrentScope().getName() + "'. Current symbols: " +
                    symbolTable.getCurrentScope().getSymbols().keySet());
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

        return new RouteDefStmt(routeArgs, function, t.getLine(), t.getCharPositionInLine());
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
        return new RouteRouteArgString(path, t.getLine(), t.getCharPositionInLine());
    }


    @Override
    public FlaskASTNode visitFlaskRouteArgKw(MiniFlaskParser.FlaskRouteArgKwContext ctx) {

        String name = ctx.IDENT().getText();
        Expr value = (Expr) visit(ctx.expr());
        Token t = ctx.getStart();

        return new RouteRouteArgKw(name, value, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskFunctionDef(MiniFlaskParser.FlaskFunctionDefContext ctx) {
        String name = ctx.IDENT().getText();
        Token t = ctx.getStart();

        if (symbolTable.getCurrentScope().resolve(name) != null && symbolTable.getCurrentScope().getSymbols().containsKey(name)) {
            throw new RuntimeException(
                    "Function '" + name + "' already defined in current scope at line " +
                            t.getLine() + ", column " + t.getCharPositionInLine()
            );
        }

        Symbol funcSymbol = new Symbol(name, SymbolKind.FUNCTION, null, t.getLine(), t.getCharPositionInLine());
        symbolTable.define(funcSymbol);
        System.out.println("Defined function '" + name + "' in scope '" +
                symbolTable.getCurrentScope().getName() + "'. Current symbols: " +
                symbolTable.getCurrentScope().getSymbols().keySet());

        symbolTable.enterScope("function_" + name);
        System.out.println("Entered function scope: " + symbolTable.getCurrentScope().getName());

        List<Param> params = new ArrayList<>();
        if (ctx.params() != null) {
            Params p = (Params) visit(ctx.params());
            params = p.params;

            for (Param param : params) {
                if (symbolTable.getCurrentScope().resolve(param.name) != null && symbolTable.getCurrentScope().getSymbols().containsKey(param.name)) {
                    throw new RuntimeException(
                            "Parameter '" + param.name + "' already defined in function '" + name +
                                    "' at line " + t.getLine() + ", column " + t.getCharPositionInLine()
                    );
                }

                Symbol paramSymbol = new Symbol(param.name, SymbolKind.VARIABLE, null, t.getLine(), t.getCharPositionInLine());
                symbolTable.define(paramSymbol);
                System.out.println("Defined parameter '" + param.name + "' in function '" + name +
                        "'. Current symbols: " + symbolTable.getCurrentScope().getSymbols().keySet());
            }
        }

        List<Stmt> body = new ArrayList<>();
        for (MiniFlaskParser.StatementContext stmtCtx : ctx.statement()) {
            body.add((Stmt) visit(stmtCtx));
        }

        return new FuncDefStmt(name, params, body, t.getLine(), t.getCharPositionInLine());
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
    public FlaskASTNode visitFlaskIfStatement(MiniFlaskParser.FlaskIfStatementContext ctx) {
        Token t = ctx.getStart();

        Expr condition = (Expr) visit(ctx.expr());

        List<Stmt> body = new ArrayList<>();
        for (MiniFlaskParser.StatementContext sCtx : ctx.statement()) {
            body.add((Stmt) visit(sCtx));
        }

        return new IfStmt(condition, body, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskReturnStatement(MiniFlaskParser.FlaskReturnStatementContext ctx) {
        Token t = ctx.getStart();

        Expr value = null;
        for (ParseTree child : ctx.children) {
            if (child instanceof MiniFlaskParser.FlaskEqualityExprContext) {
                value = (Expr) visit(child);
                break;
            }
        }

        System.out.println("Exiting function scope: " +
                symbolTable.getCurrentScope().getName() + ". Symbols in scope: " +
                symbolTable.getCurrentScope().getSymbols().keySet());
        symbolTable.exitScope();

        return new ReturnStmt(value, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public FlaskASTNode visitFlaskExpressionStatement(MiniFlaskParser.FlaskExpressionStatementContext ctx) {
        Token t = ctx.getStart();

        Expr expr = (Expr) visit(ctx.expr());

        return new ExprStmt(expr, t.getLine(), t.getCharPositionInLine());
    }

}