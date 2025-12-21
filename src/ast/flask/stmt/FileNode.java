package ast.flask.stmt;

import java.util.List;

public class FileNode extends Stmt {
    public final List<Stmt> statements;

    public FileNode(List<Stmt> statements, int line, int column) {
        super(line, column);
        this.statements = statements;
    }
}
