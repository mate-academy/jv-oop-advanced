package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperBase;
    private double lowerBase;

    public IsoscelesTrapezoid(double upperBase,double lowerBase, Color color) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
    }

    @Override
    public double calculateArea() {
        return Math.round((upperBase + lowerBase) / 2 * calculateHeight());
    }

    public double calculateHeight() {
        return Math.sqrt(upperBase + lowerBase);
    }

    @Override
    public String toString() {
        return "Figure: "
                + this.getClass().getSimpleName().toLowerCase() + ", "
                + "area: " + this.calculateArea() + " sq. units, "
                + "upperBase: " + this.upperBase + ", "
                + "lowerBase: " + this.lowerBase + ", "
                + "color: " + getColor().toString()
                + '}';
    }
}
