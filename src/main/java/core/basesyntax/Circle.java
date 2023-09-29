package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private String name = "circle";
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private String color = colorSupplier.getRandomColor();
    private final int maxRadius = 10;
    private double radius = random.nextInt(maxRadius) + 1;

    public Circle() {
    }

    public Circle(String color, String name, double radius) {
        this.name = name;
        this.radius = radius;
        this.color = color;
    }

    public String getColorSupplier() {
        return color;
    }

    public String getName() {
        return name;
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
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq.units" + ", radius: "
                + getRadius() + " units" + ", perimeter: " + getPerimeter()
                + " units" + ", color: " + getColorSupplier());
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }
}
