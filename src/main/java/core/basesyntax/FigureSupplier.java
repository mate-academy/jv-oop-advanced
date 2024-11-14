package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        switch (random.nextInt(FIGURE_TYPES_COUNT)) {
            case 0: {
                int side = random.nextInt(10) + 1;
                return new Square(color, side);
            }
            case 1: {
                int width = random.nextInt(10) + 1;
                int height = random.nextInt(10) + 1;
                return new Rectangle(color, width, height);
            }
            case 2: {
                int base = random.nextInt(10) + 1;
                int height = random.nextInt(10) + 1;
                return new RightTriangle(color, base, height);
            }
            case 3: {
                int radius = random.nextInt(10) + 1;
                return new Circle(color, radius);
            }
            default: {
                int base1 = random.nextInt(10) + 1;
                int base2 = random.nextInt(10) + 1;
                int height = random.nextInt(10) + 1;
                return new IsoscelesTrapezoid(color, base1, base2, height);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
