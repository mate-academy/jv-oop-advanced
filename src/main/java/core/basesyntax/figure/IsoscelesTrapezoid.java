package core.basesyntax.figure;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final int topSide;
    private final int bottomSide;
    private final int lateralSide;

    public IsoscelesTrapezoid(int topSide, int bottomSide, int lateralSide, Color color) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.lateralSide = lateralSide;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: isosceles trapezoid, area: %.1f sq.units, "
                        + "top side: %d units, bottom side: %d units, lateral side: %d units, "
                        + "color: %s%n",
                getArea(), topSide, bottomSide, lateralSide, color
        );
    }

    @Override
    public double getArea() {
        double halfPerim = (topSide + bottomSide + 2 * lateralSide) / 2.0;
        return Math.sqrt(
                (halfPerim - topSide)
                        * (halfPerim - bottomSide)
                        * Math.pow((halfPerim - lateralSide), 2)
        );
    }
}
