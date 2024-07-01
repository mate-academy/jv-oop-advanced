package core.basesyntax.model.impl;

import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;

public class Circle extends Figure {
    private final int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: circle, area: %.2f sq. units, radius: %d units, color: %s%n",
                calculateArea(), radius, color
        );
    }
}
