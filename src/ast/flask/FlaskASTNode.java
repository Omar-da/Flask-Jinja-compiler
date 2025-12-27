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

    @Override
    public abstract String toString();
}
