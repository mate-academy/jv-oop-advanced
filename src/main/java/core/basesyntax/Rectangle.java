package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private String color = colorSupplier.getRandomColor();
    static final int MAX_SIDE = 6;
    static final int MAX_BASE = 10;
    private double side = random.nextInt(MAX_SIDE) + 1;
    private double base = random.nextInt(MAX_BASE) + MAX_SIDE + 1;

    public Rectangle() {
    }

    public Rectangle(String color) {
        super(color);
    }

    public double getSide() {
        return side;
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
        System.out.println("Figure: Rectangle" + ", area: "
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
