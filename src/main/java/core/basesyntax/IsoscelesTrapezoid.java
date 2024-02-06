package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperBase;
    private int lowerBase;
    private int height;

    public IsoscelesTrapezoid(String color, int upperBase, int lowerBase, int height) {
        setColor(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) (upperBase + lowerBase) / 2.0 * (double) height;
    }

    @Override
    public String draw() {
        return "Figure: trapezoid, area: "
                + Math.ceil(getArea() * Math.pow(10, 1)) / Math.pow(10, 1)
                + " sq.units, upper base: "
                + upperBase
                + " units, lower base: "
                + lowerBase
                + " units, height: "
                + height
                + " units, color: "
                + getColor().toLowerCase();
    }
}
