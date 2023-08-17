package shifter;

public class ClockwiseShifter implements Shifter {
    @Override
    public String shift(String line) {
        String[] words = line.split(" ");
        String lastWord = words[words.length - 1];
        System.arraycopy(words, 0, words, 1, words.length - 1);
        words[0] = lastWord;
        return String.join(" ", words);
    }
}
