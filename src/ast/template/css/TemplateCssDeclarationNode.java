package ast.template.css;

import ast.template.TemplateASTNode;

import java.util.ArrayList;
import java.util.List;

public class TemplateCssDeclarationNode extends TemplateASTNode {
    public final String property;
    public final List<TemplateCssValueNode> values = new ArrayList<>();

    public TemplateCssDeclarationNode(String property, int line, int column) {
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
