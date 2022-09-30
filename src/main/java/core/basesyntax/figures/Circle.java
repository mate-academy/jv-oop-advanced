package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", radius: " + formatValue(radius) + " units"
                + ", area: " + formatValue(getArea()) + " sq.units"
                + ", color: " + color);
    }

    @Override
    protected double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
