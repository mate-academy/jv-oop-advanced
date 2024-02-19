package core.basesyntax.figure;

import core.basesyntax.figure.behavior.AreaCalculator;
import core.basesyntax.figure.behavior.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    protected String color;

    Figure(String color) {
        this.color = color;
    }
}
