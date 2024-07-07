package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Drawable, AreaCalculator{
    private double side1;
    private double side2;
    private double high;

    public IsoscelesTrapezoid(double side1, double side2, double high, Color color) {
        super(color);
        this.side2 = side2;
        this.side1 = side1;
        this.high = high;
    }

    public double getSide1() {
        return side1;
    }

    public double getHigh() {
        return high;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public void setH(int high) {
        this.high = high;
    }

    @Override
    public double getArea() {
        return (getSide1() * getSide2() * getHigh()) / 2;
    }

    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid, area: " + getArea() + " sq. units, side1: " + getSide1()
                + " units, side2: " + getSide2() + " units, high:" + getHigh() + " units, color: " + getColor());
    }
}
