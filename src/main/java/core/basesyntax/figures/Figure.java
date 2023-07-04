package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.ColorEnum;
import core.basesyntax.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {
    protected final ColorEnum color;

    protected Figure(ColorEnum color) {
        this.color = color;
    }
}
