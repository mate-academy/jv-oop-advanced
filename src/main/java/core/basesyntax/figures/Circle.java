package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class Circle extends Figure {
    public static final int DEFAULT_RADIUS = 10;
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + getArea() + " sq.units, radius: "
                + radius + " units, color: " + getColor();
    }
}
