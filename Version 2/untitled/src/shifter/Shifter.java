
package shifter;

import prototypepattern.prototype.Prototype;

// The Shifter interface extends the Prototype interface and declares a shift method that shifts a string.
public interface Shifter extends Prototype<Shifter> {
    // The shift method shifts the specified string and returns the shifted string.
    String shift(String line);
}