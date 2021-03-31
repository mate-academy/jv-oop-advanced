package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE = 5;
    private static final int VALUE = 20;

    public static Figure figureGenerator() {
        Random random = new Random();
        int figure = random.nextInt(FIGURE);

        switch (figure) {
            case 0:
                return new Circle("Circle", ColorSupplier.colorGenerator(),
                        random.nextInt(VALUE));
            case 1:
                return new IsoscelesTrapezoid("IsoscelesTrapezoid", ColorSupplier.colorGenerator(),
                        random.nextInt(VALUE), random.nextInt(VALUE),
                        random.nextInt(VALUE));
            case 2:

                return new Rectangle("Rectangle", ColorSupplier.colorGenerator(),
                        random.nextInt(VALUE), random.nextInt(VALUE));
            case 3:
                return new RightTriangle("RightTriangle", ColorSupplier.colorGenerator(),
                        random.nextInt(VALUE), random.nextInt(VALUE));
            default:
                return new Square("Square", ColorSupplier.colorGenerator(),
                        random.nextInt(VALUE));
        }
    }
}

