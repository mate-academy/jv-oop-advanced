package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int length;
    public Rectangle(int width, int length, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }
    @Override
    public double getArea() {
        return width * length;
    }
    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + "sq. units, width: " + width + " length: " + length + " units, color: " + getColor());
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
}
