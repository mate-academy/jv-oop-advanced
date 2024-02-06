package core.basesyntax;

import java.util.Random;

public class FigureSuplier {
    private static final int MAX_RANDOM_NUMBER = 50;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final Color DEFAULT_CIRCLE_COLOR = Color.WHITE;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureType.values().length);
        FigureType randomFigureType = FigureType.values()[index];
        switch (randomFigureType) {
            case SQUARE:
                return getRandomSquare();
            case CIRCLE:
                return getRandomCircle();
            case RECTANGLE:
                return getRandomRectangle();
            case RIGHT_TRIANGLE:
                return getRandomTriangle();
            default:
                return getRandomTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                MAX_RANDOM_NUMBER);
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextDouble() * MAX_RANDOM_NUMBER);
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextDouble() * MAX_RANDOM_NUMBER,
                random.nextDouble() * MAX_RANDOM_NUMBER);
    }

    private RightTriangle getRandomTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextDouble() * MAX_RANDOM_NUMBER,
                random.nextDouble() * MAX_RANDOM_NUMBER);
    }

    private IsoscelesTrapezoid getRandomTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextDouble() * MAX_RANDOM_NUMBER,
                random.nextDouble() * MAX_RANDOM_NUMBER,
                random.nextDouble() * MAX_RANDOM_NUMBER);
    }
}
