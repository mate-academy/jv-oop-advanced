package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private String color = colorSupplier.getRandomColor();
    static final int MAX_RADIUS = 10;
    private double radius = random.nextInt(MAX_RADIUS) + 1;

    public Circle() {
    }

    public Circle(String color, double radius) {

        this.radius = radius;
        this.color = color;
    }

    public String getColorSupplier() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle" + ", area: " + getArea()
                + " sq.units" + ", radius: "
                + getRadius() + " units" + ", perimeter: " + getPerimeter()
                + " units" + ", color: " + getColorSupplier());
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }
}
