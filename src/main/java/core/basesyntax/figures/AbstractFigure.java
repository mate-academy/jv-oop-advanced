package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Drawable;

public abstract class AbstractFigure implements AreaCalculator, Drawable {
    protected String color;

    public AbstractFigure(String color) {
        this.color = color;
    }
}
