package sorter;

import java.util.List;

public class AlphabetizedSorter implements Sorter {
    @Override
    public List<String> sort(List<String> lines) {
        lines.sort(String::compareToIgnoreCase);
        return lines;
    }
}
