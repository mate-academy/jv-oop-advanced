package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MAX_FIGURE_SIZE = 11.0;
    private static final double DEFAULT_RADIUS = 10.0;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int NUMBER_OF_FIGURES = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(NUMBER_OF_FIGURES);
        String randomColor = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                return createSquare(randomColor);
            case 1:
                return createRectangle(randomColor);
            case 2:
                return createRightTriangle(randomColor);
            case 3:
                return createCircle(randomColor);
            case 4:
                return createIsoscelesTrapezoid(randomColor);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private double getRandomValue() {
        return random.nextDouble() * MAX_FIGURE_SIZE;
    }

    private Figure createSquare(String randomColor) {
        return new Square(randomColor, getRandomValue());
    }

    private Figure createRectangle(String randomColor) {
        return new Rectangle(randomColor, getRandomValue(), getRandomValue());
    }

    private Figure createRightTriangle(String randomColor) {
        return new RightTriangle(randomColor, getRandomValue(),
                getRandomValue());
    }

    private Figure createCircle(String randomColor) {
        return new Circle(randomColor, getRandomValue());
    }

    private Figure createIsoscelesTrapezoid(String randomColor) {
        return new IsoscelesTrapezoid(randomColor, getRandomValue(),
                getRandomValue(), getRandomValue());
    }
}
