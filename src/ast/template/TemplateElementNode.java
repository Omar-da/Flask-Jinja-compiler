package ast.template;

/**
 * Base class for template elements (HTML tags, text, style, Jinja)
 */
public class TemplateElementNode extends TemplateASTNode {

    public TemplateElementNode() {
        super();
    }

    public TemplateElementNode(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "";
    }
}
