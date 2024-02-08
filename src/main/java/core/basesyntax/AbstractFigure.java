package core.basesyntax;

import core.basesyntax.service.Color;

public abstract class AbstractFigure implements AreaCalculator, Drawable {
    protected Color color;

    public AbstractFigure(Color color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract void draw();
}
