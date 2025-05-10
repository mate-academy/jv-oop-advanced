package core.basesyntax.figure;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(String color) {
        super(color);
    }

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: rectangle, area: %.2f sq.units, "
                        + "length: %.2f units, width: %.2f units, color: %s%n",
                getArea(), length, width, getColor());
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
