package core.basesyntax.figure;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class Square extends Figure {
    private final int side;

    public Square(int side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: square, area: %.1f sq.units, side: %d units, color: %s%n",
                getArea(), side, color
        );
    }

    @Override
    public double getArea() {
        return (double) side * side;
    }
}
