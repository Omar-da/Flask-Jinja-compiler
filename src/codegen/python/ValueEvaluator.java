package codegen.python;

import ast.flask.FlaskASTNode;
import ast.flask.expr.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ast.flask.misc.ArgKw;
import ast.flask.misc.DictPair;

public class ValueEvaluator {

    private final RuntimeContext context;


    public ValueEvaluator(RuntimeContext context) {
        this.context = context;
    }


    public Object evaluate(FlaskASTNode node) {


        if(node instanceof LiteralExpr literal) {
            return literal.value;
        }

        if(node instanceof BoolExpr boolExpr) {
            return boolExpr.value;
        }

        if(node instanceof ListExpr list) {
            return evaluateList(list);
        }

        if(node instanceof DictExpr dict) {
            return evaluateDict(dict);
        }

        if(node instanceof NameExpr identifier) {

            if(!context.contains(identifier.name)) {
                throw new RuntimeException(
                        "Undefined variable: "
                                + identifier.name
                );
            }

            return context.get(identifier.name);
        }

        if(node instanceof BinaryExpr binary) {
            return evaluateBinary(binary);
        }

        if (node instanceof PrimaryExpr primary) {
            return evaluatePrimary(primary);
        }


        return null;
    }

    private Object evaluateBinary(BinaryExpr expr) {

        Object left = evaluate(expr.left);

        Object right = evaluate(expr.right);


        switch(expr.operator) {

            case "+":
                return add(left, right);

            case "-":
                return ((Number)left).doubleValue()
                        - ((Number)right).doubleValue();

            case "*":
                return ((Number)left).doubleValue()
                        * ((Number)right).doubleValue();

            case "/":
                return ((Number)left).doubleValue()
                        / ((Number)right).doubleValue();

            default:
                throw new RuntimeException(
                        "Unknown operator "
                                + expr.operator
                );
        }
    }

    private Object add(Object left, Object right) {

        // String concatenation
        if (left instanceof String || right instanceof String) {
            return String.valueOf(left) + String.valueOf(right);
        }

        // Numeric addition
        if (left instanceof Number && right instanceof Number) {
            return ((Number) left).doubleValue()
                    +
                    ((Number) right).doubleValue();
        }

        throw new RuntimeException(
                "Cannot add "
                        + left.getClass()
                        + " and "
                        + right.getClass()
        );
    }

    private Object evaluateList(ListExpr list) {

        List<Object> values = new ArrayList<>();

        for(FlaskASTNode element : list.elements) {

            Object value = evaluate(element);

            values.add(value);
        }

        return values;
    }

    private Object evaluateDict(DictExpr dict) {

        Map<String,Object> values = new HashMap<>();

        for(DictPair pair : dict.pairs) {

            Object value = evaluate(pair.value);

            values.put(pair.key, value);
        }


        return values;
    }

    private Object evaluatePrimary(PrimaryExpr expr) {

        // 1. Evaluate the base first
        Object value = evaluate(expr.base);


        // 2. Apply suffixes on the result
        for (Expr suffix : expr.suffixes) {

            value = applySuffix(value, suffix);
        }


        return value;
    }

    private Object applySuffix(Object value, Expr suffix) {

        if (suffix instanceof AttrAccessExpr attr) {

            return applyAttribute(value, attr);
        }


        if (suffix instanceof IndexExpr index) {

            return applyIndex(value, index);
        }


        throw new RuntimeException(
                "Unknown suffix: " + suffix.getClass()
        );
    }

    private Object applyAttribute(Object value, AttrAccessExpr attr) {

        if (value instanceof Map<?, ?> map) {

            return map.get(attr.attribute);
        }


        throw new RuntimeException(
                "Cannot access attribute "
                        + attr.attribute
        );
    }

    private Object applyIndex(
            Object value,
            IndexExpr index
    ) {

        Object key = evaluate(index.index);


        if(value instanceof List<?> list) {

            return list.get(
                    ((Number) key).intValue()
            );
        }


        if(value instanceof Map<?, ?> map) {

            return map.get(key);
        }


        throw new RuntimeException(
                "Cannot index value: " + value
        );
    }
}