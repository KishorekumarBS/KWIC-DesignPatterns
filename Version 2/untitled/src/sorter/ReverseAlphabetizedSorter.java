package sorter;

import java.util.List;

public class ReverseAlphabetizedSorter implements Sorter {
    @Override
    public List<String> sort(List<String> lines) {
        lines.sort((a, b) -> b.compareToIgnoreCase(a));
        return lines;
    }
    @Override
    public Sorter clone() {
        return new ReverseAlphabetizedSorter();
    }
}
