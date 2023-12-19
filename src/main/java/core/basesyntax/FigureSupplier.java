package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final Random random = new Random();
    private static final double MAX_BOUND_SIDE = 100.0;
    private static final double MIN_BOUND_SIDE = 1.0;
    private static final int NUM_ROUND1 = 10000;
    private static final double NUM_ROUND2 = 100.0;
    private static final int COUNT_FIGURES = 5;
    private static final double DEFAULT_RADIUS_CIRCLE = 10.0;

    public Figure getRandomFigure() {
        int typeOfFigure = random.nextInt(COUNT_FIGURES);

        switch (typeOfFigure) {
            case 0:
                return new Square(getRandomDoubleInRange(MIN_BOUND_SIDE, MAX_BOUND_SIDE),
                        colorSupplier.getRandomColor());
            case 1:
                return new Rectangle(getRandomDoubleInRange(MIN_BOUND_SIDE, MIN_BOUND_SIDE),
                        getRandomDoubleInRange(MIN_BOUND_SIDE, MIN_BOUND_SIDE),
                        colorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(getRandomDoubleInRange(MIN_BOUND_SIDE, MIN_BOUND_SIDE),
                        colorSupplier.getRandomColor());
            case 3:
                return new Circle(getRandomDoubleInRange(MIN_BOUND_SIDE, MIN_BOUND_SIDE),
                        colorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(getRandomDoubleInRange(MIN_BOUND_SIDE,
                        MIN_BOUND_SIDE),
                        getRandomDoubleInRange(MIN_BOUND_SIDE, MIN_BOUND_SIDE),
                        getRandomDoubleInRange(MIN_BOUND_SIDE, MIN_BOUND_SIDE),
                        colorSupplier.getRandomColor());
            default:
                return null;

        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS_CIRCLE, Color.WHITE.name());
    }

    private double getRandomDoubleInRange(double min, double max) {
        double result = random.nextDouble();
        return ((int) (result * NUM_ROUND1) / NUM_ROUND2);
    }

}
