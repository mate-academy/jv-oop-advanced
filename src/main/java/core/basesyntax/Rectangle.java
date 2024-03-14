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
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: rectangle, area: %s sq. units, width: %s  sq. units, length: %s units, color: %s%n",
                getArea(),
                width,
                length,
                getColor());
    }
}
