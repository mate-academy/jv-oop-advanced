package core.basesyntax.entity;

public class IsoscelesTrapezoid extends Figure {
    public static final double MAX_HIGH = 20;
    public static final double MAX_UPPER_BASE = 20;
    public static final double MAX_LOWER_BASE = 20;

    public static final double DEFAULT_LOWER_BASE = 10;
    public static final double DEFAULT_UPPER_BASE = 20;
    public static final double DEFAULT_HIGH = 5;

    private double high;
    private double upperBase;
    private double lowerBase;

    public IsoscelesTrapezoid(Color color, double high, double upperBase, double lowerBase) {
        super(color);
        this.high = high;
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getUpperBase() {
        return upperBase;
    }

    public void setUpperBase(double upperBase) {
        this.upperBase = upperBase;
    }

    public double getLowerBase() {
        return lowerBase;
    }

    public void setLowerBase(double lowerBase) {
        this.lowerBase = lowerBase;
    }

    @Override
    public void printInfo() {
        System.out.println(new StringBuilder("Figure:")
                .append(" IsoscelesTrapezoid,\n        area: ")
                .append(getArea())
                .append(" sq.units,")
                .append("\n        upperBase: ")
                .append(upperBase)
                .append(" units,")
                .append("\n        lowerBase: ")
                .append(lowerBase)
                .append(" units,\n        color: ")
                .append(getColor()));
    }

    @Override
    public double getArea() {
        return (upperBase + lowerBase) * high / 2.0;
    }
}
