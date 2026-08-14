package codegen.python;

import java.util.Map;

public class TemplateRenderRequest {

    public final String templateName;
    public final RuntimeContext context;

    public TemplateRenderRequest(String templateName, RuntimeContext context) {
        this.templateName = templateName;
        this.context = context;
    }
}