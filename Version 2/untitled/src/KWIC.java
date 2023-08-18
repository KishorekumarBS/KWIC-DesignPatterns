import java.util.*;

import input.ConsoleInput;
import input.FileInput;
import output.GUIOutput;
import output.PlainTextOutput;
import shifter.ClockwiseShifter;
import shifter.CounterclockwiseShifter;
import sorter.AlphabetizedSorter;
import sorter.ReverseAlphabetizedSorter;
import buildersingletonpatterns.KWICProcessorBuilder;
import buildersingletonpatterns.KWICProcessor;
import buildersingletonpatterns.OptionalFeatures;


public class KWIC {
    public static void main(String[] args) {
        // Example usage
        // Creating a KWIC processor builder
        KWICProcessorBuilder builder = new KWICProcessorBuilder();

        // Prompting the user to select an input method
        System.out.println("Enter input method (1 - Console, 2 - File):");

        // Creating a scanner to read user input
        Scanner scanner = new Scanner(System.in);
        int inputMethod = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Setting the input prototype based on user input
        if (inputMethod == 1) {
            builder.setInputPrototype(new ConsoleInput());
        } else if (inputMethod == 2) {
            System.out.println("Enter the file path:");
            String filePath = scanner.nextLine();
            builder.setInputPrototype(new FileInput(filePath));
        }

        // Prompting the user to select a shifter method
        System.out.println("Enter shifter method (1 - Clockwise, 2 - Counterclockwise):");
        int shifterMethod = scanner.nextInt();

        // Setting the shifter prototype based on user input
        if (shifterMethod == 1) {
            builder.setShifterPrototype(new ClockwiseShifter());
        } else if (shifterMethod == 2) {
            builder.setShifterPrototype(new CounterclockwiseShifter());
        }

        // Prompting the user to select a sorter method
        System.out.println("Enter sorter method (1 - Alphabetizer, 2 - Reverse Alphabetizer):");
        int sorterMethod = scanner.nextInt();

        // Setting the sorter prototype based on user input
        if (sorterMethod == 1) {
            builder.setSorterPrototype(new AlphabetizedSorter());
        } else if (sorterMethod == 2) {
            builder.setSorterPrototype(new ReverseAlphabetizedSorter());
        }

        // Prompting the user to select an output method
        System.out.println("Enter output method (1 - Console, 2 - GUI):");
        int outputMethod = scanner.nextInt();

        // Setting the output prototype based on user input
        if (outputMethod == 1) {
            builder.setOutputPrototype(new PlainTextOutput());
        } else if (outputMethod == 2) {
            builder.setOutputPrototype(new GUIOutput());
        }

        // Prompting the user to select whether to perform noise elimination
        System.out.println("Do you want to perform noise elimination? (yes / no):");
        scanner.nextLine(); // Consume the newline
        String noiseElimination = scanner.nextLine();

        // Creating an optional features instance to enable noise elimination
        OptionalFeatures optionalFeatures = OptionalFeatures.getInstance();

        // Adding noise words based on user input
        if (noiseElimination.equalsIgnoreCase("yes")) {
            System.out.println("Enter the noise words separated by space:");
            String[] noiseWords = scanner.nextLine().split(" ");
            for (String noiseWord : noiseWords) {
                optionalFeatures.addNoiseWord(noiseWord);
            }
        }

        // Replace 'e' with 'q'
        System.out.println("Do you want to replace 'e' with 'q'? (yes / no):");
        String replaceE = scanner.nextLine();
        if (replaceE.equalsIgnoreCase("yes")) {
            optionalFeatures.setReplaceE(true);
        }

        KWICProcessor processor = builder.build();
        processor.process();
    }
}



