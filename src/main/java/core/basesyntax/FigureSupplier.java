package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 4;
    private static final int MAX_LENGTH = 99;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
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

    private Square getRandomSquare() {
        return new Square(
                colorSupplier.getRandomColor(),
                random.nextInt(MAX_LENGTH));
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(
                colorSupplier.getRandomColor(),
                random.nextInt(MAX_LENGTH),
                random.nextInt(MAX_LENGTH));
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(
                colorSupplier.getRandomColor(),
                random.nextInt(MAX_LENGTH),
                random.nextInt(MAX_LENGTH));
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                random.nextInt(MAX_LENGTH),
                random.nextInt(MAX_LENGTH),
                random.nextInt(MAX_LENGTH));
    }

    private Circle getRandomCircle() {
        return new Circle(
                colorSupplier.getRandomColor(),
                random.nextInt(MAX_LENGTH));
    }

    public Figure getDefaultFigure() {
        return new Circle(
                Color.WHITE.name(),
                DEFAULT_CIRCLE_RADIUS);
    }
}
