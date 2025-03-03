package core.basesyntax.figures;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private String color;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = Math.round(firstLeg * 10.0) / 10.0;
        this.secondLeg = Math.round(secondLeg * 10.0) / 10.0;
        this.color = color;
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
                + " units, color: " + color);
    }
}
