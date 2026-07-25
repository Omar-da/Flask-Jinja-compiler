package codegen.python;

import java.util.HashMap;
import java.util.Map;

public class RuntimeContext {

    private final Map<String, Object> variables = new HashMap<>();

    public void set(String name, Object value) {
        variables.put(name, value);
    }

    public Object get(String name) {
        return variables.get(name);
    }

    public boolean contains(String name) {
        return variables.containsKey(name);
    }

    public Map<String, Object> getVariables() {
        return variables;
    }

    @Override
    public String toString() {
        return variables.toString();
    }
}