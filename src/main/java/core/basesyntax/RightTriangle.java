package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: rightTriangle,"
                        + " area: %.1f sq. units,"
                        + " firstLeg: %.1f sq. units,"
                        + " secondLeg: %.1f sq. units"
                        + " color: %s\n",
                calculateArea(), firstLeg, secondLeg, getColor());
    }
}
