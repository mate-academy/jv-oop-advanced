package core.basesyntax;

import java.util.Random;

public class Сircle extends Figure implements ShapeAreaCalculator, ShapePropertyDisplay {
    private static final double PI = 3.14;

    private Random random = new Random();

    private double radius = random.nextDouble();

    public Сircle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public void displayProperty() {
        System.out.println("Figure: circle, color is " + color + ", size of the radius is " + radius
                + ", area: " + calculateArea());
    }
}
