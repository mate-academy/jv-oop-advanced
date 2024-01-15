package core.basesyntax;

public class Rectangle extends Figure {
    private double height;
    private double length;

    public Rectangle(String color, double height, double length) {
        super(color);
        this.height = height;
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, "
                + "area: " + getArea() + " sq.units, "
                + "height: " + height + " units, "
                + "length: " + length + " units, "
                + "color: " + color);
    }

    @Override
    public double getArea() {
        return getHeight() * getLength();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
