package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final int MAX_DIMENSION = 10;
    private static final int MIN_DIMENSION = 1;
    private static final int DEFAULT_RADIUS = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private int getRandomDimension() {
        return random.nextInt(MAX_DIMENSION) + MIN_DIMENSION;
    }

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int figureType = random.nextInt(FIGURE_TYPES_COUNT);

        switch (figureType) {
            case 0:
                return new Square(color, getRandomDimension());
            case 1:
                return new Rectangle(
                        color,
                        getRandomDimension(),
                        getRandomDimension()
                );
            case 2:
                return new RightTriangle(
                        color,
                        getRandomDimension(),
                        getRandomDimension()
                );
            case 3:
                 return new Circle(color, getRandomDimension());
            default:
                return new IsoscelesTrapezoid(
                        color,
                        getRandomDimension(),
                        getRandomDimension(),
                        getRandomDimension()
                );
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
