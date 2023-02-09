package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = TypeFigure.values().length;
    private static final int MAX_PARAMETER = 25;
    private static final int DEFAULT_PARAMETER = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (TypeFigure.values()[random.nextInt(FIGURE_COUNT)]) {
            case SQUARE:
                return new Square(random.nextInt(MAX_PARAMETER) + 1,
                        colorSupplier.getRandomColor());
            case RECTANGLE:
                return new Rectangle(random.nextInt(MAX_PARAMETER) + 1,
                        random.nextInt(MAX_PARAMETER) + 1,
                        colorSupplier.getRandomColor());
            case RIGHT_TRIANGLE:
                return new RightTriangle(random.nextInt(MAX_PARAMETER) + 1,
                        random.nextInt(MAX_PARAMETER) + 1,
                        colorSupplier.getRandomColor());
            case CIRCLE:
                return new Circle(random.nextInt(MAX_PARAMETER) + 1,
                        colorSupplier.getRandomColor());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(random.nextInt(MAX_PARAMETER) + 1,
                        random.nextInt(MAX_PARAMETER) + 1,
                        random.nextInt(MAX_PARAMETER) + 1,
                        colorSupplier.getRandomColor());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_PARAMETER, DEFAULT_COLOR);
    }
}
