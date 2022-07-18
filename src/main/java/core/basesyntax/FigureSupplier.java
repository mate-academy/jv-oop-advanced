package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_NUMBER = 5;
    private static final int MAX_RANDOM_NUMBER = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(FIGURES_NUMBER);
        switch (randomIndex) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomRectangle();
            case 4:
            default:
                return getIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(MAX_RANDOM_NUMBER,DEFAULT_COLOR);
    }

    private int generateNumber(int maxValue) {
        int minValue = 1;
        return random.nextInt(maxValue - minValue) + minValue;
    }

    private Circle getRandomCircle() {
        int radius = generateNumber(MAX_RANDOM_NUMBER);
        String randomColor = colorSupplier.getRandomColor();
        return new Circle(radius, randomColor);
    }

    private Square getRandomSquare() {
        int side = generateNumber(MAX_RANDOM_NUMBER);
        String randomColor = colorSupplier.getRandomColor();
        return new Square(side, randomColor);
    }

    private RightTriangle getRandomRightTriangle() {
        int firstSide = generateNumber(MAX_RANDOM_NUMBER);
        int secondSide = generateNumber(MAX_RANDOM_NUMBER);
        String randomColor = colorSupplier.getRandomColor();
        return new RightTriangle(firstSide, secondSide, randomColor);
    }

    private Rectangle getRandomRectangle() {
        int base = generateNumber(MAX_RANDOM_NUMBER);
        int height = generateNumber(MAX_RANDOM_NUMBER);
        String randomColor = colorSupplier.getRandomColor();
        return new Rectangle(base, height, randomColor);
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        int firstBase = generateNumber(MAX_RANDOM_NUMBER);
        int secondBase = generateNumber(MAX_RANDOM_NUMBER);
        int height = generateNumber(MAX_RANDOM_NUMBER);
        String randomColor = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(firstBase, secondBase, height, randomColor);
    }
}
