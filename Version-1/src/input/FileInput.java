package input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class FileInput implements Input {
    private String fileName;

    public FileInput(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<String> readLines() {
        try {
            return Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return Collections.emptyList();
        }
    }
}
