package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static Random random = new Random();

    public static Figure getRandomFigure() {
        int randomNumber = random.nextInt(FIGURE_COUNT);

        return switch (randomNumber) {
            case 0 -> new Circle(ColorSupplier.getRandomColor(), random.nextInt(100));
            case 1 -> new IsoscelesTrapezoid(
                    ColorSupplier.getRandomColor(),
                    random.nextInt(100),
                    random.nextInt(100),
                    random.nextInt(100)
            );
            case 2 -> new Rectangle(
                    ColorSupplier.getRandomColor(),
                    random.nextInt(100),
                    random.nextInt(100)
            );
            case 3 -> new RightTriangle(
                    ColorSupplier.getRandomColor(),
                    random.nextInt(100),
                    random.nextInt(100)
            );
            case 4 -> new Square(ColorSupplier.getRandomColor(), random.nextInt(100));
            default ->
                    throw new IllegalArgumentException("Unexpected random number: " + randomNumber);
        };
    }

    public static Figure getDefaultFigure() {
        return new Circle(Color.RED, 10);
    }
}
