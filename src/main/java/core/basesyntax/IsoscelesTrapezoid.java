package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double largeBase;
    private double smallBase;
    private double height;

    public IsoscelesTrapezoid(double largeBase, double smallBase, double height) {
        this.largeBase = largeBase;
        this.smallBase = smallBase;
        this.height = height;
        setSquare(0.5 * (largeBase + smallBase) * height);
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

    public void printSquareInfo() {
        System.out.println("Figure: isosceles trapezoid\narea: " + getSquare() + " sq.units\n"
                + "large base: " + largeBase + " units\nsmall base: " + smallBase
                + " units\nheight: " + height + " units\ncolor: " + getColor());
    }
}
