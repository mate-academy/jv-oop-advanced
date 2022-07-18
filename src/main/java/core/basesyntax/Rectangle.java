package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private static final int MAX_WIDTH = 20;
    private static final int MAX_HEIGHT = 20;
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName().toLowerCase()
                + ", area: " + getArea() + ", width: " + width + ",height: " + height
                + ", color: " + getColor() + ".");
    }

    public Rectangle getRandomRectangle() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Rectangle(random.nextInt(MAX_WIDTH), random.nextInt(MAX_HEIGHT),
                colorSupplier.getRandomColor());
    }
}
