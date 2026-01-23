package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int MAX_RANDOM_VALUE = 10;
    private static final int FIGURES_COUNT = 6;
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final double DEFAULT_RADIUS = 10.0;
    private static final String DEFAULT_COLOR = "White";

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int type = random.nextInt(FIGURE_TYPES_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (type) {
            case 0: {
                double side = 1 + random.nextInt(MAX_RANDOM_VALUE);
                return new Square(color, side);
            }
            case 1: {
                double width = 1 + random.nextInt(MAX_RANDOM_VALUE);
                double height = 1 + random.nextInt(MAX_RANDOM_VALUE);
                return new Rectangle(color, width, height);
            }
            case 2: {
                double firstLeg = 1 + random.nextInt(MAX_RANDOM_VALUE);
                double secondLeg = 1 + random.nextInt(MAX_RANDOM_VALUE);
                return new RightTriangle(color, firstLeg, secondLeg);
            }
            case 3: {
                double radius = 1 + random.nextInt(MAX_RANDOM_VALUE);
                return new Circle(color, radius);
            }
            case 4: {
                double baseA = 1 + random.nextInt(MAX_RANDOM_VALUE);
                double baseB = 1 + random.nextInt(MAX_RANDOM_VALUE);
                double height = 1 + random.nextInt(MAX_RANDOM_VALUE);
                return new IsoscelesTrapezoid(color, baseA, baseB, height);
            }
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public int getFiguresCount() {
        return FIGURES_COUNT;
    }
}


