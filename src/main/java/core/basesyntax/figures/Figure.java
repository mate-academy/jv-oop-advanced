package core.basesyntax.figures;

import core.basesyntax.behaviour.CalculateArea;
import core.basesyntax.behaviour.Drawable;
import core.basesyntax.colorSupplier.Color;

public abstract class Figure implements CalculateArea, Drawable {
    private final Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
