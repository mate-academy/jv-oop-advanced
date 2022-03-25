package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT = 10;
    private static final int LOWER_BOUND = 1;
    private static final int UPPER_BOUND = 11;
    private static final int FIGURES_COUNT = 5;

    public Figure getDefaultFigure() {
        Figure figure = new Circle(Color.white.toString(), DEFAULT);
        return figure;
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplie = new ColorSupplier();
        int figureIndex = random.nextInt(FIGURES_COUNT);
        switch (figureIndex) {
            case 0:
                return new Circle(colorSupplie.getRandomColor(),
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND);
            case 1:
                return new Square(colorSupplie.getRandomColor(),
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND);
            case 2:
                return new RightTriangle(colorSupplie.getRandomColor(),
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND,
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND);
            case 3:
                return new Rectangle(colorSupplie.getRandomColor(),
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND,
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND);
            case 4:
                return new IsoscelesTrapezoid(colorSupplie.getRandomColor(),
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND,
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND,
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND);
            default:
                return null;
        }
    }
}
