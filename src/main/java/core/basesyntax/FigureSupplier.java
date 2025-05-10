package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_LIMIT = 5;
    private static final int VALUE_LIMIT = 20;

    public static Figure generateRandomFigure() {
        Random number = new Random();
        int randomFigureNumber = number.nextInt(FIGURE_LIMIT);

        switch (randomFigureNumber) {
            case 0:
                return new Circle("Circle", ColorSupplier.colorRandomizer(),
                        number.nextInt(VALUE_LIMIT));
            case 1:
                return new IsoscelesTrapezoid("Isosceles Trapezoid",
                        ColorSupplier.colorRandomizer(),
                        number.nextInt(VALUE_LIMIT), number.nextInt(VALUE_LIMIT),
                        number.nextInt(VALUE_LIMIT));
            case 2:
                return new Rectangle("Rectangle", ColorSupplier.colorRandomizer(),
                        number.nextInt(VALUE_LIMIT), number.nextInt(VALUE_LIMIT));
            case 3:
                return new RightTriangle("Equilateral Triangle",
                        ColorSupplier.colorRandomizer(), number.nextInt(VALUE_LIMIT));
            case 4:
                return new Square("Square", ColorSupplier.colorRandomizer(),
                        number.nextInt(VALUE_LIMIT));
            default:
                return new Square("Square", ColorSupplier.colorRandomizer(),
                        number.nextInt(VALUE_LIMIT));
        }
    }
}
