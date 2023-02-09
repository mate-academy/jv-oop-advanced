package core.basesyntax.entity;

public class IsoscelesTrapezoid extends Figure {
    public static final int MAX_HIGH = 20;
    public static final int MAX_UPPER_BASE = 20;
    public static final int MAX_LOWER_BASE = 20;

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

    public void setHigh(int high) {
        this.high = high;
    }

    public double getUpperBase() {
        return upperBase;
    }

    public void setUpperBase(int upperBase) {
        this.upperBase = upperBase;
    }

    public double getLowerBase() {
        return lowerBase;
    }

    public void setLowerBase(int lowerBase) {
        this.lowerBase = lowerBase;
    }

    @Override
    public void printInfo() {
        System.out.println(new StringBuilder("Figure:")
                .append(" IsoscelesTrapezoid, area: ")
                .append((upperBase + lowerBase) * high / 2.0)
                .append(" sq.units,")
                .append(" upperBase: ")
                .append(upperBase)
                .append(" units")
                .append(" lowerBase: ")
                .append(lowerBase)
                .append(" units, color: ")
                .append(getColor()));
    }
}
