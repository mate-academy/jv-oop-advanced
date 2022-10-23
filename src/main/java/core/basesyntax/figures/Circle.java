package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private final int radius;
    private final String name = "circle";

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Figure: "
                + name
                + ", area: "
                + getArea()
                + " sq.units, radius: "
                + radius
                + " units, color: "
                + getColor();
    }
}
