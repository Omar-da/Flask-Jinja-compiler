package ast.template;

public class TemplateCssDeclarationNode extends ASTNode {
    public final String property;
    public final TemplateCssValueNode value;

    public TemplateCssDeclarationNode(String property, TemplateCssValueNode value) { super(); this.property = property; this.value = value; }
    public TemplateCssDeclarationNode(String property, TemplateCssValueNode value, int line, int column) { super(line, column); this.property = property; this.value = value; }
}
