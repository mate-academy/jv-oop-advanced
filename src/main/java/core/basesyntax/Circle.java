package core.basesyntax;

public class Circle implements Figure {
    private String color;
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Figure : Circle " + "color: " + getColor()
                + " radius " + String.format("%.2f", radius)
                + " area: " + String.format("%.2f", getArea()) + '}';
    }
}
