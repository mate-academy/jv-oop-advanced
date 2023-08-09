package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double high;
    private double middleLine;

    public IsoscelesTrapezoid(String color, double high, double middleLine) {
        super(color);
        this.high = high;
        this.middleLine = middleLine;
    }

    @Override
    public double getArea() {
        return high * middleLine;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, high: " + high
                + " units, middle line: " + middleLine
                + " units, color: " + getColor());
    }
}
