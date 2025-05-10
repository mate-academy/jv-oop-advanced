package core.basesyntax.model;

import core.basesyntax.result.AreaCalculator;
import core.basesyntax.result.Drawable;

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
