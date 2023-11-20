package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstLeg;
    private final double secondLeg;
    private final double height;

    public IsoscelesTrapezoid(double firstLeg, double secondLeg, double height, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + areaCalculator() + " firstLeg: "
                + firstLeg + ", secondLeg: " + secondLeg + ", height: "
                + height + ", color: " + getColor());
    }

    @Override
    public double areaCalculator() {
        return 0.5 * (firstLeg + secondLeg) * height;
    }
}
