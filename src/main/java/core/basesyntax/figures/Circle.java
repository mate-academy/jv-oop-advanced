package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public String draw() {
        return "Figure : circle, area: "
                + calculateArea() + " sq.units,"
                + " radius: " + radius + " units,"
                + " color: " + getColor();
    }
}
