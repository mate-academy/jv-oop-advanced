package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topBase;
    private int bottomBase;
    private int height;

    public IsoscelesTrapezoid(int topBase, int bottomBase, int height, String color) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    public int getTopBase() {
        return topBase;
    }

    public int getBottomBase() {
        return bottomBase;
    }

    public int getHeight() {
        return height;
    }

    public void setTopBase(int topBase) {
        this.topBase = topBase;
    }

    public void setBottomBase(int bottomBase) {
        this.bottomBase = bottomBase;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + this.getArea()
                + " sq. units, top base: " + this.topBase
                + " units, bottom base: " + this.bottomBase
                + " units, height: " + this.height
                + " units, color: " + this.getColor());
    }

    @Override
    public double getArea() {
        return ((topBase + bottomBase) / 2.0) * height;
    }
}
