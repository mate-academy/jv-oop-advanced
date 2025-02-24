package core.basesyntax;

public class RightTriangle extends Figure {
    private double leg1;
    private double leg2;

    public RightTriangle(Color color, double leg1, double leg2) {
        super(color);
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: right triangle, area = %.1f sq. units, firstLeg = %.1f"
                + "units, secondLeg = %.1f units, color: %s%n",
                calculateArea(), leg1, leg2, getColor());
    }

    @Override
    public double calculateArea() {
        return 0.5 * leg1 * leg2;
    }
}
