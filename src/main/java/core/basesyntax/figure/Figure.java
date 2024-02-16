package core.basesyntax.figure;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calculateArea();

    public void draw() {
        System.out.print("Figure: " + getClass().getSimpleName()
                + ", area: " + calculateArea() + " sq. units"
                + ", color: " + color.toLowerCase());
    }
}
