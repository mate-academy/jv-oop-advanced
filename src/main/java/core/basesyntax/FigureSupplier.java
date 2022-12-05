package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 4;
    private static final int BOUND_RANDOM = 100;
    private static final int CIRCLE_RADIUS = 10;
    private Random randomNumber = new Random();
    private Random randomFigure = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int indexFigure = randomFigure.nextInt(FIGURES_COUNT);
        if (indexFigure == 0) {
            return new Square(randomNumber.nextInt(BOUND_RANDOM), colorSupplier.getRandomColor());
        } else if (indexFigure == 1) {
            return new Rectangle(randomNumber.nextInt(BOUND_RANDOM),
                    randomNumber.nextInt(BOUND_RANDOM),
                    colorSupplier.getRandomColor());
        } else if (indexFigure == 2) {
            return new RightTriangle(randomNumber.nextInt(BOUND_RANDOM),
                    randomNumber.nextInt(BOUND_RANDOM),
                    colorSupplier.getRandomColor());
        } else {
            return new IsoscelesTrapezoid(randomNumber.nextInt(BOUND_RANDOM),
                    randomNumber.nextInt(BOUND_RANDOM),
                    randomNumber.nextInt(BOUND_RANDOM),
                    colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_RADIUS, Color.WHITE.name());
    }
}
