package ast.template.css.selector;

import ast.template.TemplateASTNode;

import java.util.ArrayList;
import java.util.List;

public class TemplateCssSelectorNode extends TemplateASTNode {
    public List<TemplateSelectorUnitNode> units = new ArrayList();
    public TemplateCssSelectorNode(int line, int column) { super(line,column); }

    @Override
    public String toString() {
        return "\nTemplateCssSelectorNode{ " +
                line + ":" + column +
                ", units=" + units +
                '}';
    }
}
