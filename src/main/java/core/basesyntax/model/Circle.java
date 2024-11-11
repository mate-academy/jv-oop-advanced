package core.basesyntax.model;

import core.basesyntax.service.AreaCalculator;

public class Circle extends Figure implements AreaCalculator {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI * radius * radius);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName().toLowerCase()
                + ", area: " + getArea() + " sq. units, "
                + "radius " + getRadius() + " units, "
                + "color: " + getColor().toLowerCase());
    }
}
