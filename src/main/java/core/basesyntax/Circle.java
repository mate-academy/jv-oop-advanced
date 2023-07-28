package core.basesyntax;

public class Circle extends Figure {
    private double radius = 0;

    public Circle() {
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return super.draw() + System.out.printf("Radius: %s", radius);
    }
}
