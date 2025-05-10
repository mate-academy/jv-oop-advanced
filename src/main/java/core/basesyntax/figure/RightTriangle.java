package core.basesyntax.figure;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, Color color) {
        this.color = color;
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
    }
    @Override
    public double countArea() {
        return firstLeg * secondLeg / 2.0;
    }

    @Override
    public String showInformation() {
        return String.format("Figure: triangle, area: %f sq. units, first leg: %d units, second leg: %d units, color: %s", countArea(), firstLeg, secondLeg, color.name().toLowerCase());
    }
}
