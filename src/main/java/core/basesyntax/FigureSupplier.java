package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_FIGURE_COLOR = Color.WHITE.name();
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int NUMBER_OF_FIGURE_TYPES = 5;
    private static final int SIDE_SIZE_LIMIT = 101;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        switch (random.nextInt(NUMBER_OF_FIGURE_TYPES)) {
            case 0:
                return new Circle(randomColor,randomSize());
            case 1:
                return new Rectangle(randomColor,randomSize(),
                        randomSize());
            case 2:
                return new IsoscelesTrapezoid(randomColor,randomSize(),
                        randomSize(),randomSize());
            case 3:
                return new Square(randomColor,randomSize());
            case 4:
                return new RightTriangle(randomColor,randomSize());
            default:
                return getDefaultFigure();
        }
    }

    public Circle getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }

    private int randomSize() {
        return random.nextInt(SIDE_SIZE_LIMIT);
    }
}
