package core.basesyntax;

import auxiliary.Figure;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg) {
        super.setRandomColor();
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return Math.round((firstLeg * secondLeg / 2) * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Figure: RightTriangle, "
                + "area: " + getArea() + " sq.units, "
                + "firstLeg: " + firstLeg + " units, "
                + "secondLeg: " + secondLeg + " units, "
                + "color: " + getColor();

    }
}
