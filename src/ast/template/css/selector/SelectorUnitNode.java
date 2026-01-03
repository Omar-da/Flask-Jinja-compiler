package ast.template.css.selector;

import ast.template.TemplateASTNode;

import java.util.ArrayList;
import java.util.List;

public class SelectorUnitNode extends TemplateASTNode {
    public final List<TemplateASTNode> parts = new ArrayList<>();
    public SelectorUnitNode(int line, int column) { super(line,column); }

    @Override
    public String toString() {
        return "\nTemplateSelectorUnitNode{ " +
                line + ":" + column +
                ", parts=" + parts +
                '}';
    }
}
