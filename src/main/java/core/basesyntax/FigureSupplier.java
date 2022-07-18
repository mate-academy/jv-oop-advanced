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

    private Circle getRandomCircle() {
        int radius = random.nextInt(MAX_RANDOM_NUMBER);
        String randomColor = colorSupplier.getRandomColor();
        return new Circle(radius, randomColor);
    }

    private Square getRandomSquare() {
        int side = random.nextInt(MAX_RANDOM_NUMBER);
        String randomColor = colorSupplier.getRandomColor();
        return new Square(side, randomColor);
    }

    private RightTriangle getRandomRightTriangle() {
        int firstSide = random.nextInt(MAX_RANDOM_NUMBER);
        int secondSide = random.nextInt(MAX_RANDOM_NUMBER);
        String randomColor = colorSupplier.getRandomColor();
        return new RightTriangle(firstSide, secondSide, randomColor);
    }

    private Rectangle getRandomRectangle() {
        int base = random.nextInt(MAX_RANDOM_NUMBER);
        int height = random.nextInt(MAX_RANDOM_NUMBER);
        String randomColor = colorSupplier.getRandomColor();
        return new Rectangle(base, height, randomColor);
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        int firstBase = random.nextInt(MAX_RANDOM_NUMBER);
        int secondBase = random.nextInt(MAX_RANDOM_NUMBER);
        int height = random.nextInt(MAX_RANDOM_NUMBER);
        String randomColor = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(firstBase, secondBase, height, randomColor);
    }
}
