package core.basesyntax.figure;

import core.basesyntax.geometry.interfaces.AreaCalculator;
import core.basesyntax.geometry.interfaces.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
