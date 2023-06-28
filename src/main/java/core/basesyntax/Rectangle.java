package core.basesyntax;

public class Rectangle extends Figure {
    private final String name = "Rectangle";
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public String drawFigure() {
        return "Figure: " + name + ", area: " + getArea() + " sq.units" + getUniqueProperties()
                + ", color: " + color;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String getUniqueProperties() {
        return ", length: " + length + " units" + ", width: "
                + width + " units";
    }
}
