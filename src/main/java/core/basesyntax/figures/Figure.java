package core.basesyntax.figures;

import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
