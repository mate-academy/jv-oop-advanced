package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int BOUND = 100;
    private static final Random random = new Random();

    public static Figure getRandomFigure() {
        FigureType ft = FigureType.values()
                [random.nextInt(FigureType.values().length)];
        int a = random.nextInt(BOUND);
        int b = random.nextInt(BOUND);

        return switch (ft) {
            case CIRCLE -> new Circle(ColorSupplier.getRandomColor(), a);
            case SQUARE -> new Square(ColorSupplier.getRandomColor(), a);
            case RECTANGLE -> new Rectangle(ColorSupplier.getRandomColor(), a, b);
            default -> getDefaultFigure();
        };

    }

    public static Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
