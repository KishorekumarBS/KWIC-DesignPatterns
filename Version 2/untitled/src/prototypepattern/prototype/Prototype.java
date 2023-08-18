
package prototypepattern.prototype;

// The Prototype interface defines a clone method that creates a new object with the same state as the original.
public interface Prototype<T> {
    // The clone method creates a new object with the same state as the original and returns it.
    T clone();
}