package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE_QUANTITY = 5;
    private static final int MAX_DEFAULT_BOUND = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        switch (random.nextInt(MAX_FIGURE_QUANTITY)) {
            case 0:
                return new Square(random.nextDouble(MAX_DEFAULT_BOUND) + 1,
                        colorSupplier.getRandomColor());
            case 1:
                return new RightTriangle(random.nextDouble(MAX_DEFAULT_BOUND) + 1,
                        random.nextDouble(MAX_DEFAULT_BOUND) + 1,
                        colorSupplier.getRandomColor());
            case 2:
                return new Rectangle(random.nextDouble(MAX_DEFAULT_BOUND) + 1,
                        random.nextDouble(MAX_DEFAULT_BOUND) + 1,
                        colorSupplier.getRandomColor());
            case 3:
                return new Circle(random.nextDouble(MAX_DEFAULT_BOUND) + 1,
                        colorSupplier.getRandomColor());
            default:
                return new IsoscelesTrapezoid(random.nextDouble(MAX_DEFAULT_BOUND) + 1,
                        random.nextDouble(MAX_DEFAULT_BOUND) + 1,
                        random.nextDouble(MAX_DEFAULT_BOUND) + 1,
                        colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(MAX_DEFAULT_BOUND, DEFAULT_COLOR);
    }

}
