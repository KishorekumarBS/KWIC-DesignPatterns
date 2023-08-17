package output;

import java.util.List;

public class PlainTextOutput implements Output {
    @Override
    public void display(List<String> lines) {
        for (String line : lines) {
            System.out.println(line);
        }
    }
}