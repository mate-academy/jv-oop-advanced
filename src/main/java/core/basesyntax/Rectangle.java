package core.basesyntax;

public class Rectangle extends Figure implements Drawable, AreaCalculator{
    private double length;
    private double width;

    public Rectangle(double length, double width, Color color) {
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
        System.out.println("Rectangle, area: " + getArea() + " sq. units, length: " + getLength() + " units, width: " + getWidth() + " units, color: " + getColor());
    }
}
