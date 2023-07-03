package core.basesyntax.model;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
