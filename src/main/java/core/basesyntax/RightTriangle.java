package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double base;

    public RightTriangle(double firstLeg, double secondLeg, double base) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.base = base;
    }

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

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle"
                + ", area: " + getArea()
                + ", firstLeg: " + firstLeg
                + ", secondLeg: " + secondLeg
                + ", base: " + base
                + ", color: " + getColor());
    }
}
