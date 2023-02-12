package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 4;
    private static final int RANDOM_RANGE = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        Figure figure = null;
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0: figure = new Circle(random.nextInt(RANDOM_RANGE),
                    colorSupplier.getRandomColor());
            break;
            case 1: figure = new IsoscelesTrapezoid(random
                    .nextInt(RANDOM_RANGE), random.nextInt(RANDOM_RANGE),
                    random.nextInt(RANDOM_RANGE), colorSupplier.getRandomColor());
            break;
            case 2: figure = new Rectangle(random.nextInt(RANDOM_RANGE),
                    random.nextInt(RANDOM_RANGE), colorSupplier.getRandomColor());
            break;
            case 3: figure = new RightTriangle(random.nextInt(RANDOM_RANGE),
                    random.nextInt(RANDOM_RANGE), colorSupplier.getRandomColor());
            break;
            default: figure = new Square(random.nextInt(RANDOM_RANGE),
                    colorSupplier.getRandomColor());
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        Figure figure = new Circle(10, Color.WHITE);
        return figure;
    }
}
