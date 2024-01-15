package core.basesyntax.figures;

import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Drawable;
import core.basesyntax.interfaces.PerimeterCalculator;

public abstract class AbstractFigure implements Drawable, AreaCalculator, PerimeterCalculator {
    private String color;

    public AbstractFigure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
