package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double upperBase;
    private final double lowerBase;
    private final double lateralSide;

    public IsoscelesTrapezoid(String color, int upperBase, int lowerBase, int lateralSide) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.lateralSide = lateralSide;
    }

    @Override
    public double getArea() {
        return (upperBase + lowerBase) / 2 * Math.sqrt(4 * Math.pow(lateralSide, 2)
                - Math.pow(upperBase - lowerBase,2)) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, upper base: " + upperBase
                + " units, lower base: " + lowerBase
                + " units, lateral side: " + lateralSide
                + " units, color: " + getColor());
    }
}
