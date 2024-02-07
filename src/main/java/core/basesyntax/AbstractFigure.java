package core.basesyntax;

import core.basesyntax.service.Color;

public abstract class AbstractFigure implements AreaCalculator, Drawable {
    private Color color;

    public AbstractFigure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
