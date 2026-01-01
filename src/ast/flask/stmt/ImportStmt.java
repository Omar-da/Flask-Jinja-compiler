package ast.flask.stmt;

import java.util.List;

public class ImportStmt extends Stmt {
    public final List<String> names;

    public ImportStmt(List<String> names, int line, int column) {
        super(line, column);
        this.names = names;
    }

    @Override
    public String toString() {
        return "\nImportStmt{ " +
                line + ":" + column +
                "و names=" + names +
                "}";
    }
}
