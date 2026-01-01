package ast.template.css;

import ast.template.TemplateASTNode;

import java.util.ArrayList;
import java.util.List;

public class TemplateCssDeclarationListNode extends TemplateASTNode {
    public final List<TemplateCssDeclarationNode> declarations = new ArrayList<>();

    public TemplateCssDeclarationListNode(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "\nTemplateCssDeclarationListNode{ " +
                line + ":" + column +
                ", declarations=" + declarations +
                '}';
    }
}
