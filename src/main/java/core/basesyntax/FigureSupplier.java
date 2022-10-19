package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int AMOUNT_FIGURES = 5;
    private static final int LENGTH = 100;
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int n = random.nextInt(AMOUNT_FIGURES);
        return switch (n + 1) {
            case 1 -> new Square(colorSupplier.getRandomColor(), random.nextInt(LENGTH));
            case 2 -> new Circle(colorSupplier.getRandomColor(), random.nextInt(LENGTH));
            case 3 -> new Rectangle(colorSupplier.getRandomColor(), random.nextInt(LENGTH), random.nextInt(LENGTH));
            case 4 -> new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(LENGTH), random.nextInt(LENGTH));
            case 5 -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(100), random.nextInt(LENGTH), random.nextInt(LENGTH));
            default -> null;
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(colorSupplier.getRandomColor(), 10);
    }
}
