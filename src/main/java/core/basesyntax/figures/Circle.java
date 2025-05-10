package core.basesyntax.figures;

import core.basesyntax.colors.Color;

public class Circle extends Figure {
    private final int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.unit, radius: "
                + radius + " units, color: " + getColor().name());
    }
}
