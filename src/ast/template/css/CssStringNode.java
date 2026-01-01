package ast.template.css;

public class CssStringNode extends TemplateCssValueNode {
    public final String text;
    public CssStringNode(String text, int line, int column) { super(line,column); this.text = text; }

    @Override
    public String toString() {
        return "\nCssStringNode{ " +
                line + ":" + column +
                ", text='" + text + '\'' +
                '}';
    }
}