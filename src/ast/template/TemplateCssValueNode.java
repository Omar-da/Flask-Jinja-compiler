package ast.template;

/**
 * CSS value: number, string, color, variable, or function
 */
public class TemplateCssValueNode extends ASTNode {
    public final String value;
    public final String unit; // optional
    public final boolean isJinjaVar;

    public TemplateCssValueNode(String value, String unit, boolean isJinjaVar) { super(); this.value = value; this.unit = unit; this.isJinjaVar = isJinjaVar; }
    public TemplateCssValueNode(String value, String unit, boolean isJinjaVar, int line, int column) { super(line, column); this.value = value; this.unit = unit; this.isJinjaVar = isJinjaVar; }
}
