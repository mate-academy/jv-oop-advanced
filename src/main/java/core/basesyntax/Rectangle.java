package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return getLength() * getWidth();
    }

    @Override
    public void draw() {
        System.out.println(String.format("Rectangle with area: %.2f sq. units, length: %.2f units, "
                + "width: %.2f units, color: %s", getArea(), getLength(), getWidth(), getColor()));
    }
}
