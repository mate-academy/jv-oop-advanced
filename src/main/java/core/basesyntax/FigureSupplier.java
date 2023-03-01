package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 10;
    private static final int DEFAULT_SIZE = 10;
    private static final String DEFAULT_COLOR = String.valueOf(Color.WHITE).toLowerCase();
    private static final String DEFAULT_FIGURE = String.valueOf(FigureType.CIRCLE).toLowerCase();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private FigureType randomFigure;

    public Figure getRandomFigure() {
        randomFigure = FigureType.values()[random.nextInt(FigureType.values().length)];
        switch (randomFigure) {
            case SQUARE:
                return getSquare();
            case RECTANGLE:
                return getRectangle();
            case RIGHT_TRIANGLE:
                return getRightTriangle();
            case CIRCLE:
                return getCircle();
            case ISOSCELES_TRAPEZOID:
                return getIsoscelesTrapezoid();
            default:
                return getRandomFigure();
        }
    }

    private Figure getSquare() {
        return new Square(randomFigure.name().toLowerCase(),
                colorSupplier.getRandomColor().toLowerCase(),
                random.nextInt(MAX_VALUE));
    }

    private Figure getRectangle () {
        return new Rectangle(randomFigure.name().toLowerCase(),
                colorSupplier.getRandomColor().toLowerCase(),
                random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE));
    }

    private Figure getRightTriangle() {
        return new RightTriangle(randomFigure.name()
                .substring(randomFigure.name().indexOf("_") + 1)
                .toLowerCase(),
                colorSupplier.getRandomColor().toLowerCase(),
                random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE));
    }

    private Figure getCircle() {
        return new Circle(randomFigure.name().toLowerCase(),
                colorSupplier.getRandomColor().toLowerCase(),
                random.nextInt(MAX_VALUE));
    }

    private Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(randomFigure.name()
                .substring(randomFigure.name().indexOf("_") + 1)
                .toLowerCase(),
                colorSupplier.getRandomColor().toLowerCase(),
                random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE));
    }
    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE, DEFAULT_COLOR, DEFAULT_SIZE);
    }
}
