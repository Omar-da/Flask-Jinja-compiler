package ast.flask.misc;

import ast.flask.FlaskASTNode;
import ast.flask.misc.DictPair;
import java.util.List;

public class DictPairs extends FlaskASTNode {
    public final List<DictPair> pairs;

    public DictPairs(List<DictPair> pairs, int line, int column) {
        super(line, column);
        this.pairs = pairs;
    }

    @Override
    public String toString() {
        return "DictPairs{" +
                "line=" + line +
                ", column=" + column +
                ", entries=" + pairs +
                '}';
    }
}
