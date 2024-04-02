package core.basesyntax.figures;

import core.basesyntax.abstractions.Figure;

public class Circle extends Figure {
    private static final int POW = 2;
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, POW);
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure "
                        + "circle"
                        + ", area:"
                        + calculateArea()
                        + ", radius = "
                        + radius
                        + ", color: "
                        + super.getColor());
    }
}
