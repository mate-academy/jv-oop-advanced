package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MAX_VALUE = 20;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigureNumber = random.nextInt(NUMBER_OF_FIGURES);
        switch (randomFigureNumber) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Circle getRandomCircle() {
        int randomRadius = random.nextInt(MAX_VALUE) + 1;
        return new Circle(ColorSupplier.getRandomColor(), randomRadius);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int topParallelSide = random.nextInt(MAX_VALUE) + 1;
        int lowerParallelSide = random.nextInt(MAX_VALUE) + 2;
        int nonParallelSide = random.nextInt(MAX_VALUE) + 1;
        return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(), topParallelSide,
                lowerParallelSide, nonParallelSide);
    }

    private Rectangle getRandomRectangle() {
        int firstSide = random.nextInt(MAX_VALUE) + 1;
        int secondSide = random.nextInt(MAX_VALUE) + 1;
        return new Rectangle(ColorSupplier.getRandomColor(), firstSide, secondSide);
    }

    private RightTriangle getRandomRightTriangle() {
        int firstLeg = random.nextInt(MAX_VALUE) + 1;
        int secondLeg = random.nextInt(MAX_VALUE) + 1;
        return new RightTriangle(ColorSupplier.getRandomColor(), firstLeg, secondLeg);
    }

    private Square getRandomSquare() {
        int side = random.nextInt(MAX_VALUE) + 1;
        return new Square(ColorSupplier.getRandomColor(), side);
    }
}
