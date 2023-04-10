package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double length;

    private String color;

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + getArea() + " sq.units, width: "
                + width + " units, length:" + length + " units, color: " + getColor());
    }
}
