package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.DrawAble;

public abstract class Figure implements AreaCalculator, DrawAble {
    protected final String color;
    protected double area;

    protected Figure(String color) {
        this.color = color;
    }
}
