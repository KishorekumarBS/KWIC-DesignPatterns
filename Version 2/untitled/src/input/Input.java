package input;

import java.util.List;
import prototypepattern.prototype.Prototype;
public interface Input extends Prototype<Input> {
    List<String> readLines();
}