package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
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

    @Override
    public double getArea() {
        return (getSide1() * getSide2() * getHigh()) / 2;
    }

    @Override
    public void draw() {
        System.out.println(String.format("IsoscelesTrapezoid with area: %.2f sq. units, "
                + "side1: %.2f units, side2: %.2f units, high: %.2f units, "
                + "color: %s", getArea(), getSide1(), getSide2(), getHigh(), getColor()));
    }
}
