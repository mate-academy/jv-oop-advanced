
package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {

    private double radius;
    private Random random = new Random();

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
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure : circle, area " + getArea() + " sq.units, radius: "
                + radius + " units, color: " + getColor());
    }
}
