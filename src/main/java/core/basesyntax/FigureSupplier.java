package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_VALUE = 10;
    private static final int MIN_VALUE = 1;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FigureType.values().length);
        switch (figureNumber) {
            case 0:
                return createSquare();
            case 1:
                return createRectangle();
            case 2:
                return createRightTriangle();
            case 3:
                return createCircle();
            default:
                return createIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure createSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE) + MIN_VALUE);
    }

    private Figure createRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE) + MIN_VALUE, random.nextInt(MAX_VALUE) + MIN_VALUE);
    }

    private Figure createRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE) + MIN_VALUE, random.nextInt(MAX_VALUE) + MIN_VALUE);
    }

    private Figure createCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE) + MIN_VALUE);
    }

    private Figure createIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE) + MIN_VALUE,
                random.nextInt(MAX_VALUE) + MIN_VALUE,
                random.nextInt(MAX_VALUE) + MIN_VALUE);
    }
}
