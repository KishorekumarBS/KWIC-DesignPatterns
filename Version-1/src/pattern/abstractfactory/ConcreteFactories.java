package pattern.abstractfactory;

import input.ConsoleInput;
import input.FileInput;
import input.Input;
import output.Output;
import output.PlainTextOutput;
import output.GUIOutput;
import shifter.Shifter;
import shifter.ClockwiseShifter;
import shifter.CounterclockwiseShifter;
import sorter.ReverseAlphabetizedSorter;
import sorter.AlphabetizedSorter;
import sorter.Sorter;

// The ConcreteFactories class defines several nested classes, each of which implements a factory interface
// and returns a concrete implementation of a product interface.
public class ConcreteFactories {
    // Concrete factory for creating console input.
    public static class ConsoleInputFactory implements InputFactory {
        public Input createInput() {
            return new ConsoleInput();
        }
    }

    // Concrete factory for creating file input.
    public static class FileInputFactory implements InputFactory {
        private String fileName;

        public FileInputFactory(String fileName) {
            this.fileName = fileName;
        }

        public Input createInput() {
            return new FileInput(fileName);
        }
    }

    // Concrete factory for creating clockwise shifter.
    public static class ClockwiseShifterFactory implements ShifterFactory {
        public Shifter createShifter() {
            return new ClockwiseShifter();
        }
    }

    // Concrete factory for creating counterclockwise shifter.
    public static class CounterclockwiseShifterFactory implements ShifterFactory {
        public Shifter createShifter() {
            return new CounterclockwiseShifter();
        }
    }

    // Concrete factory for creating alphabetized sorter.
    public static class AlphabetizedSorterFactory implements SorterFactory {
        public Sorter createSorter() {
            return new AlphabetizedSorter();
        }
    }

    // Concrete factory for creating reverse alphabetized sorter.
    public static class ReverseAlphabetizedSorterFactory implements SorterFactory {
        public Sorter createSorter() {
            return new ReverseAlphabetizedSorter();
        }
    }

    // Concrete factory for creating plain text output.
    public static class PlainTextOutputFactory implements OutputFactory {
        public Output createOutput() {
            return new PlainTextOutput();
        }
    }

    // Concrete factory for creating GUI output.
    public static class GUIOutputFactory implements OutputFactory {
        public Output createOutput() {
            return new GUIOutput();
        }
    }

}
