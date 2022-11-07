package core.basesyntax;

public class Rectangle extends Figure {

    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        this.length = length;
        this.width = width;
        this.setColor(Color.valueOf(color));
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{"
                + "length=" + length
                + ", width=" + width
                + ", color=" + getColor()
                + '}';
    }

    @Override
    public int calculateArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle"
                + ", area=" + calculateArea()
                + " sq.units"
                + "length=" + length
                + " units"
                + ", width=" + width
                + " units"
                + ", color=" + getColor());
    }
}
