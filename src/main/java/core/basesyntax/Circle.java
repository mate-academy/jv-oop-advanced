package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private ColorSupplier colorSupplier = new ColorSupplier();

    private Random random = new Random();

    private double radius;

    public void printInfo() {
        System.out.println("Figure: " + getName()
                + ", " + "area: " + calculateArea()
                + ", " + "radius: " + getRadius()
                + ", " + "color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

    public void generateRandomParameters() {
        radius = random.nextDouble() * 20;
        name = "Circle";
        color = colorSupplier.getRandomColor();
    }

    @Override
    public void generateDefaultParameters() {
        radius = 10;
        color = "White";
        name = "Circle";
    }

    public double getRadius() {
        return radius;
    }

}
