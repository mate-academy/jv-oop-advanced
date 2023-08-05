package core.basesyntax;

public class Rectangle extends Figure {
    private final double length;
    private final double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public void draw() {
        System.out.println("Figure: rectangle, area: " + calculateArea()
                + " sq.units, length: " + length
                + " units, width: " + width + " units, color: " + getColor());
    }
}
