package core.basesyntax.figures;

import core.basesyntax.Drawable;

public abstract class Figure implements Drawable {
    protected String color;

    protected Figure(String color) {
        this.color = color;
    }

    public abstract double getArea();
}
