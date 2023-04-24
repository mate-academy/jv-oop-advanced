package core.basesyntax;

public class Rectangle extends Figure {
    private final int length;
    private final int width;

    public Rectangle(Color color, int length, int width) {
        this.width = width;
        this.length = length;
        setColor(color);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: rectangle, area: " + calculateArea()
                + " sq.units, length: " + length
                + " units, width: " + width
                + " units, color: " + getColor().name().toLowerCase());
    }
}
