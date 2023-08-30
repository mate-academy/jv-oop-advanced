package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int LIMIT_NUMBER_FIGURE = 5;
    private static final int SIDE_LIMIT = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(LIMIT_NUMBER_FIGURE);
        switch (figureIndex) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(SIDE_LIMIT));
            case 1:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(SIDE_LIMIT));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(SIDE_LIMIT),
                        random.nextInt(SIDE_LIMIT));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(SIDE_LIMIT),
                        random.nextInt(SIDE_LIMIT));
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(SIDE_LIMIT), random.nextInt(SIDE_LIMIT));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
