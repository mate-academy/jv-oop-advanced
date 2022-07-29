package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_RANGE = 100;
    private static final int CIRCLE_DEFAULT_RADIUS = 10;

    public FigureObject getRandomFigure() {
        ColorSupplier supplier = new ColorSupplier();
        Random random = new Random();
        Figure randomFigure = Figure.values()[new Random()
                .nextInt(Figure.values().length)];

        switch (randomFigure) {
            case SQUARE:
                return new Square(supplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_RANGE));
            case RECTANGLE:
                return new Rectangle(supplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_RANGE),
                        random.nextInt(MAX_RANDOM_RANGE));
            case RIGHT_TRIANGLE:
                return new RightTriangle(supplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_RANGE),
                        random.nextInt(MAX_RANDOM_RANGE));
            case CIRCLE:
                return new Circle(supplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_RANGE));
            default:
                return new IsoscelesTrapezoid(supplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_RANGE),
                        random.nextInt(MAX_RANDOM_RANGE),
                        random.nextInt(MAX_RANDOM_RANGE));
        }
    }

    public FigureObject getDefaultFigure() {
        return new Circle(Color.WHITE, CIRCLE_DEFAULT_RADIUS);
    }
}
