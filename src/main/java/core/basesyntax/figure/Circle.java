package core.basesyntax.figure;

import core.basesyntax.Color;
import core.basesyntax.FigureColor;

public class Circle extends Color {
    private int radius;

    public Circle(int radius, FigureColor color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getDraw() {
        return "This is Circle. I have Area: " + getArea() + "; radius: "
                + radius + "; and have color: " + getColor();
    }
}
