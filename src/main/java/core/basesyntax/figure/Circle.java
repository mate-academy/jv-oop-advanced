package core.basesyntax.figure;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, Color color) {
        super(color);
        this.radius = radius;

    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: circle, area: " + getArea()
                        + " sq. units, radius: " + this.radius
                        + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
