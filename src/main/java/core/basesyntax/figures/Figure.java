package core.basesyntax.figures;

import core.basesyntax.behaviour.AreaCalculator;
import core.basesyntax.behaviour.Drawable;
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
