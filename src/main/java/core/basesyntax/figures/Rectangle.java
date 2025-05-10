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
    public double getArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, "
                + "area: " + getArea() + " sq.units, length: " + getLength()
                + ", width: " + getWidth() + ", color: " + getColor());
    }
}
