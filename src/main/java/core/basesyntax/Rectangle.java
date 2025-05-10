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
    public void draw() {
        String line = "Figure: Rectangle, area: ";
        System.out.println(line + calculateArea() + ", length: " + length
                + ", width: " + width + ", color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
