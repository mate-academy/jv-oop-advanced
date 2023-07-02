package core.basesyntax.models;

import core.basesyntax.enums.Color;
import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {
    private Color color;

    protected Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
