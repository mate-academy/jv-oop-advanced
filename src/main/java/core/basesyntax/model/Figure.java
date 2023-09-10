package core.basesyntax.model;

import core.basesyntax.behaviour.AreaCalculator;
import core.basesyntax.behaviour.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
