package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private static final int MAX_FIGURE_ID = 5;
    private static final int MAX_SIZE = 50;

    public Figure getRandomFigure() {
        return switch (random.nextInt(MAX_FIGURE_ID)) {
            case 0 -> new Square(random.nextDouble(MAX_SIZE), colorSupplier.getRandomColor());
            case 1 -> new Rectangle(random.nextDouble(MAX_SIZE), random.nextDouble(MAX_SIZE), colorSupplier.getRandomColor());
            case 2 -> new RightTriangle(random.nextDouble(MAX_SIZE), random.nextDouble(MAX_SIZE), colorSupplier.getRandomColor());
            case 3 -> new Circle(random.nextDouble(MAX_SIZE), colorSupplier.getRandomColor());
            case 4 -> new IsoscelesTrapezoid(random.nextDouble(MAX_SIZE), random.nextDouble(MAX_SIZE), random.nextDouble(MAX_SIZE), colorSupplier.getRandomColor());
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Colors.WHITE.name());
    }
}
