package output;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GUIOutput implements Output {
    @Override
    public void display(List<String> lines) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("KWIC Output");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JList<String> list = new JList<>(lines.toArray(new String[0]));
            JScrollPane scrollPane = new JScrollPane(list);
            frame.add(scrollPane, BorderLayout.CENTER);

            frame.setSize(600, 400);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
