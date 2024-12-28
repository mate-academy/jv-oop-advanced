package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 2 * Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Figure: circle"
                + ", area: " + calculateArea()
                + " sq. units"
                + ", radius: " + getRadius()
                + ", color: " + getColor();
    }
}
