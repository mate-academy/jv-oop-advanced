package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator {
    private static final double HALF = 0.5;
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        double fLeg = firstLeg;
        double sLeg = secondLeg;
        this.firstLeg = fLeg;
        this.secondLeg = sLeg;
    }

    @Override
    public double getArea() {
        return HALF * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: triangle, area: %.2f sq. units,"
                + " firstLeg: %.2f units, secondLeg: %.2f units,"
                + " color: %s", getArea(), firstLeg, secondLeg, getColor()));
    }
}
