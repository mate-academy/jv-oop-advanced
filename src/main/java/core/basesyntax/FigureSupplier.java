package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RADIUS_NUMBER = 10;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle(supplier.getRandomColor(), random.nextInt(MAX_RADIUS_NUMBER));
    }
}
