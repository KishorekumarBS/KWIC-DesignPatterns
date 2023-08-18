
package output;

import prototypepattern.prototype.Prototype;

import java.util.List;

// The Output interface extends the Prototype interface and declares a display method that displays a list of strings.
public interface Output extends Prototype<Output> {
    // The display method displays the specified list of strings.
    void display(List<String> lines);
}