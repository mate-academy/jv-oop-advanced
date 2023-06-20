package core.basesyntax.figure;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: circle, area: %.1f sq.units, radius: %d units, color: %s%n",
                getArea(), radius, color
        );
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
