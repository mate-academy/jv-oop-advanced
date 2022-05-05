package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg, secondLeg;
    public RightTriangle(double firstLeg, double secondLeg, double c, Colors color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }
}
