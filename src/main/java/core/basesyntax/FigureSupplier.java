package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final int RANDOM_BOUND = 10;
    private static final int MIN_DIMENSION = 1;

    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_TYPES_COUNT);
        String color = getRandomColor().toLowerCase();

        switch (figureType) {
            case 0:
                double side = MIN_DIMENSION + random.nextInt(RANDOM_BOUND);
                return new Square(color, side);
            case 1:
                double width = MIN_DIMENSION + random.nextInt(RANDOM_BOUND);
                double height = MIN_DIMENSION + random.nextInt(RANDOM_BOUND);
                return new Rectangle(color, width, height);
            case 2:
                double leg1 = MIN_DIMENSION + random.nextInt(RANDOM_BOUND);
                double leg2 = MIN_DIMENSION + random.nextInt(RANDOM_BOUND);
                return new RightTriangle(color, leg1, leg2);
            case 3:
                double radius = MIN_DIMENSION + random.nextInt(RANDOM_BOUND);
                return new Circle(color, radius);
            case 4:
            default:
                double base1 = MIN_DIMENSION + random.nextInt(RANDOM_BOUND);
                double base2 = MIN_DIMENSION + random.nextInt(RANDOM_BOUND);
                double trapHeight = MIN_DIMENSION + random.nextInt(RANDOM_BOUND);
                return new IsoscelesTrapezoid(color, base1, base2, trapHeight);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), RANDOM_BOUND);
    }
}
