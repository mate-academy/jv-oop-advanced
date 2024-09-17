package core.basesyntax.figure;

import java.util.Random;

public class FigureSupplier {
    public static final int MIN_RANDOM_NUMBER = 1;
    public static final int MAX_RANDOM_NUMBER = 20;
    public static final int LIMIT = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomIndex = (int)(Math.random() * LIMIT);
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        switch (randomIndex) {
            case 0:
                return new Circle(getRandomNum(), randomColor);
            case 1:
                return new Rectangle(getRandomNum(), getRandomNum(), randomColor);
            case 2:
                return new Square(getRandomNum(), randomColor);
            case 3:
                return new Trapezoid(getRandomNum(), getRandomNum(), getRandomNum(), randomColor);
            default:
                return new Triangle(getRandomNum(), getRandomNum(), randomColor);
        }
    }

    private int getRandomNum() {
        return (int)(Math.random()
                * (MAX_RANDOM_NUMBER - MIN_RANDOM_NUMBER + 1) + MIN_RANDOM_NUMBER);
    }
}
