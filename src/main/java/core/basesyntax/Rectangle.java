package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private final int width;
    private final int height;

    public Rectangle() {
        Random random = new Random();
        this.width = random.nextInt(1, 10);
        this.height = random.nextInt(1, 10);
        this.color = new ColorSupplier().getRandomColor();
    }

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (double)width * (double)height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + this.getArea()
                + " sq. units, width: " + width
                + " units, height: " + height
                + " units, color: " + color);
    }
}
