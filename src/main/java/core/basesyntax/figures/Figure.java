package core.basesyntax.figures;

import core.basesyntax.inferfaces.AreaCalculator;
import core.basesyntax.inferfaces.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
