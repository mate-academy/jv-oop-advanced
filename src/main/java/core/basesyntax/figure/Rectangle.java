package core.basesyntax.figure;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(int firstSide, int secondSide, Color color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: rectangle, area: %.1f sq.units, "
                        + "first side: %d units, second side: %d units, color: %s%n",
                getArea(), firstSide, secondSide, color
        );
    }

    @Override
    public double getArea() {
        return (double) firstSide * secondSide;
    }
}
