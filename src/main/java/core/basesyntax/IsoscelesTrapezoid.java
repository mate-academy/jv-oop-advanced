package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double upperBase;
    private final double lowerBase;
    private final double leg;

    public IsoscelesTrapezoid(double upperBase, double lowerBase, double leg, String color) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.leg = leg;
    }

    @Override
    public double getArea() {
        return 0.5 * (upperBase + lowerBase) * leg;
    }

    @Override
    public String getName() {
        return "isosceles trapezoid";
    }
}
