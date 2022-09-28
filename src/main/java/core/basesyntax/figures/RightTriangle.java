package core.basesyntax.figures;

import core.basesyntax.abstraction.Figure;

public class RightTriangle extends Figure {
    private final static String NAME = "right triangle";
    private final int firstLeg;
    private final int secondLeg;
    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (1.0 / 2.0) * firstLeg * secondLeg;
    }

    @Override
    public String toString() {
        return "Figure: " + NAME + ", area: " + getArea() + " sq.units,"
                + " firstLeg: " + firstLeg + "units, secondLeg: " + secondLeg
                + " units, color: " + getColor();
    }
}
