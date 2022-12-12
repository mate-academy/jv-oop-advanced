package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_RANDOM_NUMBER = 50;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(FIGURE_COUNT);
        switch (randomFigure) {
            case 0: return getRandomSquare();
            case 1: return getRandomRightTriangle();
            case 2: return getRandomRectangle();
            case 3: return getRandomCircle();
            case 4: default: return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }

    private Square getRandomSquare() {
        int randomSide = random.nextInt(MAX_RANDOM_NUMBER);
        return new Square(colorSupplier.getRandomColor(), randomSide);
    }

    private RightTriangle getRandomRightTriangle() {
        int randomFirstLeg = random.nextInt(MAX_RANDOM_NUMBER);
        int randomSecondLeg = random.nextInt(MAX_RANDOM_NUMBER);
        return new RightTriangle(colorSupplier.getRandomColor(), randomFirstLeg, randomSecondLeg);
    }

    private Rectangle getRandomRectangle() {
        int randomWidth = random.nextInt(MAX_RANDOM_NUMBER);
        int randomHeight = random.nextInt(MAX_RANDOM_NUMBER);
        return new Rectangle(colorSupplier.getRandomColor(), randomWidth, randomHeight);
    }

    private Circle getRandomCircle() {
        int randomRadius = random.nextInt(MAX_RANDOM_NUMBER);
        return new Circle(colorSupplier.getRandomColor(), randomRadius);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int randomA = random.nextInt(MAX_RANDOM_NUMBER);
        int randomB = random.nextInt(MAX_RANDOM_NUMBER);
        int randomHeight = random.nextInt(MAX_RANDOM_NUMBER);
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                randomA, randomB, randomHeight);
    }
}
