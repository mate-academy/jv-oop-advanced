package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: CIRCLE, area: "
                + getArea()
                + " sq.units, "
                + "radius: "
                + radius
                + " units,"
                + " color: "
                + getColor());
    }

    @Override
    public double getArea() {
        return Math.ceil(Math.PI * radius * radius);
    }
}
