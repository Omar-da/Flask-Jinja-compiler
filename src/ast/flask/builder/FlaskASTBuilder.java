package ast.flask.builder;

import ast.flask.expr.*;
import ast.flask.stmt.*;
import ast.flask.*;
import gen.grammers.MiniFlaskParser;
import gen.grammers.MiniFlaskParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class FlaskASTBuilder extends MiniFlaskParserBaseVisitor<ASTNode> {

    /* ---------------- FILE ---------------- */

    @Override
    public ASTNode visitFile(MiniFlaskParser.FileContext ctx) {
        List<Stmt> statements = new ArrayList<>();

        for (MiniFlaskParser.StatementContext stmtCtx : ctx.statement()) {
            statements.add((Stmt) visit(stmtCtx));
        }

        return new FileNode(statements);
    }

    /* ---------------- STATEMENTS ---------------- */

    @Override
    public ASTNode visitFlaskAssignStmt(MiniFlaskParser.FlaskAssignStmtContext ctx) {
        String name = ctx.IDENT().getText();
        Expr value = (Expr) visit(ctx.expr());
        return new AssignStmt(name, value);
    }

    @Override
    public ASTNode visitFlaskReturnStmt(MiniFlaskParser.FlaskReturnStmtContext ctx) {
        return new ReturnStmt((Expr) visit(ctx.expr()));
    }

    @Override
    public ASTNode visitFlaskExprStmt(MiniFlaskParser.FlaskExprStmtContext ctx) {
        return new ExprStmt((Expr) visit(ctx.expr()));
    }

    /* ---------------- EXPRESSIONS ---------------- */

    @Override
    public ASTNode visitFlaskEqualityExpr(MiniFlaskParser.FlaskEqualityExprContext ctx) {
        Expr left = (Expr) visit(ctx.additive(0));

        if (ctx.additive().size() == 1) {
            return left;
        }

        Expr right = (Expr) visit(ctx.additive(1));
        return new BinaryExpr(left, "==", right);
    }

    @Override
    public ASTNode visitFlaskAdditiveExpr(MiniFlaskParser.FlaskAdditiveExprContext ctx) {
        Expr expr = (Expr) visit(ctx.primary(0));

        for (int i = 1; i < ctx.primary().size(); i++) {
            Expr right = (Expr) visit(ctx.primary(i));
            expr = new BinaryExpr(expr, "+", right);
        }

        return expr;
    }

    /* ---------------- PRIMARY + SUFFIX ---------------- */

    @Override
    public ASTNode visitFlaskPrimaryExpr(MiniFlaskParser.FlaskPrimaryExprContext ctx) {
        Expr expr = (Expr) visit(ctx.atom());

        for (MiniFlaskParser.SuffixContext s : ctx.suffix()) {
            expr = applySuffix(expr, s);
        }

        return expr;
    }

    private Expr applySuffix(Expr target, MiniFlaskParser.SuffixContext ctx) {

        if (ctx.DOT() != null) {
            return new AttrAccessExpr(target, ctx.IDENT().getText());
        }

        if (ctx.LBRACK() != null) {
            Expr index = (Expr) visit(ctx.expr());
            return new IndexExpr(target, index);
        }

        if (ctx.LPAREN() != null) {
            List<Expr> args = new ArrayList<>();
            if (ctx.args() != null) {
                for (MiniFlaskParser.ArgContext a : ctx.args().arg()) {
                    args.add((Expr) visit(a));
                }
            }
            return new CallExpr(target, args);
        }

        return target;
    }

    /* ---------------- ATOMS ---------------- */

    @Override
    public ASTNode visitFlaskAtomName(MiniFlaskParser.FlaskAtomNameContext ctx) {
        return new NameExpr(ctx.IDENT().getText());
    }

    @Override
    public ASTNode visitFlaskAtomString(MiniFlaskParser.FlaskAtomStringContext ctx) {
        return new LiteralExpr(ctx.STRING().getText());
    }

    @Override
    public ASTNode visitFlaskAtomNumber(MiniFlaskParser.FlaskAtomNumberContext ctx) {
        return new LiteralExpr(Integer.parseInt(ctx.NUMBER().getText()));
    }

    @Override
    public ASTNode visitFlaskAtomTrue(MiniFlaskParser.FlaskAtomTrueContext ctx) {
        return new LiteralExpr(true);
    }

    @Override
    public ASTNode visitFlaskAtomFalse(MiniFlaskParser.FlaskAtomFalseContext ctx) {
        return new LiteralExpr(false);
    }

    @Override
    public ASTNode visitFlaskAtomNone(MiniFlaskParser.FlaskAtomNoneContext ctx) {
        return new LiteralExpr(null);
    }

    /* ---------------- COLLECTIONS ---------------- */

    @Override
    public ASTNode visitFlaskListLiteral(MiniFlaskParser.FlaskListLiteralContext ctx) {
        List<Expr> elements = new ArrayList<>();

        for (MiniFlaskParser.ExprContext e : ctx.expr()) {
            elements.add((Expr) visit(e));
        }

        return new ListExpr(elements);
    }

    @Override
    public ASTNode visitFlaskDictLiteral(MiniFlaskParser.FlaskDictLiteralContext ctx) {
        List<DictExpr.Pair> pairs = new ArrayList<>();

        for (MiniFlaskParser.PairContext p : ctx.pair()) {
            String key = p.getChild(0).getText();
            Expr value = (Expr) visit(p.expr());
            pairs.add(new DictExpr.Pair(key, value));
        }

        return new DictExpr(pairs);
    }

    /* ---------------- GENERATOR ---------------- */

    @Override
    public ASTNode visitFlaskGeneratorExpr(MiniFlaskParser.FlaskGeneratorExprContext ctx) {
        Expr element = (Expr) visit(ctx.expr(0));
        String var = ctx.IDENT().getText();
        Expr iterable = (Expr) visit(ctx.expr(1));
        Expr condition = ctx.expr().size() == 3 ? (Expr) visit(ctx.expr(2)) : null;

        return new GeneratorExpr(element, var, iterable, condition);
    }
}
