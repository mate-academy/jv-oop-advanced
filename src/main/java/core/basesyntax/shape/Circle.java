package core.basesyntax.shape;

import core.basesyntax.Figure;
import core.basesyntax.Shape;

public class Circle extends Shape implements Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq. units, radius: " + radius + " units, color: " + color);
    }
}
