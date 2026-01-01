package ast.template.css;

import ast.template.TemplateASTNode;

public abstract class TemplateCssValueNode extends TemplateASTNode {
    protected TemplateCssValueNode(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "\nTemplateCssValueNode{ " +
                line + ":" + column +
                '}';
    }
}
