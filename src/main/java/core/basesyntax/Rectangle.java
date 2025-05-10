package core.basesyntax;

public class Rectangle extends Figure {
    private final double length;
    private final double width;

    public Rectangle(double length, double width, Color color) {
        this.length = length;
        this.width = width;
        setColor(color);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String draw() {
        return "Figure: rectangle Area: " + getArea() + " sq.units"
                + " Length: " + length
                + " Width: " + width
                + " Color " + getColor() + "\n";

    }
}
