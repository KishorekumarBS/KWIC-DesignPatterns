package pattern.abstractfactory;

import output.Output;
//Abstract factory interface for creating Output objects.
public interface OutputFactory {
    Output createOutput();
}
