package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUM_FIGURE_TYPES = 5;
    private static final double DEFAULT_CIRCLE_RADIUS = 10d;

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        String colorOfFigure = colorSupplier.getRandomColor();
        int numberOfFigure = random.nextInt(NUM_FIGURE_TYPES);

        double randomValue1 = random.nextDouble();
        double randomValue2 = random.nextDouble();
        double randomValue3 = random.nextDouble();

        switch (numberOfFigure) {
            case 0:
                return new Circle(colorOfFigure, randomValue1);
            case 1:
                return new Square(colorOfFigure, randomValue1);
            case 2:
                return new RightTriangle(colorOfFigure, randomValue1, randomValue2);
            case 3:
                return new Rectangle(colorOfFigure, randomValue1, randomValue2);
            case 4:
                return new IsoscelesTrapezoid(colorOfFigure, randomValue1, randomValue2,
                        randomValue3);

            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.NAVY.name(), DEFAULT_CIRCLE_RADIUS);
    }
}
