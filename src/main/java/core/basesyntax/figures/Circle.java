package core.basesyntax.figures;

import core.basesyntax.abstraction.Figure;

public class Circle extends Figure {
    private static final String NAME = "Circle";

    private final int radius;
    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public String toString() {
        return "Figure: " + NAME + ", area: " + getArea() + " sq.units,"
                + " radius: " + radius + ", color: " + getColor();
    }
}
