package ast.template.css.declaration;

import java.util.ArrayList;
import java.util.List;

public class CssFunctionNode extends CssValueNode {
    public final String name;
    public final List<CssValueNode> args = new ArrayList<>();

    public CssFunctionNode(String name, int line, int column) {
        super(line,column);
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nCssFunctionNode{ " +
                line + ":" + column +
                ", name='" + name + '\'' +
                ", args=" + args +
                '}';
    }
}
