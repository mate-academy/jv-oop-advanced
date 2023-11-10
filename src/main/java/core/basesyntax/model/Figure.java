package core.basesyntax.model;

import core.basesyntax.model.enums.Color;
import core.basesyntax.model.interfaces.AreaCalculator;

public abstract class Figure implements AreaCalculator {

    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract void draw();
}
