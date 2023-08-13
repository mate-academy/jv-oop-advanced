package core.basesyntax;

public class Rectangle extends Figure {
    private final double length;
    private final double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void drew() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, length: " + length
                + " width: " + width
                + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
