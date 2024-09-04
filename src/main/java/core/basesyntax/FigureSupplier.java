package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 10;
    private static final int BOUND_OF_CASES = 10;
    private static final int DEFAULT_RADIUS = 12;
    private static final int FIGURE_COUNT = 3;
    private static final int ORIGIN = 1;
    private final Figure[] randomFigures = new Figure[3];
    private final Figure[] defaultFigures = new Figure[3];
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure[] getRandomFigure() {
        for (int i = 0; i < FIGURE_COUNT; i++) {
            int figureType = random.nextInt(BOUND_OF_CASES);

            randomFigures[i] = switch (figureType) {
                case 0 -> new Circle(random.nextInt(ORIGIN, BOUND), colorSupplier.getRandomColor());
                case 1 -> new Rectangle(random.nextInt(ORIGIN, BOUND),
                        random.nextInt(ORIGIN, BOUND), colorSupplier.getRandomColor());
                case 2 -> new RightTriangle(random.nextInt(ORIGIN, BOUND),
                        random.nextInt(ORIGIN, BOUND), colorSupplier.getRandomColor());
                case 3 -> new IsoscelesTrapezoid(random.nextInt(ORIGIN, BOUND),
                        random.nextInt(ORIGIN, BOUND), random.nextInt(ORIGIN, BOUND),
                        colorSupplier.getRandomColor());
                case 4 -> new Square(random.nextInt(ORIGIN, BOUND), colorSupplier.getRandomColor());
                default -> new Circle(DEFAULT_RADIUS, Color.WHITE.name());
            };
        }
        return randomFigures;
    }

    public Figure[] getDefaultFigure() {
        for (int i = 0; i < FIGURE_COUNT; i++) {
            defaultFigures[i] = new Circle(DEFAULT_RADIUS, Color.WHITE.name());
        }
        return defaultFigures;
    }
}
