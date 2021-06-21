package core.basesyntax;

public class RightTriangle extends Figure implements GetArea {
    private double firstLeg;
    private double secondLeg;

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
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String printInfo() {
        return "Figure: right triangle, area: " + Math.floor(getArea() * 100) / 100
                + " sq.units, first leg: " + (int) getFirstLeg() + " units, second leg: "
                + (int) getSecondLeg() + ", color: " + getColor();
    }
}
