package core.basesyntax.figuretypes;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return Math.round(area * DECIMAL_FORMAT) / DECIMAL_FORMAT;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, "
                + "area: " + getArea() + " units, "
                + "radius: " + radius + " units, "
                + "color: " + color);
    }
}
