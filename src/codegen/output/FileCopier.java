package codegen.output;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileCopier {

    public void copy(
            Path source,
            Path destination)
            throws IOException {

        Files.createDirectories(
                destination.getParent());

        Files.copy(
                source,
                destination,
                StandardCopyOption.REPLACE_EXISTING);
    }
}