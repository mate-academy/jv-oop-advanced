package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_AMOUNT = 5;
    private static final int MAX_RANDOM_NUMBER = 35;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private static final int DEFAULT_LENGTH = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_AMOUNT);

        switch (figureNumber) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomCircle();
            default:
                return getRandomTrapezoid();
        }
    }

    private Square getRandomSquare() {
        int sideLength = getRandomLength();
        String color = colorSupplier.getRandomColor();

        return new Square(sideLength, color);
    }

    private int getRandomLength() {
        int sideLength = random.nextInt(MAX_RANDOM_NUMBER);
        return sideLength;
    }

    private Rectangle getRandomRectangle() {
        int sideLength1 = random.nextInt(MAX_RANDOM_NUMBER);
        int sideLength2 = random.nextInt(MAX_RANDOM_NUMBER);
        String randomColor = colorSupplier.getRandomColor();
        String color = colorSupplier.getRandomColor();

        return new Rectangle(sideLength1, sideLength2, color);
    }

    private RightTriangle getRandomRightTriangle() {
        int firstLeg = random.nextInt(MAX_RANDOM_NUMBER);
        int secondLeg = random.nextInt(MAX_RANDOM_NUMBER);
        String color = colorSupplier.getRandomColor();

        return new RightTriangle(firstLeg, secondLeg, color);
    }

    private IsoscelesTrapezoid getRandomTrapezoid() {
        int firstBase = random.nextInt(MAX_RANDOM_NUMBER);
        int secondBase = random.nextInt(MAX_RANDOM_NUMBER);
        int height = random.nextInt(MAX_RANDOM_NUMBER);
        String randomColor = colorSupplier.getRandomColor();
        String color = colorSupplier.getRandomColor();

        return new IsoscelesTrapezoid(firstBase, secondBase, height, color);
    }

    private Circle getRandomCircle() {
        int radius = random.nextInt(MAX_RANDOM_NUMBER);
        String color = colorSupplier.getRandomColor();

        return new Circle(radius, color);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_LENGTH, DEFAULT_COLOR);
    }
    // Що тут змінити?
}
