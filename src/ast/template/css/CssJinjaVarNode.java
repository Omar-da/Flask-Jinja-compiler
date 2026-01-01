package ast.template.css;

import ast.template.TemplateASTNode;

public class CssJinjaVarNode extends TemplateCssValueNode {
    public final TemplateASTNode expr;
    public CssJinjaVarNode(TemplateASTNode expr, int line, int column) { super(line,column); this.expr = expr; }

    @Override
    public String toString() {
        return "\nCssJinjaVarNode{ " +
                line + ":" + column +
                ", expr=" + expr +
                '}';
    }
}