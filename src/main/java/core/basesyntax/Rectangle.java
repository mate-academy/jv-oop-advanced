package core.basesyntax;

public class Rectangle extends Figure {
    private final int length;
    private final int width;

    public Rectangle(Color color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Shape: rectangle, area: " + calculateArea()
                + "sq. units, length: " + length
                + "sq. units, width: " + width + "sq. units, color: " + getColor());
    }
}
