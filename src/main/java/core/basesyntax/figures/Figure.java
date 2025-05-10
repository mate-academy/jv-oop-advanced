package core.basesyntax.figures;

import core.basesyntax.behaviour.AreaCalculator;
import core.basesyntax.behaviour.Painter;
import core.basesyntax.enums.Color;

public abstract class Figure implements Painter, AreaCalculator {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
