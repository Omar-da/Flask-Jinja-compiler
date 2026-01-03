package ast.template.css.selector;

import ast.template.TemplateASTNode;

import java.util.ArrayList;
import java.util.List;

public class CssSelectorNode extends TemplateASTNode {
    public List<SelectorUnitNode> units = new ArrayList();
    public CssSelectorNode(int line, int column) { super(line,column); }

    @Override
    public String toString() {
        return "\nTemplateCssSelectorNode{ " +
                line + ":" + column +
                ", units=" + units +
                '}';
    }
}
