package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private String color;
    private double upperBase;
    private double lowerBase;
    private double height;

    public IsoscelesTrapezoid(double upperBase, double lowerBase, double height, String color) {
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
        this.color = color;
    }

    public String getName() {
        return "IsoscelesTrapezoid";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    double area() {
        return (upperBase + lowerBase) / 2.0 * height;
    }

    @Override
    public String drawInfo() {
        return ("Figure: " + getName() + ", " + "area: " + area() + " sq.units, "
                + "lowerBase: " + getLowerBase() + " units, " + "upperBase: "
                + getUpperBase() + " units, " + "height: " + getHeight()
                + " units, " + "color: " + getColor());
    }
}
