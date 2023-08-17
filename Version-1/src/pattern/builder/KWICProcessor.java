package pattern.builder;

import input.Input;
import shifter.Shifter;
import sorter.Sorter;
import output.Output;
import pattern.singleton.OptionalFeatures;
import java.util.ArrayList;
import java.util.List;

public class KWICProcessor {
    private Input input;
    private Shifter shifter;
    private Sorter sorter;
    private Output output;

    public KWICProcessor(Input input, Shifter shifter, Sorter sorter, Output output) {
        this.input = input;
        this.shifter = shifter;
        this.sorter = sorter;
        this.output = output;
    }
    /**
     * Reads input lines using the Input implementation and applies optional features such as noise elimination
     * and character replacement. Shifts each line by every possible word and sorts the resulting lines alphabetically.
     * Displays the sorted lines using the Output implementation.
     */
    public void process() {
        List<String> lines = input.readLines();
        List<String> shiftedLines = new ArrayList<>();
        OptionalFeatures optionalFeatures = OptionalFeatures.getInstance();

        for (String line : lines) {
            // Noise elimination
            if (!optionalFeatures.getNoiseWords().isEmpty()) {
                String[] words = line.split(" ");
                StringBuilder sb = new StringBuilder();
                for (String word : words) {
                    if (!optionalFeatures.isNoiseWord(word)) {
                        sb.append(word).append(" ");
                    }
                }
                line = sb.toString().trim();
            }

            // Replace 'e' with 'q'
            if (optionalFeatures.shouldReplaceE()) {
                line = line.replace('e', 'q');
            }

            int wordCount = line.split(" ").length;
            for (int i = 0; i < wordCount; i++) {
                shiftedLines.add(line);
                line = shifter.shift(line);
            }
        }

        List<String> sortedLines = sorter.sort(shiftedLines);
        output.display(sortedLines);
    }


}

