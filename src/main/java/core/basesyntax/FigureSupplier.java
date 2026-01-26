package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int BOUND = 100;
    private static final Random random = new Random();

    public Figure getRandomFigure() {
        FigureType ft = FigureType.values()
                [random.nextInt(FigureType.values().length)];
        int a = random.nextInt(BOUND) + 1;
        int b = random.nextInt(BOUND) + 1;
        int c = random.nextInt(BOUND) + 1;

        return switch (ft) {
            case CIRCLE -> new Circle(ColorSupplier.getRandomColor(), a);
            case SQUARE -> new Square(ColorSupplier.getRandomColor(), a);
            case RECTANGLE -> new Rectangle(ColorSupplier.getRandomColor(), a, b);
            case TRIANGLE -> new RightTriangle(ColorSupplier.getRandomColor(), a, b);
            case TRAPEZOID -> new IsoscelesTrapezoid(ColorSupplier.getRandomColor(), a, b, c);
            default -> getDefaultFigure();
        };

    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
