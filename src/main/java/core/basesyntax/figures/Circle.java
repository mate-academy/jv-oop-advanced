package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, String type, int radius) {
        super(color, type);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, radius: %s"
                        + " units, color: %s%n",
                getType(), getArea(), radius, getColor());
    }
}
