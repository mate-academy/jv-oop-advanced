package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double upperBase;
    private final double lowerBase;
    private final double height;

    public IsoscelesTrapezoid(String color, double upperSide, double lowerSide, double height) {
        super(color);
        this.upperBase = upperSide;
        this.lowerBase = lowerSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (upperBase + lowerBase) * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, area: %s sq. units, upper base: %s units, lower base: %s units, height: %s units, color: %s%n",
                getArea(),
                upperBase,
                lowerBase,
                height,
                getColor());
    }
}
