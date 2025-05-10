package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle() {

    }

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public void calculateArea() {
        setArea(0.5 * getFirstLeg() * getSecondLeg());
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + getArea() + " sq. units, first leg | second leg: "
                + getFirstLeg() + " | " + getSecondLeg() + ", color:" + getColor());
    }
}
