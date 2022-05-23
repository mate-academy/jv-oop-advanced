package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_BOUND = 20;
    private static final int MIN_BOUND = 1;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        FigureType figureType = FigureType.values()[random.nextInt(FigureType.values().length)];
        switch (figureType) {
            case CIRCLE:
                return getRandomCircle();
            case RECTANGLE:
                return getRandomRectangle();
            case SQUARE:
                return getRandomSquare();
            case TRAPEZOID:
                return getRandomTrapezoid();
            case TRIANGLE:
                return getRandomTriangle();
            default:
                return getDefaultFigure();
        }
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                getRandomBound());
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                getRandomBound());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomBound(),
                getRandomBound());
    }

    private IsoscelesTrapezoid getRandomTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomBound(),
                getRandomBound(),
                getRandomBound());
    }

    private RightTriangle getRandomTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomBound(),
                getRandomBound());
    }

    private int getRandomBound() {
        return random.nextInt(MAX_BOUND) + MIN_BOUND;
    }
}
