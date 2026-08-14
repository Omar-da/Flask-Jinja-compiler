package codegen.output;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class OutputGenerator {

    public void writeHtml(String fileName, String html) throws IOException {

        Path output = Path.of("src/output", fileName);

        Files.createDirectories(output.getParent());

        Files.writeString(output, html);
    }
}