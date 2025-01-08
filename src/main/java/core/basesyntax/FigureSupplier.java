package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_DIMENSION = 10;
    private static final Figure DEFAULT_FIGURE= new Circle(MAX_DIMENSION, DEFAULT_COLOR);
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    private final int getRandomDimension() {
        return random.nextInt(MAX_DIMENSION) + 1;
    }

    public Figure getRandomFigure() {
        int type = random.nextInt(FIGURE_COUNT);
        Color color = colorSupplier.getRandomColor();

        switch (type) {
            case 0:
                return new Square(
                        getRandomDimension(),
                        color
                );
            case 1:
                return new Rectangle(
                        getRandomDimension(),
                        getRandomDimension(),
                        color
                );
            case 2:
                return new RightTriangle(
                        getRandomDimension(),
                        getRandomDimension(),
                        color
                );
            case 3:
                return new Circle(
                        getRandomDimension(),
                        color);
            case 4:
                return new IsoscelesTrapezoid(
                        getRandomDimension(),
                        getRandomDimension(),
                        getRandomDimension(),
                        color);
            default:
                return DEFAULT_FIGURE;
        }
    }

    public Figure getDefaultFigure() {
        return DEFAULT_FIGURE;
    }
}