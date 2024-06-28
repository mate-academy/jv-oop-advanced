package core.basesyntax.figures;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.setColor(color);
        this.setType("right triangle");
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public String draw() {
        return "Figure: "
                + getType() + ", "
                + "area: "
                + this.getArea()
                + " sq. units, "
                + "firstLeg: "
                + firstLeg
                + " units, "
                + "secondLeg: "
                + secondLeg
                + " units, "
                + "color: "
                + getColor();
    }
}
