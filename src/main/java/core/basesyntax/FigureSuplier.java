package core.basesyntax;

import java.util.Random;

public class FigureSuplier {
    private static final int MAX_RANDOM_NUMBER = 50;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureType.values().length);
        FigureType randomFigure = FigureType.values()[index];

        switch (randomFigure) {
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextDouble() * MAX_RANDOM_NUMBER);
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextDouble() * MAX_RANDOM_NUMBER);
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextDouble() * MAX_RANDOM_NUMBER,
                        random.nextDouble() * MAX_RANDOM_NUMBER);
            case RIGHT_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble() * MAX_RANDOM_NUMBER,
                        random.nextDouble() * MAX_RANDOM_NUMBER);
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble() * MAX_RANDOM_NUMBER,
                        random.nextDouble() * MAX_RANDOM_NUMBER,
                        random.nextDouble() * MAX_RANDOM_NUMBER);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_CIRCLE_RADIUS);
    }
}
