package ast.template.css.declaration;

import java.util.ArrayList;
import java.util.List;

import ast.template.TemplateASTNode;

public class CssDeclarationNode extends TemplateASTNode {
    public final String property;
    public final List<CssValueNode> values = new ArrayList<>();

    public CssDeclarationNode(String property, int line, int column) {
        super(line, column);
        this.property = property;
        addChildrenFrom(values);
    }

    @Override
    public String toString() {
        return String.valueOf(property);
    }
}
