package core.basesyntax.figure;

import core.basesyntax.supplier.Color;

public class Circle extends Figure {
    private double radius;
    private Color color;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(Color color) {
        this.color = color;
    }

    public Circle(Color color, double radius) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public Color getColor() {
        return color;
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
                + " units, color: " + color.name();
    }
}
