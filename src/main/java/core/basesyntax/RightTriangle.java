package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super.setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.setArea(calculateArea());
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
