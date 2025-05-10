package core.basesyntax.model;

import core.basesyntax.services.AreaCalculator;
import core.basesyntax.services.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
