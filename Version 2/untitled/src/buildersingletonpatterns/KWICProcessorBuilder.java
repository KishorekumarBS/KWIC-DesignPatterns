package buildersingletonpatterns;

import input.Input;
import output.Output;
import shifter.Shifter;
import sorter.Sorter;

public class KWICProcessorBuilder {
    private Input inputPrototype;
    private Shifter shifterPrototype;
    private Sorter sorterPrototype;
    private Output outputPrototype;
     //setInputPrototype: sets the input prototype for the KWICProcessor
    public KWICProcessorBuilder setInputPrototype(Input inputPrototype) {
        this.inputPrototype = inputPrototype;
        return this;
    }
    //setShifterPrototype: sets the shifter prototype for the KWICProcessor
    public KWICProcessorBuilder setShifterPrototype(Shifter shifterPrototype) {
        this.shifterPrototype = shifterPrototype;
        return this;
    }
    //setSorterPrototype: sets the sorter prototype for the KWICProcessor
    public KWICProcessorBuilder setSorterPrototype(Sorter sorterPrototype) {
        this.sorterPrototype = sorterPrototype;
        return this;
    }
    //setOutputPrototype: sets the output prototype for the KWICProcessor
    public KWICProcessorBuilder setOutputPrototype(Output outputPrototype) {
        this.outputPrototype = outputPrototype;
        return this;
    }
    //build: creates and returns a new KWICProcessor instance with the specified prototypes
    public KWICProcessor build() {
        if (inputPrototype == null || shifterPrototype == null || sorterPrototype == null || outputPrototype == null) {
            throw new IllegalStateException("All prototypes must be set before building a KWICProcessor.");
        }
        return new KWICProcessor(inputPrototype.clone(), shifterPrototype.clone(),
                sorterPrototype.clone(), outputPrototype.clone());
    }
}

