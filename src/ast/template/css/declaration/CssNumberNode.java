package ast.template.css.declaration;

public class CssNumberNode extends CssValueNode {
    public final String text;
    public CssNumberNode(String text, int line, int column) { super(line,column); this.text = text; }

    @Override
    public String toString() {
        return String.valueOf(text);
    }
}
