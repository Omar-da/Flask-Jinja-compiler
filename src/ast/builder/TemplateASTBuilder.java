package ast.builder;


import ast.template.*;
import ast.template.css.declaration.*;
import ast.template.css.selector.*;
import ast.template.expr.*;
import ast.template.misc.TemplateArgKw;
import ast.template.misc.TemplateArgs;
import ast.template.misc.TemplateDictPair;
import ast.template.misc.TemplateDictPairs;
import ast.template.symbols.TemplateSymbol;
import ast.template.symbols.TemplateSymbolKind;
import ast.template.symbols.TemplateSymbolTable;
import gen.grammers.MiniTemplateParser;
import gen.grammers.MiniTemplateParserBaseVisitor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Builds simplified AST from MiniTemplateParser parse tree.
 */
public class TemplateASTBuilder extends MiniTemplateParserBaseVisitor<TemplateASTNode> {
    private final TemplateSymbolTable templateSymbolTable;

    public TemplateASTBuilder() {
        this.templateSymbolTable = new TemplateSymbolTable();
    }

    @Override
    public TemplateASTNode visitTemplate(MiniTemplateParser.TemplateContext ctx) {

        templateSymbolTable.enterScope("global");
        System.out.println("Entered global scope: " + templateSymbolTable.getCurrentScope().getName());

        TemplateElementNode root = new TemplateElementNode(
                ctx.start.getLine(),
                ctx.start.getCharPositionInLine()
        );

        for (MiniTemplateParser.ElementContext elementCtx : ctx.element()) {
            String text = elementCtx.getText();
            if (text.trim().isEmpty()) {
                continue;
            }
            TemplateASTNode child = visit(elementCtx);
            if (child != null) {
                root.children.add(child);
            }
        }


        System.out.println("Global Scope Symbols: " + templateSymbolTable.getCurrentScope().getSymbols().keySet());

        templateSymbolTable.exitScope();
        System.out.println("Exited global scope. Current scope: " + templateSymbolTable.getCurrentScope().getName());
        System.out.println();

        this.templateSymbolTable.printTable();
        return root;
    }


