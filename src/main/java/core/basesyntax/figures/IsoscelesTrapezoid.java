package core.basesyntax.figures;

import core.basesyntax.abstraction.Figure;

public class IsoscelesTrapezoid extends Figure {
    private static final String NAME = "ssosceles trapezoid";

    private final int bottomSide;
    private final int topSide;
    private final int lateralSide;

    public IsoscelesTrapezoid(String color, int bottomSide, int topSide, int lateralSide) {
        super(color);
        this.bottomSide = bottomSide;
        this.topSide = topSide;
        this.lateralSide = lateralSide;
    }

    /**
     *  S = ((a + b) / 4) *	(√(4c2 - (a - b)^2))
     */
    @Override
    public double getArea() {
        double aPlusBDivideByFour = (bottomSide + topSide) / 4.0;
        double powCSide = lateralSide * lateralSide;
        double powAMinusB = (bottomSide - topSide) * (bottomSide - topSide);
        return (aPlusBDivideByFour) * (Math.sqrt(4 * powCSide - powAMinusB));
    }

    @Override
    public String toString() {
        return "Figure: " + NAME + ", area: " + getArea() + " sq.units,"
                + " top side: " + topSide + " units, bottomSide: " + bottomSide
                + " units , lateral side: " + lateralSide
                + " units, color: " + getColor();
    }
}
