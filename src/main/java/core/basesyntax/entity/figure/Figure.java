package core.basesyntax.entity.figure;

import core.basesyntax.entity.AreaCalculator;
import core.basesyntax.entity.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
