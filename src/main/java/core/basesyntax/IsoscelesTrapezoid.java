package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double bottomBase;
    private final double upperBase;
    private final double equalSides;
    private final String color;
    private final double areaIsoscelesTrapezoid;

    public IsoscelesTrapezoid(double bottomBase, double upperBase,
                              double equalSides, String color) {
        super(color);
        this.bottomBase = bottomBase;
        this.upperBase = upperBase;
        this.equalSides = equalSides;
        this.color = color;
        this.areaIsoscelesTrapezoid = areaCalculator();
    }

    @Override
    public double areaCalculator() {
        double areaFirst = (bottomBase - upperBase) * (bottomBase - upperBase);
        double areaSecond = Math.sqrt(equalSides * equalSides - areaFirst / 4);
        return (bottomBase + upperBase) / 2 * areaSecond;
    }

    @Override
    public String drawable() {

        String first = bottomBase + " units, upperBase: " + upperBase + " units, equalSides: ";
        String second = equalSides + " units, color: " + color;
        return "\nFigure: IsoscelesTrapezoid, area: " + areaIsoscelesTrapezoid
                + " sq.units, bottomBase: " + first + second;
    }
}
