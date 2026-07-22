package ast.template.css.selector;

import java.util.ArrayList;
import java.util.List;

import ast.template.TemplateASTNode;

public class CssSelectorListNode extends TemplateASTNode {
    public final List<CssSelectorNode> selectors = new ArrayList<>();

    public CssSelectorListNode(int line, int column) {
        super(line, column);
        addChildrenFrom(selectors);
     }

    @Override
    public String toString() {
        return "";
    }
}
