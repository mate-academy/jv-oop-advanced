package core.basesyntax.figure;

import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Drawable;
import core.basesyntax.suppliers.Color;

public abstract class Figure implements AreaCalculator, Drawable {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
