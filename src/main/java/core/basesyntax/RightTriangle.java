package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator, InfoBox{
    private double firstLeg;
    private double secondLeg;

    // CONSTRUCTORS
    public RightTriangle(double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    // GETTERS & SETTERS
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

    // BODY
    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("Right triangle, area: " + getArea() + " sq.units, first leg: " + firstLeg
                + " units, second leg: " + secondLeg + " units, color: " + getColor());
    }
}
