package core.basesyntax.figure;

import core.basesyntax.interfaces.Drawable;
import core.basesyntax.interfaces.AreaCalculator;

public abstract class Figure implements Drawable, AreaCalculator {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
