package core.basesyntax;

import java.util.Random;

public final class FigureSupplier {
    private static final double DIMENSION_LIMIT = 100.0;
    private static final double DEFAULT_RADIUS = 10;
    private static final int FIGURE_TYPE_COUNT = 4;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        final ColorSupplier colorSupplier = new ColorSupplier();
        int figureIndex = random.nextInt(FIGURE_TYPE_COUNT);

        switch (figureIndex) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomDimension());
            case 1:
                return new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(),
                        getRandomDimension(),
                        getRandomDimension(),
                        getRandomDimension());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                                     getRandomDimension(),
                                     getRandomDimension());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                                         getRandomDimension(),
                                         getRandomDimension());
            case 4:
                return new Square(colorSupplier.getRandomColor(), getRandomDimension());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), DEFAULT_RADIUS);
    }

    private double getRandomDimension() {
        return random.nextDouble() * DIMENSION_LIMIT;
    }
}
