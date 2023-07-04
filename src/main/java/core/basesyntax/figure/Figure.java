package core.basesyntax.figure;

import core.basesyntax.Color;
import core.basesyntax.behaviour.AreaCalculator;
import core.basesyntax.behaviour.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {
    private final Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
