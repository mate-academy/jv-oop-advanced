package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private static final double MAX_SIZE = 10.0;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int MAX_COUNT = 5;
    private final Random random = new Random();

    private Figure createSquare() {
        return new Square(generateRandomColor(), generateSizePartFigure());
    }

    private Figure createRectangle() {
        return new Rectangle(generateRandomColor(),
                generateSizePartFigure(),
                generateSizePartFigure());
    }

    private Figure createRightTriangle() {
        return new RightTriangle(generateRandomColor(),
                generateSizePartFigure(),
                generateSizePartFigure());
    }

    private Figure createCircle() {
        return new Circle(generateRandomColor(), generateSizePartFigure());
    }

    private Figure createIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(generateRandomColor(),
                generateSizePartFigure(),
                generateSizePartFigure(),
                generateSizePartFigure());
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(MAX_COUNT)) {
            case 0:
                return createSquare();
            case 1:
                return createRectangle();
            case 2:
                return createRightTriangle();
            case 3:
                return createCircle();
            case 4:
                return createIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, MAX_SIZE);
    }

    private String generateRandomColor() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return colorSupplier.getRandomColor();
    }

    private double generateSizePartFigure() {
        return random.nextDouble() * MAX_SIZE;
    }
}
