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
        return length * width;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: "
                + getArea() + " sq. units, length: "
                + getLength() + " units, width: "
                + getWidth() + " units, color: " + getColor();
    }
}