    @Override
    public TemplateASTNode visitTemplateText(MiniTemplateParser.TemplateTextContext ctx) {
        return new TemplateTextNode(ctx.getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public TemplateASTNode visitTemplateHtmlElement(MiniTemplateParser.TemplateHtmlElementContext ctx) {return visit(ctx.htmlTag());}

    @Override
    public TemplateASTNode visitTemplateJinjaVarExpr(MiniTemplateParser.TemplateJinjaVarExprContext ctx) {
        TemplateExpr exprNode = (TemplateExpr) visit(ctx.expr());
        Token t = ctx.getStart();
        return new TemplateJinjaVarNode(exprNode, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public TemplateASTNode visitTemplateJinjaBlock(MiniTemplateParser.TemplateJinjaBlockContext ctx) {
        return visit(ctx.jinjaBlock());
    }

    @Override
    public TemplateASTNode visitTemplateJinjaFor(MiniTemplateParser.TemplateJinjaForContext ctx) {

        String varName = ctx.JINJA_IDENT().getText();

        TemplateExpr iterable = (TemplateExpr) visit(ctx.expr());

        templateSymbolTable.enterScope("for");
        System.out.println(
                "Entered for scope: " +
                        templateSymbolTable.getCurrentScope().getName()
        );

        Token t = ctx.getStart();

        if (templateSymbolTable.getCurrentScope().resolve(varName) != null &&
                templateSymbolTable.getCurrentScope().getSymbols().containsKey(varName)) {

            throw new RuntimeException(
                    "Symbol '" + varName + "' already defined in current scope at line " +
                            t.getLine() + ", column " + t.getCharPositionInLine()
            );
        }

        TemplateSymbol symbol = new TemplateSymbol(varName, TemplateSymbolKind.VARIABLE, null, t.getLine(), t.getCharPositionInLine());
        templateSymbolTable.define(symbol);

        System.out.println(
                "Defined for variable '" + varName + "' in scope '" +
                        templateSymbolTable.getCurrentScope().getName() +
                        "'. Current symbols: " +
                        templateSymbolTable.getCurrentScope().getSymbols().keySet()
        );

        List<TemplateElementNode> body = new ArrayList<>();

        for (MiniTemplateParser.ElementContext elemCtx : ctx.element()) {
            if (elemCtx.getText().trim().isEmpty()) {
                continue;
            }

            TemplateElementNode node = (TemplateElementNode) visit(elemCtx);
            if (node != null) {
                body.add(node);
            }
        }

        TemplateJinjaBlockNode forNode =
                new TemplateJinjaBlockNode(
                        "for",
                        varName,
                        iterable,
                        t.getLine(),
                        t.getCharPositionInLine()
                );

        forNode.children.addAll(body);

        templateSymbolTable.exitScope();
        System.out.println(
                "Exited for scope, back to: " +
                        templateSymbolTable.getCurrentScope().getName()
        );

        return forNode;
    }


    @Override
    public TemplateASTNode visitTemplateJinjaIf(MiniTemplateParser.TemplateJinjaIfContext ctx) {
        Token t = ctx.getStart();

        TemplateExpr condition = (TemplateExpr) visit(ctx.expr(0));

        templateSymbolTable.enterScope("if");
        System.out.println(
                "Entered if scope: " +
                        templateSymbolTable.getCurrentScope().getName()
        );

        List<TemplateASTNode> ifBody = new ArrayList<>();
        for (MiniTemplateParser.ElementContext elemCtx : ctx.element()) {
            ifBody.add(visit(elemCtx));
        }

        TemplateJinjaBlockNode ifNode = new TemplateJinjaBlockNode(
                        "if",
                        null,
                        condition,
                        t.getLine(),
                        t.getCharPositionInLine()
                );

        ifNode.children.addAll(ifBody);

        templateSymbolTable.exitScope();
        System.out.println(
                "Exited if scope, back to: " +
                        templateSymbolTable.getCurrentScope().getName()
        );

        for (int i = 1; i < ctx.expr().size(); i++) {

            TemplateExpr elifCondition = (TemplateExpr) visit(ctx.expr(i));

            templateSymbolTable.enterScope("elif");
            System.out.println(
                    "Entered elif scope: " +
                            templateSymbolTable.getCurrentScope().getName()
            );

            List<TemplateElementNode> elifBody = new ArrayList<>();
            for (MiniTemplateParser.ElementContext elemCtx : ctx.element()) {
                elifBody.add((TemplateElementNode) visit(elemCtx));
            }

            TemplateJinjaBlockNode elifNode = new TemplateJinjaBlockNode("elif", null, elifCondition);

            elifNode.children.addAll(elifBody);
            ifNode.children.add(elifNode);

            templateSymbolTable.exitScope();
            System.out.println(
                    "Exited elif scope, back to: " +
                            templateSymbolTable.getCurrentScope().getName()
            );
        }

        return ifNode;
    }


    private TemplateHtmlTagNode buildHtmlTag(
            String name,
            ParserRuleContext ctx,
            MiniTemplateParser.TagWithContentContext tagCtx,
            List<MiniTemplateParser.ElementContext> body) {

        Token t = ctx.getStart();
        TemplateTagWithContentNode tagContent = null;
        if(tagCtx != null){
            tagContent = (TemplateTagWithContentNode) visit(tagCtx);
        }

        List<TemplateASTNode> children = new ArrayList<>();
        for (MiniTemplateParser.ElementContext el : body) {
            if (el.getText().trim().isEmpty()) {
                continue;
            }

            TemplateASTNode child = visit(el);
            if (child != null) {
                children.add(child);
            }
        }

        return new TemplateHtmlTagNode(
                name,
                tagContent,
                children,
                t.getLine(),
                t.getCharPositionInLine()
        );
    }


    @Override
    public TemplateASTNode visitTemplateH1Tag(MiniTemplateParser.TemplateH1TagContext ctx) {
        return buildHtmlTag("h1", ctx, ctx.tagWithContent(), ctx.element());
    }


    @Override
    public TemplateASTNode visitTemplateDivTag(MiniTemplateParser.TemplateDivTagContext ctx) {
        return buildHtmlTag("div", ctx, ctx.tagWithContent(), ctx.element());
    }


    @Override
    public TemplateASTNode visitTemplateHeaderTag(MiniTemplateParser.TemplateHeaderTagContext ctx) {
        return buildHtmlTag("header", ctx, ctx.tagWithContent(), ctx.element());
    }

    @Override
    public TemplateASTNode visitTemplateMainTag(MiniTemplateParser.TemplateMainTagContext ctx) {
        return buildHtmlTag("main", ctx, ctx.tagWithContent(), ctx.element());
    }

    @Override
    public TemplateASTNode visitTemplateNavTag(MiniTemplateParser.TemplateNavTagContext ctx) {
        return buildHtmlTag("nav", ctx, ctx.tagWithContent(), ctx.element());
    }

    @Override
    public TemplateASTNode visitTemplateFooterTag(MiniTemplateParser.TemplateFooterTagContext ctx) {
        return buildHtmlTag("footer", ctx, ctx.tagWithContent(), ctx.element());
    }

    @Override
    public TemplateASTNode visitTemplateSectionTag(MiniTemplateParser.TemplateSectionTagContext ctx) {
        return buildHtmlTag("section", ctx, ctx.tagWithContent(), ctx.element());
    }

    @Override
    public TemplateASTNode visitTemplatePTag(MiniTemplateParser.TemplatePTagContext ctx) {
        return buildHtmlTag("p", ctx, ctx.tagWithContent(), ctx.element());
    }

    @Override
    public TemplateASTNode visitTemplateFormTag(MiniTemplateParser.TemplateFormTagContext ctx) {
        return buildHtmlTag("form", ctx, ctx.tagWithContent(), ctx.element());
    }

    @Override
    public TemplateASTNode visitTemplateUlTag(MiniTemplateParser.TemplateUlTagContext ctx) {
        return buildHtmlTag("ul", ctx, ctx.tagWithContent(), ctx.element());
    }

    @Override
    public TemplateASTNode visitTemplateLiTag(MiniTemplateParser.TemplateLiTagContext ctx) {
        return buildHtmlTag("li", ctx, ctx.tagWithContent(), ctx.element());
    }

    @Override
    public TemplateASTNode visitTemplateATag(MiniTemplateParser.TemplateATagContext ctx) {
        return buildHtmlTag("a", ctx, ctx.tagWithContent(), ctx.element());
    }

    @Override
    public TemplateASTNode visitTemplateInputTag(MiniTemplateParser.TemplateInputTagContext ctx) {

        Token t = ctx.getStart();

        TemplateTagWithContentNode tagContent = (TemplateTagWithContentNode) visit(ctx.tagWithContent());

        return new TemplateHtmlTagNode(
                "input",
                tagContent,
                List.of(),
                t.getLine(),
                t.getCharPositionInLine()
        );
    }

    @Override
    public TemplateASTNode visitTemplateButtonTag(MiniTemplateParser.TemplateButtonTagContext ctx) {
        return buildHtmlTag("button", ctx, ctx.tagWithContent(), ctx.element());
    }

    @Override
    public TemplateASTNode visitTemplateTagWithContent(MiniTemplateParser.TemplateTagWithContentContext ctx) {
        Token t = ctx.getStart();

        List<TemplateAttrNode> content = new ArrayList<>();
            for (MiniTemplateParser.AttrContext attrCtx: ctx.attr()) {
                content.add((TemplateAttrNode)visit(attrCtx));
            }

        return new TemplateTagWithContentNode(content, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public TemplateASTNode visitTemplateAttr(MiniTemplateParser.TemplateAttrContext ctx) {
        return new TemplateAttrNode(
                ctx.HTML_ATTR_IDENT().getText(),
                (AttrValueNode) visit(ctx.quotedValue()),
                ctx.start.getLine(),
                ctx.start.getCharPositionInLine()
        );
    }

    @Override
    public TemplateASTNode visitTemplateQuotedDouble(MiniTemplateParser.TemplateQuotedDoubleContext ctx) {
        Token t = ctx.getStart();

        List<QuotedItemNode> items = new ArrayList<>();
        for (MiniTemplateParser.QuotedItemContext itemCtx : ctx.quotedItem()) {
            items.add((QuotedItemNode) visit(itemCtx));
        }

        return new AttrValueNode(t.getLine(), t.getCharPositionInLine(), items);
    }


    @Override
    public TemplateASTNode visitTemplateQuotedSingle(MiniTemplateParser.TemplateQuotedSingleContext ctx) {
        Token t = ctx.getStart();

        List<QuotedItemNode> items = new ArrayList<>();
        for (MiniTemplateParser.QuotedItemContext itemCtx : ctx.quotedItem()) {
            items.add((QuotedItemNode) visit(itemCtx));
        }

        return new AttrValueNode(t.getLine(), t.getCharPositionInLine(), items);
    }

    @Override
    public TemplateASTNode visitTemplateQuotedText(MiniTemplateParser.TemplateQuotedTextContext ctx) {

        return new AttrTextNode(
                ctx.HTML_ATTR_VALUE_TEXT().getText(),
                ctx.start.getLine(),
                ctx.start.getCharPositionInLine()
        );
    }

    @Override
    public TemplateASTNode visitTemplateQuotedJinjaVar(MiniTemplateParser.TemplateQuotedJinjaVarContext ctx) {
        return new AttrJinjaVarNode((TemplateJinjaVarNode) visit(ctx.jinjaVar()));
    }

    @Override
    public TemplateASTNode visitTemplateQuotedJinjaBlock(MiniTemplateParser.TemplateQuotedJinjaBlockContext ctx) {
        return new AttrJinjaBlockNode((TemplateJinjaBlockNode) visit(ctx.jinjaBlock())
        );
    }


    // EXPRESSION

    @Override
    public TemplateASTNode visitFlaskEqualityExpr(MiniTemplateParser.FlaskEqualityExprContext ctx) {
        TemplateExpr left = (TemplateExpr) visit(ctx.additive(0));

        if (ctx.JINJA_EQEQ() != null) {
            TemplateExpr right = (TemplateExpr) visit(ctx.additive(1));
            Token t = ctx.getStart();
            return new TemplateBinaryExpr(left, "==", right, t.getLine(), t.getCharPositionInLine());
        }

        return left;
    }

    @Override
    public TemplateASTNode visitFlaskAdditiveExpr(MiniTemplateParser.FlaskAdditiveExprContext ctx) {
        TemplateExpr left = (TemplateExpr) visit(ctx.primary(0));

        for (int i = 1; i < ctx.primary().size(); i++) {
            TemplateExpr right = (TemplateExpr) visit(ctx.primary(i));

            Token plusToken = (Token) ctx.getChild(2 * i - 1).getPayload();

            left = new TemplateBinaryExpr(left, "+", right, plusToken.getLine(), plusToken.getCharPositionInLine());
        }

        return left;
    }

    @Override
    public TemplateASTNode visitFlaskPrimaryExpr(MiniTemplateParser.FlaskPrimaryExprContext ctx) {
        TemplateExpr base = (TemplateExpr) visit(ctx.atom());

        List<TemplateExpr> suffixes = ctx.suffix().stream().map(suf -> (TemplateExpr) visit(suf)).toList();

        Token t = ctx.getStart();
        return new TemplatePrimaryExpr(base, suffixes, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public TemplateASTNode visitFlaskAttrAccess(MiniTemplateParser.FlaskAttrAccessContext ctx) {
        String attrName = ctx.JINJA_IDENT().getText();
        Token t = ctx.getStart();
        return new TemplateAttrAccessExpr(attrName, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public TemplateASTNode visitFlaskIndexing(MiniTemplateParser.FlaskIndexingContext ctx) {
        TemplateExpr index = (TemplateExpr) visit(ctx.expr());

        Token t = ctx.getStart();

        return new TemplateIndexExpr(index, t.getLine(), t.getCharPositionInLine());
    }


    @Override
    public TemplateASTNode visitFlaskCallSuffix(MiniTemplateParser.FlaskCallSuffixContext ctx) {
        List<TemplateArgKw> argKws = new ArrayList<>();

        if (ctx.routeArgKws() != null) {
            TemplateArgs argsNode = (TemplateArgs) visit(ctx.routeArgKws());
            argKws.addAll(argsNode.templateArgKws);
        }

        Token t = ctx.getStart();
        return new TemplateCallExpr(argKws, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public TemplateASTNode visitFlaskArgsList(MiniTemplateParser.FlaskArgsListContext ctx) {
        List<TemplateArgKw> argKws = new ArrayList<>();

        for (MiniTemplateParser.ArgContext aCtx : ctx.arg()) {
            argKws.add((TemplateArgKw) visit(aCtx));
        }
        Token t = ctx.getStart();
        return new TemplateArgs(argKws, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public TemplateASTNode visitFlaskKwArg(MiniTemplateParser.FlaskKwArgContext ctx) {
        String name = ctx.JINJA_IDENT().getText();
        TemplateExpr value = (TemplateExpr) visit(ctx.expr());
        Token t = ctx.getStart();
        return new TemplateArgKw(name, value, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public TemplateASTNode visitFlaskPosArg(MiniTemplateParser.FlaskPosArgContext ctx) {
        TemplateExpr value = (TemplateExpr) visit(ctx.expr());
        Token t = ctx.getStart();
        return new TemplateArgKw(null, value, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public TemplateASTNode visitFlaskGeneratorExpr(MiniTemplateParser.FlaskGeneratorExprContext ctx) {

        templateSymbolTable.enterScope("generator");
        System.out.println("Entered generator scope: " + templateSymbolTable.getCurrentScope().getName());

        String var = ctx.JINJA_IDENT(1).getText();
        Token t = ctx.getStart();
        TemplateSymbol symbol = new TemplateSymbol(var, TemplateSymbolKind.VARIABLE, null, t.getLine(), t.getCharPositionInLine());
        templateSymbolTable.define(symbol);

        System.out.println("Defined generator variable '" + var + "' in scope '" +
                templateSymbolTable.getCurrentScope().getName() + "'. Current symbols: " +
                templateSymbolTable.getCurrentScope().getSymbols().keySet());


        TemplateExpr element = (TemplateExpr) visit(ctx.expr(0));
        TemplateExpr iterable = (TemplateExpr) visit(ctx.expr(1));
        TemplateExpr condition = ctx.expr().size() > 2 ? (TemplateExpr) visit(ctx.expr(2)) : null;

        TemplateGenExpr genExpr = new TemplateGenExpr(element, var, iterable, condition, t.getLine(), t.getCharPositionInLine());


        templateSymbolTable.exitScope();
        System.out.println("Exited generator scope, back to: " + templateSymbolTable.getCurrentScope().getName());

        return genExpr;
    }


    @Override
    public TemplateASTNode visitFlaskAtomName(MiniTemplateParser.FlaskAtomNameContext ctx) {
        String name = ctx.JINJA_IDENT().getText();
        Token t = ctx.getStart();

        TemplateSymbol symbol = templateSymbolTable.resolve(name);

        if (symbol == null) {
            throw new RuntimeException(
                    "Undefined variable '" + name + "' at line " +
                            t.getLine() + ", column " + t.getCharPositionInLine()
            );
        }

        System.out.println("Resolved variable '" + name + "' in scope '" +
                templateSymbolTable.getCurrentScope().getName() + "'. Symbol info: " + symbol);

        return new TemplateNameExpr(name, t.getLine(), t.getCharPositionInLine());
    }


    @Override
    public TemplateASTNode visitFlaskAtomString(MiniTemplateParser.FlaskAtomStringContext ctx) {
        Token t = ctx.getStart();
        return new TemplateLiteralExpr(ctx.JINJA_STRING().getText(), t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public TemplateASTNode visitFlaskAtomNumber(MiniTemplateParser.FlaskAtomNumberContext ctx) {
        Token t = ctx.getStart();
        return new TemplateLiteralExpr(ctx.JINJA_NUMBER().getText(), t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public TemplateASTNode visitFlskAtomApp(MiniTemplateParser.FlskAtomAppContext ctx) {
        Token t = ctx.getStart();
        return new TemplateAppExpr(t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public TemplateASTNode visitFlaskAtomNone(MiniTemplateParser.FlaskAtomNoneContext ctx) {
        Token t = ctx.getStart();
        return new TemplateNoneExpr(t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public TemplateASTNode visitFlaskAtomTrue(MiniTemplateParser.FlaskAtomTrueContext ctx) {
        Token t = ctx.getStart();
        return new TemplateBoolExpr(true, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public TemplateASTNode visitFlaskAtomFalse(MiniTemplateParser.FlaskAtomFalseContext ctx) {
        Token t = ctx.getStart();
        return new TemplateBoolExpr(false, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public TemplateASTNode visitFlaskAtomList(MiniTemplateParser.FlaskAtomListContext ctx) {
        return visit(ctx.listLiteral());
    }

    @Override
    public TemplateASTNode visitFlaskAtomDict(MiniTemplateParser.FlaskAtomDictContext ctx) {
        TemplateDictPairs pairsNode = (TemplateDictPairs) visit(ctx.dictLiteral());

        Token t = ctx.getStart();
        return new TemplateDictExpr(pairsNode.pairs, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public TemplateASTNode visitFlaskAtomGenExpr(MiniTemplateParser.FlaskAtomGenExprContext ctx) {
        return visit(ctx.genExpr());
    }

    @Override
    public TemplateASTNode visitFlaskListLiteral(MiniTemplateParser.FlaskListLiteralContext ctx) {
        List<TemplateExpr> elements = new ArrayList<>();

        for (MiniTemplateParser.ExprContext eCtx : ctx.expr()) {
            elements.add((TemplateExpr) visit(eCtx));
        }

        Token t = ctx.getStart();
        return new TemplateListExpr(elements, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public TemplateASTNode visitFlaskDictLiteral(MiniTemplateParser.FlaskDictLiteralContext ctx) {
        List<TemplateDictPair> pairs = new ArrayList<>();

        for (MiniTemplateParser.PairContext pCtx : ctx.pair()) {
            pairs.add((TemplateDictPair) visit(pCtx));
        }

        Token t = ctx.getStart();
        return new TemplateDictPairs(pairs, t.getLine(), t.getCharPositionInLine());
    }

    @Override
    public TemplateASTNode visitFlaskDictPair(MiniTemplateParser.FlaskDictPairContext ctx) {
        String key;

        if (ctx.JINJA_STRING() != null) {
            key = ctx.JINJA_STRING().getText();
        } else {
            key = ctx.JINJA_IDENT().getText();
        }

        TemplateExpr value = (TemplateExpr) visit(ctx.expr());
        return new TemplateDictPair(key, value);
    }

    @Override
    public TemplateASTNode visitTemplateStyleTag(MiniTemplateParser.TemplateStyleTagContext ctx) {

        CssRulesNode rules = (CssRulesNode) visit(ctx.cssRules());

        return new TemplateStyleTagNode(
                rules,
                ctx.start.getLine(),
                ctx.start.getCharPositionInLine()
        );
    }

    @Override
    public TemplateASTNode visitTemplateCssRules(MiniTemplateParser.TemplateCssRulesContext ctx) {

        CssRulesNode rules = new CssRulesNode(ctx.start.getLine(), ctx.start.getCharPositionInLine());

        for (MiniTemplateParser.CssRuleContext ruleCtx : ctx.cssRule()) {
            rules.rules.add((CssRuleNode) visit(ruleCtx));
        }

        return rules;
    }

    @Override
    public TemplateASTNode visitTemplateCssRule(MiniTemplateParser.TemplateCssRuleContext ctx) {

        return new CssRuleNode(
                (CssSelectorListNode) visit(ctx.cssSelectorList()),
                (CssDeclarationListNode) visit(ctx.cssDeclarationList()),
                ctx.start.getLine(),
                ctx.start.getCharPositionInLine()
        );
    }

    @Override
    public TemplateASTNode visitTemplateCssDeclarationList(MiniTemplateParser.TemplateCssDeclarationListContext ctx) {

        CssDeclarationListNode list = new CssDeclarationListNode(ctx.start.getLine(), ctx.start.getCharPositionInLine());

        for (MiniTemplateParser.CssDeclarationContext d : ctx.cssDeclaration()) {
            list.declarations.add((CssDeclarationNode) visit(d));
        }

        return list;
    }

    @Override
    public TemplateASTNode visitTemplateCssDeclaration(MiniTemplateParser.TemplateCssDeclarationContext ctx) {

        CssDeclarationNode decl = new CssDeclarationNode(
                        ctx.cssProperty().getText(),
                        ctx.start.getLine(),
                        ctx.start.getCharPositionInLine()
                );

        for (MiniTemplateParser.CssValueContext v : ctx.cssValue()) {
            decl.values.add((CssValueNode) visit(v));
        }

        return decl;
    }

    @Override
    public TemplateASTNode visitTemplateCssNumber(MiniTemplateParser.TemplateCssNumberContext ctx) {
        return new CssNumberNode(ctx.getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public TemplateASTNode visitTemplateCssIdent(MiniTemplateParser.TemplateCssIdentContext ctx) {
        return new CssIdentNode(ctx.getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public TemplateASTNode visitTemplateCssString(MiniTemplateParser.TemplateCssStringContext ctx) {
        return new CssStringNode(ctx.getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public TemplateASTNode visitTemplateCssColor(MiniTemplateParser.TemplateCssColorContext ctx) {
        return new CssColorNode(ctx.getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public TemplateASTNode visitTemplateCssJinjaVar(MiniTemplateParser.TemplateCssJinjaVarContext ctx) {

        return new CssJinjaVarNode(
                visit(ctx.jinjaVar()),
                ctx.start.getLine(),
                ctx.start.getCharPositionInLine()
        );
    }

    @Override
    public TemplateASTNode visitCssFunction(MiniTemplateParser.CssFunctionContext ctx) {

        CssFunctionNode fn = new CssFunctionNode(
                        ctx.CSS_VALUE_IDENT().getText(),
                        ctx.start.getLine(),
                        ctx.start.getCharPositionInLine()
                );

        for (MiniTemplateParser.CssValueContext v : ctx.cssValue()) {
            fn.args.add((CssValueNode) visit(v));
        }

        return fn;
    }

    @Override
    public TemplateASTNode visitTemplateCssSelectorList(MiniTemplateParser.TemplateCssSelectorListContext ctx) {

        CssSelectorListNode list = new CssSelectorListNode(ctx.start.getLine(), ctx.start.getCharPositionInLine());

        for (MiniTemplateParser.CssSelectorContext s : ctx.cssSelector()) {
            list.selectors.add((CssSelectorNode) visit(s));
        }

        return list;
    }

    @Override
    public TemplateASTNode visitTemplateCssSelector(MiniTemplateParser.TemplateCssSelectorContext ctx) {

        CssSelectorNode selector = new CssSelectorNode(
                        ctx.start.getLine(),
                        ctx.start.getCharPositionInLine()
                );

        selector.units = new ArrayList<>(); // IMPORTANT if not final

        selector.units.add((SelectorUnitNode) visit(ctx.selectorUnit(0)));

        for (int i = 1; i < ctx.selectorUnit().size(); i++) {
            selector.units.add((SelectorUnitNode) visit(ctx.selectorUnit(i)));
        }

        return selector;
    }

    @Override
    public TemplateASTNode visitTemplateSelectorUnit(
            MiniTemplateParser.TemplateSelectorUnitContext ctx) {

        SelectorUnitNode unit =
                new SelectorUnitNode(
                        ctx.start.getLine(),
                        ctx.start.getCharPositionInLine()
                );

        // base selector part
        unit.parts.add(visit(ctx.baseSelectorPart()));

        // suffix parts
        for (ParseTree child : ctx.children.subList(1, ctx.children.size())) {
            TemplateASTNode part = visit(child);
            if (part != null) {
                unit.parts.add(part);
            }
        }

        return unit;
    }

    @Override
    public TemplateASTNode visitTemplateBaseSelectorTag(MiniTemplateParser.TemplateBaseSelectorTagContext ctx) {
        return new CssTagSelectorNode(ctx.getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public TemplateASTNode visitTemplateBaseSelectorIdent(MiniTemplateParser.TemplateBaseSelectorIdentContext ctx) {
        return new CssIdentSelectorNode(ctx.getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public TemplateASTNode visitTemplateBaseSelectorStar(MiniTemplateParser.TemplateBaseSelectorStarContext ctx) {
        return new CssStarSelectorNode(ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public TemplateASTNode visitTemplateBaseSelectorClass(MiniTemplateParser.TemplateBaseSelectorClassContext ctx) {
        return visit(ctx.classPart());
    }

    @Override
    public TemplateASTNode visitTemplateBaseSelectorId(MiniTemplateParser.TemplateBaseSelectorIdContext ctx) {
        return visit(ctx.idPart());
    }

    @Override
    public TemplateASTNode visitTemplateClassPart(MiniTemplateParser.TemplateClassPartContext ctx) {

        return new CssClassSelectorNode(
                ctx.CSS_IDENT().getText(),
                ctx.start.getLine(),
                ctx.start.getCharPositionInLine()
        );
    }

    @Override
    public TemplateASTNode visitTemplateIdPart(MiniTemplateParser.TemplateIdPartContext ctx) {

        return new CssIdSelectorNode(
                ctx.CSS_IDENT().getText(),
                ctx.start.getLine(),
                ctx.start.getCharPositionInLine()
        );
    }

    @Override
    public TemplateASTNode visitPseudoClassNode(MiniTemplateParser.PseudoClassNodeContext ctx) {

        return new CssPseudoClassNode(
                ctx.CSS_IDENT().getText(),
                ctx.pseudoArgs() != null ? visit(ctx.pseudoArgs()) : null,
                ctx.start.getLine(),
                ctx.start.getCharPositionInLine()
        );
    }

    @Override
    public TemplateASTNode visitTemplatePseudoElementExpr(MiniTemplateParser.TemplatePseudoElementExprContext ctx) {

        return new CssPseudoElementNode(
                ctx.CSS_IDENT().getText(),
                ctx.start.getLine(),
                ctx.start.getCharPositionInLine()
        );
    }


}
