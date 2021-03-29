package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_RANDOM_LIMIT = 5;
    private static final int INT_BOUND_LIMIT = 100;

    public static Figure generateFigure() {
        Random random = new Random();
        int figureNumber = random.nextInt(FIGURE_RANDOM_LIMIT);

        switch (figureNumber) {
            case 0:
                return new Square("Square", ColorSupplier.generateColor(),
                        random.nextInt(INT_BOUND_LIMIT));
            case 1:
                return new Rectangle("Rectangle", ColorSupplier.generateColor(),
                        random.nextInt(INT_BOUND_LIMIT), random.nextInt(INT_BOUND_LIMIT));
            case 2:
                return new Circle("Circle", ColorSupplier.generateColor(),
                        random.nextInt(INT_BOUND_LIMIT));
            case 3:
                return new RightTriangle("Triangle", ColorSupplier.generateColor(),
                        random.nextInt(INT_BOUND_LIMIT), random.nextInt(INT_BOUND_LIMIT));
            case 4:
                return new IsoscelesTrapezoid("Trapezoid", ColorSupplier.generateColor(),
                        random.nextInt(INT_BOUND_LIMIT), random.nextInt(INT_BOUND_LIMIT),
                        random.nextInt(INT_BOUND_LIMIT));
            default:
                return new Square("Square", ColorSupplier.generateColor(),
                        random.nextInt(INT_BOUND_LIMIT));
        }
    }
}
