package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * 2;
    }

    @Override
    public String toString() {
        return "Figure: circle, "
                + " area: " + getArea() + " sq.units,"
                + " radius: " + radius + " units,"
                + " color: " + super.getColor();
    }
}
