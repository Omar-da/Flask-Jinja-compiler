package codegen.python;

import ast.flask.FlaskASTNode;

public class PythonInterpreter {

    private final RuntimeContext context =
            new RuntimeContext();

    public RuntimeContext execute(
            FlaskASTNode root) {

        visit(root);

        return context;
    }

    private void visit(
            FlaskASTNode node) {

        // we'll fill this later
    }
}