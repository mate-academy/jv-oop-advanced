package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final int BOUND = 54;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int numberOfFigures = new Random().nextInt(FIGURES_COUNT);
        return numberOfFigures == 1
                ? new Circle(colorSupplier.getRandomColor(), random.nextInt(BOUND))
                : numberOfFigures == 2
                ? new Square(colorSupplier.getRandomColor(), random.nextInt(BOUND))
                : numberOfFigures == 3
                ? new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(BOUND),
                random.nextInt(BOUND), random.nextInt(BOUND))
                : numberOfFigures == 4
                ? new Rectangle(colorSupplier.getRandomColor(), random.nextInt(BOUND),
                random.nextInt(BOUND))
                : new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(BOUND),
                random.nextInt(BOUND));
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), DEFAULT_RADIUS);
    }
}
