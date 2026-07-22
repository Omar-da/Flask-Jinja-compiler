package ast.template.css.declaration;

import java.util.ArrayList;
import java.util.List;

import ast.template.TemplateASTNode;

public class CssDeclarationListNode extends TemplateASTNode {
    public final List<CssDeclarationNode> declarations = new ArrayList<>();

    public CssDeclarationListNode(int line, int column) {
        super(line, column);
        addChildrenFrom(declarations);
    }

    @Override
    public String toString() {
        return "";
    }
}
