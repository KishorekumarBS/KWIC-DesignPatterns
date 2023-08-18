
package input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// The ConsoleInput class implements the Input interface.
public class ConsoleInput implements Input {
    // The readLines method reads input lines from the console and returns a list of strings.
    @Override
    public List<String> readLines() {
// Create a new ArrayList to store the input lines.
        List<String> lines = new ArrayList<>();
// Use a try-with-resources statement to automatically close the Scanner object after use.
        try (Scanner scanner = new Scanner(System.in)) {
// Prompt the user to enter input lines to process.
            System.out.println("Enter input lines to process");
// Read the input lines as a single string.
            String input = scanner.nextLine();
// Split the input string into an array of lines using the "$" delimiter.
            String[] inputLines = input.split("\\$");
// Add the input lines to the ArrayList.
            lines.addAll(Arrays.asList(inputLines));
        }
// Return the ArrayList of input lines.
        return lines;
    }
    // The clone method returns a new ConsoleInput object.
    @Override
    public Input clone() {
        return new ConsoleInput();
    }
}