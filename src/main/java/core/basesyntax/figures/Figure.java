package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public abstract class Figure {
    private final Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract double square();

    public abstract void draw();
}
