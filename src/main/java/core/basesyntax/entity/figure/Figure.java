package core.basesyntax.entity.figure;

import core.basesyntax.entity.AreaCalculator;
import core.basesyntax.entity.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    protected String color;

    Figure(String color) {
        this.color = color;
    }
}
