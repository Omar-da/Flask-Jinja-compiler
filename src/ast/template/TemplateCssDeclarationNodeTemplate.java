package ast.template;

public class TemplateCssDeclarationNodeTemplate extends TemplateASTNode {
    public final String property;
    public final TemplateCssValueNodeTemplate value;

    public TemplateCssDeclarationNodeTemplate(String property, TemplateCssValueNodeTemplate value) { super(); this.property = property; this.value = value; }
    public TemplateCssDeclarationNodeTemplate(String property, TemplateCssValueNodeTemplate value, int line, int column) { super(line, column); this.property = property; this.value = value; }

    @Override
    public String toString() {
        return "TemplateCssDeclarationNode{" +
                "property='" + property + '\'' +
                ", value=" + value +
                ", line=" + line +
                ", column=" + column +
                ", children=" + children +
                '}';
    }
}
