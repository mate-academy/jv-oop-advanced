package core.basesyntax.figures;

public class Rectangle extends Figure {
    private double length;
    private double width;

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
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: " + getArea()
                + " length " + " " + getLength() + " width " + getWidth()
                + ", color: " + getColor());
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
