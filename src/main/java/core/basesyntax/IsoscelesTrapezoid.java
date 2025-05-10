package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(String color, double upperBase, double bottomBase, double height) {
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
        return ((upperBase + bottomBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("figure: IsoscelesTrapezoid" + " upperBase: " + upperBase
                + " units"
                + " bottomBase: " + bottomBase
                + " units"
                + " height: " + height
                + " units"
                + " area: " + getArea() + " sq.units" + " color: " + color);
    }
}
