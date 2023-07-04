package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    private Color color;

    protected Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
