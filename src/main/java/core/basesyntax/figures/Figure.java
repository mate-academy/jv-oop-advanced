package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.Drawable;

public abstract class Figure implements Drawable {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public abstract void draw();

    public abstract double getArea();
}
