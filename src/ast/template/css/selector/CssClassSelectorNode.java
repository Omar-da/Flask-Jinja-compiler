package ast.template.css.selector;

import ast.template.TemplateASTNode;

public class CssClassSelectorNode extends TemplateASTNode {

    public final String className;

    public CssClassSelectorNode(String className, int line, int column) {
        super(line, column);
        this.className = className;
    }

    @Override
    public String toString() {
        return String.valueOf(className);
    }
}
