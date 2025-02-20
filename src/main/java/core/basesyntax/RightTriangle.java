package core.basesyntax;

public class RightTriangle extends Figure implements GetArea,Draw {

    private double firstLeg;
    private double secondLeg;

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        if (firstLeg > 0) {
            this.firstLeg = firstLeg;
        }
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        if (secondLeg > 0) {
            this.secondLeg = secondLeg;
        }

    }

    @Override
    public double area() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void print() {
        System.out.println("Figure: RightTriangle, area: " + area() + " sq. units, " + "FirstLeg: " + firstLeg + ", SecondLeg: " + secondLeg + ", Color: " + getColor());
    }
}
