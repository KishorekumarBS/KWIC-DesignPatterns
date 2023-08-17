package input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Concrete implementations for each component
public class ConsoleInput implements Input {
    @Override
    public List<String> readLines() {
        List<String> lines = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter input lines to process");
            String input = scanner.nextLine();
            String[] inputLines = input.split("\\$");
            lines.addAll(Arrays.asList(inputLines));
        }
        return lines;
    }
}
