package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIDE_LENGTH = 101;
    private static final int DEFAULT_RADIUS = 10;
    private final Figure defaultFigure = new Circle(Color.WHITE, DEFAULT_RADIUS);
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    private enum Figures {
        CIRCLE, RECTANGLE, SQUARE, RIGHT_TRIANGLE, ISOSCELES_TRAPEZOID
    }

    private final Figures[] figures = Figures.values();

    public Figure getRandomFigure() {
        switch (figures[random.nextInt(figures.length)]) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIDE_LENGTH));
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIDE_LENGTH), random.nextInt(MAX_SIDE_LENGTH));
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_SIDE_LENGTH));
            case RIGHT_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIDE_LENGTH), random.nextInt(MAX_SIDE_LENGTH));
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIDE_LENGTH), random.nextInt(MAX_SIDE_LENGTH),
                        random.nextInt(MAX_SIDE_LENGTH));
            default:
                return defaultFigure;
        }
    }

    public Figure getDefaultFigure() {
        return defaultFigure;
    }
}
