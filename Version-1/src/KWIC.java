import java.util.*;

import pattern.builder.KWICProcessor;
import pattern.builder.KWICProcessorBuilder;
import pattern.singleton.OptionalFeatures;
import pattern.abstractfactory.ConcreteFactories.*;

// Abstract Factories

public class KWIC {
    public static void main(String[] args) {
        // Example usage
        KWICProcessorBuilder builder = new KWICProcessorBuilder();

        // Input
        System.out.println("Enter input method (1 - Console, 2 - File):");
        Scanner scanner = new Scanner(System.in);
        int inputMethod = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        if (inputMethod == 1) {
            builder.setInputFactory(new ConsoleInputFactory());
        } else if (inputMethod == 2) {
            System.out.println("Enter the file path:");
            String filePath = scanner.nextLine();
            builder.setInputFactory(new FileInputFactory(filePath));
        }

        // Shifter
        System.out.println("Enter shifter method (1 - Clockwise, 2 - Counterclockwise):");
        int shifterMethod = scanner.nextInt();
        if (shifterMethod == 1) {
            builder.setShifterFactory(new ClockwiseShifterFactory());
        } else if (shifterMethod == 2) {
            builder.setShifterFactory(new CounterclockwiseShifterFactory());
        }

        // Sorter
        System.out.println("Enter sorter method (1 - Alphabetizer, 2 - Reverse Alphabetizer):");
        int sorterMethod = scanner.nextInt();
        if (sorterMethod == 1) {
            builder.setSorterFactory(new AlphabetizedSorterFactory());
        } else if (sorterMethod == 2) {
            builder.setSorterFactory(new ReverseAlphabetizedSorterFactory());
        }

        // Output
        System.out.println("Enter output method (1 - Console, 2 - GUI):");
        int outputMethod = scanner.nextInt();
        if (outputMethod == 1) {
            builder.setOutputFactory(new PlainTextOutputFactory());
        } else if (outputMethod == 2) {
            builder.setOutputFactory(new GUIOutputFactory());
        }

        // Noise elimination
        System.out.println("Do you want to perform noise elimination? (yes / no):");
        scanner.nextLine(); // Consume the newline
        String noiseElimination = scanner.nextLine();
        OptionalFeatures optionalFeatures = OptionalFeatures.getInstance();
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


