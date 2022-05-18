package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(String color, double firstBase, double secondBase, double height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, "
                + "area: " + getArea() + " sq.units, "
                + "firstBase: " + firstBase + " units, "
                + "secondBase: " + secondBase + " units, "
                + "height: " + height + " units, "
                + "color: " + color);
    }

    @Override
    public double getArea() {
        return (getFirstBase() + getSecondBase()) / 2 * getHeight();
    }

    public double getSecondBase() {
        return secondBase;
    }

    public void setSecondBase(double secondBase) {
        this.secondBase = secondBase;
    }

    public double getFirstBase() {
        return firstBase;
    }

    public void setFirstBase(double firstBase) {
        this.firstBase = firstBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
