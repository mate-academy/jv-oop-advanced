package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private double height;
    private double bottomBase;
    private double topBase;


    public IsoscelesTrapezoid(String color, double height, double bottomBase, double topBase) {
        super(color);
        this.height = height;
        this.bottomBase = bottomBase;
        this.topBase = topBase;
    }

    public double getArea() {
        return (getBottomBase() + getTopBase()) / 2 * getHeight();
    }

    public double getTopBase() {
        return topBase;
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public double getHeight() {
        return height;
    }

    public String draw() {
        String returnLine = "Shape: isosceles trapezoid, " + "area: " + getArea() + " sq. units, top base length: " +
                getTopBase() + " units, bottom base length: " + getBottomBase() +
                " units, height length: " + getHeight() + ", color: " + getColor();
        return returnLine;
    }
}
