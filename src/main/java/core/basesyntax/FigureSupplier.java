package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static final int FIGURES_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MIN_SIZE = 1;
    private static final int MAX_SIZE = 10;

    private static int randomSize() {
        return RANDOM.nextInt(MAX_SIZE - MIN_SIZE) + MIN_SIZE;
    }

    public Figure getRandomFigure() {
        switch (RANDOM.nextInt(FIGURES_COUNT)) {
            case 0:
                return new Square(COLOR_SUPPLIER.getRandomColor(), randomSize());
            case 1:
                return new Rectangle(COLOR_SUPPLIER.getRandomColor(), randomSize(), randomSize());
            case 2:
                return new RightTriangle(COLOR_SUPPLIER.getRandomColor(), randomSize(),
                        randomSize());
            case 3:
                return new Circle(COLOR_SUPPLIER.getRandomColor(), randomSize());
            case 4:
                return new IsoscelesTrapezoid(COLOR_SUPPLIER.getRandomColor(), randomSize(),
                        randomSize(), randomSize());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }
}
