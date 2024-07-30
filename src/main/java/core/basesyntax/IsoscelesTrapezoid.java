package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double bottomBase;
    private double leg;
    private double baseAngle;

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase,
                              double leg, double baseAngle) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.leg = leg;
        this.baseAngle = baseAngle;
    }

    @Override
    public double calculateArea() {
        return (topBase + bottomBase) / 2 * leg * Math.sin(baseAngle);
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + calculateArea()
                + " sq. units, topBase: " + topBase
                + " units, bottomBase: " + bottomBase
                + " units, leg: " + leg
                + " baseAngle: " + baseAngle
                + " units, color: " + color);
    }
}
