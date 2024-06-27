package core.basesyntax;

import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Describer;

public abstract class Figure implements Describer, AreaCalculator {
    public String type = "circle";
    public String color = "WHITE";
}
