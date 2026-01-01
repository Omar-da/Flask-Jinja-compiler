package ast.template;

public class TemplateStyleNodeFlask extends TemplateElementNode {
    public TemplateStyleNodeFlask() { super(); }
    public TemplateStyleNodeFlask(int line, int column) { super(line, column); }

    @Override
    public String toString() {
        return "\nTemplateStyleNode{ " +
                line + ":" + column +
                '}';
    }
}
