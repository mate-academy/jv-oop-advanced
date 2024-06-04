package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final int defaultRadius = 10;
    private static final Random random = new Random();

    public Figure getRandomFigure() {
        int choice = random.nextInt(5);

        return switch (choice) {
            case 0 -> new Circle(
                    colorSupplier.getRandomColor(),
                    random.nextDouble() * defaultRadius
            );
            case 1 -> new Square(
                    colorSupplier.getRandomColor(),
                    random.nextDouble() * defaultRadius
            );
            case 2 -> new Rectangle(
                    colorSupplier.getRandomColor(),
                    random.nextDouble() * defaultRadius,
                    random.nextDouble() * defaultRadius
            );
            case 3 -> new RightTriangle(
                    colorSupplier.getRandomColor(),
                    random.nextDouble() * defaultRadius,
                    random.nextDouble() * defaultRadius
            );
            default -> new IsoscelesTrapezoid(
                    colorSupplier.getRandomColor(),
                    random.nextDouble() * defaultRadius,
                    random.nextDouble() * defaultRadius,
                    random.nextDouble() * defaultRadius
            );
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", defaultRadius);
    }
}
