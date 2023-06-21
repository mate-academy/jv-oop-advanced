package core.basesyntax;

public class Circle extends Figure {
    private final double radius;
    private static final double P_I = 3.141592653;

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
        return "Circle " + "radius=" + radius + ", color=" + color + ", area=" + area ;
    }
}
