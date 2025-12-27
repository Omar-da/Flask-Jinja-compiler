package ast.template;

public class TemplateStyleNodeFlask extends TemplateElementNodeFlask {
    public TemplateStyleNodeFlask() { super(); }
    public TemplateStyleNodeFlask(int line, int column) { super(line, column); }

    @Override
    public String toString() {
        return "TemplateStyleNode{" +
                "line=" + line +
                ", column=" + column +
                '}';
    }
}
