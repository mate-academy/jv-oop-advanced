package core.basesyntax;

public class Circle extends Figure {
    private final double radius;
    private static final double PI = 3.141592653;

    @Override
    public double getArea() {
        return PI * (radius * radius);
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        this.area = getArea();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
