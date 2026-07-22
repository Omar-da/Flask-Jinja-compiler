package ast.flask.misc;

import ast.flask.FlaskASTNode;


import java.util.List;

public class Args extends FlaskASTNode {
    public final List<ArgKw> argKws;

    public Args(List<ArgKw> argKws, int line, int column) {
        super(line, column);
        this.argKws = argKws;
        addChildrenFrom(argKws);
    }

    @Override
    public String toString() {
        return String.valueOf(argKws);
    }
}
