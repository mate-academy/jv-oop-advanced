package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private static final double ROUNDING_FACTOR = 10.0;
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = round(radius);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq. units, radius: " + radius
                + " units, color: " + getColor());
    }

    private double round(double value) {
        return Math.round(value * ROUNDING_FACTOR) / ROUNDING_FACTOR;
    }
}
