package ast.template.symbols;

import ast.flask.symbols.Symbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TemplateScope {
    private final Map<String, TemplateSymbol> symbols = new HashMap<>();
    private final TemplateScope parent;
    private final String name;
    private final List<TemplateScope> children = new ArrayList<>();

    public TemplateScope(TemplateScope parent, String name) {
        this.parent = parent;
        this.name = name;
        if (parent != null) {
            parent.children.add(this);
        }
    }

    public List<TemplateScope> getChildren() {
        return children;
    }


    // Add a symbol to the current scope
    public void define(TemplateSymbol templateSymbol) {
        symbols.put(templateSymbol.name, templateSymbol);
    }

    // Look up symbol recursively in parent scopes
    public TemplateSymbol resolve(String name) {
        TemplateSymbol s = symbols.get(name);
        if (s != null) return s;
        if (parent != null) return parent.resolve(name);
        return null;
    }

    public Map<String, TemplateSymbol> getSymbols() {
        return symbols;
    }

    public TemplateScope getParent() {
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
