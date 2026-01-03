package ast.template.css.declaration;

import ast.template.TemplateASTNode;

public abstract class CssValueNode extends TemplateASTNode {
    protected CssValueNode(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "\nTemplateCssValueNode{ " +
                line + ":" + column +
                '}';
    }
}
