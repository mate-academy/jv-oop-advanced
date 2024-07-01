package core.basesyntax.model;

import core.basesyntax.util.AreaCalculator;
import core.basesyntax.util.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

    @Override
    public abstract double calculateArea();

    @Override
    public abstract void draw();
}
