package codegen.python;

import ast.flask.FlaskASTNode;

public class ValueEvaluator {

    private final RuntimeContext context;

    public ValueEvaluator(
            RuntimeContext context) {

        this.context = context;
    }

    public Object evaluate(
            FlaskASTNode node) {

        return null;
    }
}