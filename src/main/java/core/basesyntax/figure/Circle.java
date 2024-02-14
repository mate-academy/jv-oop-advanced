package core.basesyntax.figure;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, Color color) {
        this.radius = radius;
        setColor(color);
    }

    public void draw() {
        System.out.println(
                "Figure: circle, area: " + getArea()
                        + " sq. units, radius: " + this.radius
                        + " units, color: " + getColor());
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
