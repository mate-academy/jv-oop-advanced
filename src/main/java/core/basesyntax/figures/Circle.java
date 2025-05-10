package core.basesyntax.figures;

import core.basesyntax.Color;

public class Circle extends Figure {
    private int radius;
    private String name = "Circle";

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea()
                + "sq.units, radius: " + radius + ", color: " + getColor());
    }
}
