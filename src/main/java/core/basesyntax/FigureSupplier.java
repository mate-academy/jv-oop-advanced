package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int INT_BOUND = 100;
    private static final int MAX_VALUE_SWITCH = 4;

    private final Random RANDOM = new Random();
    private final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();

    public Figure getRandomFigure() {
        final int indexFigure = RANDOM.nextInt(MAX_VALUE_SWITCH);
        switch (indexFigure) {
            case 0:
                return new Circle(COLOR_SUPPLIER.getRandomColor(), getRandomInt());
            case 1:
                return new IsoscelesTrapezoid(COLOR_SUPPLIER.getRandomColor(), getRandomInt(),
                        getRandomInt(), getRandomInt());
            case 2:
                return new Rectangle(COLOR_SUPPLIER.getRandomColor(),
                        getRandomInt(), getRandomInt());
            case 3:
                return new RightTriangle(COLOR_SUPPLIER.getRandomColor(),
                        getRandomInt(), getRandomInt());
            case 4:

            default:
                return new Square(COLOR_SUPPLIER.getRandomColor(), getRandomInt());
        }
    }

    public Figure getDefaultFigure() {
        final int radius = 10;
        return new Circle(Color.WHITE.name(), radius);
    }

    private int getRandomInt() {
        return RANDOM.nextInt(INT_BOUND);
    }
}
