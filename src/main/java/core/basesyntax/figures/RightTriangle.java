package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.enums.Color;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;
    private final Color color;

    public RightTriangle(int firstLeg, int secondLeg, Color color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public String draw() {
        return "Figure: Rectangle" + ", area: " + area() + " sq. units"
                + ", firstLeg: " + firstLeg + " units, " + "secondLeg: " + secondLeg + " units, "
                + "color: " + color;
    }

    @Override
    public double area() {
        return (double) (firstLeg * secondLeg) / 2;
    }
}
