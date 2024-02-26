package core.basesyntax;

public class Rectangle extends Figure{
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", square: "
                + getArea() + " sq. units, color: " + getColor()
                + ", width: " + width
                + ", length " + length);

    }
}
