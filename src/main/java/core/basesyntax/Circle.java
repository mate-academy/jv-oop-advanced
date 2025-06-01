package core.basesyntax;

public class Circle implements Figure, Colorable {
    private double radius;
    private String color;

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
        System.out.println("Figure: circle, area: "
                + getArea() + " sq.units, radius: "
                + radius + " units, color: " + color);
    }

    @Override
    public String getColor() {
        return color;
    }
}
