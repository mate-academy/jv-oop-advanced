package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int figuresCount = FigureType.values().length;
    private final int radius = 10;
    private final int length = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure;
        FigureType randomFigureType = FigureType.values()[random.nextInt(figuresCount)];

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
        return new Circle(radius, Color.WHITE.name());
    }

    private int getRandomLength() {
        return random.nextInt(length) + 1;
    }
}
