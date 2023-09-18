package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_FIGURE = 5;
    private static final int MAX_SIDE = 10;
    private static final int MIN_SIDE = 1;
    private static final int AVERAGE_VALUE_TRAPEZOID = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomFigure = random.nextInt(MAX_FIGURE);

        switch (randomFigure) {
            case 0:
                return new Square(randomColor,
                        randomInt(MIN_SIDE, MAX_SIDE));
            case 1:
                return new Rectangle(randomColor,
                        randomInt(MIN_SIDE, MAX_SIDE),
                        randomInt(MIN_SIDE, MAX_SIDE));
            case 2:
                return new RightTriangle(randomColor,
                        randomInt(MIN_SIDE, MAX_SIDE),
                        randomInt(MIN_SIDE, MAX_SIDE));
            case 3:
                return new Circle(randomColor,
                        randomInt(MIN_SIDE, MAX_SIDE));
            default:
                return new IsoscelesTrapezoid(randomColor,
                        randomInt(MIN_SIDE, AVERAGE_VALUE_TRAPEZOID),
                        randomInt(AVERAGE_VALUE_TRAPEZOID, MAX_SIDE),
                        randomInt(MIN_SIDE, MAX_SIDE));
        }
    }

    private int randomInt(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
}
