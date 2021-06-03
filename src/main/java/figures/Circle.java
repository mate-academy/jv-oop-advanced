package figures;

import static java.lang.Math.pow;

import randomiser.Color;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
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
    public double getSquare() {
        return Math.PI * pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: circle, area: %.2f"
                + " sq.units, radius: %.2f units, color: %s",
                getSquare(),
                radius, super.getColor());
    }
}
