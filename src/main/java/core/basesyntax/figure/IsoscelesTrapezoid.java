package core.basesyntax.figure;

public class IsoscelesTrapezoid extends Figure {
    private double bottomBase;
    private double topBase;
    private double height;

    public IsoscelesTrapezoid(String color, double bottomBase, double topBase, double height) {
        super(color);
        this.bottomBase = bottomBase;
        this.topBase = topBase;
        this.height = height;
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public void setBottomBase(double bottomBase) {
        this.bottomBase = bottomBase;
    }

    public double getTopBase() {
        return topBase;
    }

    public void setTopBase(double topBase) {
        this.topBase = topBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * ((bottomBase + topBase) * 0.5);
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: "
                + getArea() + " sq. units, color: " + getColor()
                + ", height: " + height
                + ", bottomBase: " + bottomBase
                + ", topBase: " + topBase);
    }
}
