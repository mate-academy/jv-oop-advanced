package core.basesyntax.model;

import core.basesyntax.servise.AreaCalculator;
import core.basesyntax.servise.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;

    protected Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
