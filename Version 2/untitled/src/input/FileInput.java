
package input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

// The FileInput class implements the Input interface and reads input lines from a file.
public class FileInput implements Input {
    // The name of the file to read input lines from.
    private String fileName;

    // The constructor initializes the fileName field.
    public FileInput(String fileName) {
        this.fileName = fileName;
    }

    // The readLines method reads input lines from the specified file and returns a list of strings.
    @Override
    public List<String> readLines() {
        try {
            // Use the Files.readAllLines method to read all lines from the specified file.
            return Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            // If an IOException occurs, print an error message and return an empty list.
            System.err.println("Error reading file: " + e.getMessage());
            return Collections.emptyList();
        }
    }

    // The clone method returns a new FileInput object with the same fileName field value.
    @Override
    public Input clone() {
        return new FileInput(fileName);
    }

}