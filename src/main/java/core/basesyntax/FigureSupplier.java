package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int LENGTH = 100;
    private static final int RADIUS = 10;
    private static final int FIGURES_COUNT = FigureType.values().length;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure;
        FigureType randomFigureType = FigureType.values()[random.nextInt(FIGURES_COUNT)];

        switch (randomFigureType) {
            case SQUARE:
                figure = new Square(getRandomLength(),
                        colorSupplier.getRandomColor());
                break;
            case RIGHT_TRIANGLE:
                figure = new RightTriangle(getRandomLength(),
                        getRandomLength(),
                        colorSupplier.getRandomColor());
                break;
            case RECTANGLE:
                figure = new Rectangle(getRandomLength(),
                        getRandomLength(),
                        colorSupplier.getRandomColor());
                break;
            case ISOSCELES_TRAPEZOID:
                figure = new IsoscelesTrapezoid(getRandomLength(),
                        getRandomLength(),
                        getRandomLength(),
                        colorSupplier.getRandomColor());
                break;
            default:
                figure = new Circle(getRandomLength(),
                        colorSupplier.getRandomColor());
                break;
        }

        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(RADIUS, Color.WHITE.name());
    }

    private int getRandomLength() {
        return random.nextInt(LENGTH) + 1;
    }
}
