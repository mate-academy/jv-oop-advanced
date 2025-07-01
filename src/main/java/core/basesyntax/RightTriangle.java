package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle() {

    }

    public RightTriangle(double a,double b) {
        this.firstLeg = a;
        this.secondLeg = b;
    }

    public RightTriangle(String color, double a,double b) {
        setColor(color);
        this.firstLeg = a;
        this.secondLeg = b;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setFirstLeg(double a) {
        this.firstLeg = a;
    }

    public void setSecondLeg(double b) {
        this.secondLeg = b;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public String draw() {
        return "Figure: right triangle, area: "
                + getArea() + " sq. units, side 1: "
                + getFirstLeg() + " units, side 2: "
                + getSecondLeg() + " units," + " color: " + getColor();
    }

}
