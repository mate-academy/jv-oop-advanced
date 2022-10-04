package core.basesyntax.model;

import service.AreaCalculator;
import service.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;

    protected Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
