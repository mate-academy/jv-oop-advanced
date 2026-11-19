package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final int MAX_SIZE = 10;
    private static final int MIN_SIZE = 1;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_TYPES_COUNT);

        switch (figureType) {
            case 0: {
                String color = colorSupplier.getRandomColor();
                int radius = random.nextInt(MAX_SIZE) + MIN_SIZE;
                return new Circle(color, radius);
            }
            case 1: {
                String color = colorSupplier.getRandomColor();
                int side = random.nextInt(MAX_SIZE) + MIN_SIZE;
                return new Square(color, side);
            }
            case 2: {
                String color = colorSupplier.getRandomColor();
                int length = random.nextInt(MAX_SIZE) + MIN_SIZE;
                int width = random.nextInt(MAX_SIZE) + MIN_SIZE;
                return new Rectangle(color, length, width);
            }
            case 3: {
                String color = colorSupplier.getRandomColor();
                int base = random.nextInt(MAX_SIZE) + MIN_SIZE;
                int height = random.nextInt(MAX_SIZE) + MIN_SIZE;
                return new RightTriangle(color, base, height);
            }
            case 4: {
                String color = colorSupplier.getRandomColor();
                int firstBase = random.nextInt(MAX_SIZE) + MIN_SIZE;
                int secondBase = random.nextInt(MAX_SIZE) + MIN_SIZE;
                int height = random.nextInt(MAX_SIZE) + MIN_SIZE;
                return new IsoscelesTrapezoid(
                        color, firstBase, secondBase, height
                );
            }
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", MAX_SIZE);
    }
}
