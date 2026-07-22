package ast.template.css.selector;

import ast.template.TemplateASTNode;

public class CssPseudoElementNode extends TemplateASTNode {

    public final String name;

    public CssPseudoElementNode(String name, int line, int column) {
        super(line, column);
        this.name = name;
    }

    @Override
    public String toString() {
        return String.valueOf(name);
    }
}
