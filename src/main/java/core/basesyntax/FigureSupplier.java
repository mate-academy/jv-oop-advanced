package core.basesyntax;

import java.util.Locale;
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
                return new Circle(colorSupplier.getRandomColor(), getRandomDouble());
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), getRandomDouble());
            case RIGHT_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomDouble(), getRandomDouble());
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomDouble(), getRandomDouble());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomDouble(),
                        getRandomDouble(), getRandomDouble());
            default:
                return getDefaultFigure();
        }
    }

    public AbstractFigure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), 10);
    }

    private double getRandomDouble() {
        return random.nextDouble() * RANDOM_LIMIT;
    }
}
