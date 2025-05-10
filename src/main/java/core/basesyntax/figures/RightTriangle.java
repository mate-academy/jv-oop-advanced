package core.basesyntax.figures;

import core.basesyntax.variables.Color;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

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
        return firstLeg * secondLeg / 2;
    }

    @Override
    public String toString() {
        return "Figure: right triangle"
                + ", area: " + calculateArea()
                + " sq. units"
                + ", first leg: " + getFirstLeg()
                + ", second leg: " + getSecondLeg()
                + ", color: " + getColor();
    }
}
