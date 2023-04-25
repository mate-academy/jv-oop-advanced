package core.basesyntax;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{"
                + "radius="
                + radius + ", color='"
                + getColor() + '\''
                + '}';
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " radius: " + radius
                + " color: " + getColor());
    }
}
