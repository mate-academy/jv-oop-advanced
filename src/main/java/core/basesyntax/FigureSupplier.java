package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int choice = random.nextInt(5);

        return switch (choice) {
            case 0 -> new Circle(colorSupplier.getRandomColor(), random.nextDouble() * 10);
            case 1 -> new Square(colorSupplier.getRandomColor(), random.nextDouble() * 10);
            case 2 -> new Rectangle(colorSupplier.getRandomColor(), random.nextDouble() * 10, random.nextDouble() * 10);
            case 3 -> new RightTriangle(colorSupplier.getRandomColor(), random.nextDouble() * 10, random.nextDouble() * 10);
            default -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextDouble() * 10, random.nextDouble() * 10, random.nextDouble() * 10);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
