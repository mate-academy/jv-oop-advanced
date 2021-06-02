package figures;

import behavior.Figure;

public class Circle extends Figure {
    private final double radius;
    private String name = "Circle";

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Figure: " + name + ", area: " + getArea() + " sq.units, radius: " + radius
                + " units, color: " + getRandomColor();
    }
}
