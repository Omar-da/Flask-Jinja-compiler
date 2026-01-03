package ast.template.css.declaration;

import ast.template.TemplateASTNode;

import java.util.ArrayList;
import java.util.List;

public class CssDeclarationNode extends TemplateASTNode {
    public final String property;
    public final List<CssValueNode> values = new ArrayList<>();

    public CssDeclarationNode(String property, int line, int column) {
        super(line, column);
        this.property = property;
    }

    @Override
    public String toString() {
        return "\nTemplateCssDeclarationNode{ " +
                line + ":" + column +
                ", property='" + property + '\'' +
                ", values=" + values +
                '}';
    }
}
