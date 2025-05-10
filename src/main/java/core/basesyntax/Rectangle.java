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
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + ((int) (getArea() * 100) / 100.0)
                + " sq. units, length: " + getLength()
                + ", width: " + getWidth()
                + ", color: " + getColor());
    }
}
