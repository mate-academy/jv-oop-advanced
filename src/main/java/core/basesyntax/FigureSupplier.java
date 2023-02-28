package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 10;
    private static final int DEFAULT_SIZE = 10;
    private static final String DEFAULT_COLOR = String.valueOf(Color.WHITE).toLowerCase();
    private static final String DEFAULT_FIGURE = String.valueOf(ExistFigure.CIRCLE).toLowerCase();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private ExistFigure randomFigure;

    public Figure getRandomFigure() {
        randomFigure = ExistFigure.values()[random.nextInt(ExistFigure.values().length)];
        switch (randomFigure) {
            case SQUARE:
                return new Square(randomFigure.name().toLowerCase(),
                        colorSupplier.getRandomColor().toLowerCase(),
                        random.nextInt(MAX_VALUE));
            case RECTANGLE:
                return new Rectangle(randomFigure.name().toLowerCase(),
                        colorSupplier.getRandomColor().toLowerCase(),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
            case RIGHT_TRIANGLE:
                return new RightTriangle(randomFigure.name()
                        .substring(randomFigure.name().indexOf("_") + 1)
                        .toLowerCase(),
                        colorSupplier.getRandomColor().toLowerCase(),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
            case CIRCLE:
                return new Circle(randomFigure.name().toLowerCase(),
                        colorSupplier.getRandomColor().toLowerCase(),
                        random.nextInt(MAX_VALUE));
            default:
                return new IsoscelesTrapezoid(randomFigure.name()
                        .substring(randomFigure.name().indexOf("_") + 1)
                        .toLowerCase(),
                        colorSupplier.getRandomColor().toLowerCase(),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE, DEFAULT_COLOR, DEFAULT_SIZE);
    }
}
