package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double length;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure " + getClass().getSimpleName() + ", area: " + getArea()
                + " sq. units, color: " + getColor() + ", length: " + length
                + " width: " + width);
    }
}
