package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private double radius;
    private Random random = new Random();

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: "
                + getArea()
                + " sq.units, radius: "
                + radius
                + " units, color: "
                + getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }
}
