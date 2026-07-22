package ast.template.css.selector;

import ast.template.TemplateASTNode;

public class CssIdSelectorNode extends TemplateASTNode {

    public final String id;

    public CssIdSelectorNode(String id, int line, int column) {
        super(line, column);
        this.id = id;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
