package ast.template;

/**
 * CSS value: number, string, color, variable, or function
 */
public class TemplateCssValueNodeTemplate extends TemplateASTNode {
    public final String value;
    public final String unit; // optional
    public final boolean isJinjaVar;

    public TemplateCssValueNodeTemplate(String value, String unit, boolean isJinjaVar) { super(); this.value = value; this.unit = unit; this.isJinjaVar = isJinjaVar; }
    public TemplateCssValueNodeTemplate(String value, String unit, boolean isJinjaVar, int line, int column) { super(line, column); this.value = value; this.unit = unit; this.isJinjaVar = isJinjaVar; }

    @Override
    public String toString() {
        return "TemplateCssValueNode{" +
                "value='" + value + '\'' +
                ", unit='" + unit + '\'' +
                ", isJinjaVar=" + isJinjaVar +
                ", line=" + line +
                ", column=" + column +
                ", children=" + children +
                '}';
    }
}
