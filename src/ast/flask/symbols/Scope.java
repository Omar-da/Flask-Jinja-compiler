package ast.flask.symbols;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scope {
    private final Map<String, Symbol> symbols = new HashMap<>();
    private final Scope parent;
    private final String name;
    private final List<Scope> children = new ArrayList<>();

    public Scope(Scope parent, String name) {
        this.parent = parent;
        this.name = name;
        if (parent != null) {
            parent.children.add(this);
        }
    }

    public List<Scope> getChildren() {
        return children;
    }


    // Add a symbol to the current scope
    public void define(Symbol symbol) {
        symbols.put(symbol.name, symbol);
    }

    // Look up symbol recursively in parent scopes
    public Symbol resolve(String name) {
        Symbol s = symbols.get(name);
        if (s != null) return s;
        if (parent != null) return parent.resolve(name);
        return null;
    }

    public Map<String, Symbol> getSymbols() {
        return symbols;
    }

    public Scope getParent() {
        return parent;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Scope{" +
                "name='" + name + '\'' +
                ", symbols=" + symbols.keySet() +
                '}';
    }
}
