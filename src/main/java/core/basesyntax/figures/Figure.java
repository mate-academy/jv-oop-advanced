package core.basesyntax.figures;

import core.basesyntax.figures.figurebehaviour.AreaCalculator;
import core.basesyntax.figures.figurebehaviour.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    private final String color;

    protected Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
