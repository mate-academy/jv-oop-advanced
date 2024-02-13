package core.basesyntax.figure;

import core.basesyntax.supplier.Color;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String draw() {
        return "Figure: " + getClass().getSimpleName()
                + ", area: " + calculateArea()
                + " sq. units, radius: " + radius
                + " units, color: " + getColor().name();
    }
}
