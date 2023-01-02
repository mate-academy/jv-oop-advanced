package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Figure: Rectangle, " + "area: " + getArea() + " sq.units, "
                + "length: " + length + " units, "
                + "width: " + width + " units, " + "color: " + getColor();
    }
}
