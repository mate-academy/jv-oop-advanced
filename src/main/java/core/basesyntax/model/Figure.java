package core.basesyntax.model;

import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {

    protected String color;

    public Figure(String color) {
        this.color = color;
    }

}
