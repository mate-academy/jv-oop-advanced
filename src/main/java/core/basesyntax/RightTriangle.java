package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg(double firstLeg) {
        return firstLeg;
    }

    public double getSecondLeg(double secondLegLeg) {
        return secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + areaCalculator()
                + " sq. units, firstLeg: "
                + firstLeg + " units, secondLeg: " + secondLeg + " units, color: " + getColor());
    }

    @Override
    public double areaCalculator() {
        return 0.5 * firstLeg * secondLeg;
    }
}
