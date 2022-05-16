package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double lowerBase;
    private double upperBase;

    public IsoscelesTrapezoid(double height, double lowerBase, double upperBase, String color) {
        super(color);
        this.height = height;
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLowerBase() {
        return lowerBase;
    }

    public void setLowerBase(double lowerBase) {
        this.lowerBase = lowerBase;
    }

    public double getUpperBase() {
        return upperBase;
    }

    public void setUpperBase(double upperBase) {
        this.upperBase = upperBase;
    }

    @Override
    public double getArea() {
        return ((lowerBase + upperBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", square: "
                + getArea() + " sq. units, color: " + getColor()
                + ", lower base: " + lowerBase
                + ", upper base: " + upperBase
                + ", hide: " + height);
    }
}
