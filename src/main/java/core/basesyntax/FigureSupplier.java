package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "white";
    private static final double DEFAULT_SIZE = 10.0;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        return switch (random.nextInt(4)) {
            case 0 -> new Circle(colorSupplier.getRandomColor(),
                    random.nextDouble() * 10);
            case 1 -> new Rectangle(colorSupplier.getRandomColor(),
                    random.nextDouble() * 10,
                    random.nextDouble() * 10);
            case 2 -> new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextDouble() * 10,
                    random.nextDouble() * 10);
            case 3 -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextDouble() * 10,
                    random.nextDouble() * 10,
                    random.nextDouble() * 10);
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_SIZE);
    }
}
