package ast.template.css;

public class CssNumberNode extends TemplateCssValueNode {
    public final String text;
    public CssNumberNode(String text, int line, int column) { super(line,column); this.text = text; }

    @Override
    public String toString() {
        return "\nCssNumberNode{ " +
                line + ":" + column +
                ", text='" + text + '\'' +
                '}';
    }
}
