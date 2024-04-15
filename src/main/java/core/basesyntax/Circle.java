package core.basesyntax;

import static java.lang.Math.PI;

import java.util.Random;

public class Circle extends Figure {
    private static final int MAX_NUMBER = 100;
    private int radius;
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public Circle getRandomCircle() {
        int radius = random.nextInt(MAX_NUMBER);
        return new Circle(color.getRandomColor(), radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle = {" + "color: " + getColor()
                + ", radius: " + getRadius()
                + ", area: " + getArea() + "}");
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}
