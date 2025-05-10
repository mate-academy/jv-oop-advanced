package core.basesyntax.figures;

import core.basesyntax.model.Figure;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: right triangle, area: %.1f sq.units, "
                + "first leg: %.1f units, secondLeg: %.1f units, color: %s%n",
                calculateArea(), this.getFirstLeg(), this.getSecondLeg(), this.getColor());
    }
}
