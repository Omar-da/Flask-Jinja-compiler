package ast.template.css.selector;

import ast.template.TemplateASTNode;

import java.util.ArrayList;
import java.util.List;

public class CssSelectorListNode extends TemplateASTNode {
    public final List<CssSelectorNode> selectors = new ArrayList<>();
    public CssSelectorListNode(int line, int column) { super(line,column); }

    @Override
    public String toString() {
        return "\nTemplateCssSelectorListNode{ " +
                line + ":" + column +
                ", selectors=" + selectors +
                '}';
    }
}
