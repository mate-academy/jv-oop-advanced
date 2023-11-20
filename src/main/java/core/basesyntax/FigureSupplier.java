package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIG_NUMBER = 5;
    private static final int MAX_PARAMETER_NUMBER = 101;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomFig = random.nextInt(MAX_FIG_NUMBER);
        int randomParameter = random.nextInt(MAX_PARAMETER_NUMBER);

        switch (randomFig) {
            case 0: {
                return new Square(randomParameter, colorSupplier.getRandomColor());
            }
            case 1: {
                return new Rectangle(randomParameter, randomParameter,
                        colorSupplier.getRandomColor());
            }
            case 2: {
                return new RightTriangle(randomParameter, randomParameter,
                        colorSupplier.getRandomColor());
            }
            case 3: {
                return new Circle(randomParameter, colorSupplier.getRandomColor());
            }
            case 4: {
                return new IsoscelesTrapezoid(randomParameter, randomParameter,
                        randomParameter, colorSupplier.getRandomColor());
            }
            default: {
                throw new IllegalArgumentException("Invalid random figure number");
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, Color.WHITE.name());
    }
}
