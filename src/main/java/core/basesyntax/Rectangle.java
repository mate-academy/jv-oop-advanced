package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int height;

    public Rectangle(String color, int length, int height) {
        super(color);
        this.length = length;
        this.height = height;
    }

    @Override
    public double getArea() {
        return length * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, length: " + length + ", height: " + height
                + ", area: " + getArea() + ", color: " + getColor());
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
