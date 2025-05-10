package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(int length, int width, Color color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, Area: " + getArea()
                + " sq. units, Length: " + length + " Width: " + width
                + " units, Color: " + getColor());
    }
}
