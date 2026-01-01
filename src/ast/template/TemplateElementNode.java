package ast.template;

import ast.flask.FlaskASTNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Base class for template elements (HTML tags, text, style, Jinja)
 */
public class TemplateElementNode extends TemplateASTNode {

    public final List<TemplateASTNode> children = new ArrayList<>();

    public TemplateElementNode() {
        super();
    }

    public TemplateElementNode(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (TemplateASTNode child : children) {
            sb.append(child).append("\n");
        }
        return sb.toString().trim();
    }
}
