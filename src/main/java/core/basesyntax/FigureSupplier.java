package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_LIMIT = 4;
    private static final int VALUE_LIMIT = 50;

    public static Figure figureGenerator() {
        Random random = new Random();
        int figure = random.nextInt(FIGURE_LIMIT);

        switch (figure) {
            case 0:
                return new Circle("Circle", ColorSupplier.colorGenerator(),
                        random.nextInt(VALUE_LIMIT));
            case 1:
                return new Rectangle("Rectangle", ColorSupplier.colorGenerator(),
                        random.nextInt(VALUE_LIMIT), random.nextInt(VALUE_LIMIT));
            case 2:
                return new IsoscelesTrapezoid("IsoscelesTrapezoid", ColorSupplier.colorGenerator(),
                        random.nextInt(VALUE_LIMIT), random.nextInt(VALUE_LIMIT),
                        random.nextInt(VALUE_LIMIT));
            case 3:
                return new RightTriangle("RightTriangle", ColorSupplier.colorGenerator(),
                        random.nextInt(VALUE_LIMIT), random.nextInt(VALUE_LIMIT));
            default:
                return new Square("Square", ColorSupplier.colorGenerator(),
                        random.nextInt(VALUE_LIMIT));
        }
    }
}
