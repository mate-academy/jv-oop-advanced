package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator {
    private int width;
    private int length;

    public Rectangle(String color, int width, int length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + getArea()
                + " sq.units, width: " + width
                + " units, length: " + length
                + " units, color: " + getColor().toLowerCase();
    }
}
