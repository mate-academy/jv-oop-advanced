package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final int MAX_DIMENSION = 10;
    private static final int MIN_DIMENSION = 1;
    private static final int DEFAULT_RADIUS = 10;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        switch (random.nextInt(FIGURE_TYPES_COUNT)) {
            case 0: {
                int side = random.nextInt(MAX_DIMENSION) + MIN_DIMENSION;
                return new Square(Color.valueOf(color), side);
            }
            case 1: {
                int firstLeg = random.nextInt(MAX_DIMENSION) + MIN_DIMENSION;
                int secondLeg = random.nextInt(MAX_DIMENSION) + MIN_DIMENSION;
                return new Rectangle(Color.valueOf(color), firstLeg, secondLeg);
            }
            case 2: {
                int firstLeg = random.nextInt(MAX_DIMENSION) + MIN_DIMENSION;
                int secondLeg = random.nextInt(MAX_DIMENSION) + MIN_DIMENSION;
                return new RightTriangle(Color.valueOf(color), firstLeg, secondLeg);
            }
            case 3: {
                int radius = random.nextInt(MAX_DIMENSION) + MIN_DIMENSION;
                return new Circle(Color.valueOf(color), radius);
            }
            default: {
                int topBase = random.nextInt(MAX_DIMENSION) + MIN_DIMENSION;
                int bottomBase = random.nextInt(MAX_DIMENSION) + MIN_DIMENSION;
                int secondLeg = random.nextInt(MAX_DIMENSION) + MIN_DIMENSION;
                return new IsoscelesTrapezoid(Color.valueOf(color), topBase, bottomBase, secondLeg);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }
}
