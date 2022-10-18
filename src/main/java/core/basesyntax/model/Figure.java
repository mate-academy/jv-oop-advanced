package core.basesyntax.model;

import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Drawwable;

public abstract class Figure implements AreaCalculator, Drawwable {
    private final String color;

    public Figure(String color) {

        this.color = color;
    }

    public String getColor() {

        return color;
    }
}
