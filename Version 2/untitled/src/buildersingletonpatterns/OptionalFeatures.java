package buildersingletonpatterns;

import java.util.HashSet;
import java.util.Set;

public class OptionalFeatures {
    private static OptionalFeatures instance;
    protected Set<String> noiseWords;
    private boolean replaceE;


    // Private constructor to prevent external instantiation of the OptionalFeatures class.
    // Initializes the noiseWords set and sets the replaceE flag to false by default.

    private OptionalFeatures() {
        noiseWords = new HashSet<>();
        replaceE = false;
    }


    //* Returns the singleton instance of the OptionalFeatures class.
    //* Creates a new instance if one does not already exist.

    public static OptionalFeatures getInstance() {
        if (instance == null) {
            instance = new OptionalFeatures();
        }
        return instance;
    }


    //* Adds a noise word to the noiseWords set.

    public void addNoiseWord(String noiseWord) {
        noiseWords.add(noiseWord);
    }


    //* Checks if a given word is a noise word.
    public boolean isNoiseWord(String word) {
        return noiseWords.contains(word);
    }

    //* Enables or disables the replacement of the letter 'e' with 'q'.
    public void setReplaceE(boolean replaceE) {
        this.replaceE = replaceE;
    }

    //* Returns true if the letter 'e' should be replaced with 'q', false otherwise
    public boolean shouldReplaceE() {
        return replaceE;
    }
}
