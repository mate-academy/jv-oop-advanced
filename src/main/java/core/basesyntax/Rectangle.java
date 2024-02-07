package core.basesyntax;

public class Rectangle extends Figure {
    private final int length;
    private final int width;

    public Rectangle(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + String.format("%.2f", getArea())
                + ", length: " + length + ", width: " + width + ", color: " + color);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
