package core.basesyntax.figure;

import core.basesyntax.figure.interfaces.AreaCalculator;
import core.basesyntax.figure.interfaces.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    private String color;

    public Figure(String color) {
        this.color = color;
    }
}
