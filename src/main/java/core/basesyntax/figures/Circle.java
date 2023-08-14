package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle has " + radius + " and area " + getArea()
                + " units " + "color: " + getColor().toLowerCase());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
