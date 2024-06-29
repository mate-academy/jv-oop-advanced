package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MAX_FIGURE_SIZE = 11.0;
    private static final double DEFAULT_RADIUS = 10.0;
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

    public Figure createNewSquare() {
        double randomValue = random.nextDouble() * MAX_FIGURE_SIZE;
        return new Square(colorSupplier.getRandomColor(), randomValue);
    }

    public Figure createNewRectangle() {
        double randomValue = random.nextDouble() * MAX_FIGURE_SIZE;
        return new Rectangle(colorSupplier.getRandomColor(), randomValue, randomValue);
    }

    public Figure createNewRightTriangle() {
        double randomValue = random.nextDouble() * MAX_FIGURE_SIZE;
        return new RightTriangle(colorSupplier.getRandomColor(), randomValue, randomValue);
    }

    public Figure createNewCircle() {
        double randomValue = random.nextDouble() * MAX_FIGURE_SIZE;
        return new Circle(colorSupplier.getRandomColor(), randomValue);
    }

    public Figure createNewIsoscelesTrapezoid() {
        double randomValue = random.nextDouble() * MAX_FIGURE_SIZE;
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                randomValue, randomValue, randomValue);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }
}
