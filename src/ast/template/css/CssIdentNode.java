package ast.template.css;

public class CssIdentNode extends TemplateCssValueNode {
    public final String text;
    public CssIdentNode(String text, int line, int column) { super(line,column); this.text = text; }

    @Override
    public String toString() {
        return "\nCssIdentNode{ " +
                line + ":" + column +
                ", text='" + text + '\'' +
                '}';
    }
}