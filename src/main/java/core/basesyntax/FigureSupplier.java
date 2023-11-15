package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final double MIN_VALUE_FOR_RANDOM_UNIT = 5.0;
    private static final double MAX_VALUE_FOR_RANDOM_UNIT = 55.0;
    private static final double CIRCLE_RADIUS = 10.0;
    private static final int NUMBERS_OF_FIGURES = 4;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomIndexForMethod = random.nextInt(NUMBERS_OF_FIGURES);
        return switch (randomIndexForMethod) {
            case 0 -> getRandomCircle();
            case 1 -> getRandomRightTriangle();
            case 2 -> getIsoscelesTrapezoid();
            case 3 -> getRandomSquare();
            default -> getRandomRectangle();
        };

    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, CIRCLE_RADIUS);
    }

    private Figure getRandomCircle() {
        return new Circle(
                colorSupplier.getRandomColor(),
                random.nextDouble(MAX_VALUE_FOR_RANDOM_UNIT)
        );
    }

    private Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                random.nextDouble(MIN_VALUE_FOR_RANDOM_UNIT, MAX_VALUE_FOR_RANDOM_UNIT),
                random.nextDouble(MIN_VALUE_FOR_RANDOM_UNIT, MAX_VALUE_FOR_RANDOM_UNIT),
                random.nextDouble(MIN_VALUE_FOR_RANDOM_UNIT, MAX_VALUE_FOR_RANDOM_UNIT)
        );
    }

    private Figure getRandomRectangle() {
        return new Rectangle(
                colorSupplier.getRandomColor(),
                random.nextDouble(MIN_VALUE_FOR_RANDOM_UNIT, MAX_VALUE_FOR_RANDOM_UNIT),
                random.nextDouble(MIN_VALUE_FOR_RANDOM_UNIT, MAX_VALUE_FOR_RANDOM_UNIT)

        );
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(
                colorSupplier.getRandomColor(),
                random.nextDouble(MIN_VALUE_FOR_RANDOM_UNIT, MAX_VALUE_FOR_RANDOM_UNIT),
                random.nextDouble(MIN_VALUE_FOR_RANDOM_UNIT, MAX_VALUE_FOR_RANDOM_UNIT)

        );
    }

    private Figure getRandomSquare() {
        return new Square(
                colorSupplier.getRandomColor(),
                random.nextDouble(MIN_VALUE_FOR_RANDOM_UNIT, MAX_VALUE_FOR_RANDOM_UNIT)
        );
    }
}
