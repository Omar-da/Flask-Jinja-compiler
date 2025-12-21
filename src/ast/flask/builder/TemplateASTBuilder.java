package ast.flask.builder;


import ast.template.*;
import gen.grammers.MiniTemplateParser;
import gen.grammers.MiniTemplateParserBaseVisitor;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Builds simplified AST from MiniTemplateParser parse tree.
 */
public class TemplateASTBuilder extends MiniTemplateParserBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitTemplate(MiniTemplateParser.TemplateContext ctx) {
        TemplateElementNode root = new TemplateElementNode();
        for (MiniTemplateParser.ElementContext elCtx : ctx.element()) {
            root.children.add(visit(elCtx));
        }
        return root;
    }

    @Override
    public ASTNode visitTemplateText(MiniTemplateParser.TemplateTextContext ctx) {
        return new TemplateTextNode(ctx.getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitTemplateHtmlElement(MiniTemplateParser.TemplateHtmlElementContext ctx) {
        return visit(ctx.htmlTag());
    }

    @Override
    public ASTNode visitTemplateJinjaVar(MiniTemplateParser.TemplateJinjaVarContext ctx) {
        FlaskExprNode expr = (FlaskExprNode) visit(ctx.jinjaVar());
        return new TemplateJinjaNode("var", null, expr, ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitTemplateJinjaBlock(MiniTemplateParser.TemplateJinjaBlockContext ctx) {
        return visit(ctx.jinjaBlock());
    }

    @Override
    public ASTNode visitHtmlTag(MiniTemplateParser.HtmlTagContext ctx) {
        String tagName = ctx.getChild(0).getText();
        TemplateHtmlNode node = new TemplateHtmlNode(tagName, ctx.start.getLine(), ctx.start.getCharPositionInLine());

        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof MiniTemplateParser.ElementContext) {
                node.children.add(visit((MiniTemplateParser.ElementContext) ctx.getChild(i)));
            }
        }
        return node;
    }

    @Override
    public ASTNode visitAttr(MiniTemplateParser.AttrContext ctx) {
        TemplateQuotedNode valueNode = (TemplateQuotedNode) visit(ctx.quotedValue());
        return new TemplateAttrNode(ctx.HTML_ATTR_IDENT().getText(), valueNode,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitQuotedValue(MiniTemplateParser.QuotedValueContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (MiniTemplateParser.QuotedItemContext q : ctx.quotedItem()) {
            sb.append(q.getText());
        }
        return new TemplateQuotedNode(sb.toString(), ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitJinjaFor(MiniTemplateParser.JinjaForContext ctx) {
        String varName = ctx.JINJA_IDENT(0).getText();
        FlaskExprNode iterable = (FlaskExprNode) visit(ctx.expr(0));
        TemplateJinjaNode node = new TemplateJinjaNode("for", varName, iterable, ctx.start.getLine(), ctx.start.getCharPositionInLine());

        for (MiniTemplateParser.ElementContext elCtx : ctx.element()) {
            node.children.add(visit(elCtx));
        }
        return node;
    }

    @Override
    public ASTNode visitJinjaIf(MiniTemplateParser.JinjaIfContext ctx) {
        FlaskExprNode condition = (FlaskExprNode) visit(ctx.expr(0));
        TemplateJinjaNode node = new TemplateJinjaNode("if", null, condition, ctx.start.getLine(), ctx.start.getCharPositionInLine());

        for (MiniTemplateParser.ElementContext elCtx : ctx.element()) {
            node.children.add(visit(elCtx));
        }
        return node;
    }

    @Override
    public ASTNode visitFlaskAtomName(MiniTemplateParser.FlaskAtomNameContext ctx) {
        return new FlaskAtomNode(ctx.getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitFlaskListLiteral(MiniTemplateParser.FlaskListLiteralContext ctx) {
        List<FlaskExprNode> elements = new ArrayList<>();
        for (MiniTemplateParser.ExprContext e : ctx.expr()) {
            elements.add((FlaskExprNode) visit(e));
        }
        return new FlaskListNode(elements, ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitFlaskDictLiteral(MiniTemplateParser.FlaskDictLiteralContext ctx) {
        Map<String, FlaskExprNode> map = new LinkedHashMap<>();
        for (MiniTemplateParser.PairContext p : ctx.pair()) {
            String key = p.getChild(0).getText();
            FlaskExprNode val = (FlaskExprNode) visit(p.expr());
            map.put(key, val);
        }
        return new FlaskDictNode(map, ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitFlaskGeneratorExpr(MiniTemplateParser.FlaskGeneratorExprContext ctx) {
        String var = ctx.JINJA_IDENT(0).getText();
        FlaskExprNode iterable = (FlaskExprNode) visit(ctx.expr(0));
        FlaskExprNode filter = ctx.expr().size() > 1 ? (FlaskExprNode) visit(ctx.expr(1)) : null;
        return new FlaskGeneratorNode(var, iterable, filter, ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }
}
