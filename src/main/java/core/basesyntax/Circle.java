package core.basesyntax;

public class Circle implements Figure {
    private String color;
    private double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Square: color="
                + color
                + ", radius="
                + radius
                + ", area="
                + getArea());
    }
}
