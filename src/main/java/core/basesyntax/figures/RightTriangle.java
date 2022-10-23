package core.basesyntax.figures;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;
    private final String name = "Triangle";

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String toString() {
        return "Figure: "
                + name
                + ", area: "
                + getArea()
                + " sq.units, firstLeg: "
                + firstLeg
                + " units, secondLeg: "
                + secondLeg
                + " units, color: "
                + getColor();
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
