package core.basesyntax.figures.impl;

import core.basesyntax.enums.Color;
import core.basesyntax.figures.AreaCalculator;
import core.basesyntax.figures.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    private final Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
