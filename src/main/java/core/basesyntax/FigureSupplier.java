package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIDE_LENGTH = 100;
    private static final int DEFAULT_RADIUS_OF_CIRCLE = 10;
    private static final int NUMBER_OF_FIGURES = 5;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(NUMBER_OF_FIGURES);
        return switch (figureIndex) {
            case 0 -> createRandomCircle();
            case 1 -> createRandomRectangle();
            case 2 -> createRandomIsoscelesTrapezoid();
            case 3 -> createRandomSquare();
            case 4 -> createRandomRightTriangle();
            default -> throw new IllegalStateException("Unexpected value: "
                    + figureIndex);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS_OF_CIRCLE);
    }

    private Square createRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomSize());
    }

    private RightTriangle createRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), getRandomSize(), getRandomSize());
    }

    private Rectangle createRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomSize(), getRandomSize());
    }

    private IsoscelesTrapezoid createRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomSize(), getRandomSize(),
                getRandomSize());
    }

    private Circle createRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomSize());
    }

    private int getRandomSize() {
        return random.nextInt(MAX_SIDE_LENGTH) + 1;
    }
}
