package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void drawing() {
        System.out.println("Figure: Circle, area: " + getArea()
                + ", radius: " + getRadius()
                + ", color: " + getColor());
    }
}
