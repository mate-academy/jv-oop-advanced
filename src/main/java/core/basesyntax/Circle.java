package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private static final int MAX_RADIUS = 20;
    private int radius;

    public Circle() {
    }

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    Circle(String color) {
        super(color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName().toLowerCase()
                + ", area: " + getArea() + ", radius: " + radius + ", color: " + getColor() + ".");
    }

    public Circle getRandomCircle() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Circle(random.nextInt(MAX_RADIUS), colorSupplier.getRandomColor());
    }
}
