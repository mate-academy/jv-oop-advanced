package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int CIRCLE_RADIUS = 10;
    private static final int FIGURE_BOUND = 5;
    private static final int MAX_BOUND_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_BOUND)) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_BOUND_NUMBER));
            case 2:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_BOUND_NUMBER),
                        random.nextInt(MAX_BOUND_NUMBER),
                        random.nextInt(MAX_BOUND_NUMBER));
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_BOUND_NUMBER),
                        random.nextInt(MAX_BOUND_NUMBER));
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_BOUND_NUMBER),
                        random.nextInt(MAX_BOUND_NUMBER));
            default:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_BOUND_NUMBER));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), CIRCLE_RADIUS);
    }
}
