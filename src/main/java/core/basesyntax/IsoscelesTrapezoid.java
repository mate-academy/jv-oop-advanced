package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure {
    private final double upperBase;
    private final double lowerBase;
    private final double height;

    public IsoscelesTrapezoid(double upperBase, double lowerBase, double height, String color) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (upperBase + lowerBase) * height;
    }

    @Override
    public String draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq.units, upper base: "
                + upperBase + " units, lower base: "
                + lowerBase + " units, height: "
                + height + " units, color: "
                + getColor());
        return null;
    }
}
