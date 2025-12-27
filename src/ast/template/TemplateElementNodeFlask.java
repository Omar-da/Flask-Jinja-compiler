package ast.template;

import ast.flask.FlaskASTNode;

/**
 * Base class for template elements (HTML tags, text, style, Jinja)
 */
public class TemplateElementNodeFlask extends FlaskASTNode {
    public TemplateElementNodeFlask() { super(); }
    public TemplateElementNodeFlask(int line, int column) { super(line, column); }

    @Override
    public String toString() {
        return "TemplateElementNode{" +
                "line=" + line +
                ", column=" + column +
                '}';
    }
}
