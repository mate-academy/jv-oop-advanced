package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double topBase;
    private double bottomBase;

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase, double height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getTopBase() {
        return topBase;
    }

    public void setTopBase(double topBase) {
        this.topBase = topBase;
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public void setBottomBase(double bottomBase) {
        this.bottomBase = bottomBase;
    }

    @Override
    public double getArea() {
        return ((getTopBase() + getBottomBase()) / 2) * getHeight();
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: " + getArea()
                + " sq.units, topBase: " + topBase + " units, bottomBase: "
                + bottomBase + " units, height: "
                + height + " units, color: " + getColor());
    }
}
