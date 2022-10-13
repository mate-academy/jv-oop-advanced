package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(String color) {
        super(color);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + getArea()
                + " sq.units, radius: " + getRadius()
                + " units, color: " + getColor();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
