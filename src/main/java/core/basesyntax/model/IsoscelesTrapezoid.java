package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double topBase;
    private double bottomBase;

    public IsoscelesTrapezoid(String color, double height, double topBase, double bottomBase) {
        super(color);
        this.height = height;
        this.topBase = topBase;
        this.bottomBase = bottomBase;
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
        return (getTopBase() + getBottomBase()) / 2 * getHeight();
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, "
                + "top base: %.2f, bottom base: %.2f, height: %.2f, area: %.2f, color: %s\n",
                getTopBase(), getBottomBase(), getHeight(), getArea(), getColor());
    }
}
