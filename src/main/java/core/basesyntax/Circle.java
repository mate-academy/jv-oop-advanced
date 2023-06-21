package core.basesyntax;

public class Circle extends Figure {
    private static final double P_I = 3.141592653;
    private final double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        this.area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return P_I * (radius * radius);
    }

    @Override
    public String toString() {
        return "Circle " + "radius=" + radius + ", color=" + color + ", area=" + area;
    }
}
