package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random(4);
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(10, Colors.white);
    }

    public Figure getRandomFigure() {
        int maxRange = 6;
        switch (RANDOM.nextInt(4)) {
            case 0 -> {
                return new Square(
                        RANDOM.nextInt(maxRange),
                        COLOR_SUPPLIER.getRandomColor()
                );
            }
            case 1 -> {
                return new Rectangle(
                        RANDOM.nextInt(maxRange),
                        RANDOM.nextInt(maxRange),
                        COLOR_SUPPLIER.getRandomColor()
                );
            }
            case 2 -> {
                return new Circle(
                        RANDOM.nextInt(maxRange),
                        COLOR_SUPPLIER.getRandomColor()
                );
            }
            case 3 -> {
                return new IsoscelesTrapezoid(
                        RANDOM.nextInt(maxRange),
                        RANDOM.nextInt(maxRange),
                        RANDOM.nextInt(maxRange),
                        COLOR_SUPPLIER.getRandomColor()
                );
            }
            default -> {
                return getDefaultFigure();
            }
        }
    }
}
