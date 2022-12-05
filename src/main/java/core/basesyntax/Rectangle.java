package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(Color color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
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
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle"
                + ", area=" + this.getArea()
                + " sq.units"
                + "length=" + length
                + " units"
                + ", width=" + width
                + " units"
                + ", color=" + getColor());
    }
}
