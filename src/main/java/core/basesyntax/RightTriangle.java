package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, Color color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.printf("Figure RightTriangle, area: %.1f"
                            + " sq. units, firstLeg: %.1f"
                            + " units, secondLeg: %.1f"
                            + " units, color: %s",
                            + getArea(), firstLeg, secondLeg, color);
    }
}
