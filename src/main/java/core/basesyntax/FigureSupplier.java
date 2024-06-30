package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MAX_FIGURE_SIZE = 11.0;
    private static final double DEFAULT_RADIUS = 10.0;
    private static final String DEFAULT_FIGURE_COLOR = Color.WHITE.toString();
    private static final int NUMBER_OF_FIGURES = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(NUMBER_OF_FIGURES);

        switch (figureType) {
            case 0:
                return createNewSquare();
            case 1:
                return createNewRectangle();
            case 2:
                return createNewRightTriangle();
            case 3:
                return createNewCircle();
            case 4:
                return createNewIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public double getRandomValue() {
        return random.nextDouble() * MAX_FIGURE_SIZE;
    }

    private Figure createNewSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomValue());
    }

    private Figure createNewRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomValue(), getRandomValue());
    }

    private Figure createNewRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), getRandomValue(),
                getRandomValue());
    }

    private Figure createNewCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomValue());
    }

    private Figure createNewIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomValue(), getRandomValue(), getRandomValue());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE_COLOR, DEFAULT_RADIUS);
    }
}
