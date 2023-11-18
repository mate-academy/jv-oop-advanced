package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_AMOUNT_OF_FIGURES = 5;
    private static final int MAX_UNITS_FOR_RANDOM_FIGURE = 16;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier() {
        this.random = new Random();
        this.colorSupplier = new ColorSupplier();
    }

    public Figure getRandomFigure() {
        return switch (random.nextInt(MAX_AMOUNT_OF_FIGURES)) {
            case 0 -> getRandomCircle();
            case 1 -> getRandomRectangle();
            case 2 -> getRandomRightRectangle();
            default -> getRandomIsoscelesTrapezoid();
        };
    }

    public Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
            random.nextInt(MAX_UNITS_FOR_RANDOM_FIGURE));
    }

    public Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
            random.nextInt(MAX_UNITS_FOR_RANDOM_FIGURE),
            random.nextInt(MAX_UNITS_FOR_RANDOM_FIGURE));
    }

    public Figure getRandomRightRectangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
            random.nextInt(MAX_UNITS_FOR_RANDOM_FIGURE),
            random.nextInt(MAX_UNITS_FOR_RANDOM_FIGURE));
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
            random.nextInt(MAX_UNITS_FOR_RANDOM_FIGURE),
            random.nextInt(MAX_UNITS_FOR_RANDOM_FIGURE),
            random.nextInt(MAX_UNITS_FOR_RANDOM_FIGURE));
    }

    public Figure getDefaultFigure() {
        return new Circle("white", DEFAULT_CIRCLE_RADIUS);
    }
}

