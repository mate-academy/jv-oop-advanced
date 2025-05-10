package core.basesyntax.models;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
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
        System.out.printf(
                "Figure: right triangle, area: %.1f sq. units, first leg: %.1f units,"
                + " second leg: %.1f units, color: %s\n",
                this.getArea(),
                this.firstLeg,
                this.secondLeg,
                this.getColor()
        );
    }
}
