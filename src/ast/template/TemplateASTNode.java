package ast.template;

import ast.flask.FlaskASTNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Base AST node class with optional line/column info and children.
 */
public class TemplateASTNode {
    public final int line;
    public final int column;
    public final List<TemplateASTNode> children = new ArrayList<>();

    public TemplateASTNode() {
        this(-1, -1);
    }

    public TemplateASTNode(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public List<TemplateASTNode> getChildren() {
        return children;
    }

    public void addChild(TemplateASTNode child) {
        if (child != null) children.add(child);
    }

    @Override
    public String toString() {
        return  "ASTNode{ " +
                line + ":" + column +
                ", children=" + children +
                '}';
    }

}
