package ast.template.css.selector;

import ast.template.TemplateASTNode;

public class CssTagSelectorNode extends TemplateASTNode {

    public final String tagName;

    public CssTagSelectorNode(String tagName, int line, int column) {
        super(line, column);
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return "\nCssTagSelectorNode{ " +
                line + ":" + column +
                ", tagName='" + tagName + '\'' +
                '}';
    }
}
