package core.basesyntax.model;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Drawable;

public abstract class Figures implements AreaCalculator, Drawable {
    private String color;

    protected Figures(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
