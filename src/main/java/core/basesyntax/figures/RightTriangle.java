package core.basesyntax.figures;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private static final double ROUNDING_FACTOR = 10.0;
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = round(firstLeg);
        this.secondLeg = round(secondLeg);
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq. units, first leg: " + firstLeg
                + " units, second leg: " + secondLeg
                + " units, color: " + getColor());
    }

    private double round(double value) {
        return Math.round(value * ROUNDING_FACTOR) / ROUNDING_FACTOR;
    }
}
