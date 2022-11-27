package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle, "
                + "area: " + area() + " sq.units, "
                + "length: " + this.length + " units, "
                + "width: " + this.width + " units, "
                + "color: " + this.color);
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
}
