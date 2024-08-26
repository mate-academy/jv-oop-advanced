package core.basesyntax.figure;

import core.basesyntax.Color;

public class Circle extends Figure {
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
        System.out.println("Figure: circle, area: "
                + getArea() + " square units, radius: "
                + radius + " units, color: "
                + getColor());
    }
}
