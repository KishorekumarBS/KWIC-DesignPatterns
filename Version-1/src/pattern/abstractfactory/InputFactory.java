package pattern.abstractfactory;

import input.Input;
//Abstract factory interface for creating Input objects.
public interface InputFactory {
    Input createInput();
}
