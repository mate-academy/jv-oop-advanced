package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private int upperBase;
    private int bottomBase;
    private int altitude;

    public IsoscelesTrapezoid(Color color, int upperBase, int bottomBase, int altitude) {
        super(color);
        this.upperBase = upperBase;
        this.bottomBase = bottomBase;
        this.altitude = altitude;
    }

    @Override
    public double calculateArea() {
        return (upperBase + bottomBase) * altitude / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + String.format("%.1f", calculateArea())
                + " sq.units, upper base: " + upperBase
                + " units, bottom base: " + bottomBase
                + " units, altitude: " + altitude
                + " units, color: " + this.getColor());
    }
}
