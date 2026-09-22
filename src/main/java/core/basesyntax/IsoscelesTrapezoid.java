package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double leg;

    public IsoscelesTrapezoid(double firstBase, double secondBase, double leg) {
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.leg = leg;
    }

    public double getFirstBase() {
        return firstBase;
    }

    public void setFirstBase(double firstBase) {
        this.firstBase = firstBase;
    }

    public double getSecondBase() {
        return secondBase;
    }

    public void setSecondBase(double secondBase) {
        this.secondBase = secondBase;
    }

    public double getLeg() {
        return leg;
    }

    public void setLeg(double leg) {
        this.leg = leg;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) * leg / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid"
                + ", area: " + getArea()
                + ", firstBase: " + firstBase
                + ", secondBase: " + secondBase
                + ", leg: " + leg
                + ", color: " + getColor());
    }
}
