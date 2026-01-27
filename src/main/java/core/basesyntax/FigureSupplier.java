package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;

    private static final double MIN_SIZE = 100;
    private static final double MAX_SIZE = 1000;

    private static final double DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "White";

    private final Random random = new Random();

    public AbstractFigure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_TYPES_COUNT);

        switch (figureType) {
            case 0:
                return new Square(random.nextDouble(MIN_SIZE, MAX_SIZE));

            case 1:
                return new Rectangle(
                        random.nextDouble(MIN_SIZE, MAX_SIZE),
                        random.nextDouble(MIN_SIZE, MAX_SIZE)
                );
            case 2:
                return new RightTriangle(
                        random.nextDouble(MIN_SIZE, MAX_SIZE),
                        random.nextDouble(MIN_SIZE, MAX_SIZE)
                );
            case 3:
                return new IsoscelesTrapezoid(
                        random.nextDouble(MIN_SIZE, MAX_SIZE),
                        random.nextDouble(MIN_SIZE, MAX_SIZE),
                        random.nextDouble(MIN_SIZE, MAX_SIZE),
                        random.nextDouble(MIN_SIZE, MAX_SIZE)
                );
            case 4:
            default:
                return new Circle(
                        random.nextDouble(MIN_SIZE, MAX_SIZE));
        }
    }

    public AbstractFigure getDefaultFigure() {
        Circle circle = new Circle(DEFAULT_RADIUS);
        circle.setColor(DEFAULT_COLOR);
        return circle;
    }
}
