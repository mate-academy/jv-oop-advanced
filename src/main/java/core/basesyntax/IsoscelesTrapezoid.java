package core.basesyntax;

public class IsoscelesTrapezoid extends Superclass {
    private final double bottomBase;
    private final double upperBase;
    private final double equalSides;
    private final String color;

    public IsoscelesTrapezoid(double bottomBase, double upperBase,
                              double equalSides, String color) {
        this.bottomBase = bottomBase;
        this.upperBase = upperBase;
        this.equalSides = equalSides;
        this.color = color;
    }

    @Override
    public String getArea() {
        double areaFirst = (bottomBase - upperBase) * (bottomBase - upperBase);
        double areaSecond = Math.sqrt(equalSides * equalSides - areaFirst / 4);
        double areaFin = (bottomBase + upperBase) / 2 * areaSecond;
        String first = bottomBase + " units, upperBase: " + upperBase + " units, equalSides: ";
        String second = equalSides + " units, color: " + color;
        return "\nFigure: IsoscelesTrapezoid, area: " + areaFin + " sq.units, bottomBase: "
                + first + second;
    }
}
