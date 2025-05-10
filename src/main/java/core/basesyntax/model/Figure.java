package core.basesyntax.model;

import service.AreaCalculator;
import service.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
