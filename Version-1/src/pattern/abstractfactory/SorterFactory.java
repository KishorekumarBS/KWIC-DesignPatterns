package pattern.abstractfactory;

import sorter.Sorter;
//Abstract factory interface for creating Sorter objects.
public interface SorterFactory {
    Sorter createSorter();
}
