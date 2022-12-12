package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int DEFAULT_RADIUS = 10;
    private static final int MAX_LENGTH_RANDOM_NUMBER = 30;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random;

    public FigureSupplier() {
        random = new Random();
    }

    public Figure getRandomFigure() {
        int randomFigureIndex = random.nextInt(FIGURE_COUNT);
        switch (randomFigureIndex) {
            case 0:
                return getRandomIsoscelesTrapezoid();
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomSquare();
            default:
                return getRandomRightTriangle();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int randomUpLeg = random.nextInt(MAX_LENGTH_RANDOM_NUMBER);
        int randomRightLeg = random.nextInt(MAX_LENGTH_RANDOM_NUMBER);
        int randomDownLeg = random.nextInt(MAX_LENGTH_RANDOM_NUMBER);
        int randomHigh = random.nextInt(MAX_LENGTH_RANDOM_NUMBER);
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                randomUpLeg, randomRightLeg, randomDownLeg, randomHigh);
    }

    private Circle getRandomCircle() {
        int randomRadius = random.nextInt(MAX_LENGTH_RANDOM_NUMBER);
        return new Circle(colorSupplier.getRandomColor(), randomRadius);
    }

    private Rectangle getRandomRectangle() {
        int randomFirstLeg = random.nextInt(MAX_LENGTH_RANDOM_NUMBER);
        int randomSecondLeg = random.nextInt(MAX_LENGTH_RANDOM_NUMBER);
        int randomDownLeg = random.nextInt(MAX_LENGTH_RANDOM_NUMBER);
        int randomHigh = random.nextInt(MAX_LENGTH_RANDOM_NUMBER);
        return new Rectangle(colorSupplier.getRandomColor(), randomFirstLeg, randomSecondLeg);
    }

    private RightTriangle getRandomRightTriangle() {
        int randomFirstLeg = random.nextInt(MAX_LENGTH_RANDOM_NUMBER);
        int randomSecondLeg = random.nextInt(MAX_LENGTH_RANDOM_NUMBER);
        int randomHypotenuse = random.nextInt(MAX_LENGTH_RANDOM_NUMBER);
        int randomHigh = random.nextInt(MAX_LENGTH_RANDOM_NUMBER);
        return new RightTriangle(colorSupplier.getRandomColor(),
                randomFirstLeg, randomSecondLeg, randomHypotenuse);
    }

    private Square getRandomSquare() {
        int randomSide = random.nextInt(MAX_LENGTH_RANDOM_NUMBER);
        return new Square(colorSupplier.getRandomColor(), randomSide);
    }
}
