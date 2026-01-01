package ast.template.css.selector;

import ast.template.TemplateASTNode;
import java.util.ArrayList;
import java.util.List;

public class CssPseudoExprNode extends TemplateASTNode {

    public final List<TemplateASTNode> atoms = new ArrayList<>();

    public CssPseudoExprNode(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "\nCssPseudoExprNode{ " +
                line + ":" + column +
                ", atoms=" + atoms +
                '}';
    }
}
