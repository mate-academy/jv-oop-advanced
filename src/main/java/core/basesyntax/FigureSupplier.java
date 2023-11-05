package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int INDEX_BOUND = 5;
    private static final int SIDE_BOUND = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_LENGTH = 10;
    private static final Random index = new Random();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        return switch (index.nextInt(INDEX_BOUND)) {
            case 0 -> prepareCircle();
            case 1 -> preparedSquare();
            case 2 -> prepareRectangle();
            case 3 -> prepareTrapezoid();
            default -> prepareTriangle();
        };
    }

    public Figure getDefaultFigure() {
        return defaultFigure();
    }

    private int side() {
        final int minLength = 1;
        return random.nextInt(minLength, SIDE_BOUND);
    }

    private Circle prepareCircle() {
        return new Circle(colorSupplier.getRandomColor(), side());
    }

    private Square preparedSquare() {
        return new Square(colorSupplier.getRandomColor(), side());
    }

    private Rectangle prepareRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), side(), side());
    }

    private IsoscelesTrapezoid prepareTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), side(), side());
    }

    private RightTriangle prepareTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), side(), side());
    }

    private Circle defaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_LENGTH);
    }
}
