package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private static final int MAX_NUMBER = 100;
    private int width;
    private int height;
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Rectangle getRandomRectangle() {
        int width = random.nextInt(MAX_NUMBER);
        int height = random.nextInt(MAX_NUMBER);
        return new Rectangle(color.getRandomColor(), width, height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle = {" + "color: " + getColor() + ", width: " + getWidth()
                + ", height: " + getHeight() + ", area: " + getArea() + "}");
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
