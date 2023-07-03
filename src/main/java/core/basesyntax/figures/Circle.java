package core.basesyntax.figures;

import core.basesyntax.suppliers.Color;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + calculateArea()
                + " sq.units, radius: " + radius + " units, color: " + getColor());
    }
}
