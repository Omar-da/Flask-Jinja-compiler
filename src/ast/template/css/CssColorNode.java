package ast.template.css;

public class CssColorNode extends TemplateCssValueNode {
    public final String text;
    public CssColorNode(String text, int line, int column) { super(line,column); this.text = text; }

    @Override
    public String toString() {
        return "\nCssColorNode{ " +
                line + ":" + column +
                ", text='" + text + '\'' +
                '}';
    }
}