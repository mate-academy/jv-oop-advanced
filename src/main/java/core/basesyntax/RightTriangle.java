package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, first leg: "
                + getFirstLeg() + ", second leg: " + getSecondLeg() + ", color: " + getColor());
    }
}
