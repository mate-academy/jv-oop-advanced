package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

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
    public void draw() {
        System.out.println("Figure: rectangle, area: " + calculateArea()
                + " sq.units, length: " + getLength()
                + " units, width: " + getWidth()
                + " units, color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
