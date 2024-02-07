package core.basesyntax;

public class Rectangle extends Figure {
    private final int length;
    private final int height;

    public Rectangle(String color, int length, int height) {
        super(color);
        this.length = length;
        this.height = height;
    }

    @Override
    public double getArea() {
        return length * height;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, Square: " + getArea()
                + " sq.units, length: " + length
                + " sq.units, height: " + height
                + " units, Color: " + getColor();
    }
}
