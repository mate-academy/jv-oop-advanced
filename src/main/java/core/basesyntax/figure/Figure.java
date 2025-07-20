package core.basesyntax.figure;

import core.basesyntax.color.Color;

public abstract class Figure implements Drawable {
    private final Color color;

    protected Figure(Color color) {
        this.color = color;
    }

    public abstract double getArea();

    public Color getColor() {
        return color;
    }
}
