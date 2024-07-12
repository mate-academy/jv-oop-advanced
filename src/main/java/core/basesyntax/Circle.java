package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private final double pi = Math.PI;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * pi;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: circle, area: %s sq. units, radius: %s units, color: %s%n", calculateArea(), radius, getColor());
    }
}
