package ast.template;

public class TemplateTextNodeFlask extends TemplateElementNodeFlask {
    public final String text;

    public TemplateTextNodeFlask(String text) { super(); this.text = text; }
    public TemplateTextNodeFlask(String text, int line, int column) { super(line, column); this.text = text; }

    @Override
    public String toString() {
        return "TemplateTextNode{" +
                "text='" + text + '\'' +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}
