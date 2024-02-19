package core.basesyntax.figure;

import core.basesyntax.behavior.AreaCalculator;
import core.basesyntax.behavior.Drawable;
import core.basesyntax.colors.Color;

public abstract class Figure implements Drawable, AreaCalculator {
    private final Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
