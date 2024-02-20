package core.basesyntax.core;

public class Rectangle extends Figure {
    private final double length;
    private final double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea() + " sq. units, length: "
                + length + " units, width: " + width + " units, color: " + getColor());
    }
}
