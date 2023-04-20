package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_AMOUNT = 5;
    private static final double RANDOM_PROPERTIES = 25D;
    private static final double DEFAULT_CIRCLE_RADIUS = 10D;
    private static final String DEFAULT_CIRCLE_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURES_AMOUNT)) {
            case 0:
                return new Square(supplier.getRandomColor(),
                        random.nextDouble() * RANDOM_PROPERTIES);
            case 1:
                return new Circle(supplier.getRandomColor(),
                        random.nextDouble() * RANDOM_PROPERTIES);
            case 2:
                return new RightTriangle(supplier.getRandomColor(),
                        random.nextDouble() * RANDOM_PROPERTIES,
                        random.nextDouble() * RANDOM_PROPERTIES);
            case 3:
                return new IsoscelesTrapezoid(supplier.getRandomColor(),
                        random.nextDouble() * RANDOM_PROPERTIES,
                        random.nextDouble() * RANDOM_PROPERTIES,
                        random.nextDouble() * RANDOM_PROPERTIES);
            case 4:
                return new Rectangle(supplier.getRandomColor(),
                        random.nextDouble() * RANDOM_PROPERTIES,
                        random.nextDouble() * RANDOM_PROPERTIES);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }
}
