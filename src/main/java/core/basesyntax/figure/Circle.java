package core.basesyntax.figure;

import core.basesyntax.Color;

public class Circle extends Figure {
    private final double radius;

    public Circle(Color color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String draw() {
        return "Figure: circle, area: " + Math.ceil(area())
                + " sq.units, radius: " + radius
                + " units, color: " + color.toString().toLowerCase();
    }
}
