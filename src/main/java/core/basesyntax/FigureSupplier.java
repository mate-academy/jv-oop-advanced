package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_DIMENSION = 10;
    private static final int MAX_FIGURES = 5;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int figureType = random.nextInt(MAX_FIGURES);
        String color = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                return new Square((random.nextInt(MAX_DIMENSION) + 1) * MAX_DIMENSION, color);
            case 1:
                return new RightTriangle((random.nextInt(MAX_DIMENSION) + 1) * MAX_DIMENSION,
                        (random.nextInt(MAX_DIMENSION) + 1) * MAX_DIMENSION, color);
            case 2:
                return new Rectangle((random.nextInt(MAX_DIMENSION) + 1) * MAX_DIMENSION,
                        (random.nextInt(MAX_DIMENSION) + 1) * MAX_DIMENSION, color);
            case 3:
                return new IsoscelesTrapezoid((random.nextInt(MAX_DIMENSION) + 1) * MAX_DIMENSION,
                        (random.nextInt(MAX_DIMENSION) + 1) * MAX_DIMENSION,
                        (random.nextInt(MAX_DIMENSION) + 1) * MAX_DIMENSION, color);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }
}
