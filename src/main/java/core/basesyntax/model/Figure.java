package core.basesyntax.model;

import core.basesyntax.behavior.AreaCalculator;
import core.basesyntax.behavior.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract int calculateArea();

    public abstract void draw();
}
