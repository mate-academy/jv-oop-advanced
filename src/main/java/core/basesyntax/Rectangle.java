package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
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

    @Override
    public double getArea() {
        return getLength() * getWidth();
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + ", length: " + getLength()
                + ", width: " + getWidth()
                + ", color: " + getColor());
    }
}
