package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double largeBase;
    private double smallBase;
    private double height;

    public IsoscelesTrapezoid(String color, double largeBase, double smallBase, double height) {
        super(color);
        this.largeBase = largeBase;
        this.smallBase = smallBase;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLargeBase() {
        return largeBase;
    }

    public void setLargeBase(double largeBase) {
        this.largeBase = largeBase;
    }

    public double getSmallBase() {
        return smallBase;
    }

    public void setSmallBase(double smallBase) {
        this.smallBase = smallBase;
    }

    public void draw() {
        System.out.println("Figure: isosceles trapezoid\narea: " + getArea() + " sq.units\n"
                + "large base: " + largeBase + " units\nsmall base: " + smallBase
                + " units\nheight: " + height + " units\ncolor: " + getColor());
    }

    @Override
    public double getArea() {
        return 0.5 * (largeBase + smallBase) * height;
    }
}
