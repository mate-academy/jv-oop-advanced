package core.basesyntax;

public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(int length, int width, Color color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void draw() {
        System.out.println("Draw the rectangle");
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shape: rectangle, area: "
                + getArea()
                + " sq. units, length: "
                + length
                + " units, color: "
                + color;
    }
}
