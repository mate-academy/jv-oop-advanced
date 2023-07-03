package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.support.AreaCalculator;
import core.basesyntax.support.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    private final Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
