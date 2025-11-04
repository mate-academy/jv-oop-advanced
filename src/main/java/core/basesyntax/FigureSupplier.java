package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE_QUANTITY = 5;
    private static final double MAX_DEFAULT_BOUND = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final Random random = new Random();
    private static final double FIGURE_SIDE_BOUND = random.nextDouble(MAX_DEFAULT_BOUND) + 1;
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        switch (random.nextInt(MAX_FIGURE_QUANTITY)) {
            case 0:
                return new Square(FIGURE_SIDE_BOUND,
                        colorSupplier.getRandomColor());
            case 1:
                return new RightTriangle(FIGURE_SIDE_BOUND,
                        FIGURE_SIDE_BOUND,
                        colorSupplier.getRandomColor());
            case 2:
                return new Rectangle(FIGURE_SIDE_BOUND,
                        FIGURE_SIDE_BOUND,
                        colorSupplier.getRandomColor());
            case 3:
                return new Circle(FIGURE_SIDE_BOUND,
                        colorSupplier.getRandomColor());
            default:
                return new IsoscelesTrapezoid(FIGURE_SIDE_BOUND,
                        FIGURE_SIDE_BOUND,
                        FIGURE_SIDE_BOUND,
                        colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(MAX_DEFAULT_BOUND, DEFAULT_COLOR);
    }

}
