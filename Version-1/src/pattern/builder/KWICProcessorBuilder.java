package pattern.builder;

import input.Input;
import shifter.Shifter;
import sorter.Sorter;
import output.Output;
import pattern.abstractfactory.InputFactory;
import pattern.abstractfactory.ShifterFactory;
import pattern.abstractfactory.SorterFactory;
import pattern.abstractfactory.OutputFactory;

public class KWICProcessorBuilder {
    private InputFactory inputFactory;
    private ShifterFactory shifterFactory;
    private SorterFactory sorterFactory;
    private OutputFactory outputFactory;

    // This method sets the input factory for the KWICProcessor
    public KWICProcessorBuilder setInputFactory(InputFactory inputFactory) {
        this.inputFactory = inputFactory;
        return this;
    }

    // This method sets the shifter factory for the KWICProcessor
    public KWICProcessorBuilder setShifterFactory(ShifterFactory shifterFactory) {
        this.shifterFactory = shifterFactory;
        return this;
    }

    // This method sets the sorter factory for the KWICProcessor
    public KWICProcessorBuilder setSorterFactory(SorterFactory sorterFactory) {
        this.sorterFactory = sorterFactory;
        return this;
    }

    // This method sets the output factory for the KWICProcessor
    public KWICProcessorBuilder setOutputFactory(OutputFactory outputFactory) {
        this.outputFactory = outputFactory;
        return this;
    }

    // This method builds a KWICProcessor instance using the input, shifter, sorter, and output factories
    public KWICProcessor build() {
        // Throw an exception if any of the factories are not set
        if (inputFactory == null || shifterFactory == null || sorterFactory == null || outputFactory == null) {
            throw new IllegalStateException("All factories must be set before building a KWICProcessor.");
        }
        // Return a new KWICProcessor instance with the input, shifter, sorter, and output created by their respective factories
        return new KWICProcessor(inputFactory.createInput(), shifterFactory.createShifter(),
                sorterFactory.createSorter(), outputFactory.createOutput());
    }

}

