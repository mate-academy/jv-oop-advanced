package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, Colors color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public Colors getColor() {
        return color;
    }
}
