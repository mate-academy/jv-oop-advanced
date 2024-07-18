package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
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
        System.out.println(String.format("Figure: triangle, area: %.2f sq. units, firstLeg:"
                + " %.2f units, secondLeg: %.2f units, color: %s", getArea(), firstLeg, secondLeg, getColor()));
    }
}
