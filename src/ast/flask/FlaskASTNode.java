package ast.flask;

import java.util.ArrayList;
import java.util.List;

public abstract class FlaskASTNode {

    public final int line;
    public final int column;
    protected final List<FlaskASTNode> children = new ArrayList<>();


    protected FlaskASTNode(int line, int column) {
        this.line = line;
        this.column = column;
    }

    protected FlaskASTNode() {
        this(-1, -1);
    }

    public List<FlaskASTNode> getChildren() {
        return children;
    }

    protected void addChild(FlaskASTNode child) {
        if (child != null) {
            children.add(child);
        }
    }

    protected void addChildren(FlaskASTNode... nodes) {
        if (nodes == null) {
            return;
        }

        for (FlaskASTNode child : nodes) {
            addChild(child);
        }
    }

    protected void addChildren(List<? extends FlaskASTNode> children) {
        if (children == null) {
            return;
        }

        for (FlaskASTNode child : children) {
            addChild(child);
        }
    }

    protected void addChildrenFrom(Object... values) {
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

        if (value instanceof FlaskASTNode) {
            addChild((FlaskASTNode) value);
            return;
        }

        if (value instanceof Iterable<?>) {
            for (Object item : (Iterable<?>) value) {
                addChildrenObject(item);
            }
        }
    }

    @Override
    public abstract String toString();
}
