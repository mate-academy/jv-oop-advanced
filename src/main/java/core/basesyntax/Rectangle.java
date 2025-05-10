package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double length;

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public String toString() {
        return "Figure: Rectangle, area: " + getArea() + " sq. units, width: "
                + width + " units, length: "
                + length + " units, color: " + getColor();
    }
}
