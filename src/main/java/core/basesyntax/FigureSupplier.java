package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final int MAX_DIMENSION = 10;
    private static final int MIN_DIMENSION = 1;
    private static final int DEFAULT_RADIUS = 10;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    private int getRandomDimension() {
        return random.nextInt(MAX_DIMENSION) + MIN_DIMENSION;
    }

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        switch (random.nextInt(FIGURE_TYPES_COUNT)) {
            case 0: {
                int side = getRandomDimension();
                return new Square(color, side);
            }
            case 1: {
                int firstLeg = getRandomDimension();
                int secondLeg = getRandomDimension();
                return new Rectangle(color, firstLeg, secondLeg);
            }
            case 2: {
                int firstLeg = getRandomDimension();
                int secondLeg = getRandomDimension();
                return new RightTriangle(color, firstLeg, secondLeg);
            }
            case 3: {
                int radius = getRandomDimension();
                return new Circle(color, radius);
            }
            default: {
                int topBase = getRandomDimension();
                int bottomBase = getRandomDimension();
                int secondLeg = getRandomDimension();
                return new IsoscelesTrapezoid(color, topBase, bottomBase, secondLeg);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
