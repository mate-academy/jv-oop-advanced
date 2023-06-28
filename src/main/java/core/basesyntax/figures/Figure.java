package core.basesyntax.figures;

import core.basesyntax.behaviour.AreaCalculation;
import core.basesyntax.behaviour.Drawable;

public abstract class Figure implements Drawable, AreaCalculation {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
