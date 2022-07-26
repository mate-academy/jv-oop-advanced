package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int RANDOM_RANGE = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        if (random.nextInt(NUMBER_OF_FIGURES) == 0) {
            return new Circle(random.nextInt(RANDOM_RANGE),
                    colorSupplier.getRandomColor().toString());
        }
        if (random.nextInt(NUMBER_OF_FIGURES) == 1) {
            return new IsoscelesTrapezoid(random.nextInt(RANDOM_RANGE),
                   random.nextInt(RANDOM_RANGE), random.nextInt(RANDOM_RANGE),
                    colorSupplier.getRandomColor().toString());
        }
        if (random.nextInt(NUMBER_OF_FIGURES) == 2) {
            return new Rectangle(random.nextInt(RANDOM_RANGE), random.nextInt(RANDOM_RANGE),
                    colorSupplier.getRandomColor().toString());
        }
        if (random.nextInt(NUMBER_OF_FIGURES) == 3) {
            return new RightTriangle(random.nextInt(RANDOM_RANGE),random.nextInt(RANDOM_RANGE),
                    colorSupplier.getRandomColor().toString());
        }
        if (random.nextInt(NUMBER_OF_FIGURES) == 4) {
            return new Square(random.nextInt(RANDOM_RANGE),
                    colorSupplier.getRandomColor().toString());
        }
        return getRandomFigure();
    }

    public Circle getDefaultFigure() {
        return new Circle(10, "White");
    }
}
