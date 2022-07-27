package core.basesyntax.figures;

import core.basesyntax.Drawable;

public abstract class Figure implements Drawable {
    protected int color;

    public abstract double getArea();
}
