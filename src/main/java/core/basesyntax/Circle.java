package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private final String name = "Circle";

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea()
                + ", radius: " + radius + ", color: " + color);
    }
}
