package ast.template;

import ast.flask.ASTNode;

/**
 * Base class for template elements (HTML tags, text, style, Jinja)
 */
public class TemplateElementNode extends ASTNode {
    public TemplateElementNode() { super(); }
    public TemplateElementNode(int line, int column) { super(line, column); }
}
