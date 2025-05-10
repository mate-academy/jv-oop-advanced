package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int CIRCLE_RADIUS = 10;
    private static final int BOUND = 100;
    private static Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(FIGURE_COUNT);

        return switch (randomNumber) {
            case 0 -> new Circle(colorSupplier.getRandomColor(), random.nextInt(BOUND));
            case 1 -> new IsoscelesTrapezoid(
                    colorSupplier.getRandomColor(),
                    random.nextInt(BOUND),
                    random.nextInt(BOUND),
                    random.nextInt(BOUND)
            );
            case 2 -> new Rectangle(
                    colorSupplier.getRandomColor(),
                    random.nextInt(BOUND),
                    random.nextInt(BOUND)
            );
            case 3 -> new RightTriangle(
                    colorSupplier.getRandomColor(),
                    random.nextInt(BOUND),
                    random.nextInt(BOUND)
            );
            case 4 -> new Square(colorSupplier.getRandomColor(), random.nextInt(BOUND));
            default ->
                    throw new IllegalArgumentException("Unexpected random number: " + randomNumber);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.RED, CIRCLE_RADIUS);
    }
}
