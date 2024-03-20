package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int length;

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area - "
                    + getArea() + ", width - " + getWidth()
                    + ", length - " + getLength() + ", color - " + getColor());
    }
}
