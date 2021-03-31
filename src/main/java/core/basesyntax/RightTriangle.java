package core.basesyntax;

public class RightTriangle extends Figure {
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

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure is Right Rectangle"
                + ", Color is " + getColor()
                + ", First Leg = " + firstLeg
                + ", Second Leg = " + secondLeg
                + ", Third Leg = " + Math.sqrt(Math.pow(firstLeg, 2) + Math.pow(secondLeg, 2))
                + ", Area = " + getArea());
    }
}
