package ast.flask;

public abstract class ASTNode {
    public final int line;
    public final int column;

    protected ASTNode(int line, int column) {
        this.line = line;
        this.column = column;
    }

    protected ASTNode() {
        this(-1, -1);
    }
}
