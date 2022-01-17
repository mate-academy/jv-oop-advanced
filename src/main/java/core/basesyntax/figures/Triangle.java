package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Triangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public Triangle(double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return ((firstLeg * secondLeg) / 2);
    }

    @Override
    public String toString() {
        return "Figure: triangle, "
                + " area: " + getArea() + " sq.units,"
                + " firstLeg: " + firstLeg + " units,"
                + " secondLeg: " + secondLeg + " units,"
                + " color: " + super.getColor();
    }
}

