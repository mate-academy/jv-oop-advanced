package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperBase;
    private double lowerBase;
    private double height;
    private double leg;

    public IsoscelesTrapezoid(double upperBase, double lowerBase, double height, Color color) {
        super(color);
        this.upperBase = upperBase < upperBase ? upperBase : lowerBase;
        this.lowerBase = lowerBase > upperBase ? lowerBase : upperBase;
        this.height = height;
        leg = Math.sqrt(height * height + Math.pow((lowerBase - upperBase) / 2, 2));
    }

    @Override
    public double getArea() {
        return height * (upperBase + lowerBase) / 2;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: isosceles trapezoid, "
                        + "area: %.1f sq.units, upperBase: %.1f units, lowerBase: %.1f units,"
                        + " height: %.1f units, leg: %.1f units, color: %s",
                getArea(), upperBase, lowerBase, height, leg, getColor().name().toLowerCase()));
    }
}
