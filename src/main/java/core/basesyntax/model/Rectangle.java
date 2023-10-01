package core.basesyntax.model;

public class Rectangle extends Figure implements AreaCalculator {
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return (double) length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, length: "
                + getLength() + " units, width: " + getWidth() + " units, color:" + getColor());
    }
}
