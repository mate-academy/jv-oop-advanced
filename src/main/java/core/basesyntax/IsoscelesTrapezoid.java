package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double height;
    private final double upperBase;
    private final double lowerBase;

    public IsoscelesTrapezoid(
            double height, double upperBase, double lowerBase, Color color) {
        this.height = height;
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        setColor(color);
    }

    @Override
    public double getArea() {
        return (upperBase + lowerBase) / 2 * height;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid Area: "
                + getArea() + " sq.units"
                + " Upper base: " + upperBase + " units"
                + " Lower base: " + lowerBase + " units"
                + " Height: " + height + " units"
                + " Color: " + getColor() + "\n";
    }

}
