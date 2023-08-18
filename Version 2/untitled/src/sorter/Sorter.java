package sorter;

import prototypepattern.prototype.Prototype;

import java.util.List;

public interface Sorter extends Prototype<Sorter> {
    List<String> sort(List<String> lines);
}
