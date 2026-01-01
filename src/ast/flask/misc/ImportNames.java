package ast.flask.misc;

import java.util.List;
import ast.flask.FlaskASTNode;

public class ImportNames extends FlaskASTNode {
    public final List<String> names;

    public ImportNames(List<String> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "\nImportNames{ " +
                line + ":" + column +
                ", names=" + names +
                '}';
    }
}
