package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    // number of figures available
    public static final int FIGURE_COUNT = 5;
    // the maximum length of each segment in the figure
    public static final int UPPER_BOUND = 20;
    // the minimum length of each segment in the figure
    public static final int LOWER_BOUND = 1;

    public Figure getRandomFigure() {
        Random random = new Random();
        int randomIndex = random.nextInt(FIGURE_COUNT);
        String randomColor = new ColorSupplier().getRandomColor();
        switch (randomIndex) {
            case 0:
                return new Circle(randomColor,
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND);
            case 1:
                return new IsoscelesTrapezoid(randomColor,
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND,
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND,
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND);
            case 2:
                return new Square(randomColor,
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND);
            case 3:
                return new RightTriangle(randomColor,
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND,
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND);
            default:
                return new Rectangle(randomColor,
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND,
                        random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name(), 10);
    }
}
