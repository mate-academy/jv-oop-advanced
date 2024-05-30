package core.basesyntax.figures;

import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {

    protected double area;

    private String color;

    public Figure() {

    }

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }
}
