package core.basesyntax.model;

import core.basesyntax.enums.Color;
import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    private final Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
