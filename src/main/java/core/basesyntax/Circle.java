package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius;
    }

    @Override
    public String draw() {
        return "Figure: Circle, area:" + String.format("%.2f", getArea()) + " sq.units, radius:"
                + String.format("%.2f", radius)
                + " units, color:" + getColor();
    }

    @Override
    public String toString() {
        return draw();
    }
}
