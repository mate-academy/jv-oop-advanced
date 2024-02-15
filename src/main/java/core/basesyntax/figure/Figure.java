package core.basesyntax.figure;

import core.basesyntax.geometry_interfaces.AreaCalculator;
import core.basesyntax.geometry_interfaces.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
