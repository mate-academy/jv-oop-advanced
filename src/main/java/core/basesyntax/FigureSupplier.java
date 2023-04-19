package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int NUM_OF_CLASSES = 5;
    public static final int DEFAULT_RADIUS = 10;
    public static final int MAX_SIZE = 100;
    private final Random random = new Random();
    private final Color randomColor = Color.valueOf(new ColorSupplier().getRandomColor());

    public Figure getRandomFigure() {
        switch (random.nextInt(NUM_OF_CLASSES)) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomSquare();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE);
    }

    public Figure getRandomCircle() {
        int randomSize = random.nextInt(MAX_SIZE);
        return new Circle(randomSize, randomColor);
    }

    public Figure getRandomIsoscelesTrapezoid() {
        int randomSize1 = random.nextInt(MAX_SIZE);
        int randomSize2 = random.nextInt(MAX_SIZE);
        int randomSize3 = random.nextInt(MAX_SIZE);
        return new IsoscelesTrapezoid(
                randomSize1,
                randomSize2,
                randomSize3,
                randomColor);
    }

    public Figure getRandomRectangle() {
        int randomSize1 = random.nextInt(MAX_SIZE);
        int randomSize2 = random.nextInt(MAX_SIZE);
        return new Rectangle(randomSize1, randomSize2, randomColor);
    }

    public Figure getRandomRightTriangle() {
        int randomSize1 = random.nextInt(MAX_SIZE);
        int randomSize2 = random.nextInt(MAX_SIZE);
        return new RightTriangle(randomSize1, randomSize2, randomColor);
    }

    public Figure getRandomSquare() {
        int randomSize = random.nextInt(MAX_SIZE);
        return new Square(randomSize, randomColor);
    }
}
