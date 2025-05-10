package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 4;
    private static final double MAX_SIZE = 10;
    private static final double DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), random.nextDouble(MAX_SIZE));
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextDouble(MAX_SIZE),
                        random.nextDouble(MAX_SIZE));
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble(MAX_SIZE),
                        random.nextDouble(MAX_SIZE));
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextDouble(MAX_SIZE), random.nextDouble(MAX_SIZE),
                    random.nextDouble(MAX_SIZE));
            default:
                return new Circle(colorSupplier.getRandomColor(), random.nextDouble(MAX_SIZE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
