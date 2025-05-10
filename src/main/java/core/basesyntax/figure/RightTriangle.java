package core.basesyntax.figure;

import core.basesyntax.color.Color;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        this.color = color.name().toLowerCase();
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    public void setLegs(double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public void draw() {
        String str = "Figure: right triangle, area: " + getArea() + " sq.units, first leg: "
                + firstLeg + ", second leg: " + secondLeg + ", color: " + color;

        System.out.println(str);
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}
