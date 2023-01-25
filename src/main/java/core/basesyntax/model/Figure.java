package core.basesyntax.model;

import core.basesyntax.interfaceservices.AreaCalculator;
import core.basesyntax.interfaceservices.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
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
