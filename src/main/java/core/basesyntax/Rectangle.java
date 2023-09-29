package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private String name = "Rectangle";
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private String color = colorSupplier.getRandomColor();
    private final int maxSide = 6;
    private final int maxBase = 10;
    private double side = random.nextInt(maxSide) + 1;
    private double base = random.nextInt(maxBase) + maxSide + 1;

    public Rectangle() {
    }

    public Rectangle(String color) {
        super(color);
    }

    public double getSide() {
        return side;
    }

    public String getName() {
        return name;
    }

    public double getBase() {
        return base;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return side * base;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: "
                + getArea() + " sq.units" + ", side: "
                + getSide() + " units" + ", base: " + getBase()
                + " units" + ", perimeter: " + getPerimeter()
                + " units" + ", color: " + getColor());
    }

    @Override
    public double getPerimeter() {
        return side * 2 + base * 2;
    }
}
