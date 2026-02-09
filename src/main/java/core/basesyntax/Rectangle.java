package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) width * height / 2;
    }

    public static Rectangle getRandomRectangle() {
        Random random = new Random();
        String randomColor = new ColorSupplier().getRandomColor();
        int randomWidth = random.nextInt(VALUES_BOUND);
        int randomHeight = random.nextInt(VALUES_BOUND);

        return new Rectangle(randomColor, randomWidth, randomHeight);
    }

    @Override
    public void draw() {
        System.out.println(
                getClass().getName()
                        + "{"
                        + "color="
                        + getColor()
                        + " width="
                        + width
                        + " height="
                        + height
                        + " area="
                        + getArea()
                        + "}"
        );
    }
}
