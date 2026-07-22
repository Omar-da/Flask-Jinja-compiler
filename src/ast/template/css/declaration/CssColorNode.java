package ast.template.css.declaration;

public class CssColorNode extends CssValueNode {
    public final String text;
    public CssColorNode(String text, int line, int column) { super(line,column); this.text = text; }

    @Override
    public String toString() {
        return String.valueOf(text);
    }
}