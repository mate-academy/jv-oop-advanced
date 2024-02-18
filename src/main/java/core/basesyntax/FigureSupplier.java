package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MAX_SIZE = 50;
    private static final int DEFAULT_RADIUS_OF_CIRCLE = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS_OF_CIRCLE);
    }

    public Figure getRandomFigure() {
        int sideLength = random.nextInt(MAX_SIZE) + 1;
        int figureIndex = random.nextInt(NUMBER_OF_FIGURES);
        return switch (figureIndex) {
            case 0 -> new Circle(colorSupplier.getRandomColor(), sideLength);
            case 1 -> new RightTriangle(colorSupplier.getRandomColor(),
                    sideLength, sideLength);
            case 2 -> new Rectangle(colorSupplier.getRandomColor(),
                    sideLength, sideLength);
            case 3 -> new Square(colorSupplier.getRandomColor(), sideLength);
            case 4 -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    sideLength, sideLength, sideLength);
            default -> getDefaultFigure();
        };
    }
}
