package core.basesyntax.entity;

public class IsoscelesTrapezoid extends Figure {
    public static final double MAX_HEIGHT = 20;
    public static final double MAX_UPPER_BASE = 20;
    public static final double MAX_LOWER_BASE = 20;
    private double height;
    private double upperBase;
    private double lowerBase;

    public IsoscelesTrapezoid(Color color, double height, double upperBase, double lowerBase) {
        super(color);
        this.height = height;
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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
        System.out.println("Figure:" + " IsoscelesTrapezoid," + System.lineSeparator()
                + "        area: " + getArea() + " sq.units," + System.lineSeparator()
                + "        upperBase: " + upperBase + " units," + System.lineSeparator()
                + "        lowerBase: " + lowerBase + " units," + System.lineSeparator()
                + "        color: " + getColor());
    }

    @Override
    public double getArea() {
        return (upperBase + lowerBase) * height / 2.0;
    }
}
