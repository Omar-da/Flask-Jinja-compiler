package ast.flask.stmt;

import java.util.List;

public class FileNodeFlask extends Stmt {
    public final List<Stmt> statements;

    public FileNodeFlask(List<Stmt> statements, int line, int column) {
        super(line, column);
        this.statements = statements;
        addChildrenFrom(statements);
    }

    @Override
    public String toString() {
        return String.valueOf(statements);
    }
}
