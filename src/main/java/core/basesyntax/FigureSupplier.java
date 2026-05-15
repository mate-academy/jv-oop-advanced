package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int FIGURE_COUNT = 6;

    private static final double DEFAULT_RADIUS = 10.0;
    private static final int RANDOM_OFFSET = 1;
    private static final int RANDOM_BOUND = 10;

    private ColorSupplier colorSupplier = new ColorSupplier();

    private Random rand = new Random();

    public Figure getRandomFigure() {
        int figureType = rand.nextInt(FIGURE_COUNT);

        Colors randColors = colorSupplier.getRandomColor();

        double firstValue = rand.nextInt(RANDOM_BOUND) + RANDOM_OFFSET;
        double secondValue = rand.nextInt(RANDOM_BOUND) + RANDOM_OFFSET;

        double thirdValue = rand.nextInt(RANDOM_BOUND) + RANDOM_OFFSET;

        switch (figureType) {
            case 0:
                return new Square(firstValue, randColors);
            case 1:
                return new Rectangle(firstValue, thirdValue, randColors);
            case 2:
                return new RightTriangle(firstValue, secondValue, randColors);
            case 3:
                return new Circle(thirdValue, randColors);
            default:
                return new IsoscelesTrapezoid(firstValue, secondValue, thirdValue, randColors);

        }

    }

    public Figure getDefaultFigure() {

        return new Circle(DEFAULT_RADIUS, Colors.White);
    }

}
