package core.basesyntax.model;

import core.basesyntax.enums.Color;

public abstract class Figure {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
