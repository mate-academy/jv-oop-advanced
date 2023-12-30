package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private static final int LIMIT = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FigureType.values().length);
        FigureType figures = FigureType.values()[figureIndex];
        switch (figures) {
            case SQUARE:
                return getRandomSquare();
            case RECTANGLE:
                return getRandomRectangle();
            case RIGHT_TRIANGLE:
                return getRandomRightTriangle();
            case CIRCLE:
                return getRandomCircle();
            case ISOSCELES_TRAPEZOID:
                return getRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(LIMIT));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(LIMIT),random.nextInt(LIMIT));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(LIMIT), random.nextInt(LIMIT));
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(LIMIT));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(LIMIT), random.nextInt(LIMIT), random.nextInt(LIMIT));
    }
}
