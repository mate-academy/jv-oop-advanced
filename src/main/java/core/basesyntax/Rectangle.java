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
        return "Figure: Rectangle, area: "
                + String.format("%.2f",getArea()) + " sq. units, length: "
                + String.format("%.2f",getLength()) + " units, width: "
                + String.format("%.2f",getWidth()) + " units, color: " + getColor();
    }
}
