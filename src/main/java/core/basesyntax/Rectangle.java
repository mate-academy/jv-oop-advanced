package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(Color color, int length, int width) {
        super(color);
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        String line = "Figure: Rectangle, area: ";
        System.out.println(line + calculateArea() + ", 1: " + length + ", 2: " + width + ", color: " + color);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
