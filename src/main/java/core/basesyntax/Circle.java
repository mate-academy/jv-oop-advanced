package core.basesyntax;

public class Circle implements Figure {
    private final String color;
    private final double radius;

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
        System.out.println("Figure: circle, area: " + String.format("%.2f", getArea()) + " sq. units, radius: "
                + String.format("%.2f", radius) + " units, color: " + color);
    }
}