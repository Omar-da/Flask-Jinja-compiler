package ast.flask.stmt;

import java.util.List;

import ast.flask.misc.Param;

public class FuncDefStmt extends Stmt implements FunctionDefNode {
    public final String name;
    public final List<Param> params;
    public final List<Stmt> body;

    public FuncDefStmt(String name, List<Param> params, List<Stmt> body, int line, int column) {
        super(line, column);
        this.name = name;
        this.params = params;
        this.body = body;
        addChildrenFrom(params, body);
    }

    @Override
    public String toString() {
        return String.valueOf(name);
    }
}
