package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX = 100;
    private static final int FIGURE_COUNT = 6;
    private static final int DEFAULT_RADIUS = 10;
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 1:
                return new Circle(supplier.getRandomColor(), random.nextInt(MAX));
            case 2:
                return new Rectangle(supplier.getRandomColor(), random.nextInt(MAX),
                        random.nextInt(MAX));
            case 3:
                return new Square(supplier.getRandomColor(), random.nextInt(MAX));
            case 4:
                return new RightTriangle(supplier.getRandomColor(), random.nextInt(MAX),
                        random.nextInt(MAX));
            case 5:
                return new IsoscelesTrapezoid(supplier.getRandomColor(), random.nextInt(MAX),
                        random.nextInt(MAX), random.nextInt(MAX));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), DEFAULT_RADIUS);
    }
}
