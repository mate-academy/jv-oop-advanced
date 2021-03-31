package core.basesyntax.figure;

import core.basesyntax.Figure;
import core.basesyntax.generator.ColorSupplier;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String name) {
        super(ColorSupplier.setColors(), name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getName()
                + ", area: " + this.getArea()
                + " sq. units, radius: " + this.radius
                + " units, color: " + this.getColor());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            System.out.println("Radius cannot be less 0");
            return;
        }
        this.radius = radius;
    }
}
