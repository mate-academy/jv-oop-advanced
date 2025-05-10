package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double RANDOM_BOUND = 100.0;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final double DEFAULT_RADIUS = 10.0;

    private Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Color randomColor = colorSupplier.getRandomColor();
        double randomNumber = random.nextDouble() * RANDOM_BOUND;

        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return new Circle(randomColor, randomNumber);
            case 1:
                return new Rectangle(randomColor, randomNumber, random.nextDouble() * RANDOM_BOUND);
            case 2:
                return new Square(randomColor, randomNumber);
            case 3:
                return new RightTriangle(randomColor, randomNumber,
                        random.nextDouble() * RANDOM_BOUND);
            case 4:
                return new IsoscelesTrapezoid(randomColor, randomNumber,
                        random.nextDouble() * RANDOM_BOUND,
                        random.nextDouble() * RANDOM_BOUND);
            default:
                throw new IllegalStateException("Unexpected value: "
                        + random.nextInt(FIGURE_COUNT));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
