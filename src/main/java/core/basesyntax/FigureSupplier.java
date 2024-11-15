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
        Color color = colorSupplier.getRandomColor();
        switch (random.nextInt(FIGURE_TYPES_COUNT)) {
            case 0: {
                int side = random.nextInt(MAX_DIMENSION) + MIN_DIMENSION;
                return new Square(color, side);
            }
            case 1: {
                int width = random.nextInt(MAX_DIMENSION) + MIN_DIMENSION;
                int height = random.nextInt(MAX_DIMENSION) + MIN_DIMENSION;
                return new Rectangle(color, width, height);
            }
            case 2: {
                int base = random.nextInt(MAX_DIMENSION) + MIN_DIMENSION;
                int height = random.nextInt(MAX_DIMENSION) + MIN_DIMENSION;
                return new RightTriangle(color, base, height);
            }
            case 3: {
                int radius = random.nextInt(MAX_DIMENSION) + MIN_DIMENSION;
                return new Circle(color, radius);
            }
            default: {
                int base1 = random.nextInt(MAX_DIMENSION) + MIN_DIMENSION;
                int base2 = random.nextInt(MAX_DIMENSION) + MIN_DIMENSION;
                int height = random.nextInt(MAX_DIMENSION) + MIN_DIMENSION;
                return new IsoscelesTrapezoid(color, base1, base2, height);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }
}
