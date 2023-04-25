package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double longBase;
    private final double shortBase;
    private final double leg;

    public IsoscelesTrapezoid(Color color, double longBase, double shortBase, double leg) {
        super(color);
        this.longBase = longBase;
        this.shortBase = shortBase;
        this.leg = leg;
    }

    @Override
    public double calculataArea() {
        return ((longBase + shortBase) / 4) * Math.sqrt((4 * leg)
                * (4 * leg) - (longBase - shortBase) * (longBase - shortBase));
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculataArea()
                + " sq.units, long base: " + longBase
                + " units, short base: " + shortBase
                + " units, leg: " + leg
                + " units, color: " + getColor());
    }
}
