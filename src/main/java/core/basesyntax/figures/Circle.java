package core.basesyntax.figures;

import core.basesyntax.suppliers.Color;

public class Circle extends Figure {
    private static final double CALCULATION_PI_VALUE = Math.PI;
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return CALCULATION_PI_VALUE * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + calculateArea()
                + " sq.units, radius: " + radius + " units, color: " + getColor().name());
    }
}
