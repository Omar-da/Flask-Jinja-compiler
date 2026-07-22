package ast.template.css.selector;

import java.util.ArrayList;
import java.util.List;

import ast.template.TemplateASTNode;

public class CssSelectorNode extends TemplateASTNode {
    public List<SelectorUnitNode> units = new ArrayList();

    public CssSelectorNode(int line, int column) {
        super(line, column);
        addChildrenFrom(units);
    }

    @Override
    public String toString() {
        return "";
    }
}
