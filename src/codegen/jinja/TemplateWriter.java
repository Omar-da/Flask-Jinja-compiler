package codegen.jinja;

public class TemplateWriter {

    private final StringBuilder builder =
            new StringBuilder();

    public void append(String text) {
        builder.append(text);
    }

    public String getContent() {
        return builder.toString();
    }

    public void clear() {
        builder.setLength(0);
    }
}