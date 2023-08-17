package shifter;

public class CounterclockwiseShifter implements Shifter {
    @Override
    public String shift(String line) {
        String[] words = line.split(" ");
        String firstWord = words[0];
        System.arraycopy(words, 1, words, 0, words.length - 1);
        words[words.length - 1] = firstWord;
        return String.join(" ", words);
    }
}