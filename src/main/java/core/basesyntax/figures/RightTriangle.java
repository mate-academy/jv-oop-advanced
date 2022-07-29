package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public String toString() {
        return "Figure: rightTriangle, area: " + getArea() + " sq.units, firstLeg: "
                + firstLeg + " units, secondLeg: " + secondLeg + " units, color: " + getColor();
    }
}
