package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE_NUMBER = 6;
    private static final int MAX_CIRCLE_RADIUS = 4;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int MAX_SHORT_SIDE = 7;
    private static final int MAX_LONG_SIDE = 8;
    private static final int MAX_SIDE = 9;
    private static final int MAX_HEIGHT = 3;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(MAX_FIGURE_NUMBER);
        switch (figureNumber) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_CIRCLE_RADIUS + 1));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SHORT_SIDE), random.nextInt(MAX_LONG_SIDE + 1));
            case 3:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_SIDE + 1));
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SHORT_SIDE + 1),
                        random.nextInt(MAX_LONG_SIDE + 1), random.nextInt(MAX_HEIGHT + 1));
            case 5:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SHORT_SIDE + 1), random.nextInt(MAX_LONG_SIDE + 1));
            default:
                return getDefaultFigure();

        }
    }

    public Figure getDefaultFigure() {
        return new Circle(colorSupplier.getRandomColor(),DEFAULT_CIRCLE_RADIUS);
    }
}
