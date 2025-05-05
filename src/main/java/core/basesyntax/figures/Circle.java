package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.enums.Color;

public class Circle extends Figure {
    private final double radius;
    private final Color color;

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String draw() {
        return "Figure: Circle" + ", area: " + area() + " sq. units"
                + ", radius: " + radius + " units, " + "color: " + color;
    }

    @Override
    public double area() {
        return 3.14 * (radius * radius);
    }
}
