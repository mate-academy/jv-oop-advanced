package core.basesyntax;

import Interfaces.AreaCalculator;
import Interfaces.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double calculateArea();

    public Figure(String Color) {
        super();
        this.color = Color;
    }
}
