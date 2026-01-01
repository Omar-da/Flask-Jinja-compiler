package ast.flask.misc;

import ast.flask.FlaskASTNode;
import java.util.List;

public class Params extends FlaskASTNode {
    public final List<Param> params;

    public Params(List<Param> params) {
        super(0, 0);  // line/column not needed for wrapper
        this.params = params;
    }

    @Override
    public String toString() {
        return "\nParams{ " +
                line + ":" + column +
                ", params=" + params +
                ", children=" + children +
                '}';
    }
}
