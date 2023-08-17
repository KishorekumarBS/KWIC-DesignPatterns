package pattern.abstractfactory;

import shifter.Shifter;
//Abstract factory interface for creating Shifter objects.
public interface ShifterFactory {
    Shifter createShifter();
}
