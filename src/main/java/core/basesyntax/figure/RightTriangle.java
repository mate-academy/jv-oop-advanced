package core.basesyntax.figure;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private final int baseLeg;
    private final int heightLeg;

    public RightTriangle(int baseLeg, int heightLeg, Color color) {
        super(color);
        this.baseLeg = baseLeg;
        this.heightLeg = heightLeg;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: right triangle, area: %.1f sq.units, "
                        + "base leg: %d units, height leg: %d, color: %s%n",
                getArea(), baseLeg, heightLeg, color
        );
    }

    @Override
    public double getArea() {
        return 0.5 * baseLeg * heightLeg;
    }
}
