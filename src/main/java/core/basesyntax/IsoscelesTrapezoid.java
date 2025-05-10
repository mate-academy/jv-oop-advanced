package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double bottomBase;
    private double topBase;

    public IsoscelesTrapezoid(String color, double height,double bottomBase, double topBase) {
        super(color);
        this.height = height;
        this.topBase = topBase;
        this.bottomBase = bottomBase;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBottomBase(double bottomBase) {
        this.bottomBase = bottomBase;
    }

    public void setTopBase(double topBase) {
        this.topBase = topBase;
    }

    public double getHeight() {
        return height;
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public double getTopBase() {
        return topBase;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", square: "
                + getArea() + " sq. units, color: " + getColor()
                + ", height: " + height
                + ", bottomBase: " + bottomBase
                + ", topBase: " + topBase);

    }
}
