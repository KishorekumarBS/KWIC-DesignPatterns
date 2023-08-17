package pattern.singleton;

import java.util.HashSet;
import java.util.Set;

public class OptionalFeatures {

    // Singleton instance of OptionalFeatures class
    private static OptionalFeatures instance;

    // Set of noise words to be ignored
    private Set<String> noiseWords;

    // Flag to check if the letter 'e' should be replaced with 'E'
    private boolean replaceE;

    // Constructor (private, as it is a singleton class)
    private OptionalFeatures() {
        noiseWords = new HashSet<>();
        replaceE = false;
    }

    // Method to get the singleton instance of OptionalFeatures class
    public static OptionalFeatures getInstance() {
        if (instance == null) {
            instance = new OptionalFeatures();
        }
        return instance;
    }

    // Method to add a new noise word to the set
    public void addNoiseWord(String noiseWord) {
        noiseWords.add(noiseWord);
    }

    // Method to check if a given word is a noise word
    public boolean isNoiseWord(String word) {
        return noiseWords.contains(word);
    }

    // Method to get the set of noise words
    public Set<String> getNoiseWords() {
        return noiseWords;
    }

    // Method to set the flag to replace 'e' with 'E'
    public void setReplaceE(boolean replaceE) {
        this.replaceE = replaceE;
    }

    // Method to check if 'e' should be replaced with 'E'
    public boolean shouldReplaceE() {
        return replaceE;
    }
}

