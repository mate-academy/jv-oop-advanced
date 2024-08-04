package core.basesyntax.figures;

import java.util.Locale;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double area;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.area = calculateArea();
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
        this.area = calculateArea();
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
        this.area = calculateArea();
    }

    public double getArea() {
        return area;
    }

    @Override
    protected double calculateArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.printf(Locale.US, "Figure: right triangle, area: %.1f sq. units, "
                        + "first leg: %.1f units, "
                        + "second leg: %.1f units, "
                        + "color: %s\n",
                area, firstLeg, secondLeg, color);
    }
}
