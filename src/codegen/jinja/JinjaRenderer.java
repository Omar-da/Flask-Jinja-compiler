package codegen.jinja;

import java.util.List;

import ast.template.AttrJinjaBlockNode;
import ast.template.AttrJinjaVarNode;
import ast.template.AttrTextNode;
import ast.template.AttrValueNode;
import ast.template.TemplateASTNode;
import ast.template.TemplateAttrNode;
import ast.template.TemplateHtmlTagNode;
import ast.template.TemplateJinjaBlockNode;
import ast.template.TemplateJinjaVarNode;
import ast.template.TemplateStyleTagNode;
import ast.template.TemplateTextNode;
import codegen.python.RuntimeContext;
import codegen.python.TemplateValueEvaluator;


public class JinjaRenderer {

    private final TemplateWriter html = new TemplateWriter();

    public String render(TemplateASTNode root, RuntimeContext context) {

        html.clear();
        visit(root, context, new TemplateValueEvaluator(context));

        return formatHtml(html.getContent());
    }

    private void visit(TemplateASTNode node, RuntimeContext context, TemplateValueEvaluator evaluator) {

        if (node instanceof TemplateTextNode text) {
            html.append(text.getText());
            return;
        }

        if (node instanceof TemplateJinjaVarNode var) {
            Object value = evaluator.evaluateTemplate(var.expr);
            if (value != null) {
                html.append(value);
            }
            return;
        }

        if (node instanceof TemplateJinjaBlockNode block && "if".equals(block.type)) {
            Object condition = evaluator.evaluateTemplate(block.conditionOrIterable);
            if (Boolean.TRUE.equals(condition)) {
                for (TemplateASTNode child : block.children) {
                    visit(child, context, evaluator);
                }
            }
            return;
        }

        if (node instanceof TemplateJinjaBlockNode block && "for".equals(block.type)) {
            Object iterable = evaluator.evaluateTemplate(block);
            if (iterable instanceof List<?> list) {
                for (Object item : list) {
                    context.set(block.varName, item);
                    for (TemplateASTNode child : block.children) {
                        visit(child, context, evaluator);
                    }
                }
            }
            return;
        }

        if (node instanceof TemplateStyleTagNode) {
            return;
        }

        if (node instanceof TemplateHtmlTagNode tagNode) {
            html.append('<').append(tagNode.tagName);
            if (tagNode.tagContent != null) {
                for (TemplateASTNode child : tagNode.tagContent.children) {
                    if (child instanceof TemplateAttrNode attrNode) {
                        html.append(' ').append(attrNode.name);
                        if (attrNode.attrValueNode != null) {
                            html.append("=\"").append(renderAttrValue(attrNode.attrValueNode, context, evaluator)).append('"');
                        }
                    }
                }
            }
            html.append('>');

            for (TemplateASTNode child : tagNode.children) {
                if (child == tagNode.tagContent) {
                    continue;
                }
                visit(child, context, evaluator);
            }

            html.append("</").append(tagNode.tagName).append('>');
            return;
        }

        for (TemplateASTNode child : node.children) {
            visit(child, context, evaluator);
        }
    }

    private String renderAttrValue(AttrValueNode attrValueNode, RuntimeContext context, TemplateValueEvaluator evaluator) {
        StringBuilder rendered = new StringBuilder();
        for (TemplateASTNode child : attrValueNode.children) {
            if (child instanceof AttrTextNode textNode) {
                rendered.append(textNode.text);
            } else if (child instanceof AttrJinjaVarNode jinjaVarNode) {
                Object value = evaluator.evaluateTemplate(jinjaVarNode.var.expr);
                if (value != null) {
                    rendered.append(value);
                }
            } else if (child instanceof AttrJinjaBlockNode jinjaBlockNode) {
                Object value = evaluator.evaluateTemplate(jinjaBlockNode.block.conditionOrIterable);
                if (value != null) {
                    rendered.append(value);
                }
            }
        }
        return rendered.toString();
    }

    private String formatHtml(String htmlContent) {
        if (htmlContent == null || htmlContent.isBlank()) {
            return "";
        }

        StringBuilder formatted = new StringBuilder();
        int indent = 0;
        int lastIndex = 0;

        java.util.regex.Pattern tagPattern = java.util.regex.Pattern.compile("</?[^>]+>");
        java.util.regex.Matcher matcher = tagPattern.matcher(htmlContent);

        while (matcher.find()) {
            appendText(formatted, htmlContent.substring(lastIndex, matcher.start()), indent);

            String tag = matcher.group();
            if (isClosingTag(tag)) {
                indent = Math.max(0, indent - 1);
                appendIndented(formatted, tag, indent);
            } else if (isSelfClosingTag(tag)) {
                appendIndented(formatted, tag, indent);
            } else {
                appendIndented(formatted, tag, indent);
                indent++;
            }

            lastIndex = matcher.end();
        }

        appendText(formatted, htmlContent.substring(lastIndex), indent);
        return formatted.toString().trim();
    }

    private void appendText(StringBuilder builder, String text, int indent) {
        if (text == null || text.isBlank()) {
            return;
        }

        String trimmed = text.trim();
        if (trimmed.isEmpty()) {
            return;
        }

        if (builder.length() > 0 && builder.charAt(builder.length() - 1) != '\n') {
            builder.append('\n');
        }

        builder.append("  ".repeat(indent)).append(trimmed).append('\n');
    }

    private void appendIndented(StringBuilder builder, String tag, int indent) {
        if (builder.length() > 0 && builder.charAt(builder.length() - 1) != '\n') {
            builder.append('\n');
        }
        builder.append("  ".repeat(indent)).append(tag);
    }

    private boolean isClosingTag(String tag) {
        return tag.startsWith("</");
    }

    private boolean isSelfClosingTag(String tag) {
        return tag.endsWith("/>") || tag.equalsIgnoreCase("<br>") || tag.equalsIgnoreCase("<hr>") || tag.equalsIgnoreCase("<meta>") || tag.equalsIgnoreCase("<link>") || tag.equalsIgnoreCase("<img>") || tag.equalsIgnoreCase("<input>");
    }
}