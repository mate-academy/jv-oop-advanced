package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_RANDOM_NUMBER = 10;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_CIRCLE_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        switch (figureNumber) {
            case 0:
                return getCircle(color);
            case 1:
                return getIsoscelesTrapezoid(color);
            case 2:
                return getRectangle(color);
            case 3:
                return getRightTriangle(color);
            case 4:
            default:
                return getSquare(color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_RADIUS);
    }

    private Circle getCircle(String color) {
        int radius = random.nextInt(MAX_RANDOM_NUMBER);
        return new Circle(color, radius);
    }

    private Square getSquare(String color) {
        int side = random.nextInt(MAX_RANDOM_NUMBER);
        return new Square(color, side);
    }

    private RightTriangle getRightTriangle(String color) {
        int firstLeg = random.nextInt(MAX_RANDOM_NUMBER);
        int secondLeg = random.nextInt(MAX_RANDOM_NUMBER);
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Rectangle getRectangle(String color) {
        int shortSide = random.nextInt(MAX_RANDOM_NUMBER);
        int longSide = random.nextInt(MAX_RANDOM_NUMBER);
        return new Rectangle(color, shortSide, longSide);
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid(String color) {
        int baseSide = random.nextInt(MAX_RANDOM_NUMBER);
        int upSide = random.nextInt(MAX_RANDOM_NUMBER);
        int height = random.nextInt(MAX_RANDOM_NUMBER);
        return new IsoscelesTrapezoid(color, baseSide, upSide, height);
    }
}
