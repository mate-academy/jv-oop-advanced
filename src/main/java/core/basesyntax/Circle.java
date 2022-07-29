package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String draw() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
