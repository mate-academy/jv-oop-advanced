package core.basesyntax;

public class RightTriangle extends Figure {
    private double area;
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

    public double getArea() {
        return area;
    }

    public double areaCalculator() {
        return area = (firstLeg * secondLeg) / 2;
    }

    @Override
    public String draw() {
        return "Figure: right trianle, area: " + getArea() + " sq. units, first leg: "
                + getFirstLeg() + " units, second leg: "
                + getSecondLeg() + " units, color: "
                + getColor();
    }
}
