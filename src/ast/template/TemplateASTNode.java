package ast.template;

import java.util.ArrayList;
import java.util.List;

/**
 * Base AST node class with optional line/column info and children.
 */
public abstract class TemplateASTNode {
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

    public void addChildren(TemplateASTNode... nodes) {
        if (nodes == null) {
            return;
        }

        for (TemplateASTNode child : nodes) {
            addChild(child);
        }
    }

    public void addChildren(Iterable<? extends TemplateASTNode> nodes) {
        if (nodes == null) {
            return;
        }

        for (TemplateASTNode node : nodes) {
            addChild(node);
        }
    }

    public void addChildrenFrom(Object... values) {
        if (values == null) {
            return;
        }

        for (Object value : values) {
            addChildrenObject(value);
        }
    }

    private void addChildrenObject(Object value) {
        if (value == null) {
            return;
        }

        if (value instanceof TemplateASTNode) {
            addChild((TemplateASTNode) value);
            return;
        }

        if (value instanceof Iterable<?>) {
            for (Object item : (Iterable<?>) value) {
                addChildrenObject(item);
            }
        }
    }

    @Override
    public String toString() {
        return "";
    }

}
