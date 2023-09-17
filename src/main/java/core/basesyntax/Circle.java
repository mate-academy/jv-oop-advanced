package core.basesyntax;

public class Circle extends Shape {
    private final double radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, color=" + getColor()
                + ", radius=" + radius
                + ", area=" + getArea());
    }
}
