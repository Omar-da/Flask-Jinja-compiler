package ast.template;

import java.util.ArrayList;
import java.util.List;

/**
 * Base AST node class with optional line/column info and children.
 */
public class ASTNode {
    public final int line;
    public final int column;
    public final List<ASTNode> children = new ArrayList<>();

    public ASTNode() {
        this(-1, -1);
    }

    public ASTNode(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public void addChild(ASTNode child) {
        if (child != null) children.add(child);
    }
}
