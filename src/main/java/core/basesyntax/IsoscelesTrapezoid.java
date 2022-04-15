package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Area {
    private int upperBase;
    private int lowerBase;
    private int height;

    public IsoscelesTrapezoid(int upperBase, int lowerBase, int height) {
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (upperBase + lowerBase) / 2 * height;
    }

    @Override
    public String toDraw() {
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
