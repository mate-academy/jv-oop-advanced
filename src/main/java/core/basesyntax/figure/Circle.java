package core.basesyntax.figure;

import core.basesyntax.interfaces.AreaCalculator;

public class Circle extends Figure implements AreaCalculator {
    private static final String TYPE_FIGURE = "CIRCLE";
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double area = (getRadius() * getRadius()) * Math.PI;
        return area;
    }

    @Override
    public void print() {
        System.out.println("Figure: " + TYPE_FIGURE + ", area: " + String.format("%.2f", area())
                + " sq.units, radius: " + getRadius() + " units, color: " + getColor());
    }
}
