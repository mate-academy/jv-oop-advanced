package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int bottomBase;
    private int topBase;

    public IsoscelesTrapezoid (String color, int height, int bottomBase, int topBase) {
        super(color);
        this.bottomBase = bottomBase;
        this.height = height;
        this.topBase = topBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public void setBottomBase(int bottomBase) {
        this.bottomBase = bottomBase;
    }

    public double getTopBase() {
        return topBase;
    }

    public void setTopBase(int topBase) {
        this.topBase = topBase;
    }

    @Override
    public double getArea() {
        return height * ((bottomBase + topBase) * 0.5);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: "
                + getArea() + " sq. units, color: " + getColor() + ", height: " + height
                        + ", bottomBase: " + bottomBase + ", topBase: " + topBase);
    }
}
