package ast.template.css;

import java.util.ArrayList;
import java.util.List;

public class CssFunctionNode extends TemplateCssValueNode {
    public final String name;
    public final List<TemplateCssValueNode> args = new ArrayList<>();

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
