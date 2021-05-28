package core.basesyntax;

public class RightTriangle extends Figure {

    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;

    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public String toString() {
        return "RightTriangle{" +
                "area=" + getArea() + " sq.units" +
                ", firstLeg=" + firstLeg + " units" +
                ", secondLeg=" + secondLeg + " units" +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}
