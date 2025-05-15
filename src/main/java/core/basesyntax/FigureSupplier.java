package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURE_COUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return new Circle(
                        colorSupplier.getRandomColor(),
                        generateRandomSize()
                );
            case 1:
                return new Square(
                        colorSupplier.getRandomColor(),
                        generateRandomSize()
                );
            case 2:
                return new Rectangle(
                        colorSupplier.getRandomColor(),
                        generateRandomSize(),
                        generateRandomSize()
                );
            case 3:
                return new RightTriangle(
                        colorSupplier.getRandomColor(),
                        generateRandomSize(),
                        generateRandomSize()
                );
            case 4:
                return new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(),
                        generateRandomSize(),
                        generateRandomSize(),
                        generateRandomSize()
                );
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }

    private int generateRandomSize() {
        return random.nextInt(10) + 1;
    }
}
