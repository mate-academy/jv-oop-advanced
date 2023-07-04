package core.basesyntax.model.figure;

import core.basesyntax.model.AreaCalculator;
import core.basesyntax.model.Color;
import core.basesyntax.model.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
