package core.basesyntax.model;

import core.basesyntax.Color;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return Math.round(area * DECIMAL_FORMAT) / DECIMAL_FORMAT;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, "
                + "area: " + calculateArea() + " units, "
                + "radius: " + radius + " units, "
                + "color: " + getColor());
    }
}
