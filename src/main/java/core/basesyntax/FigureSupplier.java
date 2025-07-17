package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final int MAX_WIDTH_SIDE = 15;
    private static final int MAX_LENGTH_SIDE = 10;
    private static final int MAX_LENGTH_BASE = 20;
    private static final int MAX_LENGTH_HEIGHT = 20;
    private static final int MAX_RADIUS = 25;
    private static final int DEFAULT_RADIUS = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomCountOfFigure = random.nextInt(1, FIGURE_TYPES_COUNT) + 1;
        String randomColor = colorSupplier.getRandomColor();
        switch (randomCountOfFigure) {
            case 1 -> {
                return new Square(randomColor, random.nextInt(1, MAX_LENGTH_SIDE));
            }
            case 2 -> {
                return new Rectangle(randomColor, random.nextInt(1, MAX_LENGTH_SIDE),
                        random.nextInt(1, MAX_WIDTH_SIDE));
            }
            case 3 -> {
                return new RightTriangle(randomColor, random.nextInt(1, MAX_LENGTH_BASE),
                        random.nextInt(1, MAX_LENGTH_HEIGHT));
            }
            case 4 -> {
                return new Circle(randomColor, random.nextInt(1, MAX_RADIUS));
            }
            case 5 -> {
                return new IsoscelesTrapezoid(randomColor, random.nextInt(1, MAX_LENGTH_BASE),
                        random.nextInt(1, MAX_LENGTH_BASE), random.nextInt(1, MAX_LENGTH_HEIGHT));
            }
            default -> {
                return null;
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
