package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT = 10;
    private static final int LOWER_BOUND = 1;
    private static final int UPPER_BOUND = 11;
    private static final int FIGURES_COUNT = 5;

    public Figure getDefaultFigure() {
        Figure figure = new Circle(Color.WHITE.toString().toLowerCase(), DEFAULT);
        return figure;
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int figureIndex = random.nextInt(FIGURES_COUNT);
        switch (figureIndex) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND);
            case 1:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND);
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND,
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND);
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND,
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND);
            case 4:
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND,
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND,
                            random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND);
        }
    }
}
