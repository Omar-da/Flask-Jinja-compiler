package ast.template.css.declaration;

import ast.template.TemplateASTNode;

import java.util.ArrayList;
import java.util.List;

public class CssDeclarationListNode extends TemplateASTNode {
    public final List<CssDeclarationNode> declarations = new ArrayList<>();

    public CssDeclarationListNode(int line, int column) {
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
