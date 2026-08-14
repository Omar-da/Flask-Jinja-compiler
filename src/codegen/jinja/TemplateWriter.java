package codegen.jinja;

public class TemplateWriter {

    private final StringBuilder builder = new StringBuilder();

    public TemplateWriter append(String text) {
        builder.append(text);
        return this;
    }

    public TemplateWriter append(char text) {
        builder.append(text);
        return this;
    }

    public TemplateWriter append(Object text) {
        builder.append(String.valueOf(text));
        return this;
    }

    public String getContent() {
        return builder.toString();
    }

    public void clear() {
        builder.setLength(0);
    }
}