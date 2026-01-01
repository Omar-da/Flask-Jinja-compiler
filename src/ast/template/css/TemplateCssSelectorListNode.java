package ast.template.css;

import ast.template.TemplateASTNode;
import ast.template.css.selector.TemplateCssSelectorNode;

import java.util.ArrayList;
import java.util.List;

public class TemplateCssSelectorListNode extends TemplateASTNode {
    public final List<TemplateCssSelectorNode> selectors = new ArrayList<>();
    public TemplateCssSelectorListNode(int line, int column) { super(line,column); }

    @Override
    public String toString() {
        return "\nTemplateCssSelectorListNode{ " +
                line + ":" + column +
                ", selectors=" + selectors +
                '}';
    }
}
