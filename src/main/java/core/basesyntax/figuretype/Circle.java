package core.basesyntax.figuretype;

import core.basesyntax.figure.Figure;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.printf("Figure: circle, area: %.1f sq.units, radius: %s"
                        + " units, color: %s%n",
                getArea(), radius, getColor());
    }
}
