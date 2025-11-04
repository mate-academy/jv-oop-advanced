package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE_QUANTITY = 5;
    private static final double MAX_DEFAULT_BOUND = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        double firstSideBound = random.nextDouble(MAX_DEFAULT_BOUND) + 1;
        double secondSideBound = random.nextDouble(MAX_DEFAULT_BOUND) + 1;
        double heightSideBound = random.nextDouble(MAX_DEFAULT_BOUND) + 1;
        double radiusBound = random.nextDouble(MAX_DEFAULT_BOUND) + 1;

        switch (random.nextInt(MAX_FIGURE_QUANTITY)) {
            case 0:
                return new Square(firstSideBound,
                        colorSupplier.getRandomColor());
            case 1:
                return new RightTriangle(firstSideBound,
                        secondSideBound,
                        colorSupplier.getRandomColor());
            case 2:
                return new Rectangle(firstSideBound,
                        secondSideBound,
                        colorSupplier.getRandomColor());
            case 3:
                return new Circle(radiusBound,
                        colorSupplier.getRandomColor());
            default:
                return new IsoscelesTrapezoid(firstSideBound,
                        secondSideBound,
                        heightSideBound,
                        colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(MAX_DEFAULT_BOUND, DEFAULT_COLOR);
    }

}
