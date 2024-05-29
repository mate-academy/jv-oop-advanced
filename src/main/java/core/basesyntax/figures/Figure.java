package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {

    protected Color color;

    protected double area;

    public Figure() {

    }

    public Figure(Color color) {
        this.color = color;
    }

}
