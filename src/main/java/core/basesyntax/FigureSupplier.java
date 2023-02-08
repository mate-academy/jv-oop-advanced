package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_LIMIT = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public AbstractFigure getRandomFigure() {
        Figure[] figures = Figure.values();
        Figure figure = figures[random.nextInt(figures.length)];

        switch (figure) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(), randomDouble());
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), randomDouble());
            case TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        randomDouble(), randomDouble());
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(),
                        randomDouble(), randomDouble());
            case TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), randomDouble(),
                        randomDouble(), randomDouble());
            default:
                return getDefaultFigure();
        }
    }

    public AbstractFigure getDefaultFigure() {
        return new Circle("white", 10);
    }

    private double randomDouble() {
        return random.nextDouble() * RANDOM_LIMIT;
    }
}
