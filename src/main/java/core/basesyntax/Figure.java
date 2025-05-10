package core.basesyntax;

import core.basesyntax.interfaces.AreaCalculatable;
import core.basesyntax.interfaces.Drawlable;

public abstract class Figure implements AreaCalculatable, Drawlable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
