package ast.template.css.selector;

import ast.template.TemplateASTNode;

public class CssPseudoClassNode extends TemplateASTNode {

    public final String name;
    public final TemplateASTNode args; // may be null

    public CssPseudoClassNode(String name, TemplateASTNode args, int line, int column) {
        super(line, column);
        this.name = name;
        this.args = args;
    }

    @Override
    public String toString() {
        return "\nCssPseudoClassNode{ " +
                line + ":" + column +
                ", name='" + name + '\'' +
                ", args=" + args +
                '}';
    }
}
