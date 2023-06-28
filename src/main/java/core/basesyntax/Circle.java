package core.basesyntax;

public class Circle extends Figure {
    private final String name = "Circle";
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String drawFigure() {
        return "Figure: " + name + ", area: " + getArea() + " sq.units" + getUniqueProperties()
                + ", color: " + color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getUniqueProperties() {
        return ", radius: " + radius + " units";

    }
}
