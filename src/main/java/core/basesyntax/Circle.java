package core.basesyntax;

public class Circle extends Figure {

    private final double pi = Math.PI;
    private double radius = 10;

    public Circle() {
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiametr() {
        return radius * 2;
    }

    @Override
    public double getArea() {
        return pi * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * pi * radius;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: circle, area: %.1f sq. units, perimeter: %.1f units, "
                        + "radius: %.1f units, color: %s%n", getArea(), getPerimeter(), getRadius(),
                getColor());
    }
}
