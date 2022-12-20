package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double square() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        String square = String.format("%.1f", square());
        System.out.println("Figure: circle, area: " + square + " sq.units, radius: " + radius + ", color: "
                + super.getColor());
    }
}
