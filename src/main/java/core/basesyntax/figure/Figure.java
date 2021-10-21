package core.basesyntax.figure;

import core.basesyntax.misc.AreaCalculator;
import core.basesyntax.misc.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
