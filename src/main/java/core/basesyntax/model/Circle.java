package core.basesyntax.model;

import core.basesyntax.enums.Color;

public class Circle extends FigureImpl {
    private final double radius;

    public Circle(Color color, double radius) {
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
                + getArea() + " sq. units, radius: "
                + radius + " units, color: " + getColor()
        );
    }
}
