package ast.template;

public class TemplateTextNode extends TemplateElementNode {
    public final String text;

    public TemplateTextNode(String text, int line, int column) { super(line, column); this.text = text; }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return String.valueOf(text);
    }
}
