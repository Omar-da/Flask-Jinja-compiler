package codegen.output;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class JsonExporter {

    public void export(
            String fileName,
            String json)
            throws IOException {

        Path output =
                Path.of(
                        "compiler_output",
                        fileName);

        Files.createDirectories(
                output.getParent());

        Files.writeString(
                output,
                json);
    }
}