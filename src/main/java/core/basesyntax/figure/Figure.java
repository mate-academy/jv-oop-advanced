package core.basesyntax.figure;

import core.basesyntax.suppliers.Color;

public abstract class Figure {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract void draw();
}
