package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double lowerBase;
    private final double upperBase;
    private final double height;

    public IsoscelesTrapezoid(double lowerBase, double upperBase, double height, String color) {
        super(color);
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (lowerBase + upperBase) * height / 2;
    }

    @Override
    public String draw() {
        return "Figure - rectangle, area = " + String.format("%1f", getArea()).replace(",", ".")
                + " sq.units, loverBase = " + lowerBase + " units, upperBase = " + upperBase
                + " units, height = " + height + " units, color - " + getColor();
    }
}
