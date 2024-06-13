package core.basesyntax;

public class Circle extends Figure {
    private static final double PI = Math.PI;
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + calculateArea() + " sq. units, radius: "
                + getRadius() + " units, color: " + getColor());
    }

    public double getRadius() {
        return radius;
    }
}
