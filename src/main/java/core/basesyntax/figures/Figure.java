package core.basesyntax.figures;

import core.basesyntax.figures.AreaCalculator;
import core.basesyntax.figures.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {
    protected String color;

    protected Figure(String color) {
        this.color = color;
    }

}
