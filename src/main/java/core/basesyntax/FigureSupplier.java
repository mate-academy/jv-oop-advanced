package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int CIRCLE_DEFAULT_RADIUS = 10;
    private static final int FIGURES_NUMBER = 5;
    private static final int MAX_RANDOM_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigureIndex = random.nextInt(FIGURES_NUMBER);
        if (randomFigureIndex == 0) {
            return new Circle(random.nextInt(MAX_RANDOM_NUMBER), colorSupplier.getRandomColor());
        } else if (randomFigureIndex == 1) {
            return new Square(random.nextInt(MAX_RANDOM_NUMBER), colorSupplier.getRandomColor());
        } else if (randomFigureIndex == 2) {
            return new RightTriangle(random.nextInt(MAX_RANDOM_NUMBER),
                    random.nextInt(MAX_RANDOM_NUMBER),
                    colorSupplier.getRandomColor());
        } else if (randomFigureIndex == 3) {
            return new Rectangle(random.nextInt(MAX_RANDOM_NUMBER),
                    random.nextInt(MAX_RANDOM_NUMBER),
                    colorSupplier.getRandomColor());
        }
        return new IsoscelesTrapezoid(random.nextInt(MAX_RANDOM_NUMBER),
                random.nextInt(MAX_RANDOM_NUMBER),
                random.nextInt(MAX_RANDOM_NUMBER),
                colorSupplier.getRandomColor());
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_DEFAULT_RADIUS, Color.WHITE.toString());
    }
}
