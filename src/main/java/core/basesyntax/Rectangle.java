package core.basesyntax;

public class Rectangle extends Figure {
    private Color color;
    private int length;
    private int width;

    public Rectangle(Color color, int length, int width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        String line = "Figure: Rectangle, area: ";
        System.out.println(line + area() + ", 1: " + length + ", 2: " + width + ", color: " + color);
    }

    @Override
    public double area() {
        return length * width;
    }
}
