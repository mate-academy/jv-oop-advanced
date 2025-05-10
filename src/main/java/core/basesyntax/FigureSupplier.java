package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double DEFAULT_RADIUS = 10.0;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private ColorSupplier supplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);

        switch (index) {
            case 0:
                return new IsoscelesTrapezoid(supplier.getRandomColor(),
                        random.nextDouble(), random.nextDouble(),
                        random.nextDouble());
            case 1:
                return new Rectangle(supplier.getRandomColor(),
                        random.nextDouble(), random.nextDouble());
            case 2:
                return new Circle(supplier.getRandomColor(),
                        random.nextDouble());
            case 3:
                return new RightTriangle(supplier.getRandomColor(),
                        random.nextDouble(), random.nextDouble());
            default:
                return new Square(supplier.getRandomColor(),
                        random.nextDouble());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
