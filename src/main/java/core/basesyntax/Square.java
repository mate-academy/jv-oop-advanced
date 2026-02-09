package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private int width;
    private int height;

    public Square(String color, int width, int height) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return (double) width * height;
    }

    public static Square getRandomSquare() {
        Random random = new Random();
        Colors [] colors = Colors.values();
        int randomColorIndex = random.nextInt(colors.length);
        String randomColor = colors[randomColorIndex].name();
        int randomWidth = random.nextInt(VALUES_BOUND);
        int randomHeight = random.nextInt(VALUES_BOUND);
        return new Square(randomColor, randomWidth, randomHeight);
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
                        + " height"
                        + height
                        + " area"
                        + getArea()
                        + "}"
        );
    }
}
