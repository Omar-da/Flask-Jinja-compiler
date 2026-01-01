package ast.template.css.selector;

import ast.template.TemplateASTNode;

public class CssPseudoAtomNode extends TemplateASTNode {

    public final String text;

    public CssPseudoAtomNode(String text, int line, int column) {
        super(line, column);
        this.text = text;
    }

    @Override
    public String toString() {
        return "\nCssPseudoAtomNode{ " +
                line + ":" + column +
                ", text='" + text + '\'' +
                '}';
    }
}
