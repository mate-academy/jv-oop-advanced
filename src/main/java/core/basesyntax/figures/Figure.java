package core.basesyntax.figures;

import core.basesyntax.figures.interfaces.AreaCalculator;
import core.basesyntax.figures.interfaces.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getStringFormat(double doubleNum) {
        return String.format("%,.1f", doubleNum);
    }

    @Override
    public abstract void draw();

    @Override
    public abstract double calculateArea();
}
