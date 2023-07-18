package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double bottomBase;
    private final double upperBase;
    private final double equalSides;

    public IsoscelesTrapezoid(double bottomBase, double upperBase,
                              double equalSides, String color) {
        super(color);
        this.bottomBase = bottomBase;
        this.upperBase = upperBase;
        this.equalSides = equalSides;
    }

    @Override
    public double getArea() {
        double areaFirst = (bottomBase - upperBase) * (bottomBase - upperBase);
        double areaSecond = Math.sqrt(equalSides * equalSides - areaFirst / 4);
        return (bottomBase + upperBase) / 2 * areaSecond;
    }

    @Override
    public void draw() {
        String first = bottomBase + " units, upperBase: " + upperBase + " units, equalSides: ";
        String second = equalSides + " units, color: " + getColor();
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea()
                + " sq.units, bottomBase: " + first + second);
    }
}
