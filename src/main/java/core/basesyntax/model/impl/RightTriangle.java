package core.basesyntax.model.impl;

import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;

public class RightTriangle extends Figure {
    private final int side;

    public RightTriangle(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (Math.sqrt(3) / 4) * Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: right triangle, area: %.2f sq. units, side: %d units, color: %s%n",
                calculateArea(), side, color
        );
    }
}
