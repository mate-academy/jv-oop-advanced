package core.basesyntax.figure;

import core.basesyntax.AreaCalculate;
import core.basesyntax.Drawable;

public abstract class Figure implements AreaCalculate, Drawable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
