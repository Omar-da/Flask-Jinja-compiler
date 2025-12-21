package ast.flask.stmt;

import java.util.List;

public class FromImportStmt extends Stmt {
    public final String module;
    public final List<String> names;

    public FromImportStmt(String module, List<String> names, int line, int column) {
        super(line, column);
        this.module = module;
        this.names = names;
    }
}
