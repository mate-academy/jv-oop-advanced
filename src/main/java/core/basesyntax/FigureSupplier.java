package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static final Random RANDOM = new Random();
    private static final double RANDOM_PARAMETRS = RANDOM.nextInt(100);

    public Figure getRandomFigure() {
        int value = RANDOM.nextInt(5);
        switch (value) {
            case 0:
                return new Square(COLOR_SUPPLIER.getRandomColor(), RANDOM_PARAMETRS);
            case 1:
                return new Rectangle(COLOR_SUPPLIER.getRandomColor(),
                        RANDOM_PARAMETRS, RANDOM_PARAMETRS);
            case 2:
                return new RightTriangle(COLOR_SUPPLIER.getRandomColor(),
                        RANDOM_PARAMETRS, RANDOM_PARAMETRS);
            case 3:
                return new Circle(COLOR_SUPPLIER.getRandomColor(), RANDOM_PARAMETRS);
            default:
                return new IsoscelesTrapezoid(COLOR_SUPPLIER.getRandomColor(),
                        RANDOM_PARAMETRS,
                        RANDOM_PARAMETRS,
                        RANDOM_PARAMETRS);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
