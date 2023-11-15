package core.basesyntax.model;

import core.basesyntax.model.interfaces.AreaCalculator;
import core.basesyntax.model.interfaces.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
