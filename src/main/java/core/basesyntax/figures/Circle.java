package core.basesyntax.figures;

import java.util.Locale;

public class Circle extends Figure {
    private double radius;
    private double area;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        this.area = calculateArea();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.area = calculateArea();
    }

    public double getArea() {
        return area;
    }

    @Override
    protected double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.printf(Locale.US, "Figure: circle, area: %.1f sq. units, "
                        + "radius: %.1f units, color: %s\n",
                area, radius, color);
    }
}
