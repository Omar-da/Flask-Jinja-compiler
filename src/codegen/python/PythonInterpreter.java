package codegen.python;

import ast.flask.FlaskASTNode;
import ast.flask.stmt.AssignStmt;

public class PythonInterpreter {

    private final RuntimeContext context = new RuntimeContext();

    private final ValueEvaluator evaluator = new ValueEvaluator(context);


    public RuntimeContext execute(FlaskASTNode root) {
        visit(root);
        return context;
    }


    private void visit(FlaskASTNode node) {

        if(node instanceof AssignStmt assignment) {

            Object value = evaluator.evaluate(assignment.value);

            context.set(assignment.target, value);

            return;
        }


        for(FlaskASTNode child : node.getChildren()) {
            visit(child);
        }
    }
}