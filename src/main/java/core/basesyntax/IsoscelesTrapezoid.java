package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideOne;
    private double sideTwo;
    private double height;

    public IsoscelesTrapezoid(String color, int sideOne, int sideTwo, int height) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.height = height;
    }

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(int sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(int sideTwo) {
        this.sideTwo = sideTwo;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((sideOne * sideTwo) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area" + getArea() + " sq.units, "
                + "sideOne " + sideOne + " units, "
                + "sideTwo " + sideTwo + " units, "
                + "height " + height + " units, "
                + "color: " + getColor());
    }
}
