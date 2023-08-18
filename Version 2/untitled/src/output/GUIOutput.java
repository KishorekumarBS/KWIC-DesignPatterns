
package output;

import javax.swing.*;
import java.awt.*;
import java.util.List;

// The GUIOutput class implements the Output interface and displays output in a graphical user interface (GUI).
public class GUIOutput implements Output {
    // The display method displays the specified list of strings in a GUI.
    @Override
    public void display(List<String> lines) {
// Use the SwingUtilities.invokeLater method to ensure that the GUI is created and displayed on the event dispatch thread.
        SwingUtilities.invokeLater(() -> {
// Create a new JFrame with a title.
            JFrame frame = new JFrame("KWIC Output");
// Set the default close operation to exit the application when the frame is closed.
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create a new JList to display the lines.
            JList<String> list = new JList<>(lines.toArray(new String[0]));
            // Create a new JScrollPane to add scrollbars to the JList.
            JScrollPane scrollPane = new JScrollPane(list);
            // Add the JScrollPane to the center of the JFrame.
            frame.add(scrollPane, BorderLayout.CENTER);

            // Set the size of the JFrame to 600x400 pixels.
            frame.setSize(600, 400);
            // Center the JFrame on the screen.
            frame.setLocationRelativeTo(null);
            // Make the JFrame visible.
            frame.setVisible(true);
        });
    }

    // The clone method returns a new GUIOutput object.
    @Override
    public Output clone() {
        return new GUIOutput();
    }

}
