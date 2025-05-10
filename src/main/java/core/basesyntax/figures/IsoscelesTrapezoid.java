package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double bottomBase;
    private double upperBase;
    private double height;

    public IsoscelesTrapezoid(String color, double bottomBase, double upperBase, double height) {
        super(color);
        this.bottomBase = bottomBase;
        this.upperBase = upperBase;
        this.height = height;
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public void setBottomBase(double bottomBase) {
        this.bottomBase = bottomBase;
    }

    public double getUpperBase() {
        return upperBase;
    }

    public void setUpperBase(double upperBase) {
        this.upperBase = upperBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (bottomBase + upperBase) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: " + getArea()
                + ", bottomBase: " + bottomBase + " units"
                + ", upperBase: " + upperBase + "units" + ", height: "
                + height + "units " + ", color: " + getColor());
    }
}
