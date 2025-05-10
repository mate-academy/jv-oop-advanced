package core.basesyntax.model;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Color;
import core.basesyntax.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    public static final int DECIMAL_FORMAT = 100;
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
