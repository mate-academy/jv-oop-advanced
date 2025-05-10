package core.basesyntax;

public class RightTriangle extends ColorFigure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
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

    public double getArea() {
        return 0.5 * (firstLeg * secondLeg);
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area:  "
                + getArea() + " sq. units, " + "firstLeg: "
                + getFirstLeg() + " units, " + "secondLeg: "
                + getSecondLeg() + " units, color: " + getColor());
    }
}
