package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    Circle(double radius, Colors color) {
        super("Circle", color);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return getFigureInfo() + String.format(", radius: %.1f units", radius);
    }
}
