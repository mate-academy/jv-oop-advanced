package core.basesyntax.models;

import core.basesyntax.enums.Color;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.unit, side: "
                + firstLeg + " units, secondLeg: " + secondLeg
                + " units, color: " + getColor().name());
    }
}
