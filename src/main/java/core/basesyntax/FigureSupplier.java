package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private static final int BOUND_MAX = 10000;
    private static final int FIGURES_QUANTITY = 5;

    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(FIGURES_QUANTITY);
        ColorSupplier colorSupplier = new ColorSupplier();

        return switch (randomIndex) {
            case 0 -> new Circle(colorSupplier.getRandomColor(),
                    random.nextInt(BOUND_MAX));
            case 1 -> new Square(colorSupplier.getRandomColor(),
                    random.nextInt(BOUND_MAX));
            case 2 -> new Rectangle(colorSupplier.getRandomColor(),
                    random.nextInt(BOUND_MAX),
                    random.nextInt(BOUND_MAX));
            case 3 -> new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextInt(BOUND_MAX),
                    random.nextInt(BOUND_MAX));
            case 4 -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextInt(BOUND_MAX),
                    random.nextInt(BOUND_MAX),
                    random.nextInt(BOUND_MAX));
            default -> null;
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR,DEFAULT_RADIUS);
    }
}
