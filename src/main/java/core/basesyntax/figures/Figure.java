package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
