package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private static final int NUMBER = 10;
    private final Random RANDOM = new Random();
    private final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private int radius;

    Circle() {
        setCircle();
    }

    Circle(String color, int radius) {
        this.radius = radius;
        setColor(color);
    }

    private void setCircle() {
        radius = RANDOM.nextInt(NUMBER);
        setColor(COLOR_SUPPLIER.getRandomColor());
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, radius: %d units, color: %s%n",
                getClass().getSimpleName().toLowerCase(), getArea(), radius, getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
