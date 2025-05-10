package core.basesyntax.figures;

import core.basesyntax.Color;

public class Circle extends Figure {
    private final int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq.units, radius: " + radius + " units, color: " + getColor().name());
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
