package core.basesyntax.model;

import service.AreaCalculator;
import service.Drawable;

/**
 * Feel free to remove this class and create your own.
 */
public abstract class Figure implements AreaCalculator, Drawable {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected Figure(String color) {
        this.color = color;
    }
}
