package ast.template.css.selector;

import ast.template.TemplateASTNode;

public class CssPseudoArgsNode extends TemplateASTNode {

    public final CssPseudoExprNode expr;

    public CssPseudoArgsNode(CssPseudoExprNode expr, int line, int column) {
        super(line, column);
        this.expr = expr;
    }

    @Override
    public String toString() {
        return String.valueOf(expr);
    }
}
