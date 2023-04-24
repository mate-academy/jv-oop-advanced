package core.basesyntax.figures;

import core.basesyntax.AreaCalculation;
import core.basesyntax.Drawable;

public abstract class Figure implements AreaCalculation, Drawable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
