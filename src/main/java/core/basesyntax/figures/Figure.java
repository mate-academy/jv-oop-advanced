package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {
    protected final String color;

    protected Figure(String color) {
        this.color = color;
    }
}
