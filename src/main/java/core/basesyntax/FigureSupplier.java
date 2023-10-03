package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double MAX_SIZE = 10;
    private static final double MIN_SIZE = 1;
    private static final double DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomChoice = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (randomChoice) {
            case 0:
                return new Square(
                        getRandomSize(),
                        color
                );
            case 1:
                return new Rectangle(
                        getRandomSize(),
                        getRandomSize(),
                        color
                );
            case 2:
                return new RightTriangle(
                        getRandomSize(),
                        getRandomSize(),
                        color
                );
            case 3:
                return new Circle(
                        getRandomSize(),
                        color
                );
            default:
                return new IsoscelesTrapezoid(
                        getRandomSize(),
                        getRandomSize(),
                        getRandomSize(),
                        color
                );
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Colors.WHITE.name());
    }

    private double getRandomSize() {
        return random.nextDouble() * (MAX_SIZE - MIN_SIZE) + MIN_SIZE;
    }
}
