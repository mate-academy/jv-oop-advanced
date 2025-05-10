package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(int upperBase, int bottomBase, int height, String color) {
        super(color);
        this.upperBase = upperBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    public double getUpperBase() {
        return upperBase;
    }

    public void setUpperBase(double upperBase) {
        this.upperBase = upperBase;
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public void setBottomBase(double bottomBase) {
        this.bottomBase = bottomBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (upperBase + bottomBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area: " + getArea()
                + " sq.units, " + "bottomBase: " + bottomBase + " units, upperBase: "
                + upperBase + " units, height: " + height + " units, color: "
                + getColor());
    }
}
