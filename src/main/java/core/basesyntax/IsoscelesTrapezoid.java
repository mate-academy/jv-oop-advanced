package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int middleLine;
    private final int height;

    public IsoscelesTrapezoid(int height, int middleLine, Color color) {
        super(color);
        this.middleLine = middleLine;
        this.height = height;

    }

    @Override
    public double getArea() {
        return middleLine * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid area: " + getArea()
                + " sq.units, middle line: " + middleLine
                + " units, height: " + height + " units, color: " + getColor());
    }
}
