package core.basesyntax;

public class Circle implements Behavior {
    private double radius;
    private String color;
    private static final double ROUNDING_PRECISION = 100.0;

    public Circle(String color, double radius) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea() {
        double a = Math.PI * (radius * radius);
        return Math.round(a * ROUNDING_PRECISION) / ROUNDING_PRECISION;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, radius: " + radius +" units, color: " + color);
    }
}
