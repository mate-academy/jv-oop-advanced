package core.basesyntax.fiqures;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg) {
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: " + getArea() + "sq.units, firstLeg: "
                + firstLeg + ", secondLeg: " + secondLeg + ", color: " + getColor());
    }
}
